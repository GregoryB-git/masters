/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 */
package u1;

import android.animation.TypeEvaluator;

public class e
implements TypeEvaluator {
    public static final e a = new e();

    public static e a() {
        return a;
    }

    public Object evaluate(float f8, Object object, Object object2) {
        int n8 = (Integer)object;
        float f9 = (float)(n8 >> 24 & 255) / 255.0f;
        float f10 = (float)(n8 >> 16 & 255) / 255.0f;
        float f11 = (float)(n8 >> 8 & 255) / 255.0f;
        float f12 = (float)(n8 & 255) / 255.0f;
        n8 = (Integer)object2;
        float f13 = (float)(n8 >> 24 & 255) / 255.0f;
        float f14 = (float)(n8 >> 16 & 255) / 255.0f;
        float f15 = (float)(n8 >> 8 & 255) / 255.0f;
        float f16 = (float)(n8 & 255) / 255.0f;
        f10 = (float)Math.pow((double)f10, (double)2.2);
        f11 = (float)Math.pow((double)f11, (double)2.2);
        f12 = (float)Math.pow((double)f12, (double)2.2);
        f14 = (float)Math.pow((double)f14, (double)2.2);
        f15 = (float)Math.pow((double)f15, (double)2.2);
        f16 = (float)Math.pow((double)f16, (double)2.2);
        f10 = (float)Math.pow((double)(f10 + (f14 - f10) * f8), (double)0.45454545454545453);
        f11 = (float)Math.pow((double)(f11 + (f15 - f11) * f8), (double)0.45454545454545453);
        f16 = (float)Math.pow((double)(f12 + f8 * (f16 - f12)), (double)0.45454545454545453);
        n8 = Math.round((float)((f9 + (f13 - f9) * f8) * 255.0f));
        return Math.round((float)(f10 * 255.0f)) << 16 | n8 << 24 | Math.round((float)(f11 * 255.0f)) << 8 | Math.round((float)(f16 * 255.0f));
    }
}

