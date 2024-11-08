import java.time.LocalDate;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;  // get to the subclasses flexibility to operate on it.

    public Worker(String name, String birthDate) { // when we hire a new worker we don´t fill end date
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker(){
    }
    public int getAge(){
        LocalDate dataAtual = LocalDate.now();
        int currentYear = dataAtual.getYear();
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear - birthYear);
    }

    public double collectPay(){
        return 0.0;
        // This method is the one that should be overridden by subclasses that can
        //  figure out the right pay to return based on the type of worker.
    }

    public void terminate(String endDate){
        this.endDate = endDate;

        //used to terminate employment. This will take a date and set the end date to that day.
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
