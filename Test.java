import java.util.Arrays;
import javax.swing.JOptionPane;

//�ثe�i�׬O�A�g���إ�admin�b���A�Q�լݬݵn�J�A�����ѤF�A�æ������index=Arrays.binarySearch()�h�d�b���O�_�s�b

//private or protected or default? �{�bUser��adlist�Odefault
//���S����k��@�ǪF�貾��O��class�h�A�A�Q�ΩI�smethod���覡��²�Ƴo��class���{��

public class Test 
{
	public static void main(String[] args) 
	{
		boolean home=false;
		
		String startOption[]={"�إ߱b��","�n�J","�h�X"};
		String iOption[]= {"�޲z��","�|��"};
		String mOption[]= {"�ǥ�","�Ѯv","¾��"};
		
		do //��home==true�A�^��D�e��
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
				
				User u;
				String acctNo;
				String password;
				String username;
				
				if(res2==0)//�إߺ޲z��
				{
					acctNo=JOptionPane.showInputDialog("���إ߱b��?");
					password=JOptionPane.showInputDialog("���]�w�K�X?");
					username=JOptionPane.showInputDialog("���ϥΦW��?");
					//�ݷs�W:�p�G����cancel or ����J�n��ܫإߥ���
					u=new User(new Admin(acctNo,password,username),"�޲z��");
					JOptionPane.showMessageDialog(null, "�إߦ��\");
					home=true;//�޲z���إߵ���
				}
				else if(res2==1)//�إ߷|��
				{
					int res3=JOptionPane.showOptionDialog(null,"��ب���?","�w��",0,3,null,mOption,null);
					if(res3==0)
					{
						//�ݷs�W:�T�ظԲӪ�����
					}
				}
					
			}
			else if(res1==1)//�n�J
			{
				String acctRes;
				String passRes;
				User uTry=new User();//uTry�O�ڮ��Ӹոլݯण���©I�sUser�̪���k�A�ҥHUser�����Ū��غc�l
				int iRes=JOptionPane.showOptionDialog(null,"�Q�H��ب����n�J?","�w��",0,3,null,iOption,null);
				
				if(iRes==0)//�޲z���n�J
				{
					acctRes=JOptionPane.showInputDialog("�п�J�b��:");
					Arrays.sort(uTry.getAdlist());
					if(Arrays.binarySearch(uTry.getAdlist(), acctRes)>=0)//�T�{�b���O�_�s�b
					{
						int index=Arrays.binarySearch(uTry.getAdlist(),acctRes);
						passRes=JOptionPane.showInputDialog("�п�J�K�X:");
						if(passRes==uTry.getPassword(uTry.adlist[index]))
						{
							JOptionPane.showMessageDialog(null,"�n�J���\");
							//�ݷs�W:�i�@�B�ݷQ�����ʧ@ e.g.�s�W�ѥ�
						}
					}
					else
						JOptionPane.showMessageDialog(null,"�b�����~!!");
						//�ݷs�W:�^��n�J�e��
				}
				//�ݷs�W:��L�������n�J
			}
		}while(home==true);
	}//end main

}//end class



