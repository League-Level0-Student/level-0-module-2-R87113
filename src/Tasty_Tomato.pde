void setup() {
    size(500, 500);
}
void draw() {
    background(255, 255, 255);
    noStroke();
    fill(234, 90, 102 ); 
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(47, 180, 53);
    rect(176, 103, 12, 32);
    if(mousePressed == true ){
     fill(255, 255, 255);
      ellipse(80 , 200, 30, 30);

    }
}
