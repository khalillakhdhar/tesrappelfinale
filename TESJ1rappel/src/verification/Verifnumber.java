package verification;

public class Verifnumber {
public boolean nonnull(int a,int b)
{
	if((a!=0)&&(b!=0))
		return true;
	else
		return false;	
}
public boolean positive(int A, int B)
{
	return ((A>0) &&(B>0));

}
public boolean verifa(int a)
{
return a!=0;	
}
public boolean divise( int B)
{
return B %3!=0;	

}
public boolean pgcd(int a,int b)
{
	int x=a; int y=b;

	int diviseur=calculepgcd(x, y);
	return ((diviseur!=x)&&(diviseur!=y));
}
public int calculepgcd(int x,int y)
{
	while (x!=y)
	{
		if(x>y)
			x=x-y;
		else
			y=y-x;
		
	}
	return x;

}
}
