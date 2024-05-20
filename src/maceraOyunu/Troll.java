package maceraOyunu;

public class Troll implements Dusman {
	private String name;
	private int damage;
	private int health;

	public Troll() {
		this.name = "Troll";
		this.damage = 2;
		this.health = 12;
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
	public void attack(GameChar character) {
		character.setHealth(character.getHealth() - this.damage);
	}
}
