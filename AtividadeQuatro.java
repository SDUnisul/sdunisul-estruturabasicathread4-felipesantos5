public class AtividadeQuatro {
    
    static class ThreadNumeros extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Número: " + i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    static class ThreadLetras extends Thread {
        @Override
        public void run() {
            for (char letra = 'A'; letra <= 'E'; letra++) {
                System.out.println("Letra: " + letra);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void main(String[] args) {
        ThreadNumeros threadNumeros = new ThreadNumeros();
        ThreadLetras threadLetras = new ThreadLetras();
        
        threadNumeros.start();
        threadLetras.start();
        
        try {
            threadNumeros.join();
            threadLetras.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Programa finalizado!");
    }
}