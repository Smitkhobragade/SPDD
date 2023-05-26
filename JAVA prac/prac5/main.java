// package prac5;

public class main {
  public static void main(String[] args) {
    
    
    student s = new student();
    // CORRECT Passing
    try{
      s.initalise_std("Smit", 10, "BE22CSU110", "Hello&11");
      s.display();
    }catch(studentException ex){
      String err = ex.displayException();
      System.out.println("FOUND -- "+err);
    }

    // INVALID CGPA
    try{
      s.initalise_std("Smit", 10.1, "BE22CSU110", "Hello&11");
      s.display();
    }catch(studentException ex){
      String err = ex.displayException();
      System.out.println("FOUND -- "+err);
    }

    // INVALID Length of Enrollment no.
    try{
      s.initalise_std("Smit", 10, "BE22CSU1110", "Hello&11");
      s.display();
    }catch(studentException ex){
      String err = ex.displayException();
      System.out.println("FOUND -- "+err);
    }
    
    // Invalid Branch
    try{
      s.initalise_std("Smit", 10, "BE22ABC110", "Hello&11");
      s.display();
    }catch(studentException ex){
      String err = ex.displayException();
      System.out.println("FOUND -- "+err);
    }

    // Inavlid Degree
    try{
      s.initalise_std("Smit", 10, "AB22CSU110", "Hello&11");
      s.display();
    }catch(studentException ex){
      String err = ex.displayException();
      System.out.println("FOUND -- "+err);
    }

    // Invalid Year
    try{
      s.initalise_std("Smit", 10, "BE25CSU110", "Hello&11");
      s.display();
    }catch(studentException ex){
      String err = ex.displayException();
      System.out.println("FOUND -- "+err);
    }

    // Invalid Roll no.
    try{
      s.initalise_std("Smit", 10, "BE22CSU300", "Hello&11");
      s.display();
    }catch(studentException ex){
      String err = ex.displayException();
      System.out.println("FOUND -- "+err);
    }

    // Invalid Password length
    try{
      s.initalise_std("Smit", 10, "BE22CSU110", "Hello");
      s.display();
    }catch(studentException ex){
      String err = ex.displayException();
      System.out.println("FOUND -- "+err);
    }

    // No small letter
    try{
      s.initalise_std("Smit", 10, "BE22CSU110", "HELLO134%");
      s.display();
    }catch(studentException ex){
      String err = ex.displayException();
      System.out.println("FOUND -- "+err);
    }

    // no capital letter
    try{
      s.initalise_std("Smit", 10, "BE22CSU110", "ello12&qw");
      s.display();
    }catch(studentException ex){
      String err = ex.displayException();
      System.out.println("FOUND -- "+err);
    }

    // no numbers
    try{
      s.initalise_std("Smit", 10, "BE22CSU110", "Hello&as");
      s.display();
    }catch(studentException ex){
      String err = ex.displayException();
      System.out.println("FOUND -- "+err);
    }

    // No Special charachters
    try{
      s.initalise_std("Smit", 10, "BE22CSU110", "Hello123");
      s.display();
    }catch(studentException ex){
      String err = ex.displayException();
      System.out.println("FOUND -- "+err);
    }

  }
}
