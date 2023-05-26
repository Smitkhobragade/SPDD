// package TA1.QUE1;

public class student extends person{
  int rollno, sem;
  double cgpa;
  student(String name, String dob,int rollno1,int sem1, double cgpa1){
    super(name, dob);
    rollno = rollno1;
    sem = sem1;
    cgpa = cgpa1;
  }

  void display(){
    System.out.println("--------Student--------");
    System.out.println("Name : "+ name);
    // calculateAge();
    System.out.println("Date of Birth : "+dob);
    System.out.println("Age : "+calculateAge());
    System.out.println("Roll no : "+rollno);
    System.out.println("Semester : "+sem);
    System.out.println("CGPA : "+cgpa);
  }
}
