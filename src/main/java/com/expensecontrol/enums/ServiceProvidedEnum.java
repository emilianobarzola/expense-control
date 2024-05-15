package com.expensecontrol.enums;

public enum ServiceProvidedEnum {

    SUPERMARKET("Supermercado"),
    BUTCHER_SHOP("Açougue"),
    SNACK_BAR("Lanchonete"),
    PHARMACY("Drogaria"),
    ;

    private String name;

    private ServiceProvidedEnum(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}
