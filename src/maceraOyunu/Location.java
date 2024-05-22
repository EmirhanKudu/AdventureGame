package maceraOyunu;

public abstract class Location {
	private Player player;

	public Location(Player player) {
		this.player = player;

	}

	public abstract boolean onLocation();

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}