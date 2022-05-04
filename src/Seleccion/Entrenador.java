package Seleccion;

/**
Clase Entrenador que hereda de SeleccionFutbol
@author Aljarilla
@version 1.0
 */

public class Entrenador extends SeleccionFutbol {
    /**
    atributos propios de Entrenador
     @param id_federacion
     */
    private String id_federacion;

    /**
    Contructor por defecto
     */
    public Entrenador(){
         /**
        super() coge los los atributos por defecto de la clase padre
         */
        super();
        this.id_federacion=" ";
    }

    /**
   contructor pasandole los parámetros
    */
    public Entrenador(int id, String nombre, String apellido, int edad, String id_federacion) {
          /**
         el atributo super nos pasa los parametros de la clase padre
         */
        super(id, nombre, apellido, edad);
        this.id_federacion = id_federacion;
    }

    /**
    Getter del atributo id_federacion
    @return id-federacion
     */
    public String getId_federacion() {
        return id_federacion;
    }

    /**
    metodo en el que x persona dirige el partido
     */
    public void dirigirPartido(){
        System.out.println(getNombre()+"Partido dirigio");
    }

    /**
    metodo en el que x persona dirige entrenamiento
     */

    public void dirigirEntrenamineto(){
        System.out.println(getNombre()+"Entrenamiento dirigio");
    }

    /**
    metodo toString
     */

    @Override
    public String toString() {
        return "Entrenador{" +
                "id_federacion='" + id_federacion + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
