package ch16.gamelevel;

public class Player {
	public PlayerLevel Level;
	
	public Player(){
		Level = new BeginnerLevel();
		
	}

	public PlayerLevel getLevel() {
		return Level;
	}

	public void uppgradeLevel(PlayerLevel Level) {
		this.Level = Level;
		Level.showLevelMessage();
	}
	public void play(int count) {
		Level.go(count);
	}
	
}
