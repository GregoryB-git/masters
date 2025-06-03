package m9;

import eb.e1;
import java.util.Collections;
import m9.n0;
import ma.a0;
import ma.h;

/* loaded from: classes.dex */
public final class p0 extends m9.a<ka.s, ka.t, a> {

    /* renamed from: u, reason: collision with root package name */
    public static final h.C0164h f10871u = ma.h.f10961b;
    public final e0 t;

    public interface a extends j0 {
        void e(j9.q qVar, n0 n0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p0(m9.v r10, n9.a r11, m9.e0 r12, m9.f0 r13) {
        /*
            r9 = this;
            eb.t0<ka.s, ka.t> r0 = ka.r.f9196e
            if (r0 != 0) goto L43
            java.lang.Class<ka.r> r1 = ka.r.class
            monitor-enter(r1)
            eb.t0<ka.s, ka.t> r0 = ka.r.f9196e     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L3e
            eb.t0$a r0 = eb.t0.b()     // Catch: java.lang.Throwable -> L40
            eb.t0$c r2 = eb.t0.c.BIDI_STREAMING     // Catch: java.lang.Throwable -> L40
            r0.f5226c = r2     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "google.firestore.v1.Firestore"
            java.lang.String r3 = "Listen"
            java.lang.String r2 = eb.t0.a(r2, r3)     // Catch: java.lang.Throwable -> L40
            r0.f5227d = r2     // Catch: java.lang.Throwable -> L40
            r2 = 1
            r0.f5228e = r2     // Catch: java.lang.Throwable -> L40
            ka.s r2 = ka.s.K()     // Catch: java.lang.Throwable -> L40
            ma.o r3 = lb.b.f9824a     // Catch: java.lang.Throwable -> L40
            lb.b$a r3 = new lb.b$a     // Catch: java.lang.Throwable -> L40
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L40
            r0.f5224a = r3     // Catch: java.lang.Throwable -> L40
            ka.t r2 = ka.t.G()     // Catch: java.lang.Throwable -> L40
            lb.b$a r3 = new lb.b$a     // Catch: java.lang.Throwable -> L40
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L40
            r0.f5225b = r3     // Catch: java.lang.Throwable -> L40
            eb.t0 r0 = r0.a()     // Catch: java.lang.Throwable -> L40
            ka.r.f9196e = r0     // Catch: java.lang.Throwable -> L40
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r10 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            throw r10
        L43:
            r4 = r0
            n9.a$c r6 = n9.a.c.LISTEN_STREAM_CONNECTION_BACKOFF
            n9.a$c r7 = n9.a.c.LISTEN_STREAM_IDLE
            r2 = r9
            r3 = r10
            r5 = r11
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.t = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.p0.<init>(m9.v, n9.a, m9.e0, m9.f0):void");
    }

    @Override // m9.a
    public final void e(ka.t tVar) {
        f(tVar);
    }

    @Override // m9.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void f(ka.t tVar) {
        n0.d dVar;
        n0 cVar;
        n0.a aVar;
        this.f10740l.f = 0L;
        e0 e0Var = this.t;
        e0Var.getClass();
        int c10 = q0.g.c(tVar.L());
        e1 e1Var = null;
        if (c10 != 0) {
            if (c10 == 1) {
                ka.l H = tVar.H();
                a0.c J = H.J();
                a0.c I = H.I();
                j9.i b10 = e0Var.b(H.H().L());
                j9.q f = e0.f(H.H().M());
                x6.b.Z("Got a document change without an update time", !f.equals(j9.q.f8701b), new Object[0]);
                j9.n e10 = j9.n.e(H.H().K());
                j9.m mVar = new j9.m(b10);
                mVar.k(f, e10);
                aVar = new n0.a(J, I, b10, mVar);
            } else if (c10 == 2) {
                ka.m I2 = tVar.I();
                a0.c J2 = I2.J();
                j9.m n2 = j9.m.n(e0Var.b(I2.H()), e0.f(I2.I()));
                aVar = new n0.a(Collections.emptyList(), J2, n2.f8693b, n2);
            } else if (c10 == 3) {
                ka.o J3 = tVar.J();
                aVar = new n0.a(Collections.emptyList(), J3.I(), e0Var.b(J3.H()), null);
            } else {
                if (c10 != 4) {
                    throw new IllegalArgumentException("Unknown change type set");
                }
                ka.q K = tVar.K();
                cVar = new n0.b(K.I(), new k(K.G(), K.J()));
            }
            cVar = aVar;
        } else {
            ka.b0 M = tVar.M();
            int ordinal = M.K().ordinal();
            if (ordinal == 0) {
                dVar = n0.d.NoChange;
            } else if (ordinal == 1) {
                dVar = n0.d.Added;
            } else if (ordinal == 2) {
                dVar = n0.d.Removed;
                na.a G = M.G();
                e1Var = e1.c(G.G()).g(G.I());
            } else if (ordinal == 3) {
                dVar = n0.d.Current;
            } else {
                if (ordinal != 4) {
                    throw new IllegalArgumentException("Unknown target change type");
                }
                dVar = n0.d.Reset;
            }
            cVar = new n0.c(dVar, M.M(), M.J(), e1Var);
        }
        this.t.getClass();
        ((a) this.f10741m).e((tVar.L() == 1 && tVar.M().L() == 0) ? e0.f(tVar.M().I()) : j9.q.f8701b, cVar);
    }
}
