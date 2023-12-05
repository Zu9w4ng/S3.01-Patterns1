package S301.n2ex1;

public class FrenchAddress implements Address
{
	private String address;
	private static final String SUFFIX = " - FRANCE";
	
	public FrenchAddress(String address)
	{
		this.address = address.concat(SUFFIX);
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void showInMap()
	{
		System.out.println("Se está cargando Google Maps...");
	}

	@Override
	public String toString() {
		return "FrenchAddress [address=" + address + "]";
	}

}
