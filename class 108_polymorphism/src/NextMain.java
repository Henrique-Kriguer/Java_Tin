public class NextMain {
    public static void main(String[] args) {

//        Movie theMovie = Movie.getMovie("s", "Star wars");
//        theMovie.watchMovie();
//
//        Adventure jaws = (Adventure) Movie.getMovie("a", "Jaws"); //casting the object to Adventure
//        jaws.watchMovie();
//
//        Object comedy = Movie.getMovie("c", "Airplane");
//        Comedy comedyMovie = (Comedy) comedy;
//        comedyMovie.watchComedy();

      Object unknown = Movie.getMovie("c", "platton");
      if (unknown.getClass().getSimpleName() == "Comedy"){
          Comedy c = (Comedy) unknown;
          c.watchComedy();
      } else if(unknown.getClass().getSimpleName() == "Adventure"){
          Adventure a = (Adventure) unknown;
          a.watchAdventure();
      } else if (unknown instanceof SciFi s){;
            s.watchMovie();
      }
    }
}
