package exercitiul_1.main;

import exercitiul_1.models.Builder;
import exercitiul_1.models.BuilderV2;
import exercitiul_1.models.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Builder().setArePatRabatabil(true).setAreMicDejun(true).setArePapuciCamera(true).build();
        System.out.println(pacient);

        Pacient pacient2 = new BuilderV2().setAreHalatPentruInterior(true)
                .setAreMicDejun(true)
                .setArePapuciCamera(true)
                .setArePatRabatabil(true)
                .build();
        System.out.println(pacient2);
    }
}
