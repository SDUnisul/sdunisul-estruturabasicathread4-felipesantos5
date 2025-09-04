public class atividadeTres {
    
    static class Corredor extends Thread {
        private String nome;
        
        public Corredor(String nome) {
            this.nome = nome;
        }
        
        @Override
        public void run() {
            for (int metros = 10; metros <= 100; metros += 10) {
                System.out.println(nome + ": " + metros + " metros");
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(nome + " terminou a corrida!");
        }
    }
    
    public static void main(String[] args) {
        Corredor corredor1 = new Corredor("Corredor 1");
        Corredor corredor2 = new Corredor("Corredor 2");
        Corredor corredor3 = new Corredor("Corredor 3");
        
        corredor1.start();
        corredor2.start();
        corredor3.start();
        
        try {
            corredor1.join();
            corredor2.join();
            corredor3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Corrida finalizada!");
    }
}