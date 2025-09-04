public class AtividadeDois {
    
    static class MensagemRunnable implements Runnable {
        private String mensagem;
        
        public MensagemRunnable(String mensagem) {
            this.mensagem = mensagem;
        }
        
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(mensagem);
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void main(String[] args) {
        MensagemRunnable runnable1 = new MensagemRunnable("Olá do Runnable 1");
        MensagemRunnable runnable2 = new MensagemRunnable("Olá do Runnable 2");
        
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        
        thread1.start();
        thread2.start();
    }
}