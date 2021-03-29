package ch16.gamelevel;

public class MainBoardplay {

	public static void main(String[] args) {
		
		Player player1 = new Player();
		
		player1.Level.showLevelMessage();
		player1.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player1.uppgradeLevel(aLevel);
		player1.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player1.uppgradeLevel(sLevel);
		player1.play(3);
	}

}
