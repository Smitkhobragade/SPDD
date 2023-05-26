// package prac2;

public class Time {
  int h,m,s;
  Time(int hr,int ms,int sc){
    h = hr;
    m = ms;
    s = sc;
  }

  Time Add(Time A,Time B){

    int sec = A.s + B.s;
    int sec1 = sec%60;
    int min = A.m + B.m + (sec/60);
    int mins = min%60;
    int hs = A.h + B.h + (min/60);

    Time n = new Time(hs,mins,sec1);

    return n;
  }

  Time Sub(Time A,Time B){
    int t1 = A.h*60*60 + A.m*60 + A.s;
    int t2 = B.h*60*60 + B.m*60 + B.s;
    int tot = t1-t2;
    if(tot > 0)
      tot += 0;
    else
      tot *= (-1);

    int mins = tot/60;
    int hrs = mins/60;

    Time n = new Time(hrs,mins%60,tot%60);

    return n;  

  }

  void display(){
    System.out.println("Hours: "+h+" Mins: "+m+" Sec: "+s);
  }
}

