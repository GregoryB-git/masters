package v5;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f15926a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f15927b;

    public /* synthetic */ n(String str, int i10) {
        this.f15927b = str;
        this.f15926a = i10;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, long[]] */
    public final void a(long j10) {
        int i10 = this.f15926a;
        Object obj = this.f15927b;
        if (i10 == ((long[]) obj).length) {
            this.f15927b = Arrays.copyOf((long[]) obj, i10 * 2);
        }
        long[] jArr = (long[]) this.f15927b;
        int i11 = this.f15926a;
        this.f15926a = i11 + 1;
        jArr[i11] = j10;
    }

    public final long b(int i10) {
        if (i10 >= 0 && i10 < this.f15926a) {
            return ((long[]) this.f15927b)[i10];
        }
        StringBuilder n2 = a0.j.n("Invalid index ", i10, ", size is ");
        n2.append(this.f15926a);
        throw new IndexOutOfBoundsException(n2.toString());
    }
}
