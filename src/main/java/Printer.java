public class Printer {

    private int numberOfSheetsOfPaperLeft;
    private int tonerVolume;

    public Printer() {
        this.numberOfSheetsOfPaperLeft = 50;
        this.tonerVolume = 1000;
    }

    public int getNumberOfSheetsOfPaperLeft() {
        return numberOfSheetsOfPaperLeft;
    }

    public void print(int numOfPages, int numOfCopies) {
        if (this.numberOfSheetsOfPaperLeft >= numOfPages * numOfCopies) {
            int printedPages = numOfPages * numOfCopies;
            numberOfSheetsOfPaperLeft -= printedPages;
            tonerVolume -= printedPages;
        }
    }

    public int getTonerVolume() {
        return tonerVolume;
    }
}
