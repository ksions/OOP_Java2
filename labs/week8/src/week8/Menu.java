package week8;
import java.util.Scanner;
public class Menu {
 public void show(String[] arg) {
  System.out.println("List:");
  for(int i = 0; i < arg.length; i++) {
   if(arg[i].equals("")) {
    continue;
   }
   System.out.print(arg[i] + "  ");
  }
  System.out.println();
 }
 
 
 
 public void calculate(String[] arg, boolean[] arg1) {
  for(int i = 0; i < arg.length; i++) {
   for(int j = 0; j < arg[i].length()/2; j++) {
    if(arg[i].charAt(j) != arg[i].charAt(arg[i].length() - j - 1)) {
     arg1[i] = false;
    }
    
   }
  } 
 }
 
 
 
 public void result(String[] arg, boolean[] arg1) {
  for(int t = 0; t < arg.length; t++) {
   if(arg[t] == "") {
    continue;
   }
   if(arg1[t] == true) {
    System.out.print(arg[t] + "  ");
   }
  }
  System.out.println();
 }
 
 public void shutDown() {
  System.out.println("Goodbuy");
  return;
 }
 
 
 
 
}