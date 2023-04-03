package restaurant_ex_4.model;

import java.util.HashMap;
import java.util.Map;

public class Client {

    private String nume;

    private int nrRezervari;

    private static Map<String, Client> clienti = new HashMap<>();

    private Client(String nume) {
        this.nume = nume;
    }

    public static synchronized Client getInstance(String nume) {
        if (!clienti.containsKey(nume)) {
            Client client = new Client(nume);
            clienti.put(nume, client);
            return client;
        }
        return clienti.get(nume);
    }

    public void adaugaRezervare(){
        this.nrRezervari++;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", nrRezervari=" + nrRezervari +
                '}';
    }
}
