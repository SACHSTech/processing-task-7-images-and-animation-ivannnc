import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	PImage imgBackground;
  PImage imgFloatingCow;
	
  // state image and background
  float fltBackgroundX = 0;
  float fltBackgroundY = 0;
  float fltCowX = 0;
  float fltCowY = 0;
  float cowXSpeed = 2;
  float cowYSpeed = 2;

  // state circle
  float circleX = 50;
  float circleY = 0;
  float xSpeed = 2;
  float ySpeed = 2;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // state image and background generation 
    background(0);
    imgBackground = loadImage("Sample.png");
    imgFloatingCow = loadImage("cowAgain-removebg-preview.png");

    

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  // generate background and image
	 image(imgBackground, fltBackgroundX, fltBackgroundY);
   image(imgFloatingCow, fltCowX, fltCowY);

  // animate cow image
    fltCowX = fltCowX + cowXSpeed;
    fltCowY = fltCowY + cowYSpeed;

    if (fltCowX < 0 || fltCowX > 200){
      cowXSpeed = cowXSpeed *- 1;
    }
    else if (fltCowY < 0 || fltCowY > 200){
      cowYSpeed = cowYSpeed *- 1;
    }

    
  // generate cow's toy
    fill(51, 204, 255);
    ellipse(circleX, circleY, 25, 25);

  // modify circle
    circleX = circleX + xSpeed;
    circleY = circleY + ySpeed;

  // bounce in all directions
    if(circleX < 0 || circleX > height){
      xSpeed = xSpeed *- 1;
    }
    else if (circleY < 0 || circleY > height){
      ySpeed = ySpeed *- 1;
    }

  }
  // define other methods down here.
}