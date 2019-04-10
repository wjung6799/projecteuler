
public class Client {
	public static void main(String args[]) {
		System.out.println(sumOfThreeFive());
	}
	
	public static int sumOfThreeFive() {
		int ans = 0;
		for(int i = 0; i < 1000; i = i + 5) {
			ans = ans + i;
		}
		for(int i = 0; i < 1000; i = i + 3) {
			ans = ans + i;
		}
		for(int i = 0; i < 1000; i = i + 15) {
			ans = ans - i;
		}
		return ans;
	}
}
