import org.junit.*;

public class CalculatorTests {

    private Calculator calculator;

    @BeforeClass // Ta metoda wykona się przed wszystkimi testami
    public static void setUpBefore() throws Exception{

    }

    @AfterClass // Ta metoda wykona sie po wszystkich testach
    public static void tearDown() throws  Exception{

    }

    @Before // Ta metoda wykona sie przed kazdym testem
    public void setUp() {
        calculator = new Calculator();
    }

    @After // Ta metoda wykona sie po kazdym tescie
    public void setDown() {

    }

    @Test
    public void testAdd(){


        Assert.assertEquals("Nie 10",10,calculator.add(5,5));
        Assert.assertEquals("Nie 0",0,calculator.add(-5,5));
        Assert.assertEquals("Nie -10",-10,calculator.add(-5,-5));
        Assert.assertEquals("Nie -2",-2,calculator.add(Integer.MAX_VALUE,Integer.MAX_VALUE));
    }
    @Test
    public void testSubtraction(){

        Assert.assertEquals("Nie 5",5,calculator.subtraction(10,5));
        Assert.assertEquals("Nie -10",-10,calculator.subtraction(5,15));


    }


}
