package model;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class Repat {
    @Getter
    @Setter
    String nom;

    @Getter
    @Setter
    List<QuantiteIngredient> ingredients ;


    public Repat(String nom,List<QuantiteIngredient> ingredients) {
        this.nom = nom;
    }
}
