public class CardRunner {
  public static void main(String args[]){
    // ☕
    TerrapinCard billy = new TerrapinCard(20);
       
    TerrapinCard brian = new TerrapinCard(30); 
   
    brian.payEconomical();
    System.out.println("Brian: " + brian.getBalance());

        
    billy.payGourment();
    System.out.println("Billy: "+ billy.getBalance());

    brian.payGourment();
    System.out.println("Brian: " +   brian.getBalance());  
  
    billy.loadMoney(20);
    System.out.println("Billy: "+ billy.getBalance());
  
    brian.loadMoney(50);
    System.out.println("Brian: " +   brian.getBalance()); 

    billy.payEconomical();
    billy.payEconomical();
    System.out.println("Billy: " +   billy.getBalance()); 
  }
}

