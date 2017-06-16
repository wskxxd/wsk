package com.wsk.a_ending;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class TestEncoding {
	
	@Test
	public void test1() throws Exception{
		String str = "жа";
		byte[] bytes = str.getBytes("GBK");
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		System.out.println(new String(bytes,"iso-8859-1"));
	}
}
