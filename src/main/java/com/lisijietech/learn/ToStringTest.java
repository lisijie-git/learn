package com.lisijietech.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToStringTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println(list);
		System.out.println("a" + list);
		System.out.println(Arrays.toString(list.toArray()));
		System.out.println(list.stream().collect(Collectors.toList()));
		System.out.println(list.stream().collect(Collectors.joining(",")));
		
		Map<String,String> map = new HashMap<>();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		
		System.out.println(map);
	}
}
