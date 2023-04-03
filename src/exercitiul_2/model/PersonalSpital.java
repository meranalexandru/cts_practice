package exercitiul_2.model;

public abstract class PersonalSpital {
    protected String nume;
    protected int tureDeNoaptePerSapt;

    protected PersonalSpital(String nume, int tureDeNoaptePerSapt) {
        this.nume = nume;
        this.tureDeNoaptePerSapt = tureDeNoaptePerSapt;
    }

    public abstract void showInfo();

    public abstract void showActivitate();
}
