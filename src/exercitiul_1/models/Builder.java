package exercitiul_1.models;

public class Builder implements AbstractBuilder {
    private Pacient pacient = new Pacient(false,false,false, false);

    @Override
    public Pacient build() {
        return this.pacient;
    }

    @Override
    public AbstractBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    @Override
    public AbstractBuilder setAreMicDejun(boolean areMicDejun) {
        this.pacient.setAreMicDejun(areMicDejun);
        return this;
    }

    @Override
    public AbstractBuilder setArePapuciCamera(boolean arePapuciCamera) {
        this.pacient.setArePapuciCamera(arePapuciCamera);
        return this;
    }

    @Override
    public AbstractBuilder setAreHalatPentruInterior(boolean areHalatPentruInterior) {
        this.pacient.setAreHalatPentruInterior(areHalatPentruInterior);
        return this;
    }
}
