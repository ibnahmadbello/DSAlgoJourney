package gridTraveler;

public class GridTraveler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfRoute(2, 3));
		System.out.println(numberOfRoute(10, 9));
		System.out.println(numberOfRoute(18, 18));
	}
	
	public static int numberOfRoute(int row, int column) {
		if(row == 1 && column == 1) return 1;
		if(row == 0 || column == 0) return 0;
		return numberOfRoute(row - 1, column) + numberOfRoute(row, column - 1);
	}

}
