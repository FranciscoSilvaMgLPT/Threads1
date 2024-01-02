public class Main {
    public static void main(String[] args) {

        Account chico = new Account(10,"chico");
        Account teste1 = new Account(30,"teste1");
        Account teste2 = new Account(30,"teste2");
        chico.start();
        teste1.start();
        teste2.start();



    }
}