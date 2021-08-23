package com.training.personnage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cheval extends DecorateurPersonnage{

    public Cheval(Personnage p){ perso = p;

    }



    @Override
    public String getName() {
        return perso.getName() + " le CONQUERANT";
    }

    @Override
    public int getVelocite() {
        return perso.getVelocite() + 2000;
    }

    @Override
    public List<String> getArmeList() {

        List<String> addAccessoires = Arrays.asList("tongue","pnatalon","cannette");
        perso.setArmeList(addAccessoires);
        return perso.getArmeList();
    }



}
