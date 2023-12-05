package S301.n2ex1;

public class App 
{
    public static void main( String[] args )
    {
    	DataFactory sdf = new SpanishDataFactory();
    	Agenda agendaS = sdf.createAgenda();
    	Telf telfS = sdf.createTelf("663424576");
    	Address addressS = sdf.createAddress("Diagonal 76, Barcelona");
    	agendaS.addValues(telfS, addressS);
    	agendaS.showTelfs();
    	agendaS.showAddresses();
    	
    	DataFactory fdf = new FrenchDataFactory();
    	Agenda agendaF = fdf.createAgenda();
    	Telf telfF = fdf.createTelf("662724556");
    	Address addressF = fdf.createAddress("Calle inventada 76, Lyon");
    	agendaF.addValues(telfF, addressF);
    	agendaF.showTelfs();
    	agendaF.showAddresses();
    }
}
