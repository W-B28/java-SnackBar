package snacks;

public class VendingMachine {
    
    private static int maxId = 0;
    public int id;
    public String name;
    
    
    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }
    
    public String getName()
    {
        System.out.println("name: " + name );
        return name;
    }
    
    @Override
            public String toString()
            {
                String rtrStr = "id: " + id + "\n" +
                                "name: " + name;
                return rtrStr;
            }
 
}