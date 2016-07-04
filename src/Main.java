import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		List<String> deckList = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your cards:");

		for (int i = 0; i < 5; i++) {
			deckList.add(in.nextLine());
		}

		Set<String> uniqueSet = new HashSet<String>(deckList);
		for (String cards : uniqueSet) {
			int a = Collections.frequency(deckList, cards);
			if (a == 4) {
				System.out.println("Square!");
			} else if (a == 3) {
				System.out.println("Set!");
			} else if (a == 2) {
				System.out.println("Pair!");
			}
		}
		in.close();
	}
}