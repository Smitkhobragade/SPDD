public class Main {
  public static void main(String[] args) {
    Student s[] = new Student[5];
    s[0] = new HigherStudies("Shreyash", "Male", "CSE",9.72, "Btech", "RCOEM", "JEE", 1201, 100);
    s[1] = new Enterprenuership("Sahil", "Male", "CSE", 9.6, "Infosys", "Buisiness", 1000, 100000);
    s[2] = new Placement( "sujyot", "Male", "CSE", 9.7,"Tech", 100000, 12365);

    s[0].display();
    System.out.println("--------------------- Higher Studies ---------------------");
    s[1].display();
    System.out.println("--------------------- Enterprenuership ---------------------");
    s[2].display();
    System.out.println("--------------------- Placement ---------------------");

  }
}
