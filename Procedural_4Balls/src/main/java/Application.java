import processing.core.PApplet;

import java.awt.*;

public class Application extends PApplet {


    public static final int DIAMETER = 10;
    public static final int BALL1_SPEED = 1;
    public static final int BALL2_SPEED = 2;
    public static final int BALL3_SPEED = 3;
    public static final int BALL4_SPEED = 4;

    Dimension deviceDimensions;
    int screenHeight, screenWidth;
    int canvasHeight, canvasWidth;
    int ball1 = 0, ball2 = 0, ball3 = 0, ball4 = 0;

    public static void main(String[] args){

        PApplet.main("Application", args);
    }

    @Override
    public void settings() {

        deviceDimensions = Toolkit.getDefaultToolkit().getScreenSize();
        screenHeight = deviceDimensions.height;
        screenWidth = deviceDimensions.width;

        canvasHeight = screenHeight / 2;
        canvasWidth = screenWidth / 2;

        size(canvasWidth, canvasHeight);
    }

    @Override
    public void draw() {

        drawCircle(ball1, canvasHeight / 5);
        drawCircle(ball2, 2 * canvasHeight / 5);
        drawCircle(ball3, 3 * canvasHeight / 5);
        drawCircle(ball4, 4 *canvasHeight / 5);

        ball1 += BALL1_SPEED;
        ball2 += BALL2_SPEED;
        ball3 += BALL3_SPEED;
        ball4 += BALL4_SPEED;
    }

    private void drawCircle(int x, int y) {

        ellipse(x, y, DIAMETER, DIAMETER);
    }
}
