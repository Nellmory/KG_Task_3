package com.cg.vsu.matrixes;

import com.cg.vsu.vectors.Vector;

public interface Matrix<T extends Matrix, F extends Vector> {
    public T setZero();
    public T sum(T value, T value1);
    public T subtract(T value, T value1);
    public F multiplyByVector(T value, F value1);
    public T multiplyByMatrix(T value);
    public void transpose();
}
