class Temp_sensor implements Sensors{
    /*detecting the temp of bed*/
}
class Humidity_sensor implements Sensors{
    /*to notify when bed is wet or humid*/
}
class Call_button implements Actuators{
    /*call for help*/
}
class Light implements Actuators,Rules{
    /*emergency light to inform or call*/
}
class Message implements Actuators,Rules{
    /*send sms if the bed is not attended for long time*/
}
       
package edu.mits.iot.example;
/**
 *
 * @author mits
 */
public class Smartbed implements Device,Sensors,Actuators,Rules{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
