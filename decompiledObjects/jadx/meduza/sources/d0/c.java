package d0;

import c4.e;
import ec.i;
import v5.u;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f3330a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3331b;

    public /* synthetic */ c(int i10) {
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.f3331b = new Object[i10];
    }

    public final Object a() {
        int i10 = this.f3330a;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = ((Object[]) this.f3331b)[i11];
        i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        ((Object[]) this.f3331b)[i11] = null;
        this.f3330a--;
        return obj;
    }

    public final long b(e eVar) {
        int i10 = 0;
        eVar.c(((u) this.f3331b).f15974a, 0, 1, false);
        int i11 = ((u) this.f3331b).f15974a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        eVar.c(((u) this.f3331b).f15974a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (((u) this.f3331b).f15974a[i10] & 255) + (i14 << 8);
        }
        this.f3330a = i13 + 1 + this.f3330a;
        return i14;
    }

    public final void c(Object obj) {
        i.e(obj, "instance");
        int i10 = this.f3330a;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            if (((Object[]) this.f3331b)[i11] == obj) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (!(!z10)) {
            throw new IllegalStateException("Already in the pool!".toString());
        }
        int i12 = this.f3330a;
        Object[] objArr = (Object[]) this.f3331b;
        if (i12 < objArr.length) {
            objArr[i12] = obj;
            this.f3330a = i12 + 1;
        }
    }
}
