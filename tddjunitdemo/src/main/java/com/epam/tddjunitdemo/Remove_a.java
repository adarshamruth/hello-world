package com.epam.tddjunitdemo;

public class Remove_a {

	public static String remove(String string) {
		// TODO Auto-generated method stub
		StringBuilder res=new StringBuilder(string);
		if(string.length()>=2&&string.charAt(1)=='A')
			res.deleteCharAt(1);
		if(string.length()>=1&&string.charAt(0)=='A')
			res.deleteCharAt(0);
		return res.toString();
	}

}
