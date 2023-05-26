// package TA1.QUE1;

public class department {
  String name;
  student[] s;
  teacher[] t;

  department(String name1, student[] s1, teacher[] t1){
    name = name1;
    s = s1;
    t = t1;
  }

  void display(){
    System.out.println("--------Dept.--------");
    System.out.println("Name : "+name);
    System.out.println("No of students : "+s.length);
    System.out.println("No of Teachers : "+t.length);
  }

  void avgages(){
    int avg=0;
    for (student st : s) {
      avg += st.calculateAge();
    }
    System.out.println("Avg of Ages : "+ ((double) avg/ (double)s.length));
  }

  void minmax(){
    int min = 100,max = 0;
    for (teacher ta : t) {
      if(min > ta.calculateAge())
        min = ta.calculateAge();
      
      if(max < ta.calculateAge())
        max = ta.calculateAge();
    }

    System.out.println("Min Age : "+ min+" Max Age : "+ max);
  }

  void deptavg(){
    double avg = 0;
    for (student st : s) {
      avg += st.cgpa;
    }

    System.out.println("Dept Average is : "+ (avg/s.length));
  }

  void semavg(int sem){
    double avg = 0,cnt = 0;
    for (student st : s) {
      if(st.sem == sem){
        avg += st.cgpa;
        cnt ++;
      }
    }

    System.out.println("Sem Average is : "+(avg/cnt));

  }

  
}
