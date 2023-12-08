package com.cg.vsu.matrixes;

import com.cg.vsu.Main;
import com.cg.vsu.vectors.Vector4f;

public class Matrix4x4 implements Matrix<Matrix4x4, Vector4f> {
    private float a11 = 1;
    private float a12 = 0;
    private float a13 = 0;
    private float a14 = 0;
    private float a21 = 0;
    private float a22 = 1;
    private float a23 = 0;
    private float a24 = 0;
    private float a31 = 0;
    private float a32 = 0;
    private float a33 = 1;
    private float a34 = 0;
    private float a41 = 0;
    private float a42 = 0;
    private float a43 = 0;
    private float a44 = 1;

    public Matrix4x4() {
    }

    public Matrix4x4(float a11, float a12, float a13, float a14, float a21, float a22, float a23, float a24, float a31, float a32, float a33, float a34, float a41, float a42, float a43, float a44) {
        this.a11 = a11;
        this.a12 = a12;
        this.a13 = a13;
        this.a14 = a14;
        this.a21 = a21;
        this.a22 = a22;
        this.a23 = a23;
        this.a24 = a24;
        this.a31 = a31;
        this.a32 = a32;
        this.a33 = a33;
        this.a34 = a34;
        this.a41 = a41;
        this.a42 = a42;
        this.a43 = a43;
        this.a44 = a44;
    }

    @Override
    public Matrix4x4 setZero() {
        return new Matrix4x4(
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0);
    }

    @Override
    public Matrix4x4 sum(Matrix4x4 m1, Matrix4x4 m2) {
        return new Matrix4x4(
                m1.a11 + m2.a11, m1.a12 + m2.a12, m1.a13 + m2.a13, m1.a14 + m2.a14,
                m1.a21 + m2.a21, m1.a22 + m2.a22, m1.a23 + m2.a23, m1.a24 + m2.a24,
                m1.a31 + m2.a31, m1.a32 + m2.a32, m1.a33 + m2.a33, m1.a34 + m2.a34,
                m1.a41 + m2.a41, m1.a42 + m2.a42, m1.a43 + m2.a43, m1.a44 + m2.a44);
    }

    @Override
    public Matrix4x4 subtract(Matrix4x4 m1, Matrix4x4 m2) {
        return new Matrix4x4(
                m1.a11 - m2.a11, m1.a12 - m2.a12, m1.a13 - m2.a13, m1.a14 - m2.a14,
                m1.a21 - m2.a21, m1.a22 - m2.a22, m1.a23 - m2.a23, m1.a24 - m2.a24,
                m1.a31 - m2.a31, m1.a32 - m2.a32, m1.a33 - m2.a33, m1.a34 - m2.a34,
                m1.a41 - m2.a41, m1.a42 - m2.a42, m1.a43 - m2.a43, m1.a44 - m2.a44);
    }

    @Override
    public Vector4f multiplyByVector(Matrix4x4 m, Vector4f v) {
        return new Vector4f(
                a11 * v.getX() + a12 * v.getY() + a13 * v.getZ() + a14 * v.getW(),
                a21 * v.getX() + a22 * v.getY() + a23 * v.getZ() * a24 * v.getW(),
                a31 * v.getX() + a32 * v.getY() + a33 * v.getZ() + a34 * v.getW(),
                a41 * v.getX() + a42 * v.getY() + a43 * v.getZ() + a44 * v.getW());
    }

    @Override
    public Matrix4x4 multiplyByMatrix(Matrix4x4 b) {
        return new Matrix4x4(
                a11 * b.a11 + a12 * b.a21 + a13 * b.a31 + a14 * b.a41, a11 * b.a12 + a12 * b.a22 + a13 * b.a32 + a14 * b.a42, a11 * b.a13 + a12 * b.a23 + a13 * b.a33 + a14 * b.a43, a11 * b.a14 + a12 * b.a24 + a13 * b.a34 + a14 * b.a44,
                a21 * b.a11 + a22 * b.a21 + a23 * b.a31 + a24 * b.a41, a21 * b.a12 + a22 * b.a22 + a23 * b.a32 + a24 * b.a42, a21 * b.a13 + a22 * b.a23 + a23 * b.a33 + a24 * b.a43, a21 * b.a14 + a22 * b.a24 + a23 * b.a34 + a24 * b.a44,
                a31 * b.a11 + a32 * b.a21 + a33 * b.a31 + a34 * b.a41, a31 * b.a12 + a32 * b.a22 + a33 * b.a32 + a34 * b.a42, a31 * b.a13 + a32 * b.a23 + a33 * b.a33 + a34 * b.a43, a31 * b.a14 + a32 * b.a24 + a33 * b.a34 + a34 * b.a44,
                a41 * b.a11 + a32 * b.a21 + a33 * b.a31 + a44 * b.a41, a41 * b.a12 + a42 * b.a22 + a43 * b.a32 + a44 * b.a42, a41 * b.a13 + a42 * b.a23 + a43 * b.a33 + a44 * b.a43, a41 * b.a14 + a42 * b.a24 + a43 * b.a34 + a44 * b.a44);
    }

    @Override
    public void transpose() {
        for (int i = 1; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                float tmp;
                switch (i) {
                    case 1 -> {
                        if (j == 2) {
                            tmp = a21;
                            a21 = a12;
                            a12 = tmp;
                        }
                        if (j == 3) {
                            tmp = a31;
                            a31 = a13;
                            a13 = tmp;
                        }
                        if (j == 4) {
                            tmp = a41;
                            a41 = a14;
                            a14 = tmp;
                        }
                    }
                    case 2 -> {
                        if (j == 3) {
                            tmp = a32;
                            a32 = a23;
                            a23 = tmp;
                        } else {
                            tmp = a24;
                            a24 = a42;
                            a42 = tmp;
                        }
                    }
                    case 3 -> {
                        tmp = a43;
                        a43 = a34;
                        a34 = tmp;
                    }
                }
            }
        }
    }
}
