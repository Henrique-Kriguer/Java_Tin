public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){

        String instanceType = this.getClass().getSimpleName();
        System.out.println("Watching " + instanceType + " - " + title);
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
}
