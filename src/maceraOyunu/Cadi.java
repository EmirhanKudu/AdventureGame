package maceraOyunu;

public class Cadi implements Dusman {
	private String name;
	private int damage;
	private int health;

	public Cadi() {
		this.name = "Cadı";
		this.damage = 5;
		this.health = 8;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getDamage() {
		return damage;
	}

	@Override
	public int getHealth() {
		return health;
	}

	@Override
	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public void attack(Player player) {
		player.setHealth(player.getHealth() - this.damage);
	}

	@Override
	public void spawn() {
		System.out.println("Cadı ortaya çıktı!");
	}
}
