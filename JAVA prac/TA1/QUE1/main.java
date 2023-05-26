// package TA1.QUE1;

public class main {
  public static void main(String[] args) {
    person a = new person("SMIT", "13/08/2003");
    a.displayperson();
    student s1 = new student("Smit", "13/08/2003", 64, 3, 9.32);
    s1.display();
    teacher t1 = new teacher("Smit", "13/08/2004", "PG", 4);
    t1.display();

    student s[] = new student[5];
    s[0] = new student("Sahil", "12/02/2002", 56, 3, 9.23);
    s[1] = new student("Shreyash", "01/04/2003", 62, 4, 9.43);
    s[2] = new student("Saurabh", "18/05/2004", 61, 3, 9.0);
    s[3] = new student("Sujyot", "29/08/2003", 78, 5, 9.1);
    s[4] = new student("Sarang", "10/10/2003", 58, 3, 9.2);

    teacher t[] = new teacher[3];
    t[0] = new teacher("QWERTY", "20/04/1990", "PG", 5);
    t[1] = new teacher("ASDFG", "16/05/1993", "PHD", 3);
    t[2] = new teacher("ZXCVB", "01/12/1992", "PHD", 4);

    department d = new department("CSE", s, t);
    d.display();
    d.avgages();
    d.deptavg();
    d.semavg(3);
    d.minmax();

    

  }
}
