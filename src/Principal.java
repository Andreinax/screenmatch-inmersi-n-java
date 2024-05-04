import calculos.CalculadoraDeTiempo;
import modelo.Pelicula;
import modelo.Serie;


import java.util.Scanner;

public class Principal {
    Pelicula peliculaUsuario = new Pelicula();
    Serie serieUsuario = new Serie();
    CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();


    public void muestraElMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
            while (opcion != 9) {
                String menu = """
                    Bienvenido(a) a Screenmatch
                    1) Registrar nueva Película
                    2) Registrar nueva serie
                    3) Calculadora de tiempo
                    
                    9) Salir.
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la película: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de la pelicula");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de la pelicula");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    calculadoraDeTiempo.incluye(peliculaUsuario);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa el numero de temporadas para esta serie");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la cantidad de episodios por cada temporada");
                    int episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la duración en minutos de cada episodio");
                    int minutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();
                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
                    serieUsuario.setDuracionEnMinutosPorEpisodio(minutosPorEpisodio);
                    calculadoraDeTiempo.incluye(serieUsuario);
                    break;
                case 3:
                    System.out.println("Tiempo que necesitas para hacer un maratón con tus títulos favoritos "
                            + calculadoraDeTiempo.getTiempoTotal() + " minutos");
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
                    System.out.println("El sistema se ha cerrado, nos vemos luego.");
            }

        }


    }

}
