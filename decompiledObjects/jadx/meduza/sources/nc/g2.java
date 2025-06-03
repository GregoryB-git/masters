package nc;

/* loaded from: classes.dex */
public final class g2<T> extends sc.s<T> {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal<rb.d<ub.h, Object>> f11499e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g2(ub.e r3, ub.h r4) {
        /*
            r2 = this;
            nc.h2 r0 = nc.h2.f11505a
            ub.h$b r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            ub.h r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f11499e = r0
            ub.h r3 = r3.getContext()
            ub.f$a r0 = ub.f.a.f15163a
            ub.h$b r3 = r3.get(r0)
            boolean r3 = r3 instanceof nc.a0
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = sc.w.c(r4, r3)
            sc.w.a(r4, r3)
            r2.f0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.g2.<init>(ub.e, ub.h):void");
    }

    @Override // sc.s, nc.a
    public final void Z(Object obj) {
        if (this.threadLocalIsSet) {
            rb.d<ub.h, Object> dVar = this.f11499e.get();
            if (dVar != null) {
                sc.w.a(dVar.f13844a, dVar.f13845b);
            }
            this.f11499e.remove();
        }
        Object c10 = eb.y.c(obj);
        ub.e<T> eVar = this.f14365d;
        ub.h context = eVar.getContext();
        Object c11 = sc.w.c(context, null);
        g2<?> c12 = c11 != sc.w.f14370a ? y.c(eVar, context, c11) : null;
        try {
            this.f14365d.resumeWith(c10);
            rb.h hVar = rb.h.f13851a;
        } finally {
            if (c12 == null || c12.e0()) {
                sc.w.a(context, c11);
            }
        }
    }

    public final boolean e0() {
        boolean z10 = this.threadLocalIsSet && this.f11499e.get() == null;
        this.f11499e.remove();
        return !z10;
    }

    public final void f0(ub.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f11499e.set(new rb.d<>(hVar, obj));
    }
}
