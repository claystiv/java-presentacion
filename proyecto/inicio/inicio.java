package inicio;


import usuarios.*;
import Asistencias.*;
import SolicitudAsistencia.*;
import Programas.*;
import Fichas.*;
import Clases.*;
import Asignaturas.*;

public class inicio 
{
    public static void main(String[] args)
    { 
        usuarios u = new usuarios();
        u.registrarUsuarios();
        u.mostrarUsuarios();

        asistencias a = new asistencias();
        a.registrarAsistencias();
        a.mostrarAsistencias();

        solicitudasistencia s = new solicitudasistencia();
        s.registrarSolicitudasistencia();
        s.mostrarSolicitudasistencia();

        programas p = new programas();
        p.registrarProgramas();
        p.mostrarProgramas();

        fichas f = new fichas();
        f.registrarClases();
        f.mostrarClases();

        clases c = new clases();
        c.registrarClases();
        c.mostrarClases();

        asignaturas ag = new asignaturas();
        ag.registrarAsignaturas();
        ag.mostrarAsignaturas();
    }
}
