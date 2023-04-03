package exercitiul_2.model;

public class Brancardier extends PersonalSpital {

    protected Brancardier(String nume, int tureDeNoaptePerSapt) {
        super(nume, tureDeNoaptePerSapt);
    }

    @Override
    public void showInfo() {
        System.out.println("Nume : " + this.nume +  " + ture de noapte : " + this.tureDeNoaptePerSapt );

    }

    @Override
    public void showActivitate() {
        System.out.println("Cara pacienti");
    }
}
