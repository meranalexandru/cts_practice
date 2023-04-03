package exercitiul_3.model;

public class Asistent extends PersonalSpital{
    protected Asistent(String nume, int tureDeNoaptePerSapt) {
        super(nume, tureDeNoaptePerSapt);
    }

    @Override
    public void showInfo() {
        System.out.println("Nume Asistent : " + this.nume + " Ture pe noapte : " + this.tureDeNoaptePerSapt);
    }

    @Override
    public void showActivitate() {
        System.out.println("Se ocupa de starea generala a pacientilor");
    }
}
