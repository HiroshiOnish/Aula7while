public class Main {
    public static void main(String[] args) {
    //estrutura de repetição
    // while, for, do while

    boolean x = true;
    int contador = 0;

    while (x == true){
        if (contador <10){
            System.out.println("Estou repetindo: "+contador);
            contador++;
        }else {
            x = false;
        }
    }
    }
}
