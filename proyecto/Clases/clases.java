package Clases;

import java.util.*;

public class clases
{
    private int  id_clases;
    private String nombre_clase;
    private int dia;
    private String hora_inicio;
    private String hora_final;
    private int id_asociacion_asignatura_ficha;
    
    public clases()
    {

    } 

    public clases(int id_clases,String nombre_clase,int dia,String hora_inicio,String hora_final,int id_asociacion_asignatura_ficha)
    {
        this.id_clases=id_clases;
        this.nombre_clase=nombre_clase;
        this.dia=dia;
        this.hora_inicio=hora_inicio;
        this.hora_final=hora_final;
        this.id_asociacion_asignatura_ficha=id_asociacion_asignatura_ficha;
    }

    public void registrarClases() 
    {
     try (Scanner lector = new Scanner(System.in))
 {
     System.out.println("ingrese el numero de documento : ");
     id_clases=lector.nextInt();
     System.out.println("ingrese su tipo de documento : ");
     nombre_clase=lector.next();
     System.out.println("ingrese su tipo de documento : ");
     dia=lector.nextInt();
     System.out.println("ingrese el numero de documento : ");
     hora_inicio=lector.next();
     System.out.println("ingrese su nombre : ");
     hora_final=lector.next();
     System.out.println("ingrese su nombre : ");
     id_asociacion_asignatura_ficha=lector.nextInt();
 }
    }  

    public void mostrarClases()
    {
        System.out.println(id_clases);
        System.out.println(nombre_clase);
        System.out.println(dia);
        System.out.println(hora_inicio);
        System.out.println(hora_final);
        System.out.println(id_asociacion_asignatura_ficha);
    }

    public void actualizarClases()
    {
      
    }

    public void eliminarClases()
    {
      
    }
}
