package gestionnaire;

import model.QuantiteIngredient;
import model.Repat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
                              QuantiteIngredient quantiteIngredient = new QuantiteIngredient() ;
        List<QuantiteIngredient> quantiteIngredients = new ArrayList<QuantiteIngredient>();
       quantiteIngredient.add("2","tomate solide");
       quantiteIngredient.add("1 kilo","viande");
       quantiteIngredient.add( "1 cuillère", "sel");
             quantiteIngredients =   quantiteIngredient.add("1 cuillère","poivre noir") ;

         Repat repat1 = new Repat("couscous",quantiteIngredients);
                                         System.out.println("les ingrédients du  " + repat1.getNom()  );
        for (QuantiteIngredient quant:  quantiteIngredients
             ) {
                    System.out.println(quant.getQuantité()+"           " + quant.getIngredient());
        }



        
    }

}
