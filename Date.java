public class Date {
    private int month;
    private int day;
    private int year;

    public Date() {
        month = 1;
        day = 1;
        year = 1;
    }
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public Date(Date d){
        this.month = d.month;
        this.day = d.day;
        this.year = d.year;
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >= 1 && month <= 12)
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day >= 1 && day <= 31)
            this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1)
        this.year = year;
    }
}
