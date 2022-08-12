
package paquete1;

public class Clase2Main {
    public static void main(String[] args) {
        GettersSetters objeto1 = new GettersSetters(); // crea instacia de la clase gettersSetters llamada objeto1
        objeto1.setEdad(21);
        objeto1.setNombre("felipe");
        System.out.println(objeto1.getNombre()+" tiene: "+objeto1.getEdad()+" años");
    }
    
}
