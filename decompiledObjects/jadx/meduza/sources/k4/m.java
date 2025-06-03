package k4;

import v5.e0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final j f9073a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9074b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f9075c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f9076d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9077e;
    public final long[] f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f9078g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9079h;

    public m(j jVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        x6.b.q(iArr.length == jArr2.length);
        x6.b.q(jArr.length == jArr2.length);
        x6.b.q(iArr2.length == jArr2.length);
        this.f9073a = jVar;
        this.f9075c = jArr;
        this.f9076d = iArr;
        this.f9077e = i10;
        this.f = jArr2;
        this.f9078g = iArr2;
        this.f9079h = j10;
        this.f9074b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        for (int b10 = e0.b(this.f, j10, true); b10 < this.f.length; b10++) {
            if ((this.f9078g[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }
}
