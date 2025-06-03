/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 *  java.lang.Math
 *  java.lang.Object
 */
package com.onesignal;

import android.view.animation.Interpolator;

class OneSignalBounceInterpolator
implements Interpolator {
    private double mAmplitude;
    private double mFrequency;

    public OneSignalBounceInterpolator(double d, double d2) {
        this.mAmplitude = d;
        this.mFrequency = d2;
    }

    public float getInterpolation(float f) {
        double d = Math.pow((double)Math.E, (double)((double)(-f) / this.mAmplitude));
        return (float)(Math.cos((double)(this.mFrequency * (double)f)) * (d * -1.0) + 1.0);
    }
}

