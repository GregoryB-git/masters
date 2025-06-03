package Z0;

import g0.AbstractC1297a;
import g0.M;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final s f7819a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7820b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7821c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f7822d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7823e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f7824f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f7825g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7826h;

    public v(s sVar, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j7) {
        AbstractC1297a.a(iArr.length == jArr2.length);
        AbstractC1297a.a(jArr.length == jArr2.length);
        AbstractC1297a.a(iArr2.length == jArr2.length);
        this.f7819a = sVar;
        this.f7821c = jArr;
        this.f7822d = iArr;
        this.f7823e = i7;
        this.f7824f = jArr2;
        this.f7825g = iArr2;
        this.f7826h = j7;
        this.f7820b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j7) {
        for (int h7 = M.h(this.f7824f, j7, true, false); h7 >= 0; h7--) {
            if ((this.f7825g[h7] & 1) != 0) {
                return h7;
            }
        }
        return -1;
    }

    public int b(long j7) {
        for (int d7 = M.d(this.f7824f, j7, true, false); d7 < this.f7824f.length; d7++) {
            if ((this.f7825g[d7] & 1) != 0) {
                return d7;
            }
        }
        return -1;
    }
}
