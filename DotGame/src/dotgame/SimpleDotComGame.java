package dotgame;

public class SimpleDotComGame {

	public static void main(String[] args) {
		
		int numberOfGuesses = 0, startPosition;
		int[] loc = new int[3];
		boolean isAlive = true ;
		String guess, result;
		
		SimpleDotCom simpleDot = new SimpleDotCom();
		GameHelper helper = new GameHelper();
		
		startPosition = (int) ( Math.random() * 5 );
		
		loc[0] = startPosition;
		loc[1] = startPosition + 1;
		loc[2] = startPosition + 2;
		
		simpleDot.setLocationCells(loc);
		
		while ( isAlive == true){
			
			guess = helper.getUserInput("enter a number");
			
			result = simpleDot.checkYourself(guess);
			
			numberOfGuesses++;
			
			if ( result.equals("kill")){
				isAlive = false;
				System.out.println("Your number of guesses is "+ numberOfGuesses);
			}
		}

	}

}
