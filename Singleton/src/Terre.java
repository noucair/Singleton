
public class Terre {
    private static Terre uniqueInstance; // Stockage de l'unique instance de cette classe.
    private int age;
    private int population;
    
    // Constructeur en priv� (donc inaccessible � l'ext�rieur de la classe).
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
