import java.util.Scanner;
public class Rock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String words[] = {"sipo","boxxer"};
		System.out.println("Guess the word");
		char task[] = words[1].toCharArray();
		System.out.print("S_P_");
		/*LOGIC
		PRINT OUT S_ P _
		if character chosen == tast[2]
		reveal meaning print SIP_
		AND SO ON
		
		*/
		String condition = "n";
		int counter = 0;
		while(condition.equals("n")) {
			String user = scanner.next();
			if((int)task[1] == (int)'i') {
				System.out.print("SIP_");
				counter++;
			}
			if((int)task[3] == (int)'o'){
				System.out.print("SIPO");
			}
			if (counter == 2) {
				condition.equals("c");
				break;
			}
		}

	}
}
