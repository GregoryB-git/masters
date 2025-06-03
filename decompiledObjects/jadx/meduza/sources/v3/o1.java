package v3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o1 extends i1 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f15621e = v5.e0.E(1);
    public static final String f = v5.e0.E(2);

    /* renamed from: o, reason: collision with root package name */
    public static final e0.e f15622o = new e0.e(7);

    /* renamed from: c, reason: collision with root package name */
    public final int f15623c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15624d;

    public o1(float f10, int i10) {
        x6.b.o("maxStars must be a positive integer", i10 > 0);
        x6.b.o("starRating is out of range [0, maxStars]", f10 >= 0.0f && f10 <= ((float) i10));
        this.f15623c = i10;
        this.f15624d = f10;
    }

    public o1(int i10) {
        x6.b.o("maxStars must be a positive integer", i10 > 0);
        this.f15623c = i10;
        this.f15624d = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f15623c == o1Var.f15623c && this.f15624d == o1Var.f15624d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15623c), Float.valueOf(this.f15624d)});
    }
}
