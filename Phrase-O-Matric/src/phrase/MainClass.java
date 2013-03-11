package phrase;

public class MainClass {

	public static void main(String[] args) {
		
		String[] persoana = { "Andrei", "Viorel", "Corina", "Alexandra" };
		String[] actiune = { "mananca", "respira", "citeste", "calca" };
		String[] timp = { "mereu", "cand apuca", "cand nu trebuie", "duminica" };
		
		int sizePersoana = persoana.length;
		int sizeActiune = actiune.length;
		int sizeTimp = timp.length;
		
		int randomPersoana = (int) ( Math.random() * sizePersoana);
		int randomActiune = (int) ( Math.random() * sizeActiune);
		int randomTimp = (int) ( Math.random() * sizeTimp) ;
		
		String propozitie = persoana[ randomPersoana] + " " + actiune[randomActiune] +
				" " + timp[ randomTimp] + "." ;
		
		System.out.println(propozitie);
	}

}
