package exercitiul_3.main;

import exercitiul_3.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory fB = new BrancardierFactory();
        Factory fM = new MedicFactory();
        Factory fA = new AsistentFactory();

        List<PersonalSpital> personal = new ArrayList<>();
        personal.add(fB.createPersonalSpital("Alex" , 2));
        personal.add(fA.createPersonalSpital("Mihaila", 2));
        personal.add(fM.createPersonalSpital("Andrei", 10));
        personal.add(fB.createPersonalSpital("Bobby" ,4));

        for(PersonalSpital p : personal){
            p.showInfo();
            p.showActivitate();
        }
    }
}
