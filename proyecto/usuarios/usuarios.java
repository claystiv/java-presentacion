package usuarios;

import java.util.*;

public class usuarios 
{
    private int  id_usuario ;
    private String nombre_usuario;
    private String apellido_usuario;
    private int numero_documento;
    private String password;
    private String emailinstitucional;
    private String direccion_recidencial; 
    private int telefono_movil;
    private int id_tipo_documento;
    private int id_tipo_rol;
    private int id_ciudad;
    
    public usuarios()
    {

    } 

    public usuarios(int id_usuario, String nombre_usuario,String apellido_usuario, int numero_documento,String password,String emailinstitucional,String direccion_recidencial,int telefono_movil,int id_tipo_documento,int id_tipo_rol,int id_ciudad)
    {
        this.id_usuario=id_usuario;
        this.nombre_usuario=nombre_usuario;
        this.apellido_usuario=apellido_usuario;
        this.numero_documento=numero_documento;
        this.password=password;
        this.emailinstitucional=emailinstitucional;
        this.direccion_recidencial=direccion_recidencial;
        this.telefono_movil=telefono_movil;
        this.id_tipo_documento=id_tipo_documento;
        this.id_tipo_rol=id_tipo_rol;
        this.id_ciudad=id_ciudad;
    }

    public void registrarUsuarios() 
    {
     try (Scanner lector = new Scanner(System.in))
 {
     System.out.println("ingrese el numero de documento : ");
     id_usuario=lector.nextInt();
     System.out.println("ingrese su tipo de documento : ");
     nombre_usuario=lector.next();
     System.out.println("ingrese su tipo de documento : ");
     apellido_usuario=lector.next();
     System.out.println("ingrese el numero de documento : ");
     numero_documento=lector.nextInt();
     System.out.println("ingrese su nombre : ");
     password=lector.next();
     System.out.println("ingrese su apellido : ");
     emailinstitucional=lector.next();
     System.out.println("ingrese su apellido : ");
     direccion_recidencial=lector.next();
     System.out.println("ingrese el numero de documento : ");
     telefono_movil=lector.nextInt();
     System.out.println("ingrese el numero de documento : ");
     id_tipo_documento=lector.nextInt();
     System.out.println("ingrese el numero de documento : ");
     id_tipo_rol=lector.nextInt();
     System.out.println("ingrese su edad : ");
     id_ciudad=lector.nextInt();
 }
    }  

    public void mostrarUsuarios()
    {
        System.out.println(id_usuario);
        System.out.println(nombre_usuario);
        System.out.println(apellido_usuario);
        System.out.println(numero_documento);
        System.out.println(password);
        System.out.println(emailinstitucional);
        System.out.println(direccion_recidencial);
        System.out.println(telefono_movil);
        System.out.println(id_tipo_documento);
        System.out.println(id_tipo_rol);
        System.out.println(id_ciudad);
        System.out.println();
    }

    public void actualizarUsuarios()
    {
      
    }

    public void eliminarUsuarios()
    {
      
    }
}
