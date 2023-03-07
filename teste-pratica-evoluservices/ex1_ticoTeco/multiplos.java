package ex1_ticoTeco;

public class multiplos {

    public void ticoTeco() {
        for(int i = 1; i <= 100; i++) {

            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("TicoTeco");
            } else if (i % 3 == 0) {
                System.out.println("Tico");
            } else if (i % 5 == 0) {
                System.out.println("Teco");
            } else {
                System.out.println(i);
            }
        }
    }
}
