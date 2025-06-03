package g0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f14325a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f14326b;

    public p() {
        this(32);
    }

    public void a(long j7) {
        int i7 = this.f14325a;
        long[] jArr = this.f14326b;
        if (i7 == jArr.length) {
            this.f14326b = Arrays.copyOf(jArr, i7 * 2);
        }
        long[] jArr2 = this.f14326b;
        int i8 = this.f14325a;
        this.f14325a = i8 + 1;
        jArr2[i8] = j7;
    }

    public long b(int i7) {
        if (i7 >= 0 && i7 < this.f14325a) {
            return this.f14326b[i7];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i7 + ", size is " + this.f14325a);
    }

    public int c() {
        return this.f14325a;
    }

    public p(int i7) {
        this.f14326b = new long[i7];
    }
}
