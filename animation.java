import processing.core.PApplet;

    public class MainApp extends PApplet{
        public static void main(String[] args) {
            PApplet.main("MainApp", args);
        }

        static final int NUM_LINES = 10;

        float t;

        public void settings() {
            size(500, 500);
        }

        public void setup() {
            background(20);

        }

        public void draw() {
            background(20);
            stroke(200);
            strokeWeight(5);
            translate(width/2, height/2);
            for (int i = 0; i < NUM_LINES; i++) {
                line(x1(t + i), y1(t + i), x2(t + i), y2(t + i));
            }
            t+= 0.5;
        }

        float x1(float t) {
            return sin(t / 10) * 100 + sin(t / 5) * 20;
        }

        float y1(float t) {
            return cos(-t / 10) * 100 + sin(t / 5) * 50;
        }

        float x2(float t) {
            return sin(t / 10) * 200 + sin(t) * 2 + cos(t) * 10;
        }

        float y2(float t) {
            return cos(t / 20) * 200 + cos(t / 12) * 20;
        }
    }
