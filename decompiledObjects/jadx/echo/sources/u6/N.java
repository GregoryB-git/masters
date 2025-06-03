package u6;

import kotlin.jvm.internal.Intrinsics;
import p6.K0;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final X5.g f19968a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f19969b;

    /* renamed from: c, reason: collision with root package name */
    public final K0[] f19970c;

    /* renamed from: d, reason: collision with root package name */
    public int f19971d;

    public N(X5.g gVar, int i7) {
        this.f19968a = gVar;
        this.f19969b = new Object[i7];
        this.f19970c = new K0[i7];
    }

    public final void a(K0 k02, Object obj) {
        Object[] objArr = this.f19969b;
        int i7 = this.f19971d;
        objArr[i7] = obj;
        K0[] k0Arr = this.f19970c;
        this.f19971d = i7 + 1;
        Intrinsics.c(k02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        k0Arr[i7] = k02;
    }

    public final void b(X5.g gVar) {
        int length = this.f19970c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i7 = length - 1;
            K0 k02 = this.f19970c[length];
            Intrinsics.b(k02);
            k02.D(gVar, this.f19969b[length]);
            if (i7 < 0) {
                return;
            } else {
                length = i7;
            }
        }
    }
}
