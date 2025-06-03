package g0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public long[] f14252a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f14253b;

    /* renamed from: c, reason: collision with root package name */
    public int f14254c;

    /* renamed from: d, reason: collision with root package name */
    public int f14255d;

    public D() {
        this(10);
    }

    public static Object[] f(int i7) {
        return new Object[i7];
    }

    public synchronized void a(long j7, Object obj) {
        d(j7);
        e();
        b(j7, obj);
    }

    public final void b(long j7, Object obj) {
        int i7 = this.f14254c;
        int i8 = this.f14255d;
        Object[] objArr = this.f14253b;
        int length = (i7 + i8) % objArr.length;
        this.f14252a[length] = j7;
        objArr[length] = obj;
        this.f14255d = i8 + 1;
    }

    public synchronized void c() {
        this.f14254c = 0;
        this.f14255d = 0;
        Arrays.fill(this.f14253b, (Object) null);
    }

    public final void d(long j7) {
        if (this.f14255d > 0) {
            if (j7 <= this.f14252a[((this.f14254c + r0) - 1) % this.f14253b.length]) {
                c();
            }
        }
    }

    public final void e() {
        int length = this.f14253b.length;
        if (this.f14255d < length) {
            return;
        }
        int i7 = length * 2;
        long[] jArr = new long[i7];
        Object[] f7 = f(i7);
        int i8 = this.f14254c;
        int i9 = length - i8;
        System.arraycopy(this.f14252a, i8, jArr, 0, i9);
        System.arraycopy(this.f14253b, this.f14254c, f7, 0, i9);
        int i10 = this.f14254c;
        if (i10 > 0) {
            System.arraycopy(this.f14252a, 0, jArr, i9, i10);
            System.arraycopy(this.f14253b, 0, f7, i9, this.f14254c);
        }
        this.f14252a = jArr;
        this.f14253b = f7;
        this.f14254c = 0;
    }

    public final Object g(long j7, boolean z7) {
        Object obj = null;
        long j8 = Long.MAX_VALUE;
        while (this.f14255d > 0) {
            long j9 = j7 - this.f14252a[this.f14254c];
            if (j9 < 0 && (z7 || (-j9) >= j8)) {
                break;
            }
            obj = j();
            j8 = j9;
        }
        return obj;
    }

    public synchronized Object h() {
        return this.f14255d == 0 ? null : j();
    }

    public synchronized Object i(long j7) {
        return g(j7, true);
    }

    public final Object j() {
        AbstractC1297a.f(this.f14255d > 0);
        Object[] objArr = this.f14253b;
        int i7 = this.f14254c;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f14254c = (i7 + 1) % objArr.length;
        this.f14255d--;
        return obj;
    }

    public synchronized int k() {
        return this.f14255d;
    }

    public D(int i7) {
        this.f14252a = new long[i7];
        this.f14253b = f(i7);
    }
}
