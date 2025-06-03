package v3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b1 extends i1 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f15248d = v5.e0.E(1);

    /* renamed from: e, reason: collision with root package name */
    public static final e0.d f15249e = new e0.d(7);

    /* renamed from: c, reason: collision with root package name */
    public final float f15250c;

    public b1() {
        this.f15250c = -1.0f;
    }

    public b1(float f) {
        x6.b.o("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.f15250c = f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b1) && this.f15250c == ((b1) obj).f15250c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15250c)});
    }
}
