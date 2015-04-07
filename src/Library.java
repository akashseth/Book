import java.util.Scanner;


public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tempTitle;
		Book book=new Book("Data Structure\t","G.s Balluja\t",450,"SBIN125025\t", 10);
		System.out.println(book.toString());
		tempTitle=book.getTitle();	
	}
	
	/*
	 * Method for Issue Book
	 */
	public static void IssueBook(String tempTitle1)
	{
		String Title;
		int no_of_copies;
		System.out.println("Enter the Title of book you want to Issue");
		Scanner title=new Scanner(System.in);
		Title=title.nextLine();
		if((tempTitle1).equals(Title))
		  {	System.out.println("Enter the no. of copies you want to issue");
			Scanner copies=new Scanner(System.in);
			no_of_copies=copies.nextInt();
			Book copy=new Book("Data Structure\t","G.s Balluja\t",450,"SBIN125025\t", 10);
			copy.IssueCopy(no_of_copies);
	      }
	}
	/*
	 * Method for Return Book
	 */
	public static void ReturnBook(String tempTitle1)
	{
		String Title;
		int no_of_copies;
		System.out.println("Enter the Title of book you want to return");
		Scanner title=new Scanner(System.in);
		Title=title.nextLine();
		if((tempTitle1).equals(Title))
		  {	System.out.println("Enter the no. of copies you want to return");
			Scanner copies=new Scanner(System.in);
			no_of_copies=copies.nextInt();
			Book book=new Book("Data Structure\t","G.s Balluja\t",450,"SBIN125025\t", 10);
			book.ReturnCopy(no_of_copies);
	      }
	}
}
