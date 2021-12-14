public class Time {
    private int hour, minute, second;

    public Time(){
        hour = 12;
        minute = 30;
        second = 15;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public String toString(){
        return hour  + ":" + minute + ":" + second;
    }
}
