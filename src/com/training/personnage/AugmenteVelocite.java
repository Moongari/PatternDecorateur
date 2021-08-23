package com.training.personnage;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AugmenteVelocite extends DecorateurPersonnage{

    public AugmenteVelocite(Personnage p){perso= p;}
    @Override
    public String getName() {
        return "le ROI : " + perso.getName() ;
    }

    @Override
    public int getVelocite() {
        return perso.getVelocite() + 3000;
    }

    @Override
    public List<String> getArmeList() {
        Stream<String> addArme = Stream.<String>builder().add("bouclier").add("Arc").add("fleches").add("lance").build();
        perso.setArmeList(addArme.collect(Collectors.toList()));
        return perso.getArmeList();
    }
}
