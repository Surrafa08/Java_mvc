package modelo;
import java.util.Random;

public class modelo {
    private Random random;
    public modelo() {
        random = new Random();
    }
    public String monitorear(Double temperatura) {
        if (temperatura < 10) {
                return("Estado: calefactor prendido");
            } else if (temperatura > 29) {
                return("Estado: Ventilador prendido");
            } else {
                return("normal");
            }
    }
    
    public double leerTemperatura() {
        return 5 + (random.nextDouble() * 29);
    }
}