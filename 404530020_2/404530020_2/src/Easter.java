
public class Easter {

	static String calculateEaster(int year) { // 透過靜態函數讓EasterTeaster呼叫(參數)

		int a = year % 19;
		int b = year / 100;//Math.floor(), -2
		int c = year % 100;
		int d = b / 4;
		int e = b % 4;
		int f = (b + 8) / 25;
		int g = (b - f + 1) / 3;
		int h = (19 * a + b - d - g + 15) % 30;
		int i = c / 4;
		int k = c % 4;
		int l = (32 + 2 * e + 2 * i - h - k) % 7;
		int m = (a + 11 * h + 22 * l) / 451;
		int n = (h + l - 7 * m + 114) / 31;
		//演算法實作不完全 , +1? , -2
		int p = (h + l - 7 * m + 114) % 31;
		return "In:" + year + " Easter Sunday is:" + "month=" + n + " and day=" + (p + 1);
	}
}
