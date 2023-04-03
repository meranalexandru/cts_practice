package exercitiul_3.model;

public class Brancardier extends PersonalSpital{
    protected Brancardier(String nume, int tureDeNoaptePerSapt) {
        super(nume, tureDeNoaptePerSapt);
    }

    @Override
    public void showInfo() {
        System.out.println("Nume Brancardier : " + this.nume + " Ture pe noapte : " + this.tureDeNoaptePerSapt);
    }

    @Override
    public void showActivitate() {
        System.out.println("Cara pacientii si se ocupa de urgente");
    }
}
