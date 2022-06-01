import javax.swing.JOptionPane;
import java.util.Arrays;
//toString因為getPassword被動到了，需要更改索引
//private or protected? bookname因為改成private所以呼叫不到
public class User2 
{
	private String acctNo;
	private String password;
	private String username;
	private String identity;
	private Book2[] books=new Book2[1000];
	private Admin2 ad;
	Admin2[] adlist=new Admin2[100];
	private int adcount=0;
	
	//建構子
	//建立帳號前是否要先問欲建立的帳號身分別?再跳至相對應的class去創建?
	public User2(String no,String p,String user,String i) 
	{
		setAcctNo(no);
		setPassword(p);
		setUsername(user);
		setIdentity(i);
	}
	public User2()
	{
		
	}
	public User2(Admin2 ad,String i)
	{
		setAdmin2(ad);
		identity="管理員";
	}
	//服務方法
	public void setAcctNo(String no) {acctNo=no;}
	public String getAcctNo() {return acctNo;}
	public void setPassword(String p) {password=p;}
	public String getPassword(Admin2 ad) {return ad.password;}
	public void setUsername(String user) {username=user;}
	public String getUsername() {return username;}
	public void setIdentity(String i) {identity=i;}
	public String getIdentity() {return identity;}
	public void setAdmin2(Admin2 ad) {adlist[adcount]=ad;adcount++;}
	public Admin2[] getAdlist() {return adlist;}
	
	//功能方法
	//前面可以加個「想使用何種查詢方式」的彈出視窗
	public void searchByName(String name)
	{
		for(Book2 b:books)
		{
			if(name==b.bookname)
			{
				int res;
				res=JOptionPane.showConfirmDialog(null,"查詢到符合書籍\n"+b.toString()+"\n是否借閱?","查詢結果",JOptionPane.YES_NO_CANCEL_OPTION);
				if(res==0) 
				{
					//跳到借閱method
				}
				else
				{
					//回到主畫面
				}
					
			}
			else
			{
				int res;
				res=JOptionPane.showConfirmDialog(null,"未查詢到相關書籍，是否重新查詢?","查詢結果",JOptionPane.YES_NO_CANCEL_OPTION);
				if(res==0) 
				{
					//跳到查詢method
				}
				else
				{
					//回到主畫面
				}
			}
		}
	}
	
	public void searchByAuthor()
	{
		//可能有同作者多本書的情況
	}
	
	//public String toString()
	{
		//return String.format("帳號:%s\n密碼:%s\n姓名:%s\n身份別:%s",getAcctNo(),getPassword(),getUsername(),getIdentity());
	}
}
