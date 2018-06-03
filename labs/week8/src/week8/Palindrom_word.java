package week8;
import java.util.Scanner;

public class Palindrom_word  {	
	public static void main(String[] args) {	
			Scanner in = new Scanner(System.in);
			Menu menu = new Menu();
			String[] words;
			boolean[] words1;
			while(true) {
				System.out.println("Select:\na.Input\nb.Show\nc.Calculate\nd.Result\ne.Shut down");
				String a = in.nextLine();
					if(a.equals("a")) {
						System.out.print("How much words do you want to enter:  ");
						int num = in.nextInt();
						words = new String[num+1];
						words1 = new boolean[num+1];
						for(int i = 0; i < words.length; i++) {
							words[i] = in.nextLine();
							words1[i] = true;
						}
						break;
					}
					else if(a.equals("b") || a.equals("c") || a.equals("d") || a.equals("e")){
						System.out.println("You haven't alredy fulled array");
					}
					else {
						System.out.println("Wrong char.");
					}
			}
				
			System.out.println("");
			boolean bool = false;
			while(true) {
				System.out.println("Select:\nb.Show\nc.Calculate\nd.Result\ne.Shut down");
				String a = in.nextLine();
				if(a.equals("b")) {
					menu.show(words);
				}
				if(a.equals("c") && bool == false) {
					menu.calculate(words, words1);
					bool = true;
				}
				if(a.equals("d") && bool == true) {
					menu.result(words, words1);
				}
				if(a.equals("e")) {
					menu.shutDown();
					return;
				}
			}
			
		
		
		}
		
	}




