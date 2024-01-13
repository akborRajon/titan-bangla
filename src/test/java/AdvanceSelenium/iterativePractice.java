package AdvanceSelenium;

import java.util.ArrayList;
import java.util.Iterator;



public class iterativePractice {
	
	public static void main (String [] args) {
		
		ArrayList<String>mylist = new ArrayList<>();
		
		mylist.add("poul");
		mylist.add("hlw");
		mylist.add("i am fine");
		mylist.add("how are you");
		mylist.add("pou");
		
		System.out.println(mylist);
		Iterator<String> i = mylist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
