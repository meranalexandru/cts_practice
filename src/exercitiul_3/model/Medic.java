package exercitiul_3.model;

public class Medic extends PersonalSpital{
    protected Medic(String nume, int tureDeNoaptePerSapt) {
        super(nume, tureDeNoaptePerSapt);
    }

    @Override
    public void showInfo() {
        System.out.println("Nume Medic : " + this.nume + " Ture pe noapte : " + this.tureDeNoaptePerSapt);
    }

    @Override
    public void showActivitate() {
        System.out.println("Consulta pacienti si face operatii");
    }
}
