package GUI;

public class InitiateGameDisplayThread extends Thread {
	
	ServerListener sl;
	
	public InitiateGameDisplayThread(ServerListener sl){
		this.sl = sl;
	}
	
	public void run(){
		System.out.println("TESTSTGAME");
		sl.enterGameFrame();
		
		System.out.println( " INIIIII  TESTSTGAME");
		sl.initializeGame();
		
	}

}
