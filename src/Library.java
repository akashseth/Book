import java.util.Scanner;


public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tempTitle;
		int choice;
		Book book=new Book();
		tempTitle=book.getTitle();
		System.out.println("Enter the option you want");
		System.out.println("1.Issue book");
		System.out.println("2.Return a book");
		Scanner scan=new Scanner(System.in);
		choice=scan.nextInt();
		switch(choice)
		{
		case 1:IssueBook(tempTitle);
				break;
		case 2:ReturnBook(tempTitle);
				break;
		default :System.out.println("You have entered wrong choice");
		}

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
			Book book=new Book();
			book.IssueCopy(no_of_copies);
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
			Book book=new Book();
			book.ReturnCopy(no_of_copies);
	      }
	}
}
