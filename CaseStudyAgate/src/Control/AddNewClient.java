
package Control;

import App.Database;
import Entity.Client;

public class AddNewClient {
private static final AddNewClient instance = new AddNewClient();
    
    // Disardan instance ulasabilmek icin kullaniyoruz
    public static AddNewClient getInstance() {
        return instance;
    }
    
    // Obje yaratamamak icin private yaptik
    private AddNewClient() {
        
    }
    
    public void createNewClient(Client client) {
        Database.clientList.add(client);
       
    }

}
