// package prac2;

public class Attendance {
  int dt,mn,yr;
  Time t,t1;
  Attendance(int date,int month,int year,Time q,Time q2){
    dt = date;
    mn = month;
    yr = year;
    t = q;
    t1 = q2;
  }

  void Display(){
    System.out.println("----------------------------------------");
    System.out.println("DATE : "+dt+" - "+mn+" - "+yr);
    System.out.print("TIME IN --> ");
    t.display();
    System.out.print("TIME OUT --> ");
    t1.display();
    System.out.println("----------------------------------------");

  }
  Time hoursworked(){
    Time q3 = t.Sub(t1, t);
    // System.out.println("Hours Worked : "+q3.h);
    return q3;
  }
}
