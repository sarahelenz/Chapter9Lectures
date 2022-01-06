public class LightBulb {
   boolean onOrOff;
   int temperature;
    public LightBulb(){
        onOrOff = false;
        temperature = 0;
    }
    public LightBulb(int temperature){
       if(temperature >= 0 && temperature <= 5000)
        this.temperature = temperature;
    }
    public LightBulb(LightBulb l){
        if(this.temperature >= 0 && this.temperature <= 5000)
            this.temperature = l.temperature;
    }
    public boolean turnOn(){
        onOrOff = true;
        return onOrOff;
    }
    public boolean turnOff(){
        onOrOff = false;
        return onOrOff;
    }
    public boolean isOn(){
        if(onOrOff == true){
            return true;
        }else{
            return false;
        }
    }
    public int decreaseTemperatureBy(int x){
        if(this.temperature >= 0 && this.temperature <= 5000) {
            return temperature - x;
        }else{
            return this.temperature;
        }
    }
    public int increaseTemperatureBy(int x){
        if(this.temperature >= 0 && this.temperature <= 5000) {
            return temperature + x;
        }else {
            return this.temperature;
        }
    }
}
