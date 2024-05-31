
package com.mycompany.contratos.beings;


public class Human implements Move, Fly{ //para enlazar el "contrato"
    private String sex;
    private int height;
    private String name;

    public Human(String sex, int height, String name) {
        this.sex = sex;
        this.height = height;
        this.name = name;
    }
    
    
    @Override
    public void walk(){
        System.out.println("Estoy caminando erguido"); 
    }
    @Override
    public void run(){
        System.out.println("Corriendo como Naruto");
    }
    @Override
    public void fly(){
        System.out.println("Estoy volando!!!");
    }
}
