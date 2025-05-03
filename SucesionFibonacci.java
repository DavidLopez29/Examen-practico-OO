
package sucesionfibonacci;


public class SucesionFibonacci {

    public static void main(String[] args) {
        // TODO code application logic here
        Sucesion objSucesion;
        System.out.println("Los primeros 50 números de la sucesión de Fibonacci son:");
        objSucesion = new Sucesion();
        System.out.println(objSucesion.sucesionNum());
        System.out.println("Numeros pares: "+objSucesion.getPares());
        System.out.println("Numeros impares: "+objSucesion.getImpares());
        System.out.println("La suma total de los 50 primeros numeros es de: "+objSucesion.suma);
        System.out.println("El promedio de los 50 primeros numeros de Fibonacci es: "+objSucesion.Promedio());
    }
    
}
