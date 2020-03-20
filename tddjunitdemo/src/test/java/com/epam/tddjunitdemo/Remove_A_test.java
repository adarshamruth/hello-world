package com.epam.tddjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Remove_A_test {

	Remove_a remove_a;
	
	@BeforeEach
	void setUp()
	{
		Remove_a remove_a = new Remove_a();
	}
	@Test
	void test1()
	{
		assertEquals("BCD",Remove_a.remove("ABCD"));
	}
	@Test
	void test2()
	{
		assertEquals("CD",Remove_a.remove("AACD"));
	}
	@Test
	void test3()
	{
		assertEquals("BCD",Remove_a.remove("BACD"));
	}
	@Test
	void test4()
	{
		assertEquals("BBAA",Remove_a.remove("BBAA"));
	}
	@Test
	void test5()
	{
		assertEquals("BAA",Remove_a.remove("AABAA"));
	}
	@Test
	void test6()
	{
		assertEquals("",Remove_a.remove("AA"));
	}
	@Test
	void test7()
	{
		assertEquals("",Remove_a.remove("A"));
	}
	@Test
	void test8()
	{
		assertEquals("",Remove_a.remove(""));
	}

}
