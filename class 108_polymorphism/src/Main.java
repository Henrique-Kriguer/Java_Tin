import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Movie movie = new Comedy("Star wars");
        //movie.watchMovie();

//        Movie theMovie = Movie.getMovie("Adventure", "Star wars");
//        theMovie.watchMovie();
//
//        Movie theMovie2 = Movie.getMovie("Science Fiction", "Alliens");
//        theMovie2.watchMovie();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the movie type (A for adventure, C for comedy, S for Science Fiction or Q to quit: ");
            String type = sc.nextLine();
            if (type.equalsIgnoreCase("Q")) { //A função equalsIgnoreCase é um método da classe String em Java. Ela é usada para comparar duas strings, ignorando as diferenças entre maiúsculas e minúsculas.
                break;
            }
            System.out.println("Enter the movie title: ");
            String title = sc.nextLine();
            Movie theMovie = Movie.getMovie(type, title);
            theMovie.watchMovie();
        }
    }
}