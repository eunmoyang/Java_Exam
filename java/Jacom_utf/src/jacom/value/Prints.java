package jacom.value;

public class Prints {

	public static void printMainMenu() {
		System.out.println("====================");
		System.out.println("===   Main Menu  ===");
		System.out.println("====================");
		System.out.println("=== 1. List View ===");
		System.out.println("=== 2. new Write ===");
		System.out.println("=== 3. Update    ===");
		System.out.println("=== 4. Delete    ===");
		System.out.println("====================");
		System.out.println("===      0. exit ===");
		System.out.println("====================");
	}
	
	public static void printEmpty(int n) {
		for(int i=0; i<n; i++)
			System.out.println();
	}
	
	public static void printBViewMenu() {
		System.out.println("=====================");
		System.out.println("===   View Menu   ===");
		System.out.println("=====================");
		System.out.println("=== 1. Entry View ===");
		System.out.println("=== 2. Num Search ===");
		System.out.println("=== 3. Delete View===");
		System.out.println("=====================");
		System.out.println("===       0. exit ===");
		System.out.println("=====================");
	}
	
	public static void printBWUpdateMenu() {
		System.out.println("=====================");
		System.out.println("===  Update Menu  ===");
		System.out.println("=====================");
		System.out.println("=== 1. Num Search ===");
		System.out.println("=== 2. Name Search===");
		System.out.println("=====================");
		System.out.println("===       0. exit ===");
		System.out.println("=====================");
	}
	
}
