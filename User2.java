import javax.swing.JOptionPane;
import java.util.Arrays;
//toString�]��getPassword�Q�ʨ�F�A�ݭn������
//private or protected? bookname�]���令private�ҥH�I�s����
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
	
	//�غc�l
	//�إ߱b���e�O�_�n���ݱ��إߪ��b�������O?�A���ܬ۹�����class�h�Ы�?
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
		identity="�޲z��";
	}
	//�A�Ȥ�k
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
	
	//�\���k
	//�e���i�H�[�ӡu�Q�ϥΦ�جd�ߤ覡�v���u�X����
	public void searchByName(String name)
	{
		for(Book2 b:books)
		{
			if(name==b.bookname)
			{
				int res;
				res=JOptionPane.showConfirmDialog(null,"�d�ߨ�ŦX���y\n"+b.toString()+"\n�O�_�ɾ\?","�d�ߵ��G",JOptionPane.YES_NO_CANCEL_OPTION);
				if(res==0) 
				{
					//����ɾ\method
				}
				else
				{
					//�^��D�e��
				}
					
			}
			else
			{
				int res;
				res=JOptionPane.showConfirmDialog(null,"���d�ߨ�������y�A�O�_���s�d��?","�d�ߵ��G",JOptionPane.YES_NO_CANCEL_OPTION);
				if(res==0) 
				{
					//����d��method
				}
				else
				{
					//�^��D�e��
				}
			}
		}
	}
	
	public void searchByAuthor()
	{
		//�i�঳�P�@�̦h���Ѫ����p
	}
	
	//public String toString()
	{
		//return String.format("�b��:%s\n�K�X:%s\n�m�W:%s\n�����O:%s",getAcctNo(),getPassword(),getUsername(),getIdentity());
	}
}
