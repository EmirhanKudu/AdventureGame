package maceraOyunu;

public class Kurt implements Dusman {
	private String name;
	private int damage;
	private int health;

	public Kurt() {
		this.name = "Kurt Adam";
		this.damage = 4;
		this.health = 15;
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
