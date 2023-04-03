package exercitiul_1.models;

public class BuilderV2 implements AbstractBuilder{
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciCamera;
    private boolean areHalatPentruInterior;
    @Override
    public Pacient build() {
        return new Pacient(arePatRabatabil, areMicDejun, arePapuciCamera, areHalatPentruInterior);
    }

    @Override
    public AbstractBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    @Override
    public AbstractBuilder setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
        return this;
    }

    @Override
    public AbstractBuilder setAreHalatPentruInterior(boolean areHalatPentruInterior) {
        this.areHalatPentruInterior = areHalatPentruInterior;
        return this;
    }
}
