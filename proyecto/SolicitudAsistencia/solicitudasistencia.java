package SolicitudAsistencia;

import java.util.*;

import org.w3c.dom.Text;

public class solicitudasistencia 
{
    private int  id_solicitud_asistencia;
    private String asunto;
    private String contenido;
    private int id_aprendiz;
    private int id_instructor;
    private int id_ficha;
    
    public solicitudasistencia()
    {

    } 

    public solicitudasistencia (int  id_solicitud_asistencia,String asunto,String contenido,int id_aprendiz,int id_instructor,int id_ficha)
    {
        this.id_solicitud_asistencia=id_solicitud_asistencia;
        this.asunto=asunto;
        this.contenido=contenido;
        this.id_aprendiz=id_aprendiz;
        this.id_instructor=id_instructor;
        this.id_ficha=id_ficha;
    }

    public void registrarSolicitudasistencia () 
    {
     try (Scanner lector = new Scanner(System.in))
 {
     System.out.println("ingrese el numero de documento : ");
     id_solicitud_asistencia=lector.nextInt();
     System.out.println("ingrese su tipo de documento : ");
     asunto=lector.next();
     System.out.println("ingrese su tipo de documento : ");
     contenido=lector.next();
     System.out.println("ingrese el numero de documento : ");
     id_aprendiz=lector.nextInt();
     System.out.println("ingrese su nombre : ");
     id_instructor=lector.nextInt();
     System.out.println("ingrese su nombre : ");
     id_ficha=lector.nextInt();
 }
    }  

    public void mostrarSolicitudasistencia ()
    {
        System.out.println(id_solicitud_asistencia);
        System.out.println(asunto);
        System.out.println(contenido);
        System.out.println(id_aprendiz);
        System.out.println(id_instructor);
        System.out.println(id_ficha);
    }

    public void actualizarSolicitudasistencia ()
    {
      
    }

    public void eliminarSolicitudasistencia ()
    {
      
    }   
}
