package maceraOyunu;

import java.util.Random;

public class Swamp extends Location {

	public Swamp(Player player) {
		super(player);
	}

	@Override
	public boolean onLocation() {
		System.out.println("Bataklıkta bir düşmanla karşı karşıyasınız!");
		createEnemies();
		battle();
		return true;
	}

	private void createEnemies() {
		Random random = new Random();
		int enemyCount = random.nextInt(2) + 1; // Rastgele 1 veya 2 düşman
												// oluştur
		for (int i = 0; i < enemyCount; i++) {
			Dusman dusman = new Troll(); // Bataklıkta troll spawn olacak
			dusman.spawn();
		}
	}

	private void battle() {

	}
}
