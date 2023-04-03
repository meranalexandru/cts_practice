package exercitiul_1.models;
//Atunci când un pacient este
// internat in cadrul aplicației se face salvarea acestuia. Fiecare pacient
//        are posibilitatea sa
//        plătească extra pentru anumite facilitate precum: pat rabatabil, mic dejun inclus,
//        papuci de camera, halat pentru interior. In cazul in care pacientul nu alege aceste facilitați extra,
//        in cadrul aplicației sunt setate cu false. Să se dezvolte modulul care asigură crearea de obiecte de
//        tipul pacient cu opțiuni extra
public class Pacient {
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciCamera;
    private boolean areHalatPentruInterior;

    protected Pacient() {
        this.arePatRabatabil = false;
        this.areMicDejun = false;
        this.arePapuciCamera = false;
        this.areHalatPentruInterior = false;
    }

    protected Pacient(boolean arePatRabatabil, boolean areMicDejun, boolean arePapuciCamera, boolean areHalatPentruInterior) {
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalatPentruInterior = areHalatPentruInterior;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    protected void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    protected void setAreHalatPentruInterior(boolean areHalatPentruInterior) {
        this.areHalatPentruInterior = areHalatPentruInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "arePatRabatabil=" + arePatRabatabil +
                ", areMicDejun=" + areMicDejun +
                ", arePapuciCamera=" + arePapuciCamera +
                ", areHalatPentruInterior=" + areHalatPentruInterior +
                '}';
    }
}
