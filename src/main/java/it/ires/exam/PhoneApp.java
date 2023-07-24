package it.ires.exam;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Map;

public class PhoneApp {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Sim sim = new Sim("333333", 20);
        Telefonata telefonata = new Telefonata( "33334455");
        Telefonata telefonata2 = new Telefonata( "33334458");
        Smarthphone smarthphone=new Smarthphone();

        System.out.println(smarthphone.possoTelefonare(sim));
        System.out.println(smarthphone.doTelefonata(telefonata,sim));
        System.out.println(smarthphone.possoTelefonare(sim));


        //System.out.println(smarthphone.doTelefonata(telefonata2));
        System.out.println(smarthphone.closeTelefonata(telefonata));
        System.out.println(smarthphone.closeTelefonata(telefonata2));

        System.out.println(smarthphone.durataChiamata(telefonata));
        System.out.println(smarthphone.durataChiamata(telefonata2));

    }


}
