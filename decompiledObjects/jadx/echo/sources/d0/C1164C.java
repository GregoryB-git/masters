package d0;

import g0.AbstractC1297a;

/* renamed from: d0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1164C {

    /* renamed from: d, reason: collision with root package name */
    public static final C1164C f12353d = new C1164C(1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final String f12354e = g0.M.w0(0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f12355f = g0.M.w0(1);

    /* renamed from: a, reason: collision with root package name */
    public final float f12356a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12357b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12358c;

    public C1164C(float f7) {
        this(f7, 1.0f);
    }

    public long a(long j7) {
        return j7 * this.f12358c;
    }

    public C1164C b(float f7) {
        return new C1164C(f7, this.f12357b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1164C.class != obj.getClass()) {
            return false;
        }
        C1164C c1164c = (C1164C) obj;
        return this.f12356a == c1164c.f12356a && this.f12357b == c1164c.f12357b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f12356a)) * 31) + Float.floatToRawIntBits(this.f12357b);
    }

    public String toString() {
        return g0.M.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f12356a), Float.valueOf(this.f12357b));
    }

    public C1164C(float f7, float f8) {
        AbstractC1297a.a(f7 > 0.0f);
        AbstractC1297a.a(f8 > 0.0f);
        this.f12356a = f7;
        this.f12357b = f8;
        this.f12358c = Math.round(f7 * 1000.0f);
    }
}
