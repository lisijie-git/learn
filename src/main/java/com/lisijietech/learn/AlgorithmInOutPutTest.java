package com.lisijietech.learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AlgorithmInOutPutTest {
	//华为od的一道机试题，没通过，没多大用。
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] s = in.readLine().toCharArray();
        char[] l = in.readLine().toCharArray();
        int last = l.length - 1;
        int end = -1;
        boolean flag = false;
        for(int i = s.length - 1;i > -1;i --){
            
            for(;last > -1 ;last --){
                if(s[i] == l[last]){
                    last --;
                    flag = true;
                    break;
                }
                if(last == 0){
                    System.out.println(end);
                    return;
                }
            }
            if(i == s.length - 1){
                end = last ++;
            }
        }
        System.out.println(end);
    }
//	public static void main(String[] args) throws IOException{
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        int count = 0;
//        int len = 0;
//        int have = 0;
//        String[] array = in.readLine().split(",");
//        for(int i = 0;i < array.length;i++){
//            String haveStr = array[i];
//            if(haveStr.equals(",")){
//                continue;
//            }else{
//                have = Integer.parseInt(haveStr);
//            }
//            System.out.println(have + " ");
//            if(have == 1){
//                len ++;
//                if(len == 1){
//                    count ++;
//                }
//                if(len > 2){
//                    len = 0;
//                }
//            }else{
//                len = 0;
//            }
//        }
//        System.out.println(count);
//    }
}
