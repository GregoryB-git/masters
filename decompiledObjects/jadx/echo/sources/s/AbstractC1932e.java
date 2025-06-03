package s;

import android.graphics.drawable.Drawable;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1932e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f19146a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f7, float f8, boolean z7) {
        return z7 ? (float) (f7 + ((1.0d - f19146a) * f8)) : f7;
    }

    public static float b(float f7, float f8, boolean z7) {
        float f9 = f7 * 1.5f;
        return z7 ? (float) (f9 + ((1.0d - f19146a) * f8)) : f9;
    }
}
