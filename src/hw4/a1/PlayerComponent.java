package hw4.a1;

public interface PlayerComponent {
    void add(PlayerComponent comp);
    void remove(PlayerComponent comp);
    void move(float x, float y, float z);
    void rotate(float rx, float ry, float rz);
}
