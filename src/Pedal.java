public class Pedal {
    private int x_pos;
    private int velocity = 10;
    private int width, height;

    // constructor
    public Pedal(int x, int width , int height) {
        this.x_pos = x;
        this.width = width;
        this.height = height;
    }

    // getter
    public int getX_pos() { return x_pos; }
    public int get_width() { return width; }
    public int get_height() { return height; }
    public int get_velocity() { return velocity; }

    // setter
    public void moveLeft() { if (x_pos > 0 ) x_pos -= velocity; }
    public void moveRight() { if (x_pos + width < 480 ) x_pos += velocity; }    // 480보다 작을 때
}