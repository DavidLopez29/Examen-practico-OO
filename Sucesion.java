package sucesionfibonacci;
public class Sucesion {
    long numero;
    long numeroAnt;
    long numeroSig;
    int numeroMax;
    String sucesion;
    int pares;
    int impares;
    double promedio;
    long suma;

    public Sucesion() {
        this.numero=1;
        this.numeroAnt=0;
        this.numeroSig=0; 
        this.numeroMax=50;
        this.sucesion=" ";
        this.pares=0;
        this.impares=0;
        this.promedio=0.0;
        this.suma=0;
    } 

    
    public int getPares() {
        return pares;
    }

    public int getImpares() {
        return impares;
    }
    
    
    public double getPromedio() {
        return promedio;
    }
    
    public String sucesionNum(){
        for (int i=0; i<this.numeroMax; i++){
            sucesion+=(numeroAnt+ "\n ");
            suma += numeroAnt;
            numeroSig = numeroAnt + numero;
            if (numeroSig % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            numeroAnt=numero;
            numero=numeroSig;
        }
        return sucesion;
    }
    
    public double Promedio(){
        promedio=(double)suma/numeroMax;
        return promedio;
    }

}
    