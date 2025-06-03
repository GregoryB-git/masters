package nc;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class p0<T> extends tc.g {

    /* renamed from: c, reason: collision with root package name */
    public int f11542c;

    public p0(int i10) {
        this.f11542c = i10;
    }

    public void a(Object obj, CancellationException cancellationException) {
    }

    public abstract ub.e<T> d();

    public Throwable f(Object obj) {
        u uVar = obj instanceof u ? (u) obj : null;
        if (uVar != null) {
            return uVar.f11555a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(Object obj) {
        return obj;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            x6.b.e(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        ec.i.b(th);
        c0.a(d().getContext(), new f0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r6 = (nc.j1) r6.get(nc.j1.b.f11509a);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r12 = this;
            tc.h r0 = r12.f14766b
            ub.e r1 = r12.d()     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            ec.i.c(r1, r2)     // Catch: java.lang.Throwable -> L98
            sc.g r1 = (sc.g) r1     // Catch: java.lang.Throwable -> L98
            ub.e<T> r2 = r1.f14338e     // Catch: java.lang.Throwable -> L98
            java.lang.Object r1 = r1.f14339o     // Catch: java.lang.Throwable -> L98
            ub.h r3 = r2.getContext()     // Catch: java.lang.Throwable -> L98
            java.lang.Object r1 = sc.w.c(r3, r1)     // Catch: java.lang.Throwable -> L98
            d2.h0 r4 = sc.w.f14370a     // Catch: java.lang.Throwable -> L98
            r5 = 0
            if (r1 == r4) goto L23
            nc.g2 r4 = nc.y.c(r2, r3, r1)     // Catch: java.lang.Throwable -> L98
            goto L24
        L23:
            r4 = r5
        L24:
            ub.h r6 = r2.getContext()     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r7 = r12.k()     // Catch: java.lang.Throwable -> L5c
            java.lang.Throwable r8 = r12.f(r7)     // Catch: java.lang.Throwable -> L5c
            if (r8 != 0) goto L47
            int r9 = r12.f11542c     // Catch: java.lang.Throwable -> L5c
            r10 = 1
            if (r9 == r10) goto L3c
            r11 = 2
            if (r9 != r11) goto L3b
            goto L3c
        L3b:
            r10 = 0
        L3c:
            if (r10 == 0) goto L47
            nc.j1$b r9 = nc.j1.b.f11509a     // Catch: java.lang.Throwable -> L5c
            ub.h$b r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L5c
            nc.j1 r6 = (nc.j1) r6     // Catch: java.lang.Throwable -> L5c
            goto L48
        L47:
            r6 = r5
        L48:
            if (r6 == 0) goto L5e
            boolean r9 = r6.isActive()     // Catch: java.lang.Throwable -> L5c
            if (r9 != 0) goto L5e
            java.util.concurrent.CancellationException r6 = r6.getCancellationException()     // Catch: java.lang.Throwable -> L5c
            r12.a(r7, r6)     // Catch: java.lang.Throwable -> L5c
            rb.e$a r6 = rb.f.a(r6)     // Catch: java.lang.Throwable -> L5c
            goto L69
        L5c:
            r2 = move-exception
            goto L8c
        L5e:
            if (r8 == 0) goto L65
            rb.e$a r6 = rb.f.a(r8)     // Catch: java.lang.Throwable -> L5c
            goto L69
        L65:
            java.lang.Object r6 = r12.g(r7)     // Catch: java.lang.Throwable -> L5c
        L69:
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L5c
            rb.h r2 = rb.h.f13851a     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L76
            boolean r2 = r4.e0()     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L79
        L76:
            sc.w.a(r3, r1)     // Catch: java.lang.Throwable -> L98
        L79:
            r0.a()     // Catch: java.lang.Throwable -> L7f
            rb.h r0 = rb.h.f13851a     // Catch: java.lang.Throwable -> L7f
            goto L84
        L7f:
            r0 = move-exception
            rb.e$a r0 = rb.f.a(r0)
        L84:
            java.lang.Throwable r0 = rb.e.a(r0)
            r12.i(r5, r0)
            goto Lab
        L8c:
            if (r4 == 0) goto L94
            boolean r4 = r4.e0()     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L97
        L94:
            sc.w.a(r3, r1)     // Catch: java.lang.Throwable -> L98
        L97:
            throw r2     // Catch: java.lang.Throwable -> L98
        L98:
            r1 = move-exception
            r0.a()     // Catch: java.lang.Throwable -> L9f
            rb.h r0 = rb.h.f13851a     // Catch: java.lang.Throwable -> L9f
            goto La4
        L9f:
            r0 = move-exception
            rb.e$a r0 = rb.f.a(r0)
        La4:
            java.lang.Throwable r0 = rb.e.a(r0)
            r12.i(r1, r0)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.p0.run():void");
    }
}
