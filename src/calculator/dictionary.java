package calculator;

import java.lang.reflect.Array;

public class dictionary {
	int activeIndex= 0;
	word[] words = new word[100];
	
	public void addWord1(String original, String translation) {
		word wr = new word();
		wr.set_original(original);
		wr.set_translation(translation);
		words[activeIndex] = wr;
		activeIndex++;
	}
	
	public void addWord2(word wr) {
		words[activeIndex] = wr;
		activeIndex++;
	}	
	
	public String translate(String original) {
		for(int i = 0 ; i < activeIndex; i++) {
			if (words[i].get_original() == original) {
				return words[i].get_translation();
			}
		}
		
		return "yok";
	}
	
	@Override
	public String toString() {
		
		for(int i = 0 ; i < activeIndex; i++) {
			System.out.println(words[i].toString());
		}
		for(int i = 0 ; i < activeIndex; i++) {
			System.out.println(String.format("Original => %s", words[i].get_original()));
			System.out.println(String.format("Translation => %s", words[i].get_translation()));
		}
		
		return "";
	}
}
