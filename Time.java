import java.util.ArrayList;

public class Time {
    public ArrayList<Integer> time;

    public Time(){
        time = new ArrayList<Integer>();
        time.add(12);
        time.add(0);
        time.add(0);
        //alternate
        //this(12,0,0);
    }

    public Time(int hour, int minute, int second){
        time = new ArrayList<Integer>();
        time.add(hour);
        time.add(minute);
        time.add(second);
    }

    public Time(Time t){
        this(t.time.get(0), t.time.get(1), t.time.get(2));
    }

    public String toString(){
        return time.get(0) + ":" + time.get(1) + ":" + time.get(2);
    }

//    private int hour, minute, second;
//
//    public Time(){
//        hour = 12;
//        minute = 30;
//        second = 15;
//    }
//
//    public Time(int hour, int minute, int second){
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;
//
//        //alternatives
//        setTime(12, 30, 12);
//
//      //  this(12,30,15);
//        //has to be first line of code
//    }
//    public Time(Time t){
//        this.hour = t.hour;
//        this.minute = t.minute;
//        this.second = t.second;
//
//        //alternative
//        setTime(t.hour,  t.minute, t.second);
//    }
//
//    public void setTime(int hour, int minute, int second){
//        if(hour >= 0 && hour <= 12)
//            this.hour = hour;
//        if(minute >= 0 && minute <= 59)
//            this.minute = minute;
//        if(second >= 0 && second <= 59)
//            this.second = second;
//    }
//    public int getHour() {
//        return hour;
//    }
//
//    public void setHour(int hour) {
//        this.hour = hour;
//    }
//
//    public int getMinute() {
//        return minute;
//    }
//
//    public void setMinute(int minute) {
//        this.minute = minute;
//    }
//
//    public int getSecond() {
//        return second;
//    }
//
//    public void setSecond(int second) {
//        this.second = second;
//    }
//    public String toString(){
//        return hour  + ":" + minute + ":" + second;
//    }
}
