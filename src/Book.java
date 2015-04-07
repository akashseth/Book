import java.util.Scanner;


public class Book {
	private String Title;
	private String Author;
	private int Price;
	private String IsbnNo;
	private int NoOfCopies;
	
	public Book(String Title,String Author,int Price,String IsbnNo,int NoOfCopies)
	{
		this.Title=Title;
		this.Author=Author;
		this.Price=Price;
		this.IsbnNo=IsbnNo;
		this.NoOfCopies=NoOfCopies;
	}
	@Override
    public String toString() {
        return String.format(Title +Author +IsbnNo+Price);
	}
	public String getTitle()
	{	
		return Title;
	}
	/*
	 * Method for Get Author
	 */
	public String getAuthor()
	{	
		return Author;
	}
	 /* 
	 *Method for Get Price
	 */
	public int getPrice()
	{	
		return Price;
	}
	/*
	 * Method for Get Isbn NO.
	 */
	public String getIsbnNo()
	{
		return IsbnNo;
	}
	/*
	 * Method for Get No Of Copies
	 */
	public int getNoOfCopies()
	{
		return NoOfCopies;
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
