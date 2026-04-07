package CoreJavaProgram;
class BankDetails
{
	String cname;
	public String getCname() 
	{
		return cname;
	}
	public void setCname(String cname)
	{
		this.cname = cname;
	}
	public int getAcno()
	{
		return acno;
	}
	public void setAcno(int acno)
	{
		this.acno = acno;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	int acno;
	double balance;
	public BankDetails(String cname, int acno, double balance) 
	{
		super();
		this.cname = cname;
		this.acno = acno;
		this.balance = balance;
	}
}
public class GetterSetter 
{

	public static void main(String[] args) 
	{
		BankDetails b=new BankDetails("Prasanna",123456,10000.0);
		System.out.println("CustomerNAme:"+b.getCname());
		System.out.println("Account Number:"+b.getAcno());
		System.out.println("Balance:"+b.getBalance());
	}

}