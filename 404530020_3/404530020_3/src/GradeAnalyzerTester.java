
/*
 * [A]102
 * [TA's Advise]
 * 1. Good.
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		double tempScore = 0;
		String tempInput = "";
		GradeAnalyzer GA = new GradeAnalyzer();

		while (true) {
			tempInput = JOptionPane.showInputDialog(null, "Please input one score");
			if (tempInput.equalsIgnoreCase("q")) {
				break;
			}
			try {
				GA.addGrade(Double.parseDouble(tempInput));
			} catch (Exception e) {
				System.out.println("[System]Please input valid number");
			}
		}
		if (GA.cntInput < 2) {
			System.out.print("please input again");
		} else {
			GA.analyzeGrades();
			System.out
					.println("You entered " + GA.cntInput + " valid grades from 0 to 110. Invalid grades are ignored!");

			System.out.println(
					"The average = " + (int) GA.average + " with a standard deviation = " + (int) GA.standardDeviation);

			System.out.println(GA.toString());
		}

	}

}