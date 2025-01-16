public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,boolean duplex) {
        this.pagesPrinted = 0;
        this.duplex = duplex;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1 ;
    }

   public int getPagesPrinted() {
        return pagesPrinted;
    }


    public int addToner(int tonerAmount){
        int tempAmount = tonerAmount + tonerLevel;
        if (tonerAmount > 100 || tonerAmount < 0 || tempAmount > 100) {
            return -1;
        }
        tonerLevel = tempAmount;
            return tempAmount;
    }

    public int printPages(int pages){
        if(duplex) {
            System.out.println("Printing in duplex mode");
        }
        int jobPages = (duplex) ? (pages / 2) + (pages % 2 ) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }
}
