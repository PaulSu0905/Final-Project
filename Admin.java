
//�ŧi���ܼ�&�A�Ȥ�k�ȨѰѦҡA���T�w�᭱�|���|�Ψ�ϥ��N���g�X��

public class Admin
{
	protected String acctNo;
	protected String password;
	protected String username;
	protected String identity;
	
	//�غc�l
	public Admin(String no,String p,String user)
	{
		setAcctNo(no);
		setPassword(p);
		setUsername(user);
		identity="�޲z��";
	}
	
	//�A�Ȥ�k
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
	public void modifyBook()
	{
		
	}
}
