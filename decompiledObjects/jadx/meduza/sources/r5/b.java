package r5;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import v5.e0;
import z4.i0;

/* loaded from: classes.dex */
public abstract class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f13630a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13631b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f13632c;

    /* renamed from: d, reason: collision with root package name */
    public final v3.i0[] f13633d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f13634e;
    public int f;

    public b(i0 i0Var, int[] iArr) {
        int i10 = 0;
        x6.b.H(iArr.length > 0);
        i0Var.getClass();
        this.f13630a = i0Var;
        int length = iArr.length;
        this.f13631b = length;
        this.f13633d = new v3.i0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f13633d[i11] = i0Var.f17687d[iArr[i11]];
        }
        Arrays.sort(this.f13633d, new v4.d(2));
        this.f13632c = new int[this.f13631b];
        while (true) {
            int i12 = this.f13631b;
            if (i10 >= i12) {
                this.f13634e = new long[i12];
                return;
            } else {
                this.f13632c[i10] = i0Var.a(this.f13633d[i10]);
                i10++;
            }
        }
    }

    @Override // r5.k
    public final i0 a() {
        return this.f13630a;
    }

    @Override // r5.k
    public final v3.i0 b(int i10) {
        return this.f13633d[i10];
    }

    @Override // r5.k
    public final int c(int i10) {
        return this.f13632c[i10];
    }

    @Override // r5.k
    public final int d(v3.i0 i0Var) {
        for (int i10 = 0; i10 < this.f13631b; i10++) {
            if (this.f13633d[i10] == i0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override // r5.h
    public final /* synthetic */ void e() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13630a == bVar.f13630a && Arrays.equals(this.f13632c, bVar.f13632c);
    }

    @Override // r5.k
    public final int f(int i10) {
        for (int i11 = 0; i11 < this.f13631b; i11++) {
            if (this.f13632c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // r5.h
    public void g() {
    }

    @Override // r5.h
    public final /* synthetic */ void h() {
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.f13632c) + (System.identityHashCode(this.f13630a) * 31);
        }
        return this.f;
    }

    @Override // r5.h
    public final boolean k(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean l10 = l(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f13631b && !l10) {
            l10 = (i11 == i10 || l(i11, elapsedRealtime)) ? false : true;
            i11++;
        }
        if (!l10) {
            return false;
        }
        long[] jArr = this.f13634e;
        long j11 = jArr[i10];
        int i12 = e0.f15881a;
        long j12 = elapsedRealtime + j10;
        if (((j10 ^ j12) & (elapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j11, j12);
        return true;
    }

    @Override // r5.h
    public final boolean l(int i10, long j10) {
        return this.f13634e[i10] > j10;
    }

    @Override // r5.k
    public final int length() {
        return this.f13632c.length;
    }

    @Override // r5.h
    public void m() {
    }

    @Override // r5.h
    public int n(long j10, List<? extends b5.m> list) {
        return list.size();
    }

    @Override // r5.h
    public final int o() {
        return this.f13632c[i()];
    }

    @Override // r5.h
    public final v3.i0 p() {
        return this.f13633d[i()];
    }

    @Override // r5.h
    public void r(float f) {
    }

    @Override // r5.h
    public final /* synthetic */ void t() {
    }

    @Override // r5.h
    public final /* synthetic */ void u() {
    }
}
