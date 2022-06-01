
//宣告的變數&服務方法僅供參考，不確定後面會不會用到反正就先寫出來

public class Admin
{
	protected String acctNo;
	protected String password;
	protected String username;
	protected String identity;
	
	//建構子
	public Admin(String no,String p,String user)
	{
		setAcctNo(no);
		setPassword(p);
		setUsername(user);
		identity="管理員";
	}
	
	//服務方法
	public void setAcctNo(String no) {acctNo=no;}
	public String getAcctNo() {return acctNo;}
	public void setPassword(String p) {password=p;}
	public String getPassword() {return password;}
	public void setUsername(String user) {username=user;}
	public String getUsername() {return username;}
	public void setIdentity(String i) {identity=i;}
	public String getIdentity() {return identity;}
	
	//功能方法
	public void addBook()
	{
		
	}
	public void deleteBook()
	{
		
	}
	public void modifyBook()
	{
		
	}
}
