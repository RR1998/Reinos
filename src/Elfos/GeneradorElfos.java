package Elfos;

//import Orcos;
//import Reinos;

public class GeneradorElfos implements Reinos{
    @Override
    public Orcos getOrco(String){
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
                return new Rey;
        }
    }
}
