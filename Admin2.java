
public class Admin2 
{
	protected String acctNo;
	protected String password;
	protected String username;
	protected String identity;
	
	//�غc�l
	public Admin2(String no,String p,String user)
	{
		setAcctNo(no);
		setPassword(p);
		setUsername(user);
		identity="�޲z��";
	}
	
	public void setAcctNo(String no) {acctNo=no;}
	public String getAcctNo() {return acctNo;}
	public void setPassword(String p) {password=p;}
	public String getPassword() {return password;}
	public void setUsername(String user) {username=user;}
	public String getUsername() {return username;}
	public void setIdentity(String i) {identity=i;}
	public String getIdentity() {return identity;}
	//�\���k
	public void addBook()
	{
		
	}
	public void deleteBook()
	{
		
	}
	public void modifyBook()//�i���T���ܼơA�Q�ק�ִN���i.g.(null,null,true)�O��ɾ\���A�令�L(�]�N�O���b�[�W)
	{
		
	}
}
