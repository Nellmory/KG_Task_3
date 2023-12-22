package com.cg.vsu.matrixes;

import com.cg.vsu.vectors.Vector;

public interface Matrix<T extends Matrix, F extends Vector> {
    public void setZero();
    public T sum(T value);
    public T subtract(T value);
    public F multiplyByVector(F value);
    public T multiplyByMatrix(T value);
    public void transpose();
    public float[] getValues();
}
