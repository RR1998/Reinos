package KingdomFactory.Orcos;

import KingdomFactory.Elfos.Elfos;
import KingdomFactory.KingdomFactory;

public class GeneradorOrcos implements KingdomFactory{
    @Override
    public Elfos getElfo(String Type){
        return null;
    }
    @Override
    public Orcos getOrco(String Type){
        switch (Type){
            case "Warlock":
                return new Warlock();
            case "Lanzador":
                return new Lanzador();
            case "BestiaMayor":
                return new BestiaMayor();
        }
        return null;
    }
}
