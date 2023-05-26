public class SavingAccount extends BankAccount implements Debitable {
  int year;

  SavingAccount(String Name,int Aadhar){
    super(Name, Aadhar, 1);
  }

  @Override
  public void withdraw(int amt) {
    if(state){
      if(bal > amt){
        bal = bal - amt;
        System.out.println("Balance is "+ bal);
      }else{
        System.out.println("Insufficient balance cannot debit");
      }
      
    }
    else{
      System.out.println("The Account has been closed");
    }
    // TODO Auto-generated method stub

  }
}
