import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
 * Expected results:
 * 0 → 0
 * 1 → 1
 * 2 → 1
 * 3 → 2
 * 4 → 3
 * 5 → 5
 * -1 → exception
 * */

public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }

    @AfterEach
    public void finish(){
        fibonacci = null;
    }

    @Test
    public void should0Return0(){
        var expectedValue = 0;
        var obtainedValue = fibonacci.compute(0);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void should1Return1(){
        var expectedValue = 1;
        var obtainedValue = fibonacci.compute(1);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void should2Return1(){
        var expectedValue = 1;
        var obtainedValue = fibonacci.compute(2);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void should3Return2(){
        var expectedValue = 1;
        var obtainedValue = fibonacci.compute(2);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void should4Return3(){
        var expectedValue = 3;
        var obtainedValue = fibonacci.compute(4);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void should5Return5(){
        var expectedValue = 5;
        var obtainedValue = fibonacci.compute(5);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldNeg1ThrowException(){
        assertThrows(RuntimeException.class, ()-> fibonacci.compute(-1));
    }
}
