package x0;

import F0.InterfaceC0373s;
import F0.InterfaceC0378x;
import g0.AbstractC1297a;

/* renamed from: x0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2123d implements InterfaceC2118F {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0378x f20716a;

    /* renamed from: b, reason: collision with root package name */
    public F0.r f20717b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0373s f20718c;

    public C2123d(InterfaceC0378x interfaceC0378x) {
        this.f20716a = interfaceC0378x;
    }

    public static /* synthetic */ String g(F0.r rVar) {
        return rVar.d().getClass().getSimpleName();
    }

    @Override // x0.InterfaceC2118F
    public void a(long j7, long j8) {
        ((F0.r) AbstractC1297a.e(this.f20717b)).a(j7, j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r6.p() != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r6.p() != r11) goto L23;
     */
    @Override // x0.InterfaceC2118F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(d0.InterfaceC1186i r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, F0.InterfaceC0374t r15) {
        /*
            r7 = this;
            F0.j r6 = new F0.j
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f20718c = r6
            F0.r r8 = r7.f20717b
            if (r8 == 0) goto L10
            return
        L10:
            F0.x r8 = r7.f20716a
            F0.r[] r8 = r8.b(r9, r10)
            int r10 = r8.length
            X2.v$a r10 = X2.AbstractC0703v.S(r10)
            int r13 = r8.length
            r14 = 0
            r0 = 1
            if (r13 != r0) goto L25
            r8 = r8[r14]
            r7.f20717b = r8
            goto L82
        L25:
            int r13 = r8.length
            r1 = r14
        L27:
            if (r1 >= r13) goto L7e
            r2 = r8[r1]
            boolean r3 = r2.e(r6)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            if (r3 == 0) goto L3c
            r7.f20717b = r2     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            g0.AbstractC1297a.f(r0)
            r6.h()
            goto L7e
        L3a:
            r8 = move-exception
            goto L5a
        L3c:
            java.util.List r2 = r2.g()     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            r10.j(r2)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            F0.r r2 = r7.f20717b
            if (r2 != 0) goto L52
            long r2 = r6.p()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L50
            goto L52
        L50:
            r2 = r14
            goto L53
        L52:
            r2 = r0
        L53:
            g0.AbstractC1297a.f(r2)
            r6.h()
            goto L7b
        L5a:
            F0.r r9 = r7.f20717b
            if (r9 != 0) goto L66
            long r9 = r6.p()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L67
        L66:
            r14 = r0
        L67:
            g0.AbstractC1297a.f(r14)
            r6.h()
            throw r8
        L6e:
            F0.r r2 = r7.f20717b
            if (r2 != 0) goto L52
            long r2 = r6.p()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L50
            goto L52
        L7b:
            int r1 = r1 + 1
            goto L27
        L7e:
            F0.r r11 = r7.f20717b
            if (r11 == 0) goto L88
        L82:
            F0.r r8 = r7.f20717b
            r8.b(r15)
            return
        L88:
            x0.a0 r11 = new x0.a0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "None of the available extractors ("
            r12.append(r13)
            java.lang.String r13 = ", "
            W2.h r13 = W2.h.g(r13)
            X2.v r8 = X2.AbstractC0703v.V(r8)
            x0.c r14 = new x0.c
            r14.<init>()
            java.util.List r8 = X2.E.k(r8, r14)
            java.lang.String r8 = r13.d(r8)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = g0.AbstractC1297a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            X2.v r10 = r10.k()
            r11.<init>(r8, r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C2123d.b(d0.i, android.net.Uri, java.util.Map, long, long, F0.t):void");
    }

    @Override // x0.InterfaceC2118F
    public int c(F0.L l7) {
        return ((F0.r) AbstractC1297a.e(this.f20717b)).i((InterfaceC0373s) AbstractC1297a.e(this.f20718c), l7);
    }

    @Override // x0.InterfaceC2118F
    public long d() {
        InterfaceC0373s interfaceC0373s = this.f20718c;
        if (interfaceC0373s != null) {
            return interfaceC0373s.p();
        }
        return -1L;
    }

    @Override // x0.InterfaceC2118F
    public void e() {
        F0.r rVar = this.f20717b;
        if (rVar == null) {
            return;
        }
        F0.r d7 = rVar.d();
        if (d7 instanceof Y0.f) {
            ((Y0.f) d7).l();
        }
    }

    @Override // x0.InterfaceC2118F
    public void release() {
        F0.r rVar = this.f20717b;
        if (rVar != null) {
            rVar.release();
            this.f20717b = null;
        }
        this.f20718c = null;
    }
}
