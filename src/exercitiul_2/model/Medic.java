package exercitiul_2.model;

public class Medic extends PersonalSpital{

    protected Medic(String nume, int tureDeNoaptePerSapt) {
        super(nume, tureDeNoaptePerSapt);
    }

    @Override
    public void showInfo() {
        System.out.println("Nume Doctor : " + this.nume +  " + ture de noapte : " + this.tureDeNoaptePerSapt );
    }

    @Override
    public void showActivitate() {
        System.out.println("Consulta pacientii si face operatii");
    }
}
