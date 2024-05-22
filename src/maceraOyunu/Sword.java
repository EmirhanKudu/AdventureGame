package maceraOyunu;

public class Sword extends Tool {
	public Sword() {
		super("Kılıç", 3, 35);
	}

	@Override
	public void use(Player player) {
		player.setDamage(player.getDamage() + this.getDamage());
		System.out
				.println("Kılıç kullanıldı! Yeni Hasar: " + player.getDamage());
	}
}
