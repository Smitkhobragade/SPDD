// package prac2;

public class Employee {
  String nm,des;
  int id,age;
  Attendance[] a = new Attendance[3];

  Employee(String name,int id1,int age1,String Designation,Attendance[] a1){
    nm = name;
    id = id1;
    age = age1;
    des = Designation;
    a = a1;
  }
  void Display1(){
    System.out.println("----------------!!!!--------------------");
    System.out.println("Name : "+nm);
    System.out.println("ID : "+id);
    System.out.println("Age : "+age);
    System.out.println("Designation : "+des);
    for(Attendance a2:a){
      a2.Display();
    }
    System.out.println("----------------------------------------");
  }

  void workingHours(){
    Time t1= new Time(0,0,0);
    for(Attendance a2:a){
      Time t2 = a2.hoursworked();
      // t2.display();
      t1 = t2.Add(t1, t2);
      // System.out.println("----  ");
      // t1.display();
    }
    System.out.println("TOTAL HOURS WORKED : "+t1.h);
  }

  void workingHours(int dt1,int dt2,int mn1,int mn2){
    Time t1= new Time(0,0,0);
    for(Attendance a2:a){
      if((a2.mn >= mn1)&&(a2.mn <= mn2)){
        if((a2.dt >= dt1 )&&(a2.dt <= dt2)){
          Time t2 = a2.hoursworked();
          t1 = t2.Add(t1, t2);
        }
      }
    }
    System.out.println("TOTAL HOURS WORKED : "+t1.h);
  }

  void workingHours(int mn1){
    workingHours(1, 30, mn1, mn1);
  }
  
}
