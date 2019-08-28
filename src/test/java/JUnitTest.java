import org.junit.*;

import static org.junit.Assert.*;

public class JUnitTest {


    @Test
    public void test_findMax() {
        Finder find = new Finder();
        int[] i = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] j = new int[]{11,11,11,11,11,11,11,11,11,11};
        int ar1 = find.findMax(i);
        int ar2 = find.findMax(j);

        assertEquals(ar1,10);
        assertEquals(ar2,11);
    }
    @Test
    public void test_findMin() {
        Finder find = new Finder();
        int[] i = new int[]{2,3,54,654,7562,634,754,234,452,2,45};
        int[] j = new int[]{4,4,4,4,4,4,4,4,4};
        int ar1 = find.findMin(i);
        int ar2 = find.findMin(j);

        assertEquals(ar1,2);
        assertEquals(ar2,4);

    }


    @Test(expected = NullPointerException.class)
    public void test_NullMax() {
        Finder find = new Finder();
        int[] i;
        i = null;
        int ar1 = find.findMax(i);

    }

    @Test(expected = NullPointerException.class)
    public void test_emptyMax() {
        Finder find = new Finder();
        int[] j = new int[]{};
        int ar2 = find.findMax(j);
    }
    @Test(expected = NullPointerException.class)
    public void test_NullMin() {
        Finder find = new Finder();
        int[] i;
        i = null;
        int ar1 = find.findMin(i);

    }

    @Test(expected = NullPointerException.class)
    public void test_EmptyMin() {
        Finder find = new Finder();
        int[] j = new int[]{};
        int ar2 = find.findMin(j);
    }


}