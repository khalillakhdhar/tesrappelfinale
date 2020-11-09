package verification;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=14;
int b=20;
Verifnumber vn=new Verifnumber();	

if(vn.nonnull(a, b)&&vn.positive(a, b))
{
if(vn.pgcd(a, b))
{
System.out.println("Le PGCD de "+a+" et "+b+" est "+vn.calculepgcd(a, b));	
}
else 
	System.out.println("les valeurs de a et b doivent être différente!");

}
else
{
System.out.println("les valeurs de a et b doivent être strictement positives");	
}
	}

}
