import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Download the two source code files of sample code named Temperature.java and TemperatureConverter.java.
// Those two files make a standalone program which converts Celsius to Fahrenheit and Fahrenheit to Celsius.
//For this assignment, write a JUnit test case to test two methods in the Temperature class.
// Test the toCelsius method, and also write a test case to test the toFahrenheit method.
// You can write both test cases in one class file, which should be a JUnit test file.

class TemperatureTest {

    @Test
    void testConverterFromFahrenheitToCelsius() {
        Temperature temperature = new Temperature();
        double tempF = 80;
        double testTemperature = temperature.toCelsius(tempF);
        double expectTemperature = 26.666667;
        int allowableDifference = 1;

        assertEquals(testTemperature, expectTemperature, allowableDifference);
    }

    @Test
    void testConverterFromCelsiusToFahrenheitWithParams() {
        Temperature temperature = new Temperature();
        double tempC = 50;
        double testTemperature = temperature.toFahrenheit(tempC);
        double expectTemperature = 122;
        int allowableDifference = 1;

        assertEquals(testTemperature, expectTemperature, allowableDifference);
    }

    @Test
    void testingSetFarMethod() {
        Temperature temperature = new Temperature();
        temperature.setFahrenheit(88);

        assertEquals( 88, temperature.toFahrenheit());
    }

    @Test
    void testingSetCelsiusMethod(){
        Temperature temperature = new Temperature();
        temperature.setCelsius(30);

        assertEquals( 30, temperature.toCelsius());

    }
    
}