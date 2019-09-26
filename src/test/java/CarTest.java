import car_dealership.Car;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car( "Vertical", "Run Flat", "Alloy", "Blue", 20000.);
    }

    @Test
    public void carHasEngine(){
        assertEquals("Vertical", car.getEngine());
    }

    @Test
    public void carHasTyres(){
        assertEquals("Run Flat", car.getTyres());
    }

    @Test
            public void carHaswheels(){
        assertEquals("Alloy", car.getWheels());
    }

    @Test
    public void carHasColor(){
        assertEquals("Blue", car.getColor());
    }

    @Test
    public void carHasPrice(){
        assertEquals(20000, car.getPrice(),  0.01);
    }



}
