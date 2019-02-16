package com.example.eva1_12__listas_personalizadas;

public class Clima {
    private int imagen_clima;
    private  String ciudad;
    private  String clima;
    private  String desc_clima;
    private double temperatura;

    public Clima(int imagen_clima, String ciudad, String clima, String desc_clima, double temperatura) {
        this.imagen_clima = imagen_clima;
        this.ciudad = ciudad;
        this.clima = clima;
        this.desc_clima = desc_clima;
        this.temperatura = temperatura;
    }
}
