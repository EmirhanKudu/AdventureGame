package maceraOyunu;

import java.util.Scanner;

public class Game {

	private Scanner input = new Scanner(System.in);

	public void start() {
		System.out.println("Macera oyununa Hoş geldiniz!");
		System.out.println("Lütfen bir isim giriniz: ");
		String playerName = input.nextLine();
		Player player = new Player(playerName);
		System.out.println("Sayın " + player.getName()
				+ ", bu karanlık ve sisli adaya hoş geldiniz!");
		System.out.println("Burada yaşananların hepsi gerçek!");
		System.out.println("Lütfen karakter seçiniz: ");
		player.selectChar();

		Location[] locations = { new Forest(player), new Cave(player),
				new Swamp(player), new NormalLoc(player) };

		while (true) {
			System.out.println("Mekanlar:");
			System.out.println("1. Orman");
			System.out.println("2. Mağara");
			System.out.println("3. Bataklık");
			System.out.println("4. Normal Bölge");
			System.out.print("Bir mekan seçin (çıkmak için 0): ");
			int choice = input.nextInt();

			if (choice == 0) {
				System.out.println("Oyundan çıkılıyor...");
				break;
			} else if (choice > 0 && choice <= locations.length) {
				locations[choice - 1].onLocation();
			} else {
				System.out.println("Geçersiz seçim!");
			}
		}
		input.close();
	}
}
