import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void hasPaper() {
        assertEquals(50, printer.getNumberOfSheetsOfPaperLeft());
    }

    @Test
    public void willPrintSuccessfully() {
        printer.print(5, 5);
        assertEquals(25, printer.getNumberOfSheetsOfPaperLeft());
    }

    @Test
    public void willNotPrint() {
        printer.print(30, 5);
        assertEquals(50, printer.getNumberOfSheetsOfPaperLeft());
    }

    @Test
    public void getTonerVolume() {
        assertEquals(1000, printer.getTonerVolume());
    }

    @Test
    public void getTonerVolumeAfter20PagesPrinted() {
        printer.print(5, 4);
        assertEquals(980, printer.getTonerVolume());
    }

    @Test
    public void getTonerVolumeWontPrint() {
        printer.print(50, 4);
        assertEquals(1000, printer.getTonerVolume());
    }
}

