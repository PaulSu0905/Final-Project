import javax.swing.JOptionPane;
public class Test 
{
	public static void main(String[] args) 
	{
		boolean home=false;
		String startOption[]={"書籍查詢","建立帳號","登入","退出"};
		do //當home==true，回到主畫面
		{
			User u=new User();
			int res1=JOptionPane.showOptionDialog(null,"歡迎進入系統","歡迎",0,3,null,startOption,null);
			if(res1==3)//取消
			{
				JOptionPane.showMessageDialog(null,"謝謝使用");
				home=false;
			}	

			else if(res1==1)//建立帳號
			{
				u.adduser();
				home=true;
			}

			else if(res1==2)//登入
			{
				u.login();
                home=true;
			}

            else if(res1==0)//查詢書籍
            {
				u.search();
                home=true;
            }
        }while(home==true);
	}//end main

}//end class




