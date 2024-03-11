package com.cg.programs;

import java.util.HashMap;

public class CountOccurance {
	public static void main(String[] args) {
		
	
	String str = "Programming";
	char ch[] = str.toCharArray();

	HashMap<Character, Integer> map= new HashMap<Character, Integer>();
	for(int i = 0;i<str.length();i++){

		if(map.containsKey(ch[i])) {
			map.put(ch[i], map.get(ch[i])+1);
			
		}else {
			map.put(ch[i], 1);
		}
	}
	System.out.println(map);
}
}

