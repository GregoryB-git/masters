package m9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ka.f0;
import ma.h;
import ma.n1;

/* loaded from: classes.dex */
public final class q0 extends m9.a<ka.f0, ka.g0, a> {

    /* renamed from: w, reason: collision with root package name */
    public static final h.C0164h f10876w = ma.h.f10961b;
    public final e0 t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10877u;

    /* renamed from: v, reason: collision with root package name */
    public ma.h f10878v;

    public interface a extends j0 {
        void b(j9.q qVar, ArrayList arrayList);

        void d();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q0(m9.v r10, n9.a r11, m9.e0 r12, m9.g0 r13) {
        /*
            r9 = this;
            eb.t0<ka.f0, ka.g0> r0 = ka.r.f9195d
            if (r0 != 0) goto L43
            java.lang.Class<ka.r> r1 = ka.r.class
            monitor-enter(r1)
            eb.t0<ka.f0, ka.g0> r0 = ka.r.f9195d     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L3e
            eb.t0$a r0 = eb.t0.b()     // Catch: java.lang.Throwable -> L40
            eb.t0$c r2 = eb.t0.c.BIDI_STREAMING     // Catch: java.lang.Throwable -> L40
            r0.f5226c = r2     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "google.firestore.v1.Firestore"
            java.lang.String r3 = "Write"
            java.lang.String r2 = eb.t0.a(r2, r3)     // Catch: java.lang.Throwable -> L40
            r0.f5227d = r2     // Catch: java.lang.Throwable -> L40
            r2 = 1
            r0.f5228e = r2     // Catch: java.lang.Throwable -> L40
            ka.f0 r2 = ka.f0.J()     // Catch: java.lang.Throwable -> L40
            ma.o r3 = lb.b.f9824a     // Catch: java.lang.Throwable -> L40
            lb.b$a r3 = new lb.b$a     // Catch: java.lang.Throwable -> L40
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L40
            r0.f5224a = r3     // Catch: java.lang.Throwable -> L40
            ka.g0 r2 = ka.g0.H()     // Catch: java.lang.Throwable -> L40
            lb.b$a r3 = new lb.b$a     // Catch: java.lang.Throwable -> L40
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L40
            r0.f5225b = r3     // Catch: java.lang.Throwable -> L40
            eb.t0 r0 = r0.a()     // Catch: java.lang.Throwable -> L40
            ka.r.f9195d = r0     // Catch: java.lang.Throwable -> L40
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r10 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            throw r10
        L43:
            r4 = r0
            n9.a$c r6 = n9.a.c.WRITE_STREAM_CONNECTION_BACKOFF
            n9.a$c r7 = n9.a.c.WRITE_STREAM_IDLE
            r2 = r9
            r3 = r10
            r5 = r11
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = 0
            r9.f10877u = r10
            ma.h$h r10 = m9.q0.f10876w
            r9.f10878v = r10
            r9.t = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.q0.<init>(m9.v, n9.a, m9.e0, m9.g0):void");
    }

    @Override // m9.a
    public final void e(ka.g0 g0Var) {
        this.f10878v = g0Var.I();
        this.f10877u = true;
        ((a) this.f10741m).d();
    }

    @Override // m9.a
    public final void f(ka.g0 g0Var) {
        ka.g0 g0Var2 = g0Var;
        this.f10878v = g0Var2.I();
        this.f10740l.f = 0L;
        e0 e0Var = this.t;
        n1 G = g0Var2.G();
        e0Var.getClass();
        j9.q f = e0.f(G);
        int K = g0Var2.K();
        ArrayList arrayList = new ArrayList(K);
        for (int i10 = 0; i10 < K; i10++) {
            ka.h0 J = g0Var2.J(i10);
            this.t.getClass();
            arrayList.add(e0.d(J, f));
        }
        ((a) this.f10741m).b(f, arrayList);
    }

    @Override // m9.a
    public final void g() {
        this.f10877u = false;
        super.g();
    }

    @Override // m9.a
    public final void h() {
        if (this.f10877u) {
            j(Collections.emptyList());
        }
    }

    public final void j(List<k9.f> list) {
        x6.b.Z("Writing mutations requires an opened stream", c(), new Object[0]);
        x6.b.Z("Handshake must be complete before writing mutations", this.f10877u, new Object[0]);
        f0.a K = ka.f0.K();
        Iterator<k9.f> it = list.iterator();
        while (it.hasNext()) {
            ka.e0 k10 = this.t.k(it.next());
            K.m();
            ka.f0.I((ka.f0) K.f11120b, k10);
        }
        ma.h hVar = this.f10878v;
        K.m();
        ka.f0.H((ka.f0) K.f11120b, hVar);
        i(K.k());
    }
}
