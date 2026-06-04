

public class date_day {
    public static void main(String[] args)
     {
    int day = 7 , month=10, yyyy=2004;

    int monthcode[]={0,3,3,6,1,4,6,2,5,0,3,5};
    String[]  daycode={"Sun","Mon","tue","wed","thu","Fri","Sat"};
    int mc=monthcode[month-1];
    int yc=yyyy%100;

    int leap=0;

    if (yyyy % 4 == 0 && (month == 1 || month == 2))
    {
        leap = -1;
    }

    int result=(day+mc+6+yc+leap)%7;

    System.out.println(daycode[result]);
        
    }
    
}
