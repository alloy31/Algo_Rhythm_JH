import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		if(N%4 == 0) {
			if(N%100!=0 || N%400 == 0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}else {
			System.out.println(0);
		}
		
	}
}