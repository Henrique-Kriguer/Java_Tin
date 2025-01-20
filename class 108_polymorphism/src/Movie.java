public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println("Watching " + instanceType + " - " + title);
    }

    public static Movie getMovie(String type, String title) {
    // This kind of method returns a new instance object, is called a factory method.
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new SciFi(title);
            default -> new Movie(title);
        };
    }
}
class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(" .. %s%n".repeat(3),
                "Pleasant Scene",
                "Scarly Music",
                "Somenting bad happens");
    }
    public void watchAdventure() {
        System.out.println("Watching Adventure - " );
    }
}

    class Comedy extends Movie{
        public Comedy(String title) {
            super(title);
        }

        @Override
        public void watchMovie() {
            super.watchMovie();
            System.out.printf(" .. %s%n".repeat(3) ,
                    "Something funny happens",
                    "Comedy Music",
                    "Happy Ending");
        }
        public void watchComedy() {
            System.out.println("Watching Comedy - " );
        }
    }
    class SciFi extends Movie {
    public SciFi(String title) {
                super(title);
            }

            @Override
            public void watchMovie() {
                super.watchMovie();
                System.out.printf(" .. %s%n".repeat(3),
                        "The bad Alliens do bad things",
                        "Scarly Music",
                        "Some star will explode");
            }
        public void watchScyFi() {
            System.out.println("Watching Science fiction - " );
        }
    }

