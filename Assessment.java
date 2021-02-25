package Assignment2;

public class Assessment {
	private char type;
	private int weight;

	private Assessment() {
		this.type = ' ';
		this.weight = 0;
	}

	public char getType() {
		return type;
	}

	public int getWeight() {
		return weight;
	}

	private Assessment(char a, int b) {
		this.type = a;
		this.weight = b;

	}

	public static Assessment getInstance(char a, int b) {
		Assessment assignment = new Assessment(a, b);
		return assignment;
	}

	public boolean equals() {
		return false;

	}
}