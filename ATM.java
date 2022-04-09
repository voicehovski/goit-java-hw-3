public class ATM {
	public int countBanknotes(int sum) {
		int [] banknotes = new int [] {
			500, 200, 100, 50, 20, 10, 5, 2, 1
		};
		  
		int bCount = 0;
		int index = 0;
		while ( ( bCount = sum / banknotes [index] ) == 0 ) {
			index++;
		}
		
		int chains = sum % banknotes [index];
		if ( chains != 0 ) {
			bCount += countBanknotes ( chains );
		}

		return bCount;
	}
}
