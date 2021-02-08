package oopsAssignment;

import java.util.*;

class Book
{
	private int bookNo;
	private String title, author;
	private float price;
	
	public int getBookNo() {
		System.out.println("Your Book Number is- "+bookNo);
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		System.out.println("Your Book Title is- "+title);
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		System.out.println(" Book Author name is- "+author);
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		System.out.println("Price of Book is- "+price);
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}

public class BookDetails {
	
	public static void main(String[] args) {
		
		Book b=new Book();
		
		Scanner sc= new Scanner(System.in);    
		
		System.out.println("Enter Book Number- ");  
		b.setBookNo(sc.nextInt());
		
		System.out.println("Enter Book Title- ");  
		b.setTitle(sc.next());
		
		System.out.println("Enter author name- ");  
		b.setAuthor(sc.next());
		
		System.out.println("Enter Price- ");  
		b.setPrice(sc.nextInt());
		
		b.getBookNo();
		b.getTitle();
		b.getAuthor();
		b.getPrice();
		
		sc.close();

	}

}
