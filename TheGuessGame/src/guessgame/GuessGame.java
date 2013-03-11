package guessgame;

public class GuessGame {
	
	Player p1;
	Player p2; 
	Player p3;
	
	public void startGame(){
		boolean ok = true;
		
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		p1.guess();
		p2.guess();
		p3.guess();
		
		int guessNumber;
		guessNumber = (int) ( Math.random() * 10);
		System.out.println("Numarul cautat este "+ guessNumber);
		while (ok){
			System.out.println("Jucatorul 1 a ales numarul "+ p1.number);
			System.out.println("Jucatorul 2 a ales numarul "+ p2.number);
			System.out.println("Jucatorul 3 a ales numarul "+ p3.number);
			
			if ( p1.number == guessNumber){
				System.out.println("Jucatorul 1 a ghicit numarul!");
				ok = false;
			}
			
			if ( p2.number == guessNumber){
				System.out.println("Jucatorul 2 a ghicit numarul!");
				ok = false;
			}
			
			if ( p3.number == guessNumber){
				System.out.println("Jucatorul 3 a ghicit numarul!");
				ok = false;
			}
			
			if ( ok == true){
				System.out.println("Numarul nu a fost ghicit!");
				p1.guess();
				p2.guess();
				p3.guess();
			}
			else {
				System.out.println("Sfarsitul jocului!");
			}
		}	
	}
}
