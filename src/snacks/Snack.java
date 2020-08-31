package snacks;

public class Snack 
{
   private static int maxId = 0;
   public int id;
   public String name;
   public int quantity;
   public double cost;
   public String vendingId;
   
   
//    setters
public Snack(String name, int quantity, double cost, String vendingId)

        {
        maxId++;
        id=maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingId = vendingId;

        }
        
        public int addSnack(int quantity)
        {
    
            this.quantity += quantity;
            return quantity;
        }
        public double buySnack(int amount)
        {
    
            double totalcost = getPrice(quantity);
            return totalcost;
        }
        
        // getters 
        public int getQuantity()
        {
            return quantity;

        }
        
        public double getPrice(int quantity)
        {
            System.out.println("Your total cost " + this.cost * quantity);
            return this.cost * quantity;
        
        }
        @Override
        public String toString()
        {
    
    
            String rtnStr = "name: " + name + "\n" +
                            "quantity: " + quantity + "\n" +
                            "cost: " + cost + "\n" +
                            "vendingId: " + vendingId;
            return rtnStr;
        }

}