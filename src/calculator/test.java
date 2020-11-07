package calculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class test {
	
	public static void main (String[] args) {
		dictionary dict = new dictionary();
		
		try {
	         BufferedReader in = new BufferedReader(new FileReader("dictionary.txt"));
	         String str;
	         boolean isuse1 = true;
	         while ((str = in.readLine()) != null) {
	           String[] strword =str.split(" ");
	           if (isuse1) {
	        	   dict.addWord1(strword[0], strword[1]);
	        	   isuse1 = false;
	           } else {
	        	   word wr = new word();
	        	   wr.set_original(strword[0]);
	        	   wr.set_translation(strword[1]);
	        	   dict.addWord2(wr);
	        	   isuse1 = true;
	           }
	         }
	         dict.toString();
	         
	         Scanner sc =new Scanner(System.in);
	         
	         String userWord = sc.next();
	         
	         dict.translate(userWord);
	      } catch (IOException e) {
	      }
	}
	
}
