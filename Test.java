import java.util.Arrays;
import javax.swing.JOptionPane;
//�n�J���ѡA�æ������index=Arrays.binarySearch()
//private or protected or default? �{�bUser2��adlist�Odefault
public class Test 
{
	public static void main(String[] args) 
	{
		boolean home=false;
		
		String startOption[]={"�إ߱b��","�n�J","�h�X"};
		String iOption[]= {"�޲z��","�|��"};
		do 
		{
			int res1=JOptionPane.showOptionDialog(null,"�w��i�J�t��","�w��",0,3,null,startOption,null);
			
			if(res1==2)//����
			{
				JOptionPane.showMessageDialog(null,"���¨ϥ�");
				home=false;
			}	
			else if(res1==0)//�إ߱b��
			{
				int res2=JOptionPane.showOptionDialog(null,"�Q�إߦ�رb��?","�w��",0,3,null,iOption,null);
				if(res2==0)
				{
					User2 u;
					Admin2 ad;
					String acctNo;
					String password;
					String username;
					
					acctNo=JOptionPane.showInputDialog("���إ߱b��?");
					password=JOptionPane.showInputDialog("���]�w�K�X?");
					username=JOptionPane.showInputDialog("���ϥΦW��?");
					//�p�G����cancel�n��ܫإߥ���
					u=new User2(new Admin2(acctNo,password,username),"�޲z��");
					JOptionPane.showMessageDialog(null, "�إߦ��\");
					home=true;//�޲z���إߵ���
				}
				else if(res2==1)
				{
					String mOption[]= {"�ǥ�","�Ѯv","¾��"};
					int res3=JOptionPane.showOptionDialog(null,"��ب���?","�w��",0,3,null,mOption,null);
					if(res3==0)
					{
						//�T�ظԲӪ�����
					}
				}
					
			}
			else if(res1==1)//�n�J
			{
				String acctRes;
				String passRes;
				User2 uTry=new User2();
				int iRes=JOptionPane.showOptionDialog(null,"�Q�H��ب����n�J?","�w��",0,3,null,iOption,null);
				if(iRes==0)//�޲z���n�J
				{
					acctRes=JOptionPane.showInputDialog("�п�J�b��:");
					Arrays.sort(uTry.getAdlist());
					if(Arrays.binarySearch(uTry.getAdlist(), acctRes)>=0)
					{
						int index=Arrays.binarySearch(uTry.getAdlist(),acctRes);
						passRes=JOptionPane.showInputDialog("�п�J�K�X:");
						if(passRes==uTry.getPassword(uTry.adlist[index]))
						{
							JOptionPane.showMessageDialog(null,"�n�J���\");
						}
					}
					else
						JOptionPane.showMessageDialog(null,"�b�����~!!");
						//�^��n�J�e��
				}
			}
		}while(home==true);
	}

}



