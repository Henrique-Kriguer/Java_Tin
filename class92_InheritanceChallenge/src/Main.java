public class Main {

    public static void main(String[] args) {

        Employee Henrique = null;
        Henrique = new Employee("Henrique Kriguer", "23/10/1971", "11/11/2023");
        System.out.println(Henrique);
        System.out.println("Age = " + Henrique.getAge());
        System.out.println("Pay = " + Henrique.collectPay());

        SalariedEmployee Jonh = null;
        Jonh = new SalariedEmployee("Jonh Lennon", "15/12/1952", "11/11/2015",35000);
        System.out.println(Jonh);
        System.out.println("Age = " + Jonh.getAge());
        System.out.println("Pay = " + Jonh.collectPay());
        Jonh.retire();
       System.out.println("Pay pension check = " + Jonh.collectPay());


        HourlyEmployee Francisco = new HourlyEmployee("Francisco Kriguer", "10/01/2004", "11/11/2015",40);
        System.out.println(Francisco);
        System.out.println("Age = " + Francisco.getAge());
        System.out.println("Pay = " + Francisco.collectPay());
        System.out.println("Holyday pay = "+ Francisco.getDoublePay());
        //System.out.println("Pay pension check = " + Francisco.collectPay());



    }
}