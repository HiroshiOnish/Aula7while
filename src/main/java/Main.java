public class Main {
    public static void main(String[] args) {
        //estrutura de repetição
        // while, for, do while
        //for (variavel,comparação, operação


        boolean x = true;
        int contador = 0;

        while (x == true) {
            if (contador < 10) {
                System.out.println("Estou repetindo:X " + contador);
                contador++;
            } else {
                x = false;
            }
        }

        boolean y = false;
        int contador1 = 0;

        do {
            if (contador1 < 10) {
                ;

                System.out.println("Estou repetindo:Y " + contador1);
                contador1++;
            } else {
                y = false;
            }
        } while (y == true);

        for (int z=0; z<10; z++){
            System.out.println(z);
        }
    }
}
