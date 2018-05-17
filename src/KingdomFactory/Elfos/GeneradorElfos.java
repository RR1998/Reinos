package KingdomFactory.Elfos;

import KingdomFactory.KingdomFactory;
import KingdomFactory.Orcos.Orcos;

public class GeneradorElfos implements KingdomFactory {
    @Override
    public Orcos getOrco(String Type){
        return null;
    }

    @Override
    public Elfos getElfo(String Type){
        switch (Type){
            case "Arquero":
                return new Arqueros();
            case "Mago":
                return new Magos();
            case "Rey":
                return new Rey();
        }
        return null;
    }
}
