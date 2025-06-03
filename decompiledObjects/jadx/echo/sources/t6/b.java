package t6;

import V5.n;
import V5.t;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: o, reason: collision with root package name */
    public d[] f19600o;

    /* renamed from: p, reason: collision with root package name */
    public int f19601p;

    /* renamed from: q, reason: collision with root package name */
    public int f19602q;

    public final d b() {
        d dVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f19600o;
                if (dVarArr == null) {
                    dVarArr = d(2);
                    this.f19600o = dVarArr;
                } else if (this.f19601p >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    this.f19600o = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i7 = this.f19602q;
                do {
                    dVar = dVarArr[i7];
                    if (dVar == null) {
                        dVar = c();
                        dVarArr[i7] = dVar;
                    }
                    i7++;
                    if (i7 >= dVarArr.length) {
                        i7 = 0;
                    }
                    Intrinsics.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVar.a(this));
                this.f19602q = i7;
                this.f19601p++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public abstract d c();

    public abstract d[] d(int i7);

    public final void e(d dVar) {
        int i7;
        X5.d[] b7;
        synchronized (this) {
            try {
                int i8 = this.f19601p - 1;
                this.f19601p = i8;
                if (i8 == 0) {
                    this.f19602q = 0;
                }
                Intrinsics.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b7 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (X5.d dVar2 : b7) {
            if (dVar2 != null) {
                n.a aVar = n.f6797o;
                dVar2.resumeWith(n.a(t.f6803a));
            }
        }
    }

    public final d[] f() {
        return this.f19600o;
    }
}
