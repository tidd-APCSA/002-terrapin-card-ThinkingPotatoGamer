public class TerrapinCard {
  private double balance;

  
  public TerrapinCard(double balance){
    this.balance = balance;
  }

  
  public void payEconomical(){
    if(this.balance >= 2.5){
      this.balance -= 2.5;
    }
  }
  

  public void payGourment(){
    if(this.balance >= 4){
      this.balance -= 4;
    }
  }

  public void loadMoney(double amount){
    if(amount >= 0){
      this.balance += amount;
    }else{
      this.balance += (amount * -1);
    }
  }

  public double getBalance(){
    return this.balance;
  }
}
