public class Bell implements Runnable {
    private String sound;
    private int times;
    
    public Bell (String s, int t)
    {
        sound = s;
        times = t;
    }
    public void run()
    {
        for(int i=0; i< times ; i++)
        {
            System.out.println((i + 1 ) + sound + " ");
        }

    }
}
