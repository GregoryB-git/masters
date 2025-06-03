/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.graphics.Path
 *  android.util.Property
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;
import me.zhanghai.android.materialprogressbar.internal.ObjectAnimatorCompatLollipop;

public class ObjectAnimatorCompat {
    private ObjectAnimatorCompat() {
    }

    public static <T> ObjectAnimator ofArgb(T t2, Property<T, Integer> property, int ... nArray) {
        return ObjectAnimatorCompatLollipop.ofArgb(t2, property, nArray);
    }

    public static ObjectAnimator ofArgb(Object object, String string2, int ... nArray) {
        return ObjectAnimatorCompatLollipop.ofArgb(object, string2, nArray);
    }

    public static <T> ObjectAnimator ofFloat(T t2, Property<T, Float> property, Property<T, Float> property2, Path path) {
        return ObjectAnimatorCompatLollipop.ofFloat(t2, property, property2, path);
    }

    public static ObjectAnimator ofFloat(Object object, String string2, String string3, Path path) {
        return ObjectAnimatorCompatLollipop.ofFloat(object, string2, string3, path);
    }

    public static <T> ObjectAnimator ofInt(T t2, Property<T, Integer> property, Property<T, Integer> property2, Path path) {
        return ObjectAnimatorCompatLollipop.ofInt(t2, property, property2, path);
    }

    public static ObjectAnimator ofInt(Object object, String string2, String string3, Path path) {
        return ObjectAnimatorCompatLollipop.ofInt(object, string2, string3, path);
    }
}

