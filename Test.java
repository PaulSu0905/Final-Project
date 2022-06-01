import java.util.Arrays;
import javax.swing.JOptionPane;
//登入失敗，疑似不能用index=Arrays.binarySearch()
//private or protected or default? 現在User2的adlist是default
public class Test 
{
	public static void main(String[] args) 
	{
		boolean home=false;
		
		String startOption[]={"建立帳號","登入","退出"};
		String iOption[]= {"管理員","會員"};
		do 
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
				if(res2==0)
				{
					User2 u;
					Admin2 ad;
					String acctNo;
					String password;
					String username;
					
					acctNo=JOptionPane.showInputDialog("欲建立帳號?");
					password=JOptionPane.showInputDialog("欲設定密碼?");
					username=JOptionPane.showInputDialog("欲使用名稱?");
					//如果有按cancel要顯示建立失敗
					u=new User2(new Admin2(acctNo,password,username),"管理員");
					JOptionPane.showMessageDialog(null, "建立成功");
					home=true;//管理員建立結束
				}
				else if(res2==1)
				{
					String mOption[]= {"學生","老師","職員"};
					int res3=JOptionPane.showOptionDialog(null,"何種身分?","歡迎",0,3,null,mOption,null);
					if(res3==0)
					{
						//三種詳細的身分
					}
				}
					
			}
			else if(res1==1)//登入
			{
				String acctRes;
				String passRes;
				User2 uTry=new User2();
				int iRes=JOptionPane.showOptionDialog(null,"想以何種身分登入?","歡迎",0,3,null,iOption,null);
				if(iRes==0)//管理員登入
				{
					acctRes=JOptionPane.showInputDialog("請輸入帳號:");
					Arrays.sort(uTry.getAdlist());
					if(Arrays.binarySearch(uTry.getAdlist(), acctRes)>=0)
					{
						int index=Arrays.binarySearch(uTry.getAdlist(),acctRes);
						passRes=JOptionPane.showInputDialog("請輸入密碼:");
						if(passRes==uTry.getPassword(uTry.adlist[index]))
						{
							JOptionPane.showMessageDialog(null,"登入成功");
						}
					}
					else
						JOptionPane.showMessageDialog(null,"帳號錯誤!!");
						//回到登入畫面
				}
			}
		}while(home==true);
	}

}



