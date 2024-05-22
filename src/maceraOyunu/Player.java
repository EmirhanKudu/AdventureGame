package maceraOyunu;

import java.util.Scanner;

public class Player {

	private int damage;
	private int health;
	private int maxHealth;
	private int money;
	private String name;
	private String charName;

	public Player(String name) {
		this.name = name;
	}

	public void selectChar() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("####################################");
		System.out.println(
				"1. Karakter : Samuray \t Hasar: 5 \t Sağlık: 21 \t Para: 5");
		System.out.println(
				"2. Karakter : Kovboy \t Hasar: 4 \t Sağlık: 14 \t Para: 30");
		System.out.println(
				"3. Karakter : Büyücü \t Hasar: 7 \t Sağlık: 9 \t Para: 50");
		System.out.println("####################################");
		System.out.print("Lütfen bir karakter seçiniz: ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			initPlayer("Samuray", 5, 21, 5);
			break;
		case 2:
			initPlayer("Kovboy", 4, 14, 30);
			break;
		case 3:
			initPlayer("Büyücü", 7, 9, 50);
			break;
		default:
			System.out.println(
					"Geçersiz seçim! Varsayılan olarak Samuray seçildi.");
			initPlayer("Samuray", 5, 21, 5);
			break;
		}

		// Maksimum sağlık puanını ayarlayalım
		this.maxHealth = this.health;

		System.out.println("Seçilen Karakter: " + getCharName());
		System.out.println("Hasar: " + getDamage() + "\tSağlık: " + getHealth()
				+ "\tPara: " + getMoney());
	}

	private void initPlayer(String charName, int damage, int health,
			int money) {
		this.charName = charName;
		this.damage = damage;
		this.health = health;
		this.money = money;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMaxHealth() { // Yeni eklenen metot
		return maxHealth;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}
}
