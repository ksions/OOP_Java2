package week8;
import java.util.*;
public class Exe {
Scanner in = new Scanner(System.in);
public static void main(String[] args) {
	String[] s = new String[4];
	s[0] = "noon";
	s[1] = "civic";
	s[2] = "radar";
	s[3] = "level";
	boolean[] bool = new boolean[4];
	bool[0] = true;
	bool[1] = true;
	bool[2] = true;
	bool[3] = true;
	for(int i = 0; i < s.length; i++) {
		for(int j = 0; j < s[i].length()/2; j++) {
			if(s[i].charAt(j) != s[i].charAt(s[i].length() - j - 1)) {
				bool[i] = false;
			}
			
		}
	}
	for(int t = 0; t < s.length; t++) {
		if(bool[t] == true) {
			System.out.print(s[t] + "  ");
		}
	}
	
	
	}
}
