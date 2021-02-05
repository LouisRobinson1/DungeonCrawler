
package dungeoncrawler;

import java.awt.Toolkit;
public class DungeonCrawler {

   
    public static void main(String[] args) {
        MainScreen S = new MainScreen();
       
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = (int)tk.getScreenSize().getWidth();
        int ySize = (int)tk.getScreenSize().getHeight();
        
        
        S.setSize(xSize,ySize);
        S.setVisible(true);
    
    }
    
    }
    

