package k0;

import g0.AbstractC1297a;
import x0.InterfaceC2142x;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2142x.b f15523a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15524b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15525c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15526d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15527e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15528f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15529g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15530h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15531i;

    public C0(InterfaceC2142x.b bVar, long j7, long j8, long j9, long j10, boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11 = false;
        AbstractC1297a.a(!z10 || z8);
        AbstractC1297a.a(!z9 || z8);
        if (!z7 || (!z8 && !z9 && !z10)) {
            z11 = true;
        }
        AbstractC1297a.a(z11);
        this.f15523a = bVar;
        this.f15524b = j7;
        this.f15525c = j8;
        this.f15526d = j9;
        this.f15527e = j10;
        this.f15528f = z7;
        this.f15529g = z8;
        this.f15530h = z9;
        this.f15531i = z10;
    }

    public C0 a(long j7) {
        return j7 == this.f15525c ? this : new C0(this.f15523a, this.f15524b, j7, this.f15526d, this.f15527e, this.f15528f, this.f15529g, this.f15530h, this.f15531i);
    }

    public C0 b(long j7) {
        return j7 == this.f15524b ? this : new C0(this.f15523a, j7, this.f15525c, this.f15526d, this.f15527e, this.f15528f, this.f15529g, this.f15530h, this.f15531i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0.class != obj.getClass()) {
            return false;
        }
        C0 c02 = (C0) obj;
        return this.f15524b == c02.f15524b && this.f15525c == c02.f15525c && this.f15526d == c02.f15526d && this.f15527e == c02.f15527e && this.f15528f == c02.f15528f && this.f15529g == c02.f15529g && this.f15530h == c02.f15530h && this.f15531i == c02.f15531i && g0.M.c(this.f15523a, c02.f15523a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f15523a.hashCode()) * 31) + ((int) this.f15524b)) * 31) + ((int) this.f15525c)) * 31) + ((int) this.f15526d)) * 31) + ((int) this.f15527e)) * 31) + (this.f15528f ? 1 : 0)) * 31) + (this.f15529g ? 1 : 0)) * 31) + (this.f15530h ? 1 : 0)) * 31) + (this.f15531i ? 1 : 0);
    }
}
