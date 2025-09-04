public class AtividadeUm {
    
    static class ContadorThread extends Thread {
        private String nome;
        
        public ContadorThread(String nome) {
            this.nome = nome;
        }
        
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(nome + ": " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void main(String[] args) {
        ContadorThread thread1 = new ContadorThread("Thread 1");
        ContadorThread thread2 = new ContadorThread("Thread 2");
        
        thread1.start();
        thread2.start();
    }
}