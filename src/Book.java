import java.util.Scanner;


public class Book {
	private String Title;
	private String Author;
	private int Price;
	private String IsbnNo;
	private int No_of_copies;
	/*
	 * Methor for Get Title
	 */
	public String getTitle()
	{	String title="Data Structure";
		Title=title;
		return Title;
	}
	/*
	 * Method for Get Author
	 */
	public String getAuthor()
	{	String author="G.S Balujja";
		Author=author;
		return Author;
	}
	 /* 
	 *Method for Get Price
	 */
	public int getPrice()
	{	int price=450;
		Price=price;
		return Price;
	}
	/*
	 * Method for Get Isbn NO.
	 */
	public String getIsbnNo()
	{	String isbnNo="9858452054";
		IsbnNo=isbnNo;
		return IsbnNo;
	}
	/*
	 * Method for Get No Of Copies
	 */
	public int getNoOfCopies()
	{	int no_of_copies=10;
		No_of_copies=no_of_copies;
		return No_of_copies;
	}
	/*
	 * Method for Issue Copy
	 */
	public  void IssueCopy(int issuecopy)
	{	int finalIssueCopy;
		finalIssueCopy=getNoOfCopies();
		if(finalIssueCopy>issuecopy)
			finalIssueCopy-=issuecopy;
		else
		System.out.println("We have not minimum required copy");
	}
	/*
	 * Method for Return Copy
	 */
	public  void ReturnCopy(int returncopy)
	{
		int finalReturnCopy;
		finalReturnCopy=getNoOfCopies();
			finalReturnCopy+=returncopy;
	}
	

}
