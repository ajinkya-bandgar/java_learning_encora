public class DateUtil{
    private int day;
    private int month;
    private int year;

    DateUtil(int day,int month,int year){
        this.day = day;
        this.year = year;

        //for month
        this.month = (month < 1) ? 1 : (month > 12) ? 12 : month;

        //for year (considering max till next 10 years from now)
        this.year = (year < 2023) ? 2023 : (year > 2033) ? 2033 : year;

        //for day without leap year
       this.day = this.setDate(day,month,year);
    }

    boolean isLeapYear(int year) {
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) ? true : false;
	}
    
    int setDate(int date,int month,int year){
     return (day < 1) ? 1 : (this.isLeapYear(year) && month == 2 && day > 29) ? 29 : (!this.isLeapYear(year) && month == 2 && day > 28) ? 28 : 
                   ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) ? 31 :
                   ((month == 4 || month == 6 || month == 9 || month == 11 || month == 8) && day > 30) ? 30 : day; 
    }

    @Override
	public String toString() {
		return day + "-" + month + "-" + year;
	}
}