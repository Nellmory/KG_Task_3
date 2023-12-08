package com.cg.vsu;

import com.cg.vsu.matrixes.Matrix3x3;
import com.cg.vsu.matrixes.Matrix4x4;
import com.cg.vsu.vectors.Vector2f;

public class Main {
    public static void main(String[] args) {
        Matrix4x4 m = new Matrix4x4(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        m.transpose();
    }
}