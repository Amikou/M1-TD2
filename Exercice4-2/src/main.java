
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server serv = new Server();
		Client c1 = new Client("Client 1");
		Client c2 = new Client("Client 2");
		Client c3 = new Client("Client 3");
		if(c1.seConnecter(serv))
			serv.connecter(c1);
		if(c2.seConnecter(serv))
			serv.connecter(c2);
		if(c3.seConnecter(serv))
			serv.connecter(c3);
		c3.envoyer("Hello world !");

	}

}
