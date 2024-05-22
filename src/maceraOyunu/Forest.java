package maceraOyunu;

import java.util.Random;

public class Forest extends Location {

	public Forest(Player player) {
		super(player);
	}

	@Override
	public boolean onLocation() {
		System.out.println("Ormanda bir düşmanla karşı karşıyasınız!");
		createEnemies();
		battle();
		return true;
	}

	private void createEnemies() {
		Random random = new Random();
		int enemyCount = random.nextInt(2) + 1; // Rastgele 1 veya 2 düşman
												// oluştur
		for (int i = 0; i < enemyCount; i++) {
			Dusman dusman = new Cadi(); // Ormanda cadı spawn olacak
			dusman.spawn();
		}
	}

	private void battle() {

	}
}
