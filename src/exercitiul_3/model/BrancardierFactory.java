package exercitiul_3.model;

public class BrancardierFactory implements Factory{
    @Override
    public PersonalSpital createPersonalSpital(String nume, int turePeNoapte) {
        return new Brancardier(nume, turePeNoapte);
    }
}
