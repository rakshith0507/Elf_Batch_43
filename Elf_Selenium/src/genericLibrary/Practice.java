package genericLibrary;

public class Practice {
	public static void main(String[] args) {
		String excel = Utility.fromExcel("Test", 9, 3);
		System.out.println(Utility.fromPropertyFile("url"));
		System.out.println(excel);
		
	}

}
