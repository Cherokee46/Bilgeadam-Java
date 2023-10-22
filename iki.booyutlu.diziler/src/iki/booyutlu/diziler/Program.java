package iki.booyutlu.diziler;

public class Program {
	// tek boyutlu dizi
	int arr[] = {1,2,3};
	
	int[] arr1 = new int[3];
	
	int[] arr2 = new int[] {4,5,6};
	
	// iki boyutlu dizi
	
	int[][] ikiBoyutluDizi = {};
	
	int[][] ikiBoyutluDizi_1 = new int[3][3];
	
	int[][] ikiBoyutluDizi_2 = new int[][] {};
	
	int [] ikiBoyutluDizi_3 [] = new int[3][];
	
	int ikiBoyutluDizi_4 [][] = new int[3][];
	
	
	
	public static void main(String[] args) {
		String[][] ticTacToe = {{"1","2","3"}, {"4","5","6"},{"7","8","9"}};
	
		for (int i = 0; i < ticTacToe.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < ticTacToe.length; j++) {
				System.out.print(ticTacToe[i][j] + " | ");
			}
			System.out.println();
			System.out.println("------------");
		}
	}

}
