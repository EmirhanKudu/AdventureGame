package maceraOyunu;

import java.util.Scanner;

public class Store extends Location {
	public Store(Player player) {
		super(player);
	}

	@Override
	public boolean onLocation() {
		System.out.println("Mağazaya hoş geldiniz!");
		boolean shopping = true;

		while (shopping) {
			int choice = menu();
			switch (choice) {
			case 1:
				buyItem(new Sword());
				break;
			case 2:
				buyItem(new Gun());
				break;
			case 3:
				buyItem(new Armor());
				break;
			case 4:
				shopping = false;
				break;
			default:
				System.out.println("Geçersiz seçim!");
				break;
			}
		}
		return true;
	}

	private int menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Kılıç (Hasar: 3, Fiyat: 35)");
		System.out.println("2. Tabanca (Hasar: 5, Fiyat: 45)");
		System.out.println("3. Zırh (Sağlık: +10, Fiyat: 50)");
		System.out.println("4. Çıkış");
		System.out.print("Bir seçenek seçin: ");
		return scanner.nextInt();
	}

	private void buyItem(Tool tool) {
		if (getPlayer().getMoney() >= tool.getPrice()) {
			getPlayer().setMoney(getPlayer().getMoney() - tool.getPrice());
			tool.use(getPlayer());
			System.out.println(tool.getName() + " satın alındı!");
		} else {
			System.out.println("Yeterli paranız yok!");
		}
	}
}
