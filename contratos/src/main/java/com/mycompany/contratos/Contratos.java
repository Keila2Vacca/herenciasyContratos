

package com.mycompany.contratos;

import com.mycompany.contratos.beings.Human;

public class Contratos {

    public static void main(String[] args) {
       Human human1 = new Human("femenino", 174, "Keila", "Tierra");
       human1.crawl();
       human1.walk();
       human1.run();
       human1.fly();
    }
}
