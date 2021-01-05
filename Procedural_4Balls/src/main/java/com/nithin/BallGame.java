package com.nithin;

import processing.core.PApplet;
import java.awt.*;

public class BallGame extends PApplet {

    public static final int DIAMETER = 10;
    public static final int NUMBER_OF_BALLS = 4;
    public static final String CLASS_NAME = "com.nithin.BallGame";
    Dimension deviceDimensions;
    int screenHeight, screenWidth, canvasHeight, canvasWidth;
    int fifthPartOfHeight;
    int[] balls;


    public static void main(String[] args){

        PApplet.main(CLASS_NAME, args);
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
    public void setup() {

        balls = new int[NUMBER_OF_BALLS];
        fifthPartOfHeight = canvasHeight / (NUMBER_OF_BALLS + 1);
    }

    @Override
    public void draw() {

        for(int i = 0; i < NUMBER_OF_BALLS; i++) {
            drawBall(balls[i], (i + 1) * fifthPartOfHeight);
            balls[i] += (i + 1);
        }
    }

    private void drawBall(int x, int y) {

        ellipse(x, y, DIAMETER, DIAMETER);
    }
}
