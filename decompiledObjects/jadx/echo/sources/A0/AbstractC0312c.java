package A0;

import android.os.SystemClock;
import d0.C1171J;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.M;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import y0.AbstractC2226e;

/* renamed from: A0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0312c implements y {

    /* renamed from: a, reason: collision with root package name */
    public final C1171J f72a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f74c;

    /* renamed from: d, reason: collision with root package name */
    public final int f75d;

    /* renamed from: e, reason: collision with root package name */
    public final C1194q[] f76e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f77f;

    /* renamed from: g, reason: collision with root package name */
    public int f78g;

    public AbstractC0312c(C1171J c1171j, int... iArr) {
        this(c1171j, iArr, 0);
    }

    public static /* synthetic */ int w(C1194q c1194q, C1194q c1194q2) {
        return c1194q2.f12721i - c1194q.f12721i;
    }

    @Override // A0.B
    public final int a(C1194q c1194q) {
        for (int i7 = 0; i7 < this.f73b; i7++) {
            if (this.f76e[i7] == c1194q) {
                return i7;
            }
        }
        return -1;
    }

    @Override // A0.B
    public final C1194q b(int i7) {
        return this.f76e[i7];
    }

    @Override // A0.B
    public final int c(int i7) {
        return this.f74c[i7];
    }

    @Override // A0.B
    public final C1171J d() {
        return this.f72a;
    }

    @Override // A0.B
    public final int e(int i7) {
        for (int i8 = 0; i8 < this.f73b; i8++) {
            if (this.f74c[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0312c abstractC0312c = (AbstractC0312c) obj;
        return this.f72a.equals(abstractC0312c.f72a) && Arrays.equals(this.f74c, abstractC0312c.f74c);
    }

    @Override // A0.y
    public /* synthetic */ void h(boolean z7) {
        x.b(this, z7);
    }

    public int hashCode() {
        if (this.f78g == 0) {
            this.f78g = (System.identityHashCode(this.f72a) * 31) + Arrays.hashCode(this.f74c);
        }
        return this.f78g;
    }

    @Override // A0.y
    public boolean i(int i7, long j7) {
        return this.f77f[i7] > j7;
    }

    @Override // A0.y
    public int k(long j7, List list) {
        return list.size();
    }

    @Override // A0.y
    public final int l() {
        return this.f74c[o()];
    }

    @Override // A0.B
    public final int length() {
        return this.f74c.length;
    }

    @Override // A0.y
    public final C1194q m() {
        return this.f76e[o()];
    }

    @Override // A0.y
    public boolean p(int i7, long j7) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean i8 = i(i7, elapsedRealtime);
        int i9 = 0;
        while (i9 < this.f73b && !i8) {
            i8 = (i9 == i7 || i(i9, elapsedRealtime)) ? false : true;
            i9++;
        }
        if (!i8) {
            return false;
        }
        long[] jArr = this.f77f;
        jArr[i7] = Math.max(jArr[i7], M.b(elapsedRealtime, j7, Long.MAX_VALUE));
        return true;
    }

    @Override // A0.y
    public /* synthetic */ boolean q(long j7, AbstractC2226e abstractC2226e, List list) {
        return x.d(this, j7, abstractC2226e, list);
    }

    @Override // A0.y
    public /* synthetic */ void t() {
        x.a(this);
    }

    @Override // A0.y
    public /* synthetic */ void u() {
        x.c(this);
    }

    public AbstractC0312c(C1171J c1171j, int[] iArr, int i7) {
        int i8 = 0;
        AbstractC1297a.f(iArr.length > 0);
        this.f75d = i7;
        this.f72a = (C1171J) AbstractC1297a.e(c1171j);
        int length = iArr.length;
        this.f73b = length;
        this.f76e = new C1194q[length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            this.f76e[i9] = c1171j.a(iArr[i9]);
        }
        Arrays.sort(this.f76e, new Comparator() { // from class: A0.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int w7;
                w7 = AbstractC0312c.w((C1194q) obj, (C1194q) obj2);
                return w7;
            }
        });
        this.f74c = new int[this.f73b];
        while (true) {
            int i10 = this.f73b;
            if (i8 >= i10) {
                this.f77f = new long[i10];
                return;
            } else {
                this.f74c[i8] = c1171j.b(this.f76e[i8]);
                i8++;
            }
        }
    }

    @Override // A0.y
    public void g() {
    }

    @Override // A0.y
    public void j() {
    }

    @Override // A0.y
    public void r(float f7) {
    }
}
