package calculos;

import modelo.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo) {
        tiempoTotal += titulo.getTiempoDeDuracionEnMinutos();


    }
}