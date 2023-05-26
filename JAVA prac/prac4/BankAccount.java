public class BankAccount {
  static int counter1 = 0,counter2 = 0;
  int acno,aadhar;
  String name;
  boolean state;
  double roi,bal;

  BankAccount(String Name,int Aadhar,int i){
    state = true;
    name = Name;
    aadhar = Aadhar;
    acno = openAccount(i);
  }

// i = 0 for FD else Daving account
  private int openAccount(int i){
    if(i == 0){
      counter1 = counter1 + 1;
      return 55000+counter1-1;
    }
    else{
      counter2= counter2 + 1;
      return 11000+counter2-1;
    }
  }

  void deposit(int amt){
    if(state){
      bal = bal + amt;
      System.out.println("Balance is : "+bal);
    }
    else{
      System.out.println("The is Account is Closed");
    }

  }

  double closeAccount(){
    updateInterest();
    System.out.println("ACCOUNT CLOSED Money given back with updated interest : "+bal);
    state = false;
    return 0;
  }

  void updateInterest(){
    if(state){
      bal = bal + (bal * 0.04);
      System.out.println("Balance is now : "+bal);
    }
    else{
      System.out.println("You account is Closed");
    }

  }

  
  void display(){
    if(state){
      System.out.println("---------------------------");
      System.out.println("Name of Holder : "+name);
      System.out.println("Bank Account Number : "+acno);
      System.out.println("ACCOUTN BAL IS : "+bal);
    }
    else{
      System.out.println("ACCOUNT IS CLOSED");
    }

  }
  
}
