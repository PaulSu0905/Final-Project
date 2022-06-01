
public class Book2 
{
	private String bookname;
	private String author;
	private String company;
	private String borrowDay;
	private String returnDay;
	private boolean condition;//為true時為無人借閱=有在架上
	
	//建構子
	public Book2(String name,String a,String com,boolean c)
	{
		setBookname(name);
		setAuthor(a);
		setCompany(com);
		setCondition(c);
	}
	
	//服務方法
	public void setBookname(String name) {bookname=name;}
	public String getBookname() {return bookname;}
	public void setAuthor(String a) {author=a;}
	public String getAuthor() {return author;}
	public void setCompany(String com) {company=com;}
	public String getCompany() {return company;}
	public void setBorrowDay(String bd) {borrowDay=bd;}
	public String getBorrowDay() {return borrowDay;}
	public void setReturnDay(String rd) {returnDay=rd;}
	public String getReturnDay() {return returnDay;}
	public void setCondition(boolean c) {condition=c;}
	public boolean getCondition() {return condition;}
	
	//功能方法
	public String toString()
	{
		return String.format("書名:%s\n作者:%s\n出版社:%s\n借閱狀態:%s",getBookname(),getAuthor(),getCompany(),condition==true?"無人借閱":"已被借閱");
	}
	
}
