public class App {
    public static void main(String[] args) throws Exception {
    
        Runnable c1 = new Bell("DIN",5);
        Runnable c2 = new Bell ("DON", 5);
        
        Thread T1 = new Thread(c1);
        Thread T2 = new Thread(c2);

        T1.start();


        T2.start();

        

        new Thread(new Bell("DAN", 5)).start();
            
        
    }
}
