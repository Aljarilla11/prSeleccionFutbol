package Seleccion;
/**
Clase Launch
@author Aljarilla
@version 1.0
 */
public class Launch {
    public static void main(String[] args) {
        /**
        array de Seleccion de cuatro posiciones
         */
        SeleccionFutbol [] equipo = new SeleccionFutbol[4];
        /**
        creamos objetod con las diferentes clases
         */
        Entrenador e=new Entrenador(1,"Vicente","del Bosque",65,"43fsrg3");
        Futbolista f1=new Futbolista(2,"Leo","Messi",34,10,"Extremo");
        Futbolista f2=new Futbolista(2,"Xavi","Hernandez",40,8,"Medio");
        Masajista m1=new Masajista(4,"Raul","Martinez",34);

        /**
        asignamos a cada posicion un objeto
         */
        equipo[0]=e;
        equipo[1]=f1;
        equipo[2]=f2;
        equipo[3]=m1;
       /**
       concentracion
        */
        System.out.println("El equipo inicia concentracion");
        for (SeleccionFutbol s:equipo){
            System.out.println(s.getNombre()+" "+s.getApellido()+"->");s.concentrarse();
        }
        /**
        viaje
         */
        System.out.println("El equipo inicia el viaje");
        for (SeleccionFutbol s:equipo){
            System.out.println(s.getNombre()+" "+s.getApellido()+"->");s.viajar();
        }
        /**
        entrenamineto
         */

        System.out.println("Entrenamineto del equipo");
        System.out.println(e.getNombre()+" "+e.getApellido()+"->");e.dirigirEntrenamineto();

        System.out.print(f1.getNombre()+" "+f1.getApellido()+"->");f1.entrenar();
        System.out.print(f2.getNombre()+" "+f2.getApellido()+"->");f2.entrenar();

        /**
        masaje
         */

        System.out.println("Masajista preparado");
        System.out.print(m1.getNombre()+" "+m1.getApellido()+"->");m1.darMasaje();

        /**
        partido de futbol
         */
        System.out.println("Empieza el partido");
        System.out.println(e.getNombre()+" "+e.getApellido()+"->");e.dirigirPartido();

        System.out.print(f1.getNombre()+" "+f1.getApellido()+"->");f1.jugarPartido();
        System.out.print(f2.getNombre()+" "+f2.getApellido()+"->");f2.jugarPartido();






    }

}
