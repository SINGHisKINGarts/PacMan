import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class PacMan extends JPanel{
    private int rowCount=21;
    private int columnCount=19;
    private int tileSize=32;
    private int boardWidth =columnCount*tileSize;
    private int boardHeight =rowCount*tileSize;
    private Image wallImage;
    private Image blueGhostImage;
    private Image redGhostImage;
    private Image pinkGhostImage;
    private Image orangeGhostImage;

    private Image pacmanUpImage;
    private Image pacmanDownImage;
    private Image pacmanLeftImage;
    private Image pacmanRightImage;

    PacMan() {
        setPreferredSize(new Dimension(boardWidth,boardHeight));
        setBackground(Color.BLACK);

        // load images
        wallImage=new ImageIcon(getClass().getResource("./wall.png")).getImage();
        blueGhostImage=new ImageIcon(getClass().getResource("./blueGhost.png")).getImage();
        redGhostImage=new ImageIcon(getClass().getResource("./blueGhost.png")).getImage();
        pinkGhostImage=new ImageIcon(getClass().getResource("./blueGhost.png")).getImage();
        orangeGhostImage=new ImageIcon(getClass().getResource("./blueGhost.png")).getImage();

        pacmanUpImage=new ImageIcon(getClass().getResource("./pacmanUp.png")).getImage();
        pacmanLeftImage=new ImageIcon(getClass().getResource("./pacmanLeft.png")).getImage();
        pacmanDownImage=new ImageIcon(getClass().getResource("./pacmanDown.png")).getImage();
        pacmanRightImage=new ImageIcon(getClass().getResource("./pacmanRight.png")).getImage();

    }
}