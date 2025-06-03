package a4;

import V3.C0663b;
import V3.G;
import W3.d;
import b4.C0799a;
import b4.InterfaceC0802d;
import d4.C1227b;
import d4.m;
import d4.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC0802d.a f8131b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0802d f8132a;

    public class a implements InterfaceC0802d.a {
        @Override // b4.InterfaceC0802d.a
        public m a(d4.h hVar, m mVar, boolean z7) {
            return null;
        }

        @Override // b4.InterfaceC0802d.a
        public n b(C1227b c1227b) {
            return null;
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8133a;

        static {
            int[] iArr = new int[d.a.values().length];
            f8133a = iArr;
            try {
                iArr[d.a.Overwrite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8133a[d.a.Merge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8133a[d.a.AckUserWrite.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8133a[d.a.ListenComplete.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final k f8134a;

        /* renamed from: b, reason: collision with root package name */
        public final List f8135b;

        public c(k kVar, List list) {
            this.f8134a = kVar;
            this.f8135b = list;
        }
    }

    public static class d implements InterfaceC0802d.a {

        /* renamed from: a, reason: collision with root package name */
        public final G f8136a;

        /* renamed from: b, reason: collision with root package name */
        public final k f8137b;

        /* renamed from: c, reason: collision with root package name */
        public final n f8138c;

        public d(G g7, k kVar, n nVar) {
            this.f8136a = g7;
            this.f8137b = kVar;
            this.f8138c = nVar;
        }

        @Override // b4.InterfaceC0802d.a
        public m a(d4.h hVar, m mVar, boolean z7) {
            n nVar = this.f8138c;
            if (nVar == null) {
                nVar = this.f8137b.b();
            }
            return this.f8136a.g(nVar, mVar, z7, hVar);
        }

        @Override // b4.InterfaceC0802d.a
        public n b(C1227b c1227b) {
            C0745a c7 = this.f8137b.c();
            if (c7.c(c1227b)) {
                return c7.b().v(c1227b);
            }
            n nVar = this.f8138c;
            return this.f8136a.a(c1227b, nVar != null ? new C0745a(d4.i.f(nVar, d4.j.j()), true, false) : this.f8137b.d());
        }
    }

    public l(InterfaceC0802d interfaceC0802d) {
        this.f8132a = interfaceC0802d;
    }

    public static boolean g(k kVar, C1227b c1227b) {
        return kVar.c().c(c1227b);
    }

    public final k a(k kVar, V3.k kVar2, Y3.d dVar, G g7, n nVar, C0799a c0799a) {
        if (g7.i(kVar2) != null) {
            return kVar;
        }
        boolean e7 = kVar.d().e();
        C0745a d7 = kVar.d();
        if (dVar.getValue() == null) {
            C0663b s7 = C0663b.s();
            Iterator it = dVar.iterator();
            C0663b c0663b = s7;
            while (it.hasNext()) {
                V3.k kVar3 = (V3.k) ((Map.Entry) it.next()).getKey();
                V3.k T6 = kVar2.T(kVar3);
                if (d7.d(T6)) {
                    c0663b = c0663b.a(kVar3, d7.b().A(T6));
                }
            }
            return c(kVar, kVar2, c0663b, g7, nVar, e7, c0799a);
        }
        if ((kVar2.isEmpty() && d7.f()) || d7.d(kVar2)) {
            return d(kVar, kVar2, d7.b().A(kVar2), g7, nVar, e7, c0799a);
        }
        if (!kVar2.isEmpty()) {
            return kVar;
        }
        C0663b s8 = C0663b.s();
        C0663b c0663b2 = s8;
        for (m mVar : d7.b()) {
            c0663b2 = c0663b2.d(mVar.c(), mVar.d());
        }
        return c(kVar, kVar2, c0663b2, g7, nVar, e7, c0799a);
    }

    public c b(k kVar, W3.d dVar, G g7, n nVar) {
        k d7;
        C0799a c0799a = new C0799a();
        int i7 = b.f8133a[dVar.c().ordinal()];
        if (i7 == 1) {
            W3.f fVar = (W3.f) dVar;
            if (fVar.b().d()) {
                d7 = f(kVar, fVar.a(), fVar.e(), g7, nVar, c0799a);
            } else {
                Y3.m.f(fVar.b().c());
                d7 = d(kVar, fVar.a(), fVar.e(), g7, nVar, fVar.b().e() || (kVar.d().e() && !fVar.a().isEmpty()), c0799a);
            }
        } else if (i7 == 2) {
            W3.c cVar = (W3.c) dVar;
            if (cVar.b().d()) {
                d7 = e(kVar, cVar.a(), cVar.e(), g7, nVar, c0799a);
            } else {
                Y3.m.f(cVar.b().c());
                d7 = c(kVar, cVar.a(), cVar.e(), g7, nVar, cVar.b().e() || kVar.d().e(), c0799a);
            }
        } else if (i7 == 3) {
            W3.a aVar = (W3.a) dVar;
            boolean f7 = aVar.f();
            V3.k a7 = aVar.a();
            d7 = !f7 ? a(kVar, a7, aVar.e(), g7, nVar, c0799a) : k(kVar, a7, g7, nVar, c0799a);
        } else {
            if (i7 != 4) {
                throw new AssertionError("Unknown operation: " + dVar.c());
            }
            d7 = i(kVar, dVar.a(), g7, nVar, c0799a);
        }
        ArrayList arrayList = new ArrayList(c0799a.a());
        j(kVar, d7, arrayList);
        return new c(d7, arrayList);
    }

    public final k c(k kVar, V3.k kVar2, C0663b c0663b, G g7, n nVar, boolean z7, C0799a c0799a) {
        if (kVar.d().b().isEmpty() && !kVar.d().f()) {
            return kVar;
        }
        Y3.m.g(c0663b.X() == null, "Can't have a merge that is an overwrite");
        C0663b f7 = kVar2.isEmpty() ? c0663b : C0663b.s().f(kVar2, c0663b);
        n b7 = kVar.d().b();
        Map q7 = f7.q();
        k kVar3 = kVar;
        for (Map.Entry entry : q7.entrySet()) {
            C1227b c1227b = (C1227b) entry.getKey();
            if (b7.Q(c1227b)) {
                kVar3 = d(kVar3, new V3.k(c1227b), ((C0663b) entry.getValue()).g(b7.v(c1227b)), g7, nVar, z7, c0799a);
            }
        }
        k kVar4 = kVar3;
        for (Map.Entry entry2 : q7.entrySet()) {
            C1227b c1227b2 = (C1227b) entry2.getKey();
            boolean z8 = !kVar.d().c(c1227b2) && ((C0663b) entry2.getValue()).X() == null;
            if (!b7.Q(c1227b2) && !z8) {
                kVar4 = d(kVar4, new V3.k(c1227b2), ((C0663b) entry2.getValue()).g(b7.v(c1227b2)), g7, nVar, z7, c0799a);
            }
        }
        return kVar4;
    }

    public final k d(k kVar, V3.k kVar2, n nVar, G g7, n nVar2, boolean z7, C0799a c0799a) {
        d4.i c7;
        d4.i D7;
        d4.i a7;
        C0745a d7 = kVar.d();
        InterfaceC0802d interfaceC0802d = this.f8132a;
        if (!z7) {
            interfaceC0802d = interfaceC0802d.b();
        }
        boolean z8 = true;
        if (kVar2.isEmpty()) {
            a7 = d7.a();
            D7 = d4.i.f(nVar, interfaceC0802d.e());
        } else {
            if (!interfaceC0802d.d() || d7.e()) {
                C1227b Z6 = kVar2.Z();
                if (!d7.d(kVar2) && kVar2.size() > 1) {
                    return kVar;
                }
                V3.k c02 = kVar2.c0();
                n y7 = d7.b().v(Z6).y(c02, nVar);
                if (Z6.s()) {
                    c7 = interfaceC0802d.a(d7.a(), y7);
                } else {
                    c7 = interfaceC0802d.c(d7.a(), Z6, y7, c02, f8131b, null);
                }
                if (!d7.f() && !kVar2.isEmpty()) {
                    z8 = false;
                }
                k f7 = kVar.f(c7, z8, interfaceC0802d.d());
                return h(f7, kVar2, g7, new d(g7, f7, nVar2), c0799a);
            }
            Y3.m.g(!kVar2.isEmpty(), "An empty path should have been caught in the other branch");
            C1227b Z7 = kVar2.Z();
            D7 = d7.a().D(Z7, d7.b().v(Z7).y(kVar2.c0(), nVar));
            a7 = d7.a();
        }
        c7 = interfaceC0802d.f(a7, D7, null);
        if (!d7.f()) {
            z8 = false;
        }
        k f72 = kVar.f(c7, z8, interfaceC0802d.d());
        return h(f72, kVar2, g7, new d(g7, f72, nVar2), c0799a);
    }

    public final k e(k kVar, V3.k kVar2, C0663b c0663b, G g7, n nVar, C0799a c0799a) {
        Y3.m.g(c0663b.X() == null, "Can't have a merge that is an overwrite");
        Iterator it = c0663b.iterator();
        k kVar3 = kVar;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            V3.k T6 = kVar2.T((V3.k) entry.getKey());
            if (g(kVar, T6.Z())) {
                kVar3 = f(kVar3, T6, (n) entry.getValue(), g7, nVar, c0799a);
            }
        }
        Iterator it2 = c0663b.iterator();
        k kVar4 = kVar3;
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            V3.k T7 = kVar2.T((V3.k) entry2.getKey());
            if (!g(kVar, T7.Z())) {
                kVar4 = f(kVar4, T7, (n) entry2.getValue(), g7, nVar, c0799a);
            }
        }
        return kVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a4.k f(a4.k r9, V3.k r10, d4.n r11, V3.G r12, d4.n r13, b4.C0799a r14) {
        /*
            r8 = this;
            a4.a r0 = r9.c()
            a4.l$d r6 = new a4.l$d
            r6.<init>(r12, r9, r13)
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L34
            b4.d r10 = r8.f8132a
            d4.h r10 = r10.e()
            d4.i r10 = d4.i.f(r11, r10)
            b4.d r11 = r8.f8132a
            a4.a r12 = r9.c()
            d4.i r12 = r12.a()
            d4.i r10 = r11.f(r12, r10, r14)
            b4.d r11 = r8.f8132a
            boolean r11 = r11.d()
            r12 = 1
            a4.k r9 = r9.e(r10, r12, r11)
            goto Lb3
        L34:
            d4.b r3 = r10.Z()
            boolean r12 = r3.s()
            if (r12 == 0) goto L59
            b4.d r10 = r8.f8132a
            a4.a r12 = r9.c()
            d4.i r12 = r12.a()
            d4.i r10 = r10.a(r12, r11)
            boolean r11 = r0.f()
            boolean r12 = r0.e()
        L54:
            a4.k r9 = r9.e(r10, r11, r12)
            goto Lb3
        L59:
            V3.k r5 = r10.c0()
            d4.n r10 = r0.b()
            d4.n r10 = r10.v(r3)
            boolean r12 = r5.isEmpty()
            if (r12 == 0) goto L6d
        L6b:
            r4 = r11
            goto L97
        L6d:
            d4.n r12 = r6.b(r3)
            if (r12 == 0) goto L92
            d4.b r13 = r5.X()
            boolean r13 = r13.s()
            if (r13 == 0) goto L8d
            V3.k r13 = r5.a0()
            d4.n r13 = r12.A(r13)
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L8d
            r4 = r12
            goto L97
        L8d:
            d4.n r11 = r12.y(r5, r11)
            goto L6b
        L92:
            d4.g r11 = d4.g.W()
            goto L6b
        L97:
            boolean r10 = r10.equals(r4)
            if (r10 != 0) goto Lb3
            b4.d r1 = r8.f8132a
            d4.i r2 = r0.a()
            r7 = r14
            d4.i r10 = r1.c(r2, r3, r4, r5, r6, r7)
            boolean r11 = r0.f()
            b4.d r12 = r8.f8132a
            boolean r12 = r12.d()
            goto L54
        Lb3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.l.f(a4.k, V3.k, d4.n, V3.G, d4.n, b4.a):a4.k");
    }

    public final k h(k kVar, V3.k kVar2, G g7, InterfaceC0802d.a aVar, C0799a c0799a) {
        n a7;
        d4.i c7;
        n b7;
        C0745a c8 = kVar.c();
        if (g7.i(kVar2) != null) {
            return kVar;
        }
        if (kVar2.isEmpty()) {
            Y3.m.g(kVar.d().f(), "If change path is empty, we must have complete server data");
            if (kVar.d().e()) {
                n b8 = kVar.b();
                if (!(b8 instanceof d4.c)) {
                    b8 = d4.g.W();
                }
                b7 = g7.e(b8);
            } else {
                b7 = g7.b(kVar.b());
            }
            c7 = this.f8132a.f(kVar.c().a(), d4.i.f(b7, this.f8132a.e()), c0799a);
        } else {
            C1227b Z6 = kVar2.Z();
            if (Z6.s()) {
                Y3.m.g(kVar2.size() == 1, "Can't have a priority with additional path components");
                n f7 = g7.f(kVar2, c8.b(), kVar.d().b());
                if (f7 != null) {
                    c7 = this.f8132a.a(c8.a(), f7);
                }
                c7 = c8.a();
            } else {
                V3.k c02 = kVar2.c0();
                if (c8.c(Z6)) {
                    n f8 = g7.f(kVar2, c8.b(), kVar.d().b());
                    a7 = f8 != null ? c8.b().v(Z6).y(c02, f8) : c8.b().v(Z6);
                } else {
                    a7 = g7.a(Z6, kVar.d());
                }
                n nVar = a7;
                if (nVar != null) {
                    c7 = this.f8132a.c(c8.a(), Z6, nVar, c02, aVar, c0799a);
                }
                c7 = c8.a();
            }
        }
        return kVar.e(c7, c8.f() || kVar2.isEmpty(), this.f8132a.d());
    }

    public final k i(k kVar, V3.k kVar2, G g7, n nVar, C0799a c0799a) {
        C0745a d7 = kVar.d();
        return h(kVar.f(d7.a(), d7.f() || kVar2.isEmpty(), d7.e()), kVar2, g7, f8131b, c0799a);
    }

    public final void j(k kVar, k kVar2, List list) {
        C0745a c7 = kVar2.c();
        if (c7.f()) {
            boolean z7 = c7.b().B() || c7.b().isEmpty();
            if (list.isEmpty() && kVar.c().f() && ((!z7 || c7.b().equals(kVar.a())) && c7.b().t().equals(kVar.a().t()))) {
                return;
            }
            list.add(C0747c.n(c7.a()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if (r10.B() == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a4.k k(a4.k r9, V3.k r10, V3.G r11, d4.n r12, b4.C0799a r13) {
        /*
            r8 = this;
            d4.n r0 = r11.i(r10)
            if (r0 == 0) goto L7
            return r9
        L7:
            a4.l$d r6 = new a4.l$d
            r6.<init>(r11, r9, r12)
            a4.a r12 = r9.c()
            d4.i r2 = r12.a()
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L9f
            d4.b r12 = r10.Z()
            boolean r12 = r12.s()
            if (r12 == 0) goto L26
            goto L9f
        L26:
            d4.b r3 = r10.Z()
            a4.a r12 = r9.d()
            d4.n r12 = r11.a(r3, r12)
            if (r12 != 0) goto L46
            a4.a r0 = r9.d()
            boolean r0 = r0.c(r3)
            if (r0 == 0) goto L46
            d4.n r12 = r2.k()
            d4.n r12 = r12.v(r3)
        L46:
            r4 = r12
            if (r4 == 0) goto L55
            b4.d r1 = r8.f8132a
        L4b:
            V3.k r5 = r10.c0()
            r7 = r13
            d4.i r2 = r1.c(r2, r3, r4, r5, r6, r7)
            goto L6c
        L55:
            if (r4 != 0) goto L6c
            a4.a r12 = r9.c()
            d4.n r12 = r12.b()
            boolean r12 = r12.Q(r3)
            if (r12 == 0) goto L6c
            b4.d r1 = r8.f8132a
            d4.g r4 = d4.g.W()
            goto L4b
        L6c:
            d4.n r10 = r2.k()
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto Lbf
            a4.a r10 = r9.d()
            boolean r10 = r10.f()
            if (r10 == 0) goto Lbf
            d4.n r10 = r9.b()
            d4.n r10 = r11.b(r10)
            boolean r12 = r10.B()
            if (r12 == 0) goto Lbf
        L8e:
            b4.d r12 = r8.f8132a
            d4.h r12 = r12.e()
            d4.i r10 = d4.i.f(r10, r12)
            b4.d r12 = r8.f8132a
            d4.i r2 = r12.f(r2, r10, r13)
            goto Lbf
        L9f:
            a4.a r10 = r9.d()
            boolean r10 = r10.f()
            if (r10 == 0) goto Lb2
            d4.n r10 = r9.b()
            d4.n r10 = r11.b(r10)
            goto L8e
        Lb2:
            a4.a r10 = r9.d()
            d4.n r10 = r10.b()
            d4.n r10 = r11.e(r10)
            goto L8e
        Lbf:
            a4.a r10 = r9.d()
            boolean r10 = r10.f()
            if (r10 != 0) goto Ld6
            V3.k r10 = V3.k.Y()
            d4.n r10 = r11.i(r10)
            if (r10 == 0) goto Ld4
            goto Ld6
        Ld4:
            r10 = 0
            goto Ld7
        Ld6:
            r10 = 1
        Ld7:
            b4.d r11 = r8.f8132a
            boolean r11 = r11.d()
            a4.k r9 = r9.e(r2, r10, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.l.k(a4.k, V3.k, V3.G, d4.n, b4.a):a4.k");
    }
}
