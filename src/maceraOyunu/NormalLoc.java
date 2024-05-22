package maceraOyunu;

import java.util.Scanner;

public class NormalLoc extends Location {

	public NormalLoc(Player player) {
		super(player);
	}

	@Override
	public boolean onLocation() {
		menu();
		return true;
	}

	private void menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Normal bir mekandasınız. Seçenekler:");
		System.out.println("1. Güvenli Ev");
		System.out.println("2. Mağaza");
		System.out.print("Bir seçenek seçin: ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			safeHouse();
			break;
		case 2:
			Store store = new Store(getPlayer());
			store.onLocation();
			break;
		default:
			System.out.println("Geçersiz seçim!");
			break;
		}
	}

	private void safeHouse() {
		System.out.println("Güvenli Evdesiniz. Sağlığınız yenilendi!");
		getPlayer().setHealth(21); // Burada, maksimum sağlık değeri karaktere
									// göre ayarlanabilir
		System.out.println("Mevcut Sağlık: " + getPlayer().getHealth());
	}
}
