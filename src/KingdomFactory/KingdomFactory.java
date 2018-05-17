package KingdomFactory;

import KingdomFactory.Elfos.Elfos;
import KingdomFactory.Orcos.Orcos;

public interface KingdomFactory {
    Elfos getElfo(String Type);
    Orcos getOrco(String Type);
    }