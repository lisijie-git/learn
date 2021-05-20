package com.lisijietech.learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	//华为od的机试题，没完全通过。
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        
		int times = 1;
		String element = str.substring(0,str == null || str.length() == 0 ? 0 : 1);
		int index = 0;
		while(index < str.length() - element.length()) {
			String nextElement = str.substring(index + 1,index + 1 + element.length());
			if(element.equals(nextElement)) {
				index += element.length();
				times ++;
			}else {
				index ++;
				element = str.substring(0,index + 1);
				times = 1;
			}
		}
		if(index != str.length() - 1) {
			System.out.println("找到规律串：" + str + "，重复1次");
		}else {
			System.out.println("找到规律串：" + element + "，重复" + times + "次");
		}
        
	}
}
