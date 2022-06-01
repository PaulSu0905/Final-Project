
public class Admin2 
{
	protected String acctNo;
	protected String password;
	protected String username;
	protected String identity;
	
	//建構子
	public Admin2(String no,String p,String user)
	{
		setAcctNo(no);
		setPassword(p);
		setUsername(user);
		identity="管理員";
	}
	
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
	public void modifyBook()//可給三個變數，想修改誰就改誰i.g.(null,null,true)是把借閱狀態改成無(也就是有在架上)
	{
		
	}
}
