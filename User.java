import javax.swing.JOptionPane;
import java.util.Arrays;

//�ثe��إ߱b���覡���Q�k�O�AUser���U���U�ب������}�Ce.g.adlist�A�p�G�ϥΪ̭n�n�J���ܡA�h�U�Ӱ}�C��b���s���s�b&�K�X�������T

//toString�]��getPassword()����ʡA�ݭn������
//private or protected or default? 44�檺bookname�]���ŧiprivate�ҥH�I�s����
//�ŧi���ܼ�&�A�Ȥ�k�ȨѰѦҡA���T�w�᭱�|���|�Ψ�ϥ��N���g�X��

public class User 
{
	private String acctNo;
	private String password;
	private String username;
	private String identity;
	private Book[] books=new Book[1000];
	Admin[] adlist=new Admin[100]; //admin���W��
	private int adcount=0;
	
	//�غc�l
	public User()
	{
		//�]�����g��L�غc�l�A�S��k�I�s�w�]�L�Ѽƪ��غc�l�A�ҥH���o��Ū�
	}
	public User(Admin ad,String i)
	{
		setAdmin(ad);
		identity="�޲z��";
	}
	
	//�A�Ȥ�k
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
	
	//�\���k
	public void searchByName(String name)
	{
		for(Book b:books)
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
	
	public String toString()
	{
		return String.format("�b��:%s\n�K�X:%s\n�m�W:%s\n�����O:%s",getAcctNo(),getPassword(),getUsername(),getIdentity());
	}
}
