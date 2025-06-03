package F0;

import F0.M;
import java.util.Arrays;

/* renamed from: F0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363h implements M {

    /* renamed from: a, reason: collision with root package name */
    public final int f1896a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1897b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f1898c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f1899d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f1900e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1901f;

    public C0363h(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f1897b = iArr;
        this.f1898c = jArr;
        this.f1899d = jArr2;
        this.f1900e = jArr3;
        int length = iArr.length;
        this.f1896a = length;
        if (length > 0) {
            this.f1901f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f1901f = 0L;
        }
    }

    public int a(long j7) {
        return g0.M.h(this.f1900e, j7, true, true);
    }

    @Override // F0.M
    public boolean h() {
        return true;
    }

    @Override // F0.M
    public M.a j(long j7) {
        int a7 = a(j7);
        N n7 = new N(this.f1900e[a7], this.f1898c[a7]);
        if (n7.f1794a >= j7 || a7 == this.f1896a - 1) {
            return new M.a(n7);
        }
        int i7 = a7 + 1;
        return new M.a(n7, new N(this.f1900e[i7], this.f1898c[i7]));
    }

    @Override // F0.M
    public long l() {
        return this.f1901f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f1896a + ", sizes=" + Arrays.toString(this.f1897b) + ", offsets=" + Arrays.toString(this.f1898c) + ", timeUs=" + Arrays.toString(this.f1900e) + ", durationsUs=" + Arrays.toString(this.f1899d) + ")";
    }
}
