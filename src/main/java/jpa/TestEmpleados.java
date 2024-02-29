package jpa;

import entity.Empleado;

import jakarta.persistence.*;
import java.util.List;

public class TestEmpleados {

    public static void main(String[] args) {
        // !Creación del EntityManagerFactory y del EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
        EntityManager em = emf.createEntityManager();

        try {
            // !Persistir empleados
            persistirEmpleado(em);
            // !Imprimir todos los empleados
            imprimirEmpleados(em);

            // !Actualizar un empleado
            actualizarEmpleado(em);

            // !Eliminar un empleado
            eliminarEmpleado(em);
            // !Imprimir la lista actualizada de empleados
            imprimirEmpleados(em);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // !Cerrar el EntityManager y el EntityManagerFactory
            em.close();
            emf.close();
        }
    }

    // !Método para persistir empleados
    private static void persistirEmpleado(EntityManager em) {
        EntityTransaction et = em.getTransaction();
        et.begin();

        // !Crear y persistir empleados
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("John");
        empleado1.setApellido("Wick");
        empleado1.setEmail("johnwick@gmail.com");
        empleado1.setDepartamento("IT");
        em.persist(empleado1);

        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Alice");
        empleado2.setApellido("Smith");
        empleado2.setEmail("alice@gmail.com");
        empleado2.setDepartamento("HR");
        em.persist(empleado2);

        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Bob");
        empleado3.setApellido("Johnson");
        empleado3.setEmail("bob@gmail.com");
        empleado3.setDepartamento("Finance");
        em.persist(empleado3);

        et.commit();
    }

    // !Método para actualizar un empleado
    private static void actualizarEmpleado(EntityManager em) {
        EntityTransaction et = em.getTransaction();
        et.begin();

        // !Buscar y actualizar el departamento de un empleado
        Empleado empleado = em.find(Empleado.class, 1L);
        if (empleado != null) {
            empleado.setDepartamento("Finance");
            System.out.println("Empleado actualizado: " + empleado);
        }

        et.commit();
    }

    // !Método para eliminar un empleado
    private static void eliminarEmpleado(EntityManager em) {
        EntityTransaction et = em.getTransaction();
        et.begin();

        // !Buscar y eliminar un empleado
        Empleado empleado = em.find(Empleado.class, 2L);
        if (empleado != null) {
            em.remove(empleado);
            System.out.println("Empleado con ID " + empleado.getId() + " eliminado.");
        }

        et.commit();
    }

    // !Método para imprimir todos los empleados
    private static void imprimirEmpleados(EntityManager em) {
        // !Consultar todos los empleados
        List<Empleado> empleados = em.createQuery("FROM Empleado", Empleado.class).getResultList();
        System.out.println("Hay " + empleados.size() + " empleados en el sistema.");

        // !Imprimir la lista de empleados
        if (empleados.isEmpty()) {
            System.out.println("No se encontraron empleados.");
        } else {
            for (Empleado emp : empleados) {
                System.out.println(emp);
            }
        }
    }
}
