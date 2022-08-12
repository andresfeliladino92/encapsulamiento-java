package paquete1;

public class GettersSetters {
    private int edad;  //crea variable con modificador de acceso privado solo se puede utilizar en esta clase
    private String nombre;
    
    //metodo setter: sirve para poderle dar valor o poder acceder a la edad en otra clase por ser private
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Meodo Getter: Sirve para mostrar valor de edad en otra clase 
    public int getEdad() {
        return edad;
    }
    
    //Setter de nombre sirve para acceder a la variable nombre desde otra clase y cambiarle el valor
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Getter de nombre para mostrar dato desde otra clase
    public String getNombre() {
        return nombre;
    }


    
    

  

    
    
    
    
    
}
