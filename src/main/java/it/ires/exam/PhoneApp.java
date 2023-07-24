package it.ires.exam;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

public class PhoneApp {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Sim sim = new Sim("333333", 20);
        Telefonata telefonata = new Telefonata(0, 60, "33334455");
        System.out.println(sim.getCredit());
        System.out.println(telefonata.durataChiamata());
        System.out.println(telefonata.costoChiamataAlMinuto(telefonata, sim));
    }


}
