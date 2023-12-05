package S301.n2ex1;

public class SpanishTelf implements Telf
{
	private String telfNum;
	private static final String PREFIX = "34 - ";
	
	public SpanishTelf(String telfNum)
	{
		this.telfNum = PREFIX.concat(telfNum);
	}
	
	public String getTelfNum()
	{
		return telfNum;
	}

	public void setTelfNum(String telfNum)
	{
		this.telfNum = telfNum;
	}

	public void call()
	{
		System.out.println("Se está llamando...");
	}

	@Override
	public String toString() {
		return "SpanishTelf [telfNum=" + telfNum + "]";
	}

}
