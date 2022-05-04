package Seleccion;

/**
 Esta es la clase padre que tiene 4 atributos que seran comunes en las demas subclases
 @author Aljarilla
 @version 1.0
 */

public class SeleccionFutbol {
    /**
   Atributos SeleccionFutbol
    @param id
    @param apellido
    @param nombre
    @edad
    */
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    /**
    Contructor por defecto
     */
    public SeleccionFutbol(){
        this.id=0;
        this.nombre=" ";
        this.apellido=" ";
        this.edad=0;
    }

    /**
    Constructor pasandole los parámetros
     */
    public SeleccionFutbol(int id,String nombre,String apellido,int edad){
        this.id=edad;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    /**
   Getter del atributo id
   @return id
   */
    public int getId() {
        return id;
    }

    /**
     Getter del atributo nombre
    @return nombre
    */
    public String getNombre() {
        return nombre;
    }

    /**
    Getter del atributo apellido
    @return apellido
    */
    public String getApellido() {
        return apellido;
    }


      /**
    Getter del atributo edad
    @return edad
    */

    public int getEdad() {
        return edad;
    }

    /**
    setter de nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
    setter de apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
    setter de edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
    metodo que indica que x persona se concentra
     */
    public void concentrarse(){
        System.out.println(nombre+" se concentra: ");
    }

    /**
    metodo que indica que x persona viaja
     */
    public void viajar(){
        System.out.println(nombre+" viaja: ");
    }

    /**
    metodo toString
     */
    @Override
    public String toString() {
        return "SeleccionFutbol{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
