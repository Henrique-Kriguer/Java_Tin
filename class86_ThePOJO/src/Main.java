public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <5; i++){
            Student s = new Student(
                    "00"+i,
                    switch (i){
                        case 1 -> "Henrique";
                        case 2 -> "Francisco";
                        case 3 -> "João";
                        case 4 -> "Simone";
                        default -> "Anonymous";
                    },
                    "23/10/197"+i,
                    "Java_masterClass"

            );
            System.out.println(s);
        }


    }
}