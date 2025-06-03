package nc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class o0<T> extends sc.s<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f11521e = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_decision");
    private volatile int _decision;

    public o0(ub.e eVar, ub.h hVar) {
        super(eVar, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        b.a0.C(p2.m0.P(r5.f14365d), eb.y.c(r6), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r2 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        return;
     */
    @Override // sc.s, nc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(java.lang.Object r6) {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = nc.o0.f11521e
        L2:
            int r1 = r0.get(r5)
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L1a
            if (r1 != r3) goto Le
            goto L23
        Le:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L1a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = nc.o0.f11521e
            boolean r1 = r1.compareAndSet(r5, r2, r4)
            if (r1 == 0) goto L2
            r2 = r3
        L23:
            if (r2 == 0) goto L26
            return
        L26:
            ub.e<T> r0 = r5.f14365d
            ub.e r0 = p2.m0.P(r0)
            java.lang.Object r6 = eb.y.c(r6)
            r1 = 0
            b.a0.C(r0, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.o0.Z(java.lang.Object):void");
    }

    @Override // sc.s, nc.o1
    public final void p(Object obj) {
        Z(obj);
    }
}
