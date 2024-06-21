package hw4.a1;

public final class PlayerArm implements PlayerComponent {
    private float rx, ry, rz;
    private float x, y, z;

    public PlayerArm() {

    }

    public void add(PlayerComponent comp) {

    }
    public void remove(PlayerComponent comp) {

    }
    public void move(float x, float y, float z) {
        this.x += x;
        this.y += y;
        this.z += z;
    }
    public void rotate(float rx, float ry, float rz) {
        this.rx += rx;
        this.ry += ry;
        this.rz += rz;

        this.rx %= 360;
        this.ry %= 360;
        this.rz %= 360;
    }
}
