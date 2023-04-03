package exercitiul_2.model;

public class Asistent extends PersonalSpital{
    protected Asistent(String nume, int tureDeNoaptePerSapt) {
        super(nume, tureDeNoaptePerSapt);
    }

    @Override
    public void showInfo() {
        System.out.println("Nume Asistent : " + this.nume +  " + ture de noapte : " + this.tureDeNoaptePerSapt );
    }

    @Override
    public void showActivitate() {
        System.out.println("Se ocupa de starea generala a pacientilor");
    }
}
