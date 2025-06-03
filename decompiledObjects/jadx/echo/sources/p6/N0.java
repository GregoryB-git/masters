package p6;

/* loaded from: classes.dex */
public final class N0 extends u6.B {

    /* renamed from: s, reason: collision with root package name */
    public final ThreadLocal f18506s;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public N0(X5.g r3, X5.d r4) {
        /*
            r2 = this;
            p6.O0 r0 = p6.O0.f18509o
            X5.g$b r1 = r3.b(r0)
            if (r1 != 0) goto Ld
            X5.g r0 = r3.k(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f18506s = r0
            X5.g r4 = r4.getContext()
            X5.e$b r0 = X5.e.f7290c
            X5.g$b r4 = r4.b(r0)
            boolean r4 = r4 instanceof p6.F
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = u6.J.c(r3, r4)
            u6.J.a(r3, r4)
            r2.L0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.N0.<init>(X5.g, X5.d):void");
    }

    @Override // u6.B, p6.AbstractC1836a
    public void G0(Object obj) {
        if (this.threadLocalIsSet) {
            V5.m mVar = (V5.m) this.f18506s.get();
            if (mVar != null) {
                u6.J.a((X5.g) mVar.a(), mVar.b());
            }
            this.f18506s.remove();
        }
        Object a7 = D.a(obj, this.f19953r);
        X5.d dVar = this.f19953r;
        X5.g context = dVar.getContext();
        Object c7 = u6.J.c(context, null);
        N0 g7 = c7 != u6.J.f19961a ? E.g(dVar, context, c7) : null;
        try {
            this.f19953r.resumeWith(a7);
            V5.t tVar = V5.t.f6803a;
        } finally {
            if (g7 == null || g7.K0()) {
                u6.J.a(context, c7);
            }
        }
    }

    public final boolean K0() {
        boolean z7 = this.threadLocalIsSet && this.f18506s.get() == null;
        this.f18506s.remove();
        return !z7;
    }

    public final void L0(X5.g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f18506s.set(V5.q.a(gVar, obj));
    }
}
