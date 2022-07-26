
package pratica1;

/**
 *
 * @author 0048609
 */
public class Pratica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Doguinho
        Dog husk = new Dog();
        
        husk.setNome("Bob");
        System.out.println(husk.getNome() + " faz " + husk.getSound());
        husk.digHole();
        husk.setPeso(100);
        //Gatinho
        Cat siames = new Cat();
        siames.setNome("Josh");
        System.out.println(siames.getNome()+ " faz " + siames.getSound());

        siames.scrathc();
        siames.setPeso(100);

        //Passarinho
        Bird sabia = new Bird();
        sabia.setNome("Piu");
        System.out.println(sabia.getNome()+ " faz " + sabia.getSound());
        sabia.fly();
        sabia.setPeso(10);
        
        Giraffe giraffe = new Giraffe();
        giraffe.setNome("Tom");
        System.out.println(giraffe.getNome());
        
        

        // TODO code application logic here
    }

}