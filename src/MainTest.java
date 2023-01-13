import org.junit.Test;

import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void Test1(){
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(2);
        String a = Main.result(1, 1);
        assertEquals(formatter.format(Math.cos(1)), a);
    }

    @org.junit.jupiter.api.Test
    void Test2(){
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(2);
        String a = Main.result(2, 2);
        assertEquals(formatter.format(Math.cos(2)), a);
    }

    @org.junit.jupiter.api.Test
    void Test3(){
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(2);
        String a = Main.result(3, 1000);
        assertEquals(formatter.format(Math.cos(1000)), a);
    }

}