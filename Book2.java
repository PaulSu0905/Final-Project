
public class Book2 
{
	private String bookname;
	private String author;
	private String company;
	private String borrowDay;
	private String returnDay;
	private boolean condition;//��true�ɬ��L�H�ɾ\=���b�[�W
	
	//�غc�l
	public Book2(String name,String a,String com,boolean c)
	{
		setBookname(name);
		setAuthor(a);
		setCompany(com);
		setCondition(c);
	}
	
	//�A�Ȥ�k
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
	
	//�\���k
	public String toString()
	{
		return String.format("�ѦW:%s\n�@��:%s\n�X����:%s\n�ɾ\���A:%s",getBookname(),getAuthor(),getCompany(),condition==true?"�L�H�ɾ\":"�w�Q�ɾ\");
	}
	
}
