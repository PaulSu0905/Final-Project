import java.util.Arrays;
import javax.swing.JOptionPane;

//目前進度是，寫完建立admin帳號，想試看看登入，但失敗了，疑似不能用index=Arrays.binarySearch()去查帳號是否存在

//private or protected or default? 現在User的adlist是default
//有沒有辦法把一些東西移到別的class去，再利用呼叫method的方式來簡化這隻class的程式

public class Test 
{
	public static void main(String[] args) 
	{
		boolean home=false;
		
		String startOption[]={"建立帳號","登入","退出"};
		String iOption[]= {"管理員","會員"};
		String mOption[]= {"學生","老師","職員"};
		
		do //當home==true，回到主畫面
		{
			int res1=JOptionPane.showOptionDialog(null,"歡迎進入系統","歡迎",0,3,null,startOption,null);
			
			if(res1==2)//取消
			{
				JOptionPane.showMessageDialog(null,"謝謝使用");
				home=false;
			}	
			else if(res1==0)//建立帳號
			{
				int res2=JOptionPane.showOptionDialog(null,"想建立何種帳號?","歡迎",0,3,null,iOption,null);
				
				User u;
				String acctNo;
				String password;
				String username;
				
				if(res2==0)//建立管理員
				{
					acctNo=JOptionPane.showInputDialog("欲建立帳號?");
					password=JOptionPane.showInputDialog("欲設定密碼?");
					username=JOptionPane.showInputDialog("欲使用名稱?");
					//待新增:如果有按cancel or 未輸入要顯示建立失敗
					u=new User(new Admin(acctNo,password,username),"管理員");
					JOptionPane.showMessageDialog(null, "建立成功");
					home=true;//管理員建立結束
				}
				else if(res2==1)//建立會員
				{
					int res3=JOptionPane.showOptionDialog(null,"何種身分?","歡迎",0,3,null,mOption,null);
					if(res3==0)
					{
						//待新增:三種詳細的身分
					}
				}
					
			}
			else if(res1==1)//登入
			{
				String acctRes;
				String passRes;
				User uTry=new User();//uTry是我拿來試試看能不能單純呼叫User裡的方法，所以User有隻空的建構子
				int iRes=JOptionPane.showOptionDialog(null,"想以何種身分登入?","歡迎",0,3,null,iOption,null);
				
				if(iRes==0)//管理員登入
				{
					acctRes=JOptionPane.showInputDialog("請輸入帳號:");
					Arrays.sort(uTry.getAdlist());
					if(Arrays.binarySearch(uTry.getAdlist(), acctRes)>=0)//確認帳號是否存在
					{
						int index=Arrays.binarySearch(uTry.getAdlist(),acctRes);
						passRes=JOptionPane.showInputDialog("請輸入密碼:");
						if(passRes==uTry.getPassword(uTry.adlist[index]))
						{
							JOptionPane.showMessageDialog(null,"登入成功");
							//待新增:進一步問想做的動作 e.g.新增書本
						}
					}
					else
						JOptionPane.showMessageDialog(null,"帳號錯誤!!");
						//待新增:回到登入畫面
				}
				//待新增:其他身分的登入
			}
		}while(home==true);
	}//end main

}//end class



