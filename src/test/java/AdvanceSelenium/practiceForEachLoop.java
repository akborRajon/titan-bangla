package AdvanceSelenium;

import java.util.ArrayList;

public class practiceForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ArrayList<String>mylist = new ArrayList<>();
		
		mylist.add("poul");
		mylist.add("hlw");
		mylist.add("i am fine");
		mylist.add("how are you");
		mylist.add("pou");
		
		System.out.println(mylist);
		for (String items:mylist) {
			System.out.println(items);
		}
	}

}
