package Seleccion;
/**
Clase Masajista que hereda de SeleccionFutbol
@author Aljarilla
@version 1.0
 */

public class Masajista extends SeleccionFutbol {
    /**
    atributos propios de Masajistas
    @param titulacion
    @param anios_experiencia
     */
    private String titulacion;
    private int anios_experiencia;

    /**
    Contructor por defecto
     */
    public Masajista(){
         /**
        super() coge los los atributos por defecto de la clase padre
         */
        super();
        this.titulacion=" ";
        this.anios_experiencia=0;
    }

    /**
   contructor pasandole los parámetros
    */
    public Masajista(int id, String nombre, String apellido, int edad) {
          /**
         el atributo super nos pasa los parametros de la clase padre
         */
        super(id, nombre, apellido, edad);
        this.titulacion=titulacion;
        this.anios_experiencia=anios_experiencia;
    }

    /**
   Getter del atributo titulacion
   @return titulacion
    */
    public String getTitulacion() {
        return titulacion;
    }

    /**
    Setter titulacion
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    /**
    Getter del atributo anios_experiencia
    @return anios_experiencia
    */
    public int getAnios_experiencia() {
        return anios_experiencia;
    }

    /**
    setter anios_experiencia
     */
    public void setAnios_experiencia(int anios_experiencia) {
        this.anios_experiencia = anios_experiencia;
    }

    /**
    metodo en el que x persona da masaje
     */
    public void darMasaje(){
        System.out.println(getNombre()+"dar masaje");
    }

    /**
    metodo toString
     */
    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", anios_experiencia=" + anios_experiencia +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
