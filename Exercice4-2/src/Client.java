
public class Client {

	public String nom;
	
	public Server serv;
	
	public Client(String nom){
		this.nom=nom;
	}
	
	public boolean seConnecter(Server serv){
		this.serv=serv;
		return true;
	}
	
	public void envoyer(String msg){
		serv.diffuser(msg);
	}
	
	public void recevoir(String msg){
		System.out.println(nom+" reçoit : "+ msg);
	}
}
