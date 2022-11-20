package Asignaturas;

import java.util.*;

public class asignaturas 
{
    private int  id_asignatura;
    private String nombre_asignatura;
  
    
    public asignaturas()
    {

    } 

    public asignaturas(int  id_asignatura, String nombre_asignatura)
    {
        this.id_asignatura=id_asignatura;
        this.nombre_asignatura=nombre_asignatura;

    }

    public void registrarAsignaturas() 
    {
     try (Scanner lector = new Scanner(System.in))
 {
     System.out.println("ingrese el numero de documento : ");
     id_asignatura=lector.nextInt();
     System.out.println("ingrese su tipo de documento : ");
     nombre_asignatura=lector.next();
 }
    }  

    public void mostrarAsignaturas()
    {
        System.out.println(id_asignatura);
        System.out.println(nombre_asignatura);
    }

    public void actualizarAsignaturas()
    {
      
    }

    public void eliminarAsignaturas()
    {
      
    }
    
}
