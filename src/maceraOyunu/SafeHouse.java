package maceraOyunu;

public class SafeHouse extends Location {

	public SafeHouse(Player player) {
		super(player);
	}

	@Override
	public boolean onLocation() {
		System.out.println(
				"Güvenli Evdesiniz. Burada sağlığınız yenilenecek ve durumunuz kontrol edilecek.");
		heal();
		checkStatus();
		return true;
	}

	private void heal() {
		System.out.println("Sağlık yenileniyor...");
		getPlayer().setHealth(getPlayer().getMaxHealth());
		System.out.println("Sağlık tamamen yenilendi! Yeni Sağlık: "
				+ getPlayer().getHealth());
	}

	private void checkStatus() {
		System.out.println("Durum kontrol ediliyor...");
		if (getPlayer().getMoney() < 0) {
			System.out.println(
					"Dikkat! Borçlu durumdasınız. Paranız 0'ın altına düştü.");
			System.out.println("Para ekleniyor...");
			getPlayer().setMoney(10); // Varsayılan olarak oyuncuya 10 para
										// ekleniyor
			System.out.println("Yeni Paranız: " + getPlayer().getMoney());
		} else {
			System.out.println("Paranız ve diğer durumlar normal.");
		}
	}
}
