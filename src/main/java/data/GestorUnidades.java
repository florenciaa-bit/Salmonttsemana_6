package data;

import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativo;
import model.UnidadOperativo;

public class GestorUnidades {
    public static UnidadOperativo[] crearUnidadesDePrueba() {
        UnidadOperativo[] unidades = new UnidadOperativo[4];

        // Dos centros de cultivo
        unidades[0] = new CentroCultivo(
                "Centro Chinquihue",
                "Puerto Montt",
                3500
        );

        unidades[1] = new CentroCultivo(
                "Centro Calbuco",
                "Calbuco",
                4200
        );

        // Dos plantas de proceso
        unidades[2] = new PlantaProceso(
                "Planta Pargua",
                "Pargua",
                180
        );

        unidades[3] = new PlantaProceso(
                "Planta Chiloé",
                "Quellón",
                220
        );

        return unidades;
    }
}
