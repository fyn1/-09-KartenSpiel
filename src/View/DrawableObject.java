package View;

/**
 * Created by 204g01 on 28.11.2016.
 */


/**
 * Created by Jean-Pierre on 15.11.2016.
 */

    import java.awt.*;

    /**
     * Interface für Objekte, die nur gezeichnet und programm-steuerbar sein m�ssen.
     */
    public interface DrawableObject{

        void draw(DrawingPanel dp, Graphics2D g2d);

        void update(double dt);

    }


