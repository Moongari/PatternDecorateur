package com.training.personnage;

import java.util.List;

public abstract class DecorateurPersonnage extends Personnage{

    protected Personnage perso;

    public abstract String getName();
    public abstract int getVelocite();
    public abstract List<String> getArmeList();


}
