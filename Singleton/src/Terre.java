
public class Terre {
    private static Terre uniqueInstance; // Stockage de l'unique instance de cette classe.
    private int age;
    private int population;
    
    // Constructeur en privé (donc inaccessible à l'extérieur de la classe).
    private Terre()
    {
            age = new int();
            population = new int();
    }
    

    public static synchronized Terre getInstance()
    {
            if(uniqueInstance==null)
            {
                    uniqueInstance = new Terre();
            }
            return uniqueInstance;
    }
    
    public void SetAge(int age)
    {
            this.age=age;
           
           
    }
    
    
    public int getAge()
    {
            return age;
    }
    
      public void SetPopulation(int population)
    {
            this.population=population;
           
           
    }
    
    
    public int getPopulation()
    {
            return population;
    }
}
