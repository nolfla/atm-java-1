public class ATM{
  public static int totalMoney = 0;
  
  public int money;
  
  public ATM(int money){
    this.money = money;
  }
  
  public static int getMoney(){
    return this.money;
  }
  
  public int getTotalMoney(){
    return totalMoney;
  }
  
}
