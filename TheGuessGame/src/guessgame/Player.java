package guessgame;

public class Player {
	
	public int number = 0;
	
	public void guess(){
		number = (int) ( Math.random() * 10);
	}

}
