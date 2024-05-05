import calculos.CalculadoraDeTiempo;
import modelo.Pelicula;
import modelo.Serie;




import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    Pelicula peliculaUsuario = new Pelicula();
    Serie serieUsuario = new Serie();
    CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();
    ArrayList<String> listaPeliculas = new ArrayList<>();
    ArrayList<String> listaSeries = new ArrayList<>();
    int seg;
    String op, buscador;

    public void muestraElMenu() throws InterruptedException {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
            while (opcion != 9) {
                String menu = """
                    Bienvenido(a) a Screenmatch
                    1) Registrar nueva Película
                    2) Registrar nueva serie
                    3) Calculadora de tiempo
                    4) Consulta Peliculas Registradas
                    5) Consulta Series Registradas
                    6) Buscador de Peliculas y Series
                    
                    
                    9) Salir.
                    """;

            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    do {


                    System.out.println("Ingrese el nombre de la película: ");
                    String nombre = teclado.nextLine();
                    listaPeliculas.add(nombre);
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
                        do {
                            System.out.println("¿Que opción desea realizar?");
                            System.out.println("1. Volver a registrar otra Película.");
                            System.out.println("2. Confirmar los datos de la película ingresada.");
                            op = teclado.nextLine();
                        } while(!(op.equalsIgnoreCase("1") || op.equalsIgnoreCase("2")));

                } while (op.equalsIgnoreCase("1"));
                    break;
                case 2:
                   do {


                    System.out.println("Ingrese el nombre de la serie");
                    String nombreSerie = teclado.nextLine();
                    listaSeries.add(nombreSerie);
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

                       do {
                           System.out.println("¿Que opción desea realizar?");
                           System.out.println("1. Volver a registrar otra Película.");
                           System.out.println("2. Confirmar los datos de la película ingresada.");
                           op = teclado.nextLine();
                       } while(!(op.equalsIgnoreCase("1") || op.equalsIgnoreCase("2")));

                   }while (op.equalsIgnoreCase("1"));
                    break;
                case 3:
                    System.out.println("Tiempo que necesitas para hacer un maratón con tus títulos favoritos "
                            + calculadoraDeTiempo.getTiempoTotal() + " minutos");
                    break;
                case 4:
                    System.out.println("El listado de Películas registradas es: "+listaPeliculas);
                    break;
                case 5:
                    System.out.println("El Listado de las Series Registradas es: "+listaSeries);
                    break;
                case 6:
                    System.out.println("Ingresa la Película o Serie que deseas mirar: ");
                    String buscador = teclado.nextLine();
                    if (listaPeliculas.equals(buscador) || listaSeries.equals(buscador)){
                        System.out.println("La Pelicula que ingresaste se encuentra registrada en el sistema");
                    } else {
                        System.out.println("La pelicula que ingresaste no se encuentra registrada en el sistema.");
                    }
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    System.out.println("Espere 3 Segundos mientras el sistema cierra correctamente");
                    seg--;
                    System.out.println((seg--));
                    Thread.sleep(1000);
                    System.out.println((seg--));
                    Thread.sleep(1000);
                    System.out.println((seg--));
                    Thread.sleep(1000);
                    System.out.println("***Hasta Luego***");
                    break;
                default:
                    System.out.println("Opción no válida");
                    System.out.println("Intenta Nuevamente.");

            }

        }


    }

}
