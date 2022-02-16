package model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class QuantiteIngredient {


    @Setter
    @Getter
    String quantité;
    @Setter
    @Getter
    String ingredient ;

    public QuantiteIngredient(String quantité, String ingredient) {
        this.quantité = quantité;
        this.ingredient = ingredient;
    }

    @Setter
    @Getter
    List<QuantiteIngredient>  quantiteIngredients = new ArrayList<QuantiteIngredient>();

    public QuantiteIngredient() {
    }

    public   List<QuantiteIngredient> add(String quantité, String nom ) {

            QuantiteIngredient   quantiteIngredient = new QuantiteIngredient(quantité,nom);
            quantiteIngredients.add(quantiteIngredient);
return quantiteIngredients ;
        }



}
