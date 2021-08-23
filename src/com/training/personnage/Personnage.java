package com.training.personnage;

import java.util.ArrayList;
import java.util.List;

public abstract class Personnage {

    private String name;
    private int velocite;
    private List<String> armeList ;

    public List<String> getArmeList() {
        return armeList;
    }

    public void setArmeList(List<String> armeList) {
        this.armeList = armeList;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVelocite() {
        return velocite;
    }

    public void setVelocite(int velocite) {
        this.velocite = velocite;
    }


    @Override
    public String toString() {
        return "Personnage{" +
                "name='" + getName() + '\'' +
                ", velocite=" + getVelocite() +
                ", armeList=" + getArmeList() +
                '}';
    }
}
