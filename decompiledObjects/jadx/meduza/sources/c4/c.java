package c4;

import c4.t;
import java.util.Arrays;
import v5.e0;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final int f2262a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2263b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f2264c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f2265d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f2266e;
    public final long f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f2263b = iArr;
        this.f2264c = jArr;
        this.f2265d = jArr2;
        this.f2266e = jArr3;
        int length = iArr.length;
        this.f2262a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // c4.t
    public final boolean e() {
        return true;
    }

    @Override // c4.t
    public final t.a g(long j10) {
        int f = e0.f(this.f2266e, j10, true);
        long[] jArr = this.f2266e;
        long j11 = jArr[f];
        long[] jArr2 = this.f2264c;
        u uVar = new u(j11, jArr2[f]);
        if (j11 >= j10 || f == this.f2262a - 1) {
            return new t.a(uVar, uVar);
        }
        int i10 = f + 1;
        return new t.a(uVar, new u(jArr[i10], jArr2[i10]));
    }

    @Override // c4.t
    public final long h() {
        return this.f;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ChunkIndex(length=");
        l10.append(this.f2262a);
        l10.append(", sizes=");
        l10.append(Arrays.toString(this.f2263b));
        l10.append(", offsets=");
        l10.append(Arrays.toString(this.f2264c));
        l10.append(", timeUs=");
        l10.append(Arrays.toString(this.f2266e));
        l10.append(", durationsUs=");
        l10.append(Arrays.toString(this.f2265d));
        l10.append(")");
        return l10.toString();
    }
}
