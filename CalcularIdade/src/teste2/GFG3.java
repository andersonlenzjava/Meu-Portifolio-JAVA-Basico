package teste2;

import java.time.LocalDate;
import java.time.Period;

class GFG3 {

	// Function to print difference in
	// time start_date and end_date
	static void findDifference(LocalDate start_date, LocalDate end_date) {

		// find the period between
		// the start and end date
		Period diff = Period.between(start_date, end_date);

		// Print the date difference
		// in years, months, and days
		System.out.print("Difference " + "between two dates is: ");

		// Print the result
		System.out.printf("%d years, %d months" + " and %d days ", diff.getYears(), diff.getMonths(), diff.getDays());
	}

	// Driver Code
	public static void main(String[] args) {
		// Start date
		LocalDate start_date = LocalDate.of(2018, 01, 10);

		// End date
		LocalDate end_date = LocalDate.of(2020, 06, 10);

		// Function Call
		findDifference(start_date, end_date);
	}
}