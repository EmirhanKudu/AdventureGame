package maceraOyunu;

public class Armor extends Tool {
	public Armor() {
		super("Zırh", 0, 50);
	}

	@Override
	public void use(Player player) {
		player.setHealth(player.getHealth() + 10);
		System.out
				.println("Zırh kullanıldı! Yeni Sağlık: " + player.getHealth());
	}
}
