/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.annotation.TargetApi
 *  android.graphics.Path
 *  android.util.Property
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.graphics.Path;
import android.util.Property;

@TargetApi(value=21)
class ObjectAnimatorCompatLollipop {
    private ObjectAnimatorCompatLollipop() {
    }

    public static <T> ObjectAnimator ofArgb(T t2, Property<T, Integer> property, int ... nArray) {
        return ObjectAnimator.ofArgb(t2, property, (int[])nArray);
    }

    public static ObjectAnimator ofArgb(Object object, String string2, int ... nArray) {
        return ObjectAnimator.ofArgb((Object)object, (String)string2, (int[])nArray);
    }

    public static <T> ObjectAnimator ofFloat(T t2, Property<T, Float> property, Property<T, Float> property2, Path path) {
        return ObjectAnimator.ofFloat(t2, property, property2, (Path)path);
    }

    public static ObjectAnimator ofFloat(Object object, String string2, String string3, Path path) {
        return ObjectAnimator.ofFloat((Object)object, (String)string2, (String)string3, (Path)path);
    }

    public static <T> ObjectAnimator ofInt(T t2, Property<T, Integer> property, Property<T, Integer> property2, Path path) {
        return ObjectAnimator.ofInt(t2, property, property2, (Path)path);
    }

    public static ObjectAnimator ofInt(Object object, String string2, String string3, Path path) {
        return ObjectAnimator.ofInt((Object)object, (String)string2, (String)string3, (Path)path);
    }
}

