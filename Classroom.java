
public class Classroom {

	public static void main(String[] args) {
		Wilder jean = new Wilder("Jean", true);
		Wilder jacques = new Wilder("Jacques", true);
		Wilder nicolas = new Wilder("Nicolas", false);
		Wilder audrey = new Wilder("Audrey", false);
		
		System.out.println(jean.whoAmI());
		System.out.println(jacques.whoAmI());
		System.out.println(nicolas.whoAmI());
		System.out.println(audrey.whoAmI());
	}
	
}