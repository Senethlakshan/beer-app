package com.example.admin.myapplication;


import java.util.ArrayList;
import java.util.List;

public class Findbeer {

List<String> beerColletion =  new ArrayList<String>();

List<String>getBrnds(String selectedItem){

    if(selectedItem.equals("light")){

        beerColletion.add(" jac mam");
        beerColletion.add(" vico mam");

    }
    else if(selectedItem.equals(("brown"))){

        beerColletion.add(" marco");
        beerColletion.add(" samala ");
    }

    return beerColletion;
}

}
