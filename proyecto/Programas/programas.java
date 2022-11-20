package Programas;

import java.util.*;

public class programas 
{
    private int  id_programa;
    private String nombre_programa;
  
    
    public programas()
    {

    } 

    public programas(int id_programa, String nombre_programa)
    {
        this.id_programa=id_programa;
        this.nombre_programa=nombre_programa;

    }

    public void registrarProgramas() 
    {
     try (Scanner lector = new Scanner(System.in))
 {
     System.out.println("ingrese el numero de documento : ");
     id_programa=lector.nextInt();
     System.out.println("ingrese su tipo de documento : ");
     nombre_programa=lector.next();
 }
    }  

    public void mostrarProgramas()
    {
        System.out.println(id_programa);
        System.out.println(nombre_programa);
    }

    public void actualizarProgramas()
    {
      
    }

    public void eliminarProgramas()
    {
      
    }
}
