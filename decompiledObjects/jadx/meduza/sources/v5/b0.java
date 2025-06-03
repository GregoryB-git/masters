package v5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0<V> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f15868a = new long[10];

    /* renamed from: b, reason: collision with root package name */
    public V[] f15869b = (V[]) new Object[10];

    /* renamed from: c, reason: collision with root package name */
    public int f15870c;

    /* renamed from: d, reason: collision with root package name */
    public int f15871d;

    public final synchronized void a(Object obj, long j10) {
        if (this.f15871d > 0) {
            if (j10 <= this.f15868a[((this.f15870c + r0) - 1) % this.f15869b.length]) {
                b();
            }
        }
        c();
        int i10 = this.f15870c;
        int i11 = this.f15871d;
        Object[] objArr = (V[]) this.f15869b;
        int length = (i10 + i11) % objArr.length;
        this.f15868a[length] = j10;
        objArr[length] = obj;
        this.f15871d = i11 + 1;
    }

    public final synchronized void b() {
        this.f15870c = 0;
        this.f15871d = 0;
        Arrays.fill(this.f15869b, (Object) null);
    }

    public final void c() {
        int length = this.f15869b.length;
        if (this.f15871d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) new Object[i10];
        int i11 = this.f15870c;
        int i12 = length - i11;
        System.arraycopy(this.f15868a, i11, jArr, 0, i12);
        System.arraycopy(this.f15869b, this.f15870c, vArr, 0, i12);
        int i13 = this.f15870c;
        if (i13 > 0) {
            System.arraycopy(this.f15868a, 0, jArr, i12, i13);
            System.arraycopy(this.f15869b, 0, vArr, i12, this.f15870c);
        }
        this.f15868a = jArr;
        this.f15869b = vArr;
        this.f15870c = 0;
    }

    public final V d(long j10, boolean z10) {
        V v10 = null;
        long j11 = Long.MAX_VALUE;
        while (this.f15871d > 0) {
            long j12 = j10 - this.f15868a[this.f15870c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            v10 = e();
            j11 = j12;
        }
        return v10;
    }

    public final V e() {
        x6.b.H(this.f15871d > 0);
        V[] vArr = this.f15869b;
        int i10 = this.f15870c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f15870c = (i10 + 1) % vArr.length;
        this.f15871d--;
        return v10;
    }
}
