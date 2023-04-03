package exercitiul_3.model;

public class AsistentFactory implements Factory{
    @Override
    public PersonalSpital createPersonalSpital(String nume, int turePeNoapte) {
        return new Asistent(nume, turePeNoapte);
    }
}
