import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SortMenFromBoys_ {
    @Test
    public void normal_numbers() {
        ArrayList<Integer> test = new ArrayList<Integer>();
        ArrayList<Integer> real = new ArrayList<Integer>();
        test.add(7);
        test.add(3);
        test.add(14);
        test.add(17);


        real.add(14);
        real.add(17);
        real.add(7);
        real.add(3);
        Assert.assertEquals(real,new SortMenFromBoys().sort(test));
    }

    @Test
    public void negative_numbers() {
        ArrayList<Integer> test = new ArrayList<Integer>();
        ArrayList<Integer> real = new ArrayList<Integer>();
        test.add(-3);
        test.add(30);
        test.add(-12);
        test.add(7);


        real.add(-12);
        real.add(30);
        real.add(7);
        real.add(-3);
        Assert.assertEquals(real,new SortMenFromBoys().sort(test));
    }
}
