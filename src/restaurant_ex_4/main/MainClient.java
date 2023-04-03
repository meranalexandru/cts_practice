package restaurant_ex_4.main;

import restaurant_ex_4.model.Client;

import java.util.List;

public class MainClient {
    public static void main(String[] args) {
        Client client = Client.getInstance("Mihaila regele meu");

        Client client1 = Client.getInstance("Rares muie");

        Client client2 = Client.getInstance("Yarina Nervoasa");

        client1.adaugaRezervare();
        client1.adaugaRezervare();

        List<Client> clients = List.of(client1, client2, client);

        clients.forEach(c -> {
            System.out.println(c);
        });
        System.out.println("000000000000000000000000000000");

        Client client3 = Client.getInstance("Rares muie");

        client3.adaugaRezervare();

        clients.forEach(c -> {
            System.out.println(c);
        });

    }
}
