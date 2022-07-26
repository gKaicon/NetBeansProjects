/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica1;

/**
 *
 * @author 0048609
 */
public class Dog extends Animal {

    public void digHole() {
        System.out.println(getNome()+" está cavando o buraco");
    }
        public Dog(){
            super();
            
            setSound("au au au");
        }
    }
