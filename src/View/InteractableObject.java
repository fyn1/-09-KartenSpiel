package View;



    import java.awt.event.MouseEvent;

    /**
     * Interface für Objekte, die gezeichnet, programm-steuerbar
     * UND nutzerinteragierbar sein müssen.
     */
    public interface InteractableObject extends DrawableObject{

        void keyPressed(int key);

        void keyReleased(int key);

        void mouseReleased(MouseEvent e);


    }


