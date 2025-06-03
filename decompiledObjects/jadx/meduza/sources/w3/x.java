package w3;

import java.util.HashMap;
import java.util.Random;
import v3.r1;
import v5.e0;
import w3.b;
import z4.t;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: g, reason: collision with root package name */
    public static final e0.d f16241g = new e0.d(1);

    /* renamed from: h, reason: collision with root package name */
    public static final Random f16242h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public z f16246d;
    public String f;

    /* renamed from: a, reason: collision with root package name */
    public final r1.c f16243a = new r1.c();

    /* renamed from: b, reason: collision with root package name */
    public final r1.b f16244b = new r1.b();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, a> f16245c = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public r1 f16247e = r1.f15743a;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f16248a;

        /* renamed from: b, reason: collision with root package name */
        public int f16249b;

        /* renamed from: c, reason: collision with root package name */
        public long f16250c;

        /* renamed from: d, reason: collision with root package name */
        public t.b f16251d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f16252e;
        public boolean f;

        public a(String str, int i10, t.b bVar) {
            this.f16248a = str;
            this.f16249b = i10;
            this.f16250c = bVar == null ? -1L : bVar.f17728d;
            if (bVar == null || !bVar.a()) {
                return;
            }
            this.f16251d = bVar;
        }

        public final boolean a(b.a aVar) {
            t.b bVar = aVar.f16202d;
            if (bVar == null) {
                return this.f16249b != aVar.f16201c;
            }
            long j10 = this.f16250c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f17728d > j10) {
                return true;
            }
            if (this.f16251d == null) {
                return false;
            }
            int b10 = aVar.f16200b.b(bVar.f17725a);
            int b11 = aVar.f16200b.b(this.f16251d.f17725a);
            t.b bVar2 = aVar.f16202d;
            if (bVar2.f17728d < this.f16251d.f17728d || b10 < b11) {
                return false;
            }
            if (b10 > b11) {
                return true;
            }
            boolean a10 = bVar2.a();
            t.b bVar3 = aVar.f16202d;
            if (!a10) {
                int i10 = bVar3.f17729e;
                return i10 == -1 || i10 > this.f16251d.f17726b;
            }
            int i11 = bVar3.f17726b;
            int i12 = bVar3.f17727c;
            t.b bVar4 = this.f16251d;
            int i13 = bVar4.f17726b;
            if (i11 <= i13) {
                return i11 == i13 && i12 > bVar4.f17727c;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
        
            if (r0 < r6.o()) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(v3.r1 r5, v3.r1 r6) {
            /*
                r4 = this;
                int r0 = r4.f16249b
                int r1 = r5.o()
                r2 = 0
                r3 = -1
                if (r0 < r1) goto L13
                int r5 = r6.o()
                if (r0 >= r5) goto L11
                goto L40
            L11:
                r0 = r3
                goto L40
            L13:
                w3.x r1 = w3.x.this
                v3.r1$c r1 = r1.f16243a
                r5.m(r0, r1)
                w3.x r0 = w3.x.this
                v3.r1$c r0 = r0.f16243a
                int r0 = r0.f15767w
            L20:
                w3.x r1 = w3.x.this
                v3.r1$c r1 = r1.f16243a
                int r1 = r1.f15768x
                if (r0 > r1) goto L11
                java.lang.Object r1 = r5.l(r0)
                int r1 = r6.b(r1)
                if (r1 == r3) goto L3d
                w3.x r5 = w3.x.this
                v3.r1$b r5 = r5.f16244b
                v3.r1$b r5 = r6.f(r1, r5, r2)
                int r0 = r5.f15750c
                goto L40
            L3d:
                int r0 = r0 + 1
                goto L20
            L40:
                r4.f16249b = r0
                if (r0 != r3) goto L45
                return r2
            L45:
                z4.t$b r5 = r4.f16251d
                r0 = 1
                if (r5 != 0) goto L4b
                return r0
            L4b:
                java.lang.Object r5 = r5.f17725a
                int r5 = r6.b(r5)
                if (r5 == r3) goto L54
                r2 = r0
            L54:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: w3.x.a.b(v3.r1, v3.r1):boolean");
        }
    }

    public final a a(int i10, t.b bVar) {
        t.b bVar2;
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f16245c.values()) {
            if (aVar2.f16250c == -1 && i10 == aVar2.f16249b && bVar != null) {
                aVar2.f16250c = bVar.f17728d;
            }
            if (bVar != null ? !((bVar2 = aVar2.f16251d) != null ? !(bVar.f17728d == bVar2.f17728d && bVar.f17726b == bVar2.f17726b && bVar.f17727c == bVar2.f17727c) : bVar.a() || bVar.f17728d != aVar2.f16250c) : i10 == aVar2.f16249b) {
                long j11 = aVar2.f16250c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10) {
                    int i11 = e0.f15881a;
                    if (aVar.f16251d != null && aVar2.f16251d != null) {
                        aVar = aVar2;
                    }
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) f16241g.get();
        a aVar3 = new a(str, i10, bVar);
        this.f16245c.put(str, aVar3);
        return aVar3;
    }

    public final void b(b.a aVar) {
        t.b bVar;
        if (aVar.f16200b.p()) {
            this.f = null;
            return;
        }
        a aVar2 = this.f16245c.get(this.f);
        this.f = a(aVar.f16201c, aVar.f16202d).f16248a;
        c(aVar);
        t.b bVar2 = aVar.f16202d;
        if (bVar2 == null || !bVar2.a()) {
            return;
        }
        if (aVar2 != null) {
            long j10 = aVar2.f16250c;
            t.b bVar3 = aVar.f16202d;
            if (j10 == bVar3.f17728d && (bVar = aVar2.f16251d) != null && bVar.f17726b == bVar3.f17726b && bVar.f17727c == bVar3.f17727c) {
                return;
            }
        }
        t.b bVar4 = aVar.f16202d;
        a(aVar.f16201c, new t.b(bVar4.f17725a, bVar4.f17728d));
        this.f16246d.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r1.f17728d < r3) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c(w3.b.a r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            w3.z r0 = r9.f16246d     // Catch: java.lang.Throwable -> Lbf
            r0.getClass()     // Catch: java.lang.Throwable -> Lbf
            v3.r1 r0 = r10.f16200b     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = r0.p()     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L10
            monitor-exit(r9)
            return
        L10:
            java.util.HashMap<java.lang.String, w3.x$a> r0 = r9.f16245c     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = r9.f     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lbf
            w3.x$a r0 = (w3.x.a) r0     // Catch: java.lang.Throwable -> Lbf
            z4.t$b r1 = r10.f16202d     // Catch: java.lang.Throwable -> Lbf
            r2 = 1
            if (r1 == 0) goto L3c
            if (r0 == 0) goto L3c
            long r3 = r0.f16250c     // Catch: java.lang.Throwable -> Lbf
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r6 = 0
            if (r5 != 0) goto L31
            int r0 = r0.f16249b     // Catch: java.lang.Throwable -> Lbf
            int r3 = r10.f16201c     // Catch: java.lang.Throwable -> Lbf
            if (r0 == r3) goto L38
            goto L37
        L31:
            long r7 = r1.f17728d     // Catch: java.lang.Throwable -> Lbf
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L38
        L37:
            r6 = r2
        L38:
            if (r6 == 0) goto L3c
            monitor-exit(r9)
            return
        L3c:
            int r0 = r10.f16201c     // Catch: java.lang.Throwable -> Lbf
            w3.x$a r0 = r9.a(r0, r1)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = r9.f     // Catch: java.lang.Throwable -> Lbf
            if (r1 != 0) goto L4a
            java.lang.String r1 = r0.f16248a     // Catch: java.lang.Throwable -> Lbf
            r9.f = r1     // Catch: java.lang.Throwable -> Lbf
        L4a:
            z4.t$b r1 = r10.f16202d     // Catch: java.lang.Throwable -> Lbf
            if (r1 == 0) goto L99
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> Lbf
            if (r1 == 0) goto L99
            z4.t$b r1 = new z4.t$b     // Catch: java.lang.Throwable -> Lbf
            z4.t$b r3 = r10.f16202d     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r4 = r3.f17725a     // Catch: java.lang.Throwable -> Lbf
            long r5 = r3.f17728d     // Catch: java.lang.Throwable -> Lbf
            int r3 = r3.f17726b     // Catch: java.lang.Throwable -> Lbf
            r1.<init>(r4, r3, r5)     // Catch: java.lang.Throwable -> Lbf
            int r3 = r10.f16201c     // Catch: java.lang.Throwable -> Lbf
            w3.x$a r1 = r9.a(r3, r1)     // Catch: java.lang.Throwable -> Lbf
            boolean r3 = r1.f16252e     // Catch: java.lang.Throwable -> Lbf
            if (r3 != 0) goto L99
            r1.f16252e = r2     // Catch: java.lang.Throwable -> Lbf
            v3.r1 r1 = r10.f16200b     // Catch: java.lang.Throwable -> Lbf
            z4.t$b r3 = r10.f16202d     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r3 = r3.f17725a     // Catch: java.lang.Throwable -> Lbf
            v3.r1$b r4 = r9.f16244b     // Catch: java.lang.Throwable -> Lbf
            r1.g(r3, r4)     // Catch: java.lang.Throwable -> Lbf
            v3.r1$b r1 = r9.f16244b     // Catch: java.lang.Throwable -> Lbf
            z4.t$b r3 = r10.f16202d     // Catch: java.lang.Throwable -> Lbf
            int r3 = r3.f17726b     // Catch: java.lang.Throwable -> Lbf
            long r3 = r1.d(r3)     // Catch: java.lang.Throwable -> Lbf
            long r3 = v5.e0.R(r3)     // Catch: java.lang.Throwable -> Lbf
            v3.r1$b r1 = r9.f16244b     // Catch: java.lang.Throwable -> Lbf
            long r5 = r1.f15752e     // Catch: java.lang.Throwable -> Lbf
            long r5 = v5.e0.R(r5)     // Catch: java.lang.Throwable -> Lbf
            long r3 = r3 + r5
            r5 = 0
            java.lang.Math.max(r5, r3)     // Catch: java.lang.Throwable -> Lbf
            w3.z r1 = r9.f16246d     // Catch: java.lang.Throwable -> Lbf
            r1.getClass()     // Catch: java.lang.Throwable -> Lbf
        L99:
            boolean r1 = r0.f16252e     // Catch: java.lang.Throwable -> Lbf
            if (r1 != 0) goto La4
            r0.f16252e = r2     // Catch: java.lang.Throwable -> Lbf
            w3.z r1 = r9.f16246d     // Catch: java.lang.Throwable -> Lbf
            r1.getClass()     // Catch: java.lang.Throwable -> Lbf
        La4:
            java.lang.String r1 = r0.f16248a     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r3 = r9.f     // Catch: java.lang.Throwable -> Lbf
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lbf
            if (r1 == 0) goto Lbd
            boolean r1 = r0.f     // Catch: java.lang.Throwable -> Lbf
            if (r1 != 0) goto Lbd
            r0.f = r2     // Catch: java.lang.Throwable -> Lbf
            w3.z r1 = r9.f16246d     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = r0.f16248a     // Catch: java.lang.Throwable -> Lbf
            w3.y r1 = (w3.y) r1     // Catch: java.lang.Throwable -> Lbf
            r1.l(r10, r0)     // Catch: java.lang.Throwable -> Lbf
        Lbd:
            monitor-exit(r9)
            return
        Lbf:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.x.c(w3.b$a):void");
    }
}
