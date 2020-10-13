
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Création et utilisation du Client c1.
        Client c1 = new Client(1234);
        
        // Création et utilisation du Client c2.
        Client c2 = new Client(987654321);
       
        // Affichage des logs en console.
        String s = Terre.getInstance().getAge();
        String y = Terre.getInstance().getPopulation();
        System.out.println(s);
        System.out.println(y);
	}

}
