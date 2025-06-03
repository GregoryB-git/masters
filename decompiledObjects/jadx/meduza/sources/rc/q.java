package rc;

import ub.h;

/* loaded from: classes.dex */
public final class q extends ec.j implements dc.p<Integer, h.b, Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o<?> f13900a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o<?> oVar) {
        super(2);
        this.f13900a = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r1 == null) goto L7;
     */
    @Override // dc.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer invoke(java.lang.Integer r4, ub.h.b r5) {
        /*
            r3 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            ub.h$b r5 = (ub.h.b) r5
            ub.h$c r0 = r5.getKey()
            rc.o<?> r1 = r3.f13900a
            ub.h r1 = r1.f13893b
            ub.h$b r1 = r1.get(r0)
            int r2 = nc.j1.f11508k
            nc.j1$b r2 = nc.j1.b.f11509a
            if (r0 == r2) goto L26
            if (r5 == r1) goto L1f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L21
        L1f:
            int r4 = r4 + 1
        L21:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L3a
        L26:
            nc.j1 r1 = (nc.j1) r1
            nc.j1 r5 = (nc.j1) r5
        L2a:
            if (r5 != 0) goto L2e
            r5 = 0
            goto L35
        L2e:
            if (r5 != r1) goto L31
            goto L35
        L31:
            boolean r0 = r5 instanceof sc.s
            if (r0 != 0) goto L63
        L35:
            if (r5 != r1) goto L3b
            if (r1 != 0) goto L1f
            goto L21
        L3a:
            return r4
        L3b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = ", expected child of "
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L63:
            nc.j1 r5 = r5.getParent()
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.q.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
