package exercitiul_2.main;

import exercitiul_2.model.PersonalSpital;
import exercitiul_2.model.PersonalSpitalFactory;
import exercitiul_2.model.TipPersonal;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        PersonalSpitalFactory factory = new PersonalSpitalFactory();
        List<PersonalSpital> personalSpital = new LinkedList<>();
        personalSpital.add(factory.createPersonal(TipPersonal.ASISTENT, "Mihaila", 2));
        personalSpital.add(factory.createPersonal(TipPersonal.MEDIC, "Iorga", 10));
        personalSpital.add(factory.createPersonal(TipPersonal.BRANCARDIER, "Bobby", 3));

        for(PersonalSpital ps : personalSpital){
            ps.showInfo();
            ps.showActivitate();
        }
    }
}
