package maceraOyunu;

public class Gun extends Tool {
	public Gun() {
		super("Tabanca", 5, 45);
	}

	@Override
	public void use(Player player) {
		player.setDamage(player.getDamage() + this.getDamage());
		System.out.println(
				"Tabanca kullanıldı! Yeni Hasar: " + player.getDamage());
	}
}
