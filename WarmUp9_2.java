/*
 * Write a LightBulb class. The objects of the LightBulb class
 * need to know whether it is on or off. The objects
 * also need to know what the temperature the bulb is as an
 * integer from 0 to 5000. The class should be able to turn
 * on and off the light bulb and should be able to change
 * the light temperature. (ie. it is dimmable). When constructing
 * the objects of the class, we should be able to create a light
 * bulb with no arguments, both arguments and be able to copy a
 * bulb that was already created.
 *
 * When done, the class should work with the runner below.
 */

public class WarmUp9_2 {
    public static void main(String[] args) {
        LightBulb led = new LightBulb();
        LightBulb halogen = new LightBulb(5500);
        LightBulb led2 = new LightBulb(led);

        led.turnOn();
        halogen.turnOff();
        halogen.isOn();

        led.decreaseTemperatureBy(200);
        System.out.println(halogen.increaseTemperatureBy(1000));
    }
}
