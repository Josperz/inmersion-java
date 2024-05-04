import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java");
        //System.out.println("Película the dark knight");
        // Declaracion de variables
        int fechaDeLanzamiento = 2008;
        double evaluacion = 4.8;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Batman: The dark knight";
        String sinopsis = """
                Cuando la amenaza conocida como el Joker causa estragos y el caos en Gotham City, 
                Batman debe aceptar una de las mayores pruebas psicológicas y físicas para luchar 
                contra la injusticia.""";
        double mediaEvaluacionesUsuario = 0;

        System.out.println("Película: " + nombre);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Plan basico activo: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluacion de The dark knight: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la evaluacion que le darias a " + nombre);
            double notaPelicula = teclado.nextDouble();
            mediaEvaluacionesUsuario= mediaEvaluacionesUsuario + notaPelicula;
        }
        System.out.println("la media de la pelicula " + nombre + " calculada por el usuario es: " + mediaEvaluacionesUsuario / 3);
    }
}