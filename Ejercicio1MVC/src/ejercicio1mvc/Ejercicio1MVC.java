package ejercicio1mvc;

import controlador.controlador;
import modelo.modelo;
import vista.vista;

public class Ejercicio1MVC {
    public static void main(String[] args) {
        modelo modelo = new modelo(10); 
        vista vista = new vista();
        controlador controlador = new controlador(modelo, vista);
        controlador.iniciar();
    }
}