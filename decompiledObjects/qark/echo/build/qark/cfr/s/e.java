/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  java.lang.Math
 */
package s;

import android.graphics.drawable.Drawable;

public abstract class e
extends Drawable {
    public static final double a = Math.cos((double)Math.toRadians((double)45.0));

    public static float a(float f8, float f9, boolean bl) {
        float f10 = f8;
        if (bl) {
            f10 = (float)((double)f8 + (1.0 - a) * (double)f9);
        }
        return f10;
    }

    public static float b(float f8, float f9, boolean bl) {
        float f10;
        f8 = f10 = f8 * 1.5f;
        if (bl) {
            f8 = (float)((double)f10 + (1.0 - a) * (double)f9);
        }
        return f8;
    }
}

