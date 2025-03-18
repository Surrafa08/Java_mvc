package modelo;

import java.util.ArrayList;
import java.util.Random;

public class modelo {
    private static Random random = new Random();
    private ArrayList<Boolean> datos;
    private static String mensaje1 = "las luces estan prendidas";
    private static String mensaje2 = "las luces estan apagadas";

    public modelo() {
        datos = new ArrayList<>();
    }

    public String Informacion() {
        boolean noche;
        boolean movimiento;
        datos.add(random.nextBoolean());
        datos.add(random.nextBoolean()); 
        noche = datos.get(0);
        movimiento = datos.get(1);

        if (noche && movimiento) {
            return mensaje1;
        } else {
            return mensaje2;
        }
    }
}