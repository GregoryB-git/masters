package w5;

import v5.e0;

/* loaded from: classes.dex */
public final class o implements v3.g {

    /* renamed from: e, reason: collision with root package name */
    public static final String f16426e = e0.E(0);
    public static final String f = e0.E(1);

    /* renamed from: o, reason: collision with root package name */
    public static final String f16427o = e0.E(2);

    /* renamed from: p, reason: collision with root package name */
    public static final String f16428p = e0.E(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f16429a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16430b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16431c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16432d;

    public o(float f10, int i10, int i11, int i12) {
        this.f16429a = i10;
        this.f16430b = i11;
        this.f16431c = i12;
        this.f16432d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f16429a == oVar.f16429a && this.f16430b == oVar.f16430b && this.f16431c == oVar.f16431c && this.f16432d == oVar.f16432d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f16432d) + ((((((217 + this.f16429a) * 31) + this.f16430b) * 31) + this.f16431c) * 31);
    }
}
