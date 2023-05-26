// package prac2;

public class Main {
  public static void main(String[] args) {
    Time s1 = new Time(3,59,0);
    s1.display();
    Time s2 = new Time(1,58,1);
    Time s3 = new Time(10,0,1);

    s2.display();
    Time s = s1.Add(s1, s2);
    s.display();
    Time sa = s1.Sub(s1, s2);
    sa.display();

    Attendance[] a = new Attendance[8];
    a[1] = new Attendance(4, 2, 2023, s1,s2);
    a[0] = new Attendance(1, 2, 2023, s1,s2);
    a[2] = new Attendance(6, 2, 2023, s1,s3);
    a[3] = new Attendance(10, 2, 2023, s1,s3);
    a[4] = new Attendance(15, 2, 2023, s2,s3);
    a[5] = new Attendance(20, 2, 2023, s2,s3);
    a[6] = new Attendance(2, 3, 2023, s2,s3);
    a[7] = new Attendance(4, 3, 2023, s2,s3);

    a[0].Display();

    Employee e1 = new Employee("Shreyash", 62, 20, "Student", a);
    e1.Display1();
    e1.workingHours(); // if not parameter passed it gives all hours worked in whole working span
    e1.workingHours(2); // if only one parameter it takes as a month and gives working hours of month
    e1.workingHours(1, 15, 2, 2); //4 parameters ==> date/month 1 and date/month2 it gives all working between these two dates
  }
}
