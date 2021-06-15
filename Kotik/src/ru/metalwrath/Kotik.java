package ru.metalwrath;

public class Kotik {
	private int hunger = 50;
	private int prettiness;
	private String name;
	private int weight;
	private String meow;

	// GETTERS & SETTERS
	public int getPrettiness() {
		return prettiness;
	}

	public void setPrettiness(int prettiness) {
		this.prettiness = prettiness;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getMeow() {
		return meow;
	}

	public void setMeow(String meow) {
		this.meow = meow;
	}

	// CONSTRUCTORS

	public Kotik(int prettiness, String name, int weight, String meow) {
		super();
		this.prettiness = prettiness;
		this.name = name;
		this.weight = weight;
		this.meow = meow;
	}

	public Kotik() {
	}

	// METHODS

	public void liveAnotherDay() {
		for (int i = 0; i < 24; i++) {
			int random = (int) (Math.random() * 4 + 1);

			switch (random) {
			case 1:
				play();
				break;

			case 2:
				sleep();
				break;

			case 3:
				chaseMouse();
				break;

			case 4:
				claws();
				break;

			default:
				System.out.println("ERROR! YOU NOOB!");
				break;
			}

		}
	}

	public void eat() {
		hunger += 15;
		System.out.println(name + " OM-NOM-NOM!");
	}

	public void play() {
		if (hunger < 1) {
			System.out.println(name + " is say: I am hungry! I cant do anythink!");
			eat();
		} else {
			System.out.println(name + " is playing!");
			hunger -= 10;
		}

	}

	public void sleep() {
		if (hunger < 1) {
			System.out.println(name + " is say: I am hungry! I cant do anythink!");
			eat();
		} else {
			System.out.println(name + " is sleeping!");
			hunger -= 10;
		}
	}

	public void chaseMouse() {
		if (hunger < 1) {
			System.out.println(name + " is say: I am hungry! I cant do anythink!");
			eat();
		} else {
			System.out.println(name + " is hunting!");
			int huntRandom = (int) (Math.random() * 10);
			if (huntRandom < 5) {
				System.out.println("Great hunt! " + name + " chase the mouse and kill her!");
				hunger += 20;
			} else {
				System.out.println("Hunt is failed. " + name + " is are luser! ");
				hunger -= 10;
			}

		}
	}

	public void claws() {
		if (hunger < 1) {
			System.out.println(name + " is say: I am hungry! I cant do anythink!");
			eat();
		} else {
			System.out.println(name + " is harpens claws on wallpaper! Pidor pushistiy.");
			hunger -= 10;
		}
	}

}
