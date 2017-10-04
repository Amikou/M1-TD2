import java.util.ArrayList;
import java.util.List;

public class Server {
	
	public List<Client> clients;
	
	
	public Server(){
		clients = new ArrayList<Client>();
	}
	
	public boolean connecter(Client clt){
		clients.add(clt);
		return true;
	}
	
	public void diffuser(String msg){
		for(Client clt: clients)
			clt.recevoir(msg);
	}

}
