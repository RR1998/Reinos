package KingdomFactory;
import KingdomFactory.Elfos.GeneradorElfos;
import KingdomFactory.Orcos.GeneradorOrcos;

public class FactoryKingdomProducer{
    public static KingdomFactory getFactory(String Type){
        switch(Type){
            case "Orco":
                return new GeneradorOrcos();
            case "Elfo":
                return new GeneradorElfos();
        }
        return null;
    }

}
