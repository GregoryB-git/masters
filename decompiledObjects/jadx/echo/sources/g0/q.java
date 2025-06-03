package g0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f14327a;

    /* renamed from: b, reason: collision with root package name */
    public int f14328b;

    /* renamed from: c, reason: collision with root package name */
    public int f14329c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f14330d;

    /* renamed from: e, reason: collision with root package name */
    public int f14331e;

    public q() {
        this(16);
    }

    public void a() {
        this.f14327a = 0;
        this.f14328b = -1;
        this.f14329c = 0;
    }

    public long b() {
        if (this.f14329c != 0) {
            return this.f14330d[this.f14327a];
        }
        throw new NoSuchElementException();
    }

    public boolean c() {
        return this.f14329c == 0;
    }

    public long d() {
        int i7 = this.f14329c;
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f14330d;
        int i8 = this.f14327a;
        long j7 = jArr[i8];
        this.f14327a = this.f14331e & (i8 + 1);
        this.f14329c = i7 - 1;
        return j7;
    }

    public q(int i7) {
        AbstractC1297a.a(i7 >= 0 && i7 <= 1073741824);
        i7 = i7 == 0 ? 1 : i7;
        i7 = Integer.bitCount(i7) != 1 ? Integer.highestOneBit(i7 - 1) << 1 : i7;
        this.f14327a = 0;
        this.f14328b = -1;
        this.f14329c = 0;
        long[] jArr = new long[i7];
        this.f14330d = jArr;
        this.f14331e = jArr.length - 1;
    }
}
