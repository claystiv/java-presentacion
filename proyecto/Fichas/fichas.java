package Fichas;

import java.util.*;

public class fichas 
{
    private int  id_ficha;
    private int id_programa;
 
    public fichas()
    {

    } 

    public fichas(int id_ficha,int id_programa)
    {
        this.id_ficha=id_ficha;
        this.id_programa=id_programa;
    }

    public void registrarClases() 
    {
     try (Scanner lector = new Scanner(System.in))
 {
     System.out.println("ingrese el numero de documento : ");
     id_ficha=lector.nextInt();
     System.out.println("ingrese su tipo de documento : ");
     id_programa=lector.nextInt();
 }
    }  

    public void mostrarClases()
    {
        System.out.println(id_ficha);
        System.out.println(id_programa);
    }

    public void actualizarClases()
    {
      
    }

    public void eliminarClases()
    {
      
    }
}
