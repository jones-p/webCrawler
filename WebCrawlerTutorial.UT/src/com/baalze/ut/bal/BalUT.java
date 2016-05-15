package com.baalze.ut.bal;

import com.baalze.bal.*;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BalUT {

	@Test
	public void loadDocumentFromWeb()throws Exception{
		Domain domain = new Domain("http://en.wikipedia.org/");
		assertTrue("getDomainHash: Hash is wrong length.", domain.getDomainHash().length() == 64);
		Anchor anchor = new Anchor( domain, "http://en.wikipedia.org/");
		assertTrue("getAnchorHash: Hash is wrong length.", anchor.getAnchorHash().length() == 64);
		WebPage webPage = new WebPage(anchor);
		webPage.loadDocumentFromWeb();
		/* String is a message displays when test fails */
		assertTrue("Test Results", webPage.getDocument() != null);
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}
}
