package maceraOyunu;

import java.util.Random;

public class Cave extends Location {

	public Cave(Player player) {
		super(player);
	}

	@Override
	public boolean onLocation() {
		System.out.println("Mağarada bir düşmanla karşı karşıyasınız!");
		createEnemies();
		battle();
		return true;
	}

	private void createEnemies() {
		Random random = new Random();
		int enemyCount = random.nextInt(2) + 1; // Rastgele 1 veya 2 düşman
												// oluştur
		for (int i = 0; i < enemyCount; i++) {
			Dusman dusman = new Kurt();
			dusman.spawn();
		}
	}

	private void battle() {

	}
}
