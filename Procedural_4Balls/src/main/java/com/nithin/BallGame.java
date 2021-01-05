package com.nithin;

import processing.core.PApplet;
import java.awt.*;

public class BallGame extends PApplet {

    public static final int DIAMETER = 10;
    Dimension deviceDimensions;
    int screenHeight, screenWidth, canvasHeight, canvasWidth;
    int fifthPartOfHeight;
    int[] balls;

    public static void main(String[] args){

        PApplet.main("com.nithin.BallGame", args);
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

        balls = new int[4];
        fifthPartOfHeight = canvasHeight / (balls.length + 1);
    }

    @Override
    public void draw() {

        for(int i = 0; i < balls.length; i++) {
            drawCircle(balls[i], (i + 1) * fifthPartOfHeight);
            balls[i] += (i + 1);
        }
    }

    private void drawCircle(int x, int y) {

        ellipse(x, y, DIAMETER, DIAMETER);
    }
}
