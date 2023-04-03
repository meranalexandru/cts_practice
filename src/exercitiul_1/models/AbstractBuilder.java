package exercitiul_1.models;

public interface AbstractBuilder {

    Pacient build();

    AbstractBuilder setArePatRabatabil(boolean arePatRabatabil);

    AbstractBuilder setAreMicDejun(boolean areMicDejun);

    AbstractBuilder setArePapuciCamera(boolean arePapuciCamera);

    AbstractBuilder setAreHalatPentruInterior(boolean areHalatPentruInterior);
}
