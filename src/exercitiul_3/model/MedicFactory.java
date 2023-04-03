package exercitiul_3.model;

public class MedicFactory implements Factory{
    @Override
    public PersonalSpital createPersonalSpital(String nume, int turePeNoapte) {
        return new Medic(nume, turePeNoapte);
    }
}
