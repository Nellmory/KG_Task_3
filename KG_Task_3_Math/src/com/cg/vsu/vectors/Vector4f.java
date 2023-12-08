package com.cg.vsu.vectors;

public class Vector4f implements Vector<Vector4f> {
    private float x, y, z, w;

    public Vector4f(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public boolean equals(Vector4f other) {
        return Math.abs(x - other.x) < eps && Math.abs(y - other.y) < eps && Math.abs(z - other.z) < eps && Math.abs(w - other.w) < eps;
    }

    @Override
    public Vector4f sum(Vector4f v1, Vector4f v2) {
        return new Vector4f(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z, v1.w + v2.w);
    }

    @Override
    public Vector4f subtract(Vector4f v1, Vector4f v2) {
        return new Vector4f(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z, v1.w - v2.w);
    }

    @Override
    public void multiplyByScalar(float a) {
        x = x * a;
        y = y * a;
        z = z * a;
        w = w * a;
    }

    @Override
    public void divideByScalar(float a) {
        x = x / a;
        y = y / a;
        z = z / a;
        w = w / a;
    }

    @Override
    public float length() {
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + Math.pow(w, 2));
    }

    @Override
    public void normalize() {
        float length = this.length();
        x = x / length;
        y = y / length;
        z = z / length;
        w = w / length;
    }

    @Override
    public Vector4f ScalarMultiplication(Vector4f v1, Vector4f v2) {
        return new Vector4f(v1.x * v2.x, v1.y * v2.y, v1.z * v2.z, v1.w * v2.w);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public float getW() {
        return w;
    }
}
