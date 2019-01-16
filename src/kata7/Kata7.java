package kata7;


import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Kata7 extends JFrame {
    
    public static void main(String[] args) throws IOException {
        new Kata7().launch();
    }

    public Kata7() throws IOException {
        Watch watch = new Watch();
        WatchDisplay watchDisplay = new WatchDisplay(background());
        new WatchPresenter(watch, watchDisplay);
        this.init();
        this.add(watchDisplay);
    }
    
    

    private static Image background() throws IOException  {
        return ImageIO.read(new File("RelojVeloz.png"));            
    }

    private void launch() {
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Watch");
        this.setSize(400,400);
        this.setResizable(false);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
