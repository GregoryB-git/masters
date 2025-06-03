package nc;

/* loaded from: classes.dex */
public final class e2<U, T extends U> extends sc.s<T> implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f11491e;

    public e2(long j10, ub.e<? super U> eVar) {
        super(eVar, eVar.getContext());
        this.f11491e = j10;
    }

    @Override // nc.a, nc.o1
    public final String N() {
        return super.N() + "(timeMillis=" + this.f11491e + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r2 == null) goto L9;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r4 = this;
            long r0 = r4.f11491e
            ub.h r2 = r4.f11466c
            nc.l0 r2 = nc.m0.b(r2)
            boolean r3 = r2 instanceof nc.n0
            if (r3 == 0) goto Lf
            nc.n0 r2 = (nc.n0) r2
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L1f
            int r3 = mc.a.f11153d
            mc.c r3 = mc.c.f11157c
            p2.m0.d0(r0, r3)
            java.lang.String r2 = r2.H()
            if (r2 != 0) goto L35
        L1f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Timed out waiting for "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " ms"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
        L35:
            nc.d2 r0 = new nc.d2
            r0.<init>(r2, r4)
            r4.r(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.e2.run():void");
    }
}
