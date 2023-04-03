package exercitiul_2.model;

public class PersonalSpitalFactory {
    public PersonalSpital createPersonal (TipPersonal tipPersonal, String nume, int turePeNoapte) throws Exception {
        switch (tipPersonal){
//            case BRANCARDIER -> {
//                return new Brancardier(nume, turePeNoapte);
//            }
//            case ASISTENT -> {
//                return new Asistent(nume, turePeNoapte);
//            }
//            case MEDIC -> {
//                return new Medic(nume, turePeNoapte);
//            }
//            default -> {
//                throw new Exception("No type found");
//            }
            case BRANCARDIER :
                return new Brancardier(nume,turePeNoapte);
            case ASISTENT :
                return new Asistent(nume, turePeNoapte);
            case MEDIC:
                return new Medic(nume, turePeNoapte);
            default: {
                throw new Exception("n avem");
            }

        }
    }
}
