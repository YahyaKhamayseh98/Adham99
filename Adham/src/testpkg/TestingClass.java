package testpkg;

import static org.junit.Assert.assertTrue;

import org.junit.Before;

import org.junit.Test;

import mainpkg.Book;
import mainpkg.ShoppingCart;

public class TestingClass {

	ShoppingCart sc ;
	
	@Before public void initialize() {
		sc= new ShoppingCart();
	}
	
	@Test public void test1() {
		
		assertTrue(sc.pcount ==0);
	}
	
	@Test public void test2() {
		Book b = new Book();
		b.amount=1;
		b.name="Java Book";
		b.price=127;
		sc.addBook(b);
		
		assertTrue(sc.pcount==1 && sc.totPrice==127);
	}
	
	@Test public void test3() {
		Book b = new Book();
		b.amount=1;
		b.name="Java Book";
		b.price=127;
		sc.addBook(b);
		
		Book b2 = new Book();
		b2.amount=1;
		b2.name="Web Design Book";
		b2.price=100;
		sc.addBook(b2);
		
		assertTrue(sc.pcount==2 && sc.totPrice==227);
	}
	
}
