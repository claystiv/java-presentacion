package Asistencias;

import java.util.*;

public class asistencias 
{
    private int  id_asistencia;
    private String hora_firmada;
    private int id_clase;
    private int id_tipo_asistencia;
    private int id_aprendiz;
    
    public asistencias()
    {

    } 

    public asistencias(int  id_asistencia, String hora_firmada,int id_clase,int id_tipo_asistencia,int id_aprendiz)
    {
        this.id_asistencia=id_asistencia;
        this.hora_firmada=hora_firmada;
        this.id_clase=id_clase;
        this.id_tipo_asistencia=id_tipo_asistencia;
        this.id_aprendiz=id_aprendiz;
    }

    public void registrarAsistencias() 
    {
     try (Scanner lector = new Scanner(System.in))
 {
     System.out.println("ingrese el numero de documento : ");
     id_asistencia=lector.nextInt();
     System.out.println("ingrese su tipo de documento : ");
     hora_firmada=lector.next();
     System.out.println("ingrese su tipo de documento : ");
     id_clase=lector.nextInt();
     System.out.println("ingrese el numero de documento : ");
     id_tipo_asistencia=lector.nextInt();
     System.out.println("ingrese su nombre : ");
     id_aprendiz=lector.nextInt();
 }
    }  

    public void mostrarAsistencias()
    {
        System.out.println(id_asistencia);
        System.out.println(hora_firmada);
        System.out.println(id_clase);
        System.out.println(id_tipo_asistencia);
        System.out.println(id_aprendiz);
    }

    public void actualizarAsistencias()
    {
      
    }

    public void eliminarAsistencias()
    {
      
    }
    
}
