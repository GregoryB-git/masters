/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ArgbEvaluator
 *  android.animation.ObjectAnimator
 *  android.animation.PropertyValuesHolder
 *  android.animation.TypeEvaluator
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.util.Property
 *  androidx.annotation.Size
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.Property;
import androidx.annotation.Size;

class ObjectAnimatorCompatBase {
    private static final int NUM_POINTS = 201;

    private ObjectAnimatorCompatBase() {
    }

    private static void calculateXYValues(Path path, @Size(value=201L) float[] fArray, @Size(value=201L) float[] fArray2) {
        path = new PathMeasure(path, false);
        float f7 = path.getLength();
        float[] fArray3 = new float[2];
        for (int i2 = 0; i2 < 201; ++i2) {
            path.getPosTan((float)i2 * f7 / 200.0f, fArray3, null);
            fArray[i2] = fArray3[0];
            fArray2[i2] = fArray3[1];
        }
    }

    private static void calculateXYValues(Path path, @Size(value=201L) int[] nArray, @Size(value=201L) int[] nArray2) {
        path = new PathMeasure(path, false);
        float f7 = path.getLength();
        float[] fArray = new float[2];
        for (int i2 = 0; i2 < 201; ++i2) {
            path.getPosTan((float)i2 * f7 / 200.0f, fArray, null);
            nArray[i2] = Math.round((float)fArray[0]);
            nArray2[i2] = Math.round((float)fArray[1]);
        }
    }

    public static <T> ObjectAnimator ofArgb(T object, Property<T, Integer> property, int ... nArray) {
        object = ObjectAnimator.ofInt(object, property, (int[])nArray);
        object.setEvaluator((TypeEvaluator)new ArgbEvaluator());
        return object;
    }

    public static ObjectAnimator ofArgb(Object object, String string2, int ... nArray) {
        object = ObjectAnimator.ofInt((Object)object, (String)string2, (int[])nArray);
        object.setEvaluator((TypeEvaluator)new ArgbEvaluator());
        return object;
    }

    public static <T> ObjectAnimator ofFloat(T t2, Property<T, Float> property, Property<T, Float> property2, Path path) {
        float[] fArray = new float[201];
        float[] fArray2 = new float[201];
        ObjectAnimatorCompatBase.calculateXYValues(path, fArray, fArray2);
        return ObjectAnimator.ofPropertyValuesHolder(t2, (PropertyValuesHolder[])new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(property, (float[])fArray), PropertyValuesHolder.ofFloat(property2, (float[])fArray2)});
    }

    public static ObjectAnimator ofFloat(Object object, String string2, String string3, Path path) {
        float[] fArray = new float[201];
        float[] fArray2 = new float[201];
        ObjectAnimatorCompatBase.calculateXYValues(path, fArray, fArray2);
        return ObjectAnimator.ofPropertyValuesHolder((Object)object, (PropertyValuesHolder[])new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat((String)string2, (float[])fArray), PropertyValuesHolder.ofFloat((String)string3, (float[])fArray2)});
    }

    public static <T> ObjectAnimator ofInt(T t2, Property<T, Integer> property, Property<T, Integer> property2, Path path) {
        int[] nArray = new int[201];
        int[] nArray2 = new int[201];
        ObjectAnimatorCompatBase.calculateXYValues(path, nArray, nArray2);
        return ObjectAnimator.ofPropertyValuesHolder(t2, (PropertyValuesHolder[])new PropertyValuesHolder[]{PropertyValuesHolder.ofInt(property, (int[])nArray), PropertyValuesHolder.ofInt(property2, (int[])nArray2)});
    }

    public static ObjectAnimator ofInt(Object object, String string2, String string3, Path path) {
        int[] nArray = new int[201];
        int[] nArray2 = new int[201];
        ObjectAnimatorCompatBase.calculateXYValues(path, nArray, nArray2);
        return ObjectAnimator.ofPropertyValuesHolder((Object)object, (PropertyValuesHolder[])new PropertyValuesHolder[]{PropertyValuesHolder.ofInt((String)string2, (int[])nArray), PropertyValuesHolder.ofInt((String)string3, (int[])nArray2)});
    }
}

