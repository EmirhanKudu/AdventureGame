package maceraOyunu;

public interface Dusman {
	String getName();

	int getDamage();

	int getHealth();

	void setHealth(int health);

	void attack(Player player);

	void spawn();
}
