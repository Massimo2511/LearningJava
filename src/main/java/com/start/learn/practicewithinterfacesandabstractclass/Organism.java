package com.start.learn.practicewithinterfacesandabstractclass;

public interface Organism {
   public default void swim() {
        System.out.println(" All creatures can swim");
    }

   public void speak();
}
