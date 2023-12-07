package com.cg.vsu.vectors;

public class Vector2f implements Vector<Vector2f> {
    private float x, y;

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Vector2f other) {
        return Math.abs(x - other.x) < eps && Math.abs(y - other.y) < eps;
    }

    @Override
    public Vector2f sum(Vector2f v1, Vector2f v2) {
        return new Vector2f(v1.x + v2.x, v1.y + v2.y);
    }

    @Override
    public Vector2f subtract(Vector2f v1, Vector2f v2) {
        return new Vector2f(v1.x - v2.x, v1.y - v2.y);
    }

    @Override
    public void multiplyByScalar(float a) {
        x = x * a;
        y = y * a;
    }

    @Override
    public void divideByScalar(float a) {
        x = x / a;
        y = y / a;
    }

    @Override
    public double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public void normalize() {
        float length = (float) this.length();
        x = x / length;
        y = y / length;
    }

    @Override
    public Vector2f ScalarMultiplication(Vector2f v1, Vector2f v2) {
        return new Vector2f(v1.x * v2.x, v1.y * v2.y);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
