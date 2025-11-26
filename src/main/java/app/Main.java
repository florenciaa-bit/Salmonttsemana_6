package app;

import data.GestorUnidades;
import model.UnidadOperativo;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Unidades Operativas de Salmontt ===");

        UnidadOperativo[] unidades = GestorUnidades.crearUnidadesDePrueba();

        for (UnidadOperativo u : unidades) {
            System.out.println(u.toString());
        }

        System.out.println("=== Fin de la demostración ===");
    }
}
