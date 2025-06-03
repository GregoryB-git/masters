package z0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f17474a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17475b;

    public b(float[] fArr) {
        this.f17474a = fArr;
        this.f17475b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f17474a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f10 = this.f17475b;
        float f11 = (f - (min * f10)) / f10;
        float[] fArr2 = this.f17474a;
        float f12 = fArr2[min];
        return ((fArr2[min + 1] - f12) * f11) + f12;
    }
}
