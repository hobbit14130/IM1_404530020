import java.util.ArrayList;

class MyCount {
	String name;
	int cnt;

	MyCount() {

	}

	MyCount(String _name, int _cnt) {
		this.name = _name;
		this.cnt = _cnt;
	}

	public String toString() {
		return this.name + "=" + this.cnt;
	}

}

public class GradeAnalyzer {

	int cntInput = 0;
	double totalNumber = 0, standardDeviation = 0, average = 0, sDTemp = 0;
	ArrayList<Double> numberScore = new ArrayList<Double>();
	MyCount[] GradeDistribution = new MyCount[11];
	boolean firstTime = true;

	;

	static boolean isValidGrade(double aGrade) {
		if (aGrade <= 110 && aGrade >= 0)
			return true;
		return false;
	}

	void addGrade(double Grade) { // 分數區間設定
		// Good, +2.
		if (firstTime) {
			GradeDistribution[0] = new MyCount("A+", 0);
			GradeDistribution[1] = new MyCount("A", 0);
			GradeDistribution[2] = new MyCount("A-", 0);
			GradeDistribution[3] = new MyCount("B+", 0);
			GradeDistribution[4] = new MyCount("B", 0);
			GradeDistribution[5] = new MyCount("B-", 0);
			GradeDistribution[6] = new MyCount("C+", 0);
			GradeDistribution[7] = new MyCount("C", 0);
			GradeDistribution[8] = new MyCount("C-", 0);
			GradeDistribution[9] = new MyCount("D", 0);
			GradeDistribution[10] = new MyCount("F", 0);
			firstTime = false;
		}

		if (!isValidGrade(Grade)) {
			return;
		}

		numberScore.add(Grade); // (100, 80, 60, 40, 20, 0)
		totalNumber = Grade + totalNumber;
		cntInput++;
		if (Grade >= 90) { // 區間條件區隔
			if (Grade >= 98)
				GradeDistribution[0].cnt++;
			else if (Grade >= 92)
				GradeDistribution[1].cnt++;
			else
				GradeDistribution[2].cnt++;
		} else if (Grade >= 80) {
			if (Grade >= 88)
				GradeDistribution[3].cnt++;
			else if (Grade >= 82)
				GradeDistribution[4].cnt++;
			else
				GradeDistribution[5].cnt++;
		} else if (Grade >= 70) {
			if (Grade >= 78)
				GradeDistribution[6].cnt++;
			else if (Grade >= 72)
				GradeDistribution[7].cnt++;
			else
				GradeDistribution[8].cnt++;
		} else {
			if (Grade >= 60)
				GradeDistribution[9].cnt++;
			else
				GradeDistribution[10].cnt++;
		}
	}

	void analyzeGrades() {
		average = totalNumber / cntInput;
		for (int i = 0; i < numberScore.size(); i++) {
			sDTemp = (numberScore.get(i) - average) * (numberScore.get(i) - average) + sDTemp;
		}

		standardDeviation = Math.round((Math.sqrt(sDTemp / cntInput)));
	}

	public String toString() {
		String rlt = "";
		for (int i = 0; i < GradeDistribution.length; i++) {
			rlt = GradeDistribution[i] + "\n" + rlt;
		}

		return "The grade distribution is:\n\n" + rlt;
	}

}
