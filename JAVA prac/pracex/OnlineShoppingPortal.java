// package pracex;

public class OnlineShoppingPortal {
// CODE SHOULD BE GET10 so manage it accordingly
  float value(float amt,String code){
    if(code.equals("GET10")){
    if(amt > 1000){
      float val =  amt * 0.3f;
      System.out.println("PRICE : "+ (amt-val));
      return (amt-val);
    }
    else{
      float val = amt * 0.2f;
      System.out.println("PRCICE : "+ (amt-val));
      return (amt-val);
    }
  }
  else{
    System.out.println("INVALID PROMO CODE : REGULAR CUSTOMER");
    return (value(amt));
}
  }

  float value(float amt){
    if(amt > 500){
      float val =  amt * 0.1f;
      System.out.println("PRICE : "+ (amt-val));
      return (amt-val);
    }
    else{
      float val = 10.0f;
      System.out.println("PRCICE : "+ (amt-val));
      return (amt-val);
    }
  }
}
