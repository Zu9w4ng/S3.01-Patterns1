package DavidS3.n1ex1;

public class App 
{
    public static void main(String[] args)
    {
        Undo.getInstance();
        boolean finished = false;
        
        do
        {
        	showMenu();
        	int select = 0;
        	
        	try {
				select = Input.readInt("Introdueix la acció a realitzar: ");
			} catch (Exception e) {
				e.printStackTrace();
			}
        	
        	switch (select)
        	{
        	case 1:
        		Undo.addCommand(Input.readString(""));
        		break;
        	case 2:
        		try {
        			int pos = Input.readInt("Introdueix la posició a eliminar");
					Undo.removeCommand(pos);
				} catch (Exception e) {
					e.printStackTrace();
				}
        		break;
        		
        	case 3:
        		try {
        			int pos = Input.readInt("Introdueix la posició a mostrar");
					System.out.println(Undo.getCommand(pos)); 
				} catch (Exception e) {
					e.printStackTrace();
				}
        		break;
        		
        	case 4:
        		Undo.printAllCommands();
        		break;
        		
        	case 5:
        		finished = true;
        		break;
        	
        	default:
        		System.out.println("Selecciona una acció vàlida");
        	}	
        	
        } while(!finished);
    }
    
    public static void showMenu()
    {
    	System.out.println("1 - Afegeix una comanda\n"
    			+ "2 - Elimina una comanda\n"
    			+ "3 - Mostra una comanda\n"
    			+ "4 - Imprimeix totes les comandes\n"
    			+ "5 - Finalitza el programa");
    }
}
