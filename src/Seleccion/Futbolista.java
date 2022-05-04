package Seleccion;

/**
Clase Futbolista que hereda de la clase padre SeleccionFutbol
@author Aljarilla
@version 1.0
 */

public class Futbolista extends SeleccionFutbol {
    /**
    Atributos propios de futbolista
     @param dorsal
     @param demarcacion
     */
    private int dorsal;
    private String demarcacion;

    /**
    Constructor por defecto
     */
    public Futbolista() {
        /**
        super() coge los los atributos por defecto de la clase padre
         */
        super();
        this.dorsal = 0;
        this.demarcacion = " ";
    }


    /**
    contructor pasandole los parámetros
     */
    public Futbolista(int id,String nombre,String apellido,int edad,int dorsal,String demarcacion){
        /**
        el atributo super nos pasa los parametros de la clase padre
         */
        super(id,nombre,apellido,edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    /**
   Getter del atributo dorsal
   @return dorsal
  */
    public int getDorsal() {
        return dorsal;
    }
    /**
   setter de dorsal
    */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    /**
    Getter del atributo demarcacion
    @return demarcacion
     */
    public String getDemarcacion() {
        return demarcacion;
    }

    /**
   setter de demarcacion
    */
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    /**
    metodo que no devuelve nada en el cual indicamos que x persona juega partido
     */
    public void jugarPartido(){
        System.out.println("Juega Partido");
    }

    /**
    metodo que no devuelve nada en el cual indicamos que x persona entrena
     */
    public void entrenar(){
        System.out.println("Entrena");
    }

    /**
    metodo toString
     */
    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", demarcacion='" + demarcacion + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
