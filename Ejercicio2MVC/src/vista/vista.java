package vista;
import java.util.ArrayList;

public class vista {

    public vista(){
    }

    public void mostrarInfo(ArrayList<String>fizzbuzz){
        System.out.println("bienvenido al fizzbuzz juego");
        for (String fizz : fizzbuzz){
            System.out.println(fizz);
        }
    }
}