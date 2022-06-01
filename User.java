import javax.swing.JOptionPane;
import java.util.Arrays;

//目前對建立帳號方式的想法是，User底下有各種身分的陣列e.g.adlist，如果使用者要登入的話，去各個陣列找帳號存不存在&密碼正不正確

//toString因為getPassword()有更動，需要更改索引
//private or protected or default? 44行的bookname因為宣告private所以呼叫不到
//宣告的變數&服務方法僅供參考，不確定後面會不會用到反正就先寫出來

public class User 
{
	private String acctNo;
	private String password;
	private String username;
	private String identity;
	private Book[] books=new Book[1000];
	Admin[] adlist=new Admin[100]; //admin的名單
	private int adcount=0;
	
	//建構子
	public User()
	{
		//因為有寫其他建構子，沒辦法呼叫預設無參數的建構子，所以有這支空的
	}
	public User(Admin ad,String i)
	{
		setAdmin(ad);
		identity="管理員";
	}
	
	//服務方法
	public void setAcctNo(String no) {acctNo=no;}
	public String getAcctNo() {return acctNo;}
	public void setPassword(String p) {password=p;}
	public String getPassword(Admin ad) {return ad.password;}
	public void setUsername(String user) {username=user;}
	public String getUsername() {return username;}
	public void setIdentity(String i) {identity=i;}
	public String getIdentity() {return identity;}
	public void setAdmin(Admin ad) {adlist[adcount]=ad;adcount++;}
	public Admin[] getAdlist() {return adlist;}
	
	//功能方法
	public void searchByName(String name)
	{
		for(Book b:books)
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
	
	public String toString()
	{
		return String.format("帳號:%s\n密碼:%s\n姓名:%s\n身份別:%s",getAcctNo(),getPassword(),getUsername(),getIdentity());
	}
}
