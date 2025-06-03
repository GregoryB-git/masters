package ma;

import java.util.Iterator;
import java.util.Map;
import ma.e0;
import ma.s;
import ma.w;

/* loaded from: classes.dex */
public final class w0<T> implements i1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f11129a;

    /* renamed from: b, reason: collision with root package name */
    public final p1<?, ?> f11130b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11131c;

    /* renamed from: d, reason: collision with root package name */
    public final p<?> f11132d;

    public w0(p1<?, ?> p1Var, p<?> pVar, s0 s0Var) {
        this.f11130b = p1Var;
        this.f11131c = pVar.e(s0Var);
        this.f11132d = pVar;
        this.f11129a = s0Var;
    }

    @Override // ma.i1
    public final void a(T t, T t10) {
        p1<?, ?> p1Var = this.f11130b;
        Class<?> cls = j1.f11015a;
        p1Var.o(t, p1Var.k(p1Var.g(t), p1Var.g(t10)));
        if (this.f11131c) {
            j1.A(this.f11132d, t, t10);
        }
    }

    @Override // ma.i1
    public final void b(T t) {
        this.f11130b.j(t);
        this.f11132d.f(t);
    }

    @Override // ma.i1
    public final boolean c(T t) {
        return this.f11132d.c(t).j();
    }

    @Override // ma.i1
    public final boolean d(T t, T t10) {
        if (!this.f11130b.g(t).equals(this.f11130b.g(t10))) {
            return false;
        }
        if (this.f11131c) {
            return this.f11132d.c(t).equals(this.f11132d.c(t10));
        }
        return true;
    }

    @Override // ma.i1
    public final int e(T t) {
        p1<?, ?> p1Var = this.f11130b;
        int i10 = p1Var.i(p1Var.g(t)) + 0;
        if (!this.f11131c) {
            return i10;
        }
        s<?> c10 = this.f11132d.c(t);
        int i11 = 0;
        for (int i12 = 0; i12 < c10.f11073a.e(); i12++) {
            i11 += s.g(c10.f11073a.d(i12));
        }
        Iterator<Map.Entry<?, Object>> it = c10.f11073a.f().iterator();
        while (it.hasNext()) {
            i11 += s.g(it.next());
        }
        return i10 + i11;
    }

    @Override // ma.i1
    public final T f() {
        s0 s0Var = this.f11129a;
        return s0Var instanceof w ? (T) ((w) ((w) s0Var).t(w.f.NEW_MUTABLE_INSTANCE)) : (T) s0Var.e().l();
    }

    @Override // ma.i1
    public final int g(T t) {
        int hashCode = this.f11130b.g(t).hashCode();
        return this.f11131c ? (hashCode * 53) + this.f11132d.c(t).hashCode() : hashCode;
    }

    @Override // ma.i1
    public final void h(Object obj, l lVar) {
        Iterator<Map.Entry<?, Object>> l10 = this.f11132d.c(obj).l();
        while (l10.hasNext()) {
            Map.Entry<?, Object> next = l10.next();
            s.a aVar = (s.a) next.getKey();
            if (aVar.d() != w1.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            aVar.b();
            aVar.e();
            boolean z10 = next instanceof e0.a;
            aVar.a();
            lVar.l(0, z10 ? ((e0.a) next).f10943a.getValue().b() : next.getValue());
        }
        p1<?, ?> p1Var = this.f11130b;
        p1Var.r(p1Var.g(obj), lVar);
    }

    @Override // ma.i1
    public final void i(T t, g1 g1Var, o oVar) {
        j jVar;
        p1 p1Var = this.f11130b;
        p pVar = this.f11132d;
        q1 f = p1Var.f(t);
        s<ET> d10 = pVar.d(t);
        do {
            try {
                jVar = (j) g1Var;
                if (jVar.a() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                p1Var.n(t, f);
            }
        } while (k(jVar, oVar, pVar, d10, p1Var, f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[EDGE_INSN: B:27:0x0091->B:28:0x0091 BREAK  A[LOOP:1: B:13:0x0052->B:21:0x0052], SYNTHETIC] */
    @Override // ma.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(T r10, byte[] r11, int r12, int r13, ma.f.a r14) {
        /*
            r9 = this;
            r0 = r10
            ma.w r0 = (ma.w) r0
            ma.q1 r1 = r0.unknownFields
            ma.q1 r2 = ma.q1.f
            if (r1 != r2) goto L10
            ma.q1 r1 = new ma.q1
            r1.<init>()
            r0.unknownFields = r1
        L10:
            ma.w$c r10 = (ma.w.c) r10
            ma.s<ma.w$d> r0 = r10.extensions
            boolean r2 = r0.f11074b
            if (r2 == 0) goto L1e
            ma.s r0 = r0.clone()
            r10.extensions = r0
        L1e:
            r10 = 0
            r0 = r10
        L20:
            if (r12 >= r13) goto L9b
            int r4 = ma.f.G(r11, r12, r14)
            int r2 = r14.f10948a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L50
            r12 = r2 & 7
            if (r12 != r3) goto L4b
            ma.p<?> r12 = r9.f11132d
            ma.o r0 = r14.f10951d
            ma.s0 r3 = r9.f11129a
            int r5 = r2 >>> 3
            ma.w$e r0 = r12.b(r0, r3, r5)
            if (r0 != 0) goto L48
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = ma.f.E(r2, r3, r4, r5, r6, r7)
            goto L20
        L48:
            ma.d1 r11 = ma.d1.f10940c
            throw r10
        L4b:
            int r12 = ma.f.M(r2, r11, r4, r13, r14)
            goto L20
        L50:
            r12 = 0
            r2 = r10
        L52:
            if (r4 >= r13) goto L91
            int r4 = ma.f.G(r11, r4, r14)
            int r5 = r14.f10948a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L74
            r8 = 3
            if (r6 == r8) goto L64
            goto L87
        L64:
            if (r0 != 0) goto L71
            if (r7 != r3) goto L87
            int r4 = ma.f.b(r11, r4, r14)
            java.lang.Object r2 = r14.f10950c
            ma.h r2 = (ma.h) r2
            goto L52
        L71:
            ma.d1 r11 = ma.d1.f10940c
            throw r10
        L74:
            if (r7 != 0) goto L87
            int r4 = ma.f.G(r11, r4, r14)
            int r12 = r14.f10948a
            ma.p<?> r0 = r9.f11132d
            ma.o r5 = r14.f10951d
            ma.s0 r6 = r9.f11129a
            ma.w$e r0 = r0.b(r5, r6, r12)
            goto L52
        L87:
            r6 = 12
            if (r5 != r6) goto L8c
            goto L91
        L8c:
            int r4 = ma.f.M(r5, r11, r4, r13, r14)
            goto L52
        L91:
            if (r2 == 0) goto L99
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.c(r12, r2)
        L99:
            r12 = r4
            goto L20
        L9b:
            if (r12 != r13) goto L9e
            return
        L9e:
            ma.b0 r10 = ma.b0.g()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.w0.j(java.lang.Object, byte[], int, int, ma.f$a):void");
    }

    public final <UT, UB, ET extends s.a<ET>> boolean k(g1 g1Var, o oVar, p<ET> pVar, s<ET> sVar, p1<UT, UB> p1Var, UB ub2) {
        j jVar = (j) g1Var;
        int i10 = jVar.f11010b;
        if (i10 != 11) {
            if ((i10 & 7) != 2) {
                return jVar.x();
            }
            w.e b10 = pVar.b(oVar, this.f11129a, i10 >>> 3);
            if (b10 == null) {
                return p1Var.l(ub2, g1Var);
            }
            pVar.h(b10);
            return true;
        }
        w.e eVar = null;
        h hVar = null;
        int i11 = 0;
        while (jVar.a() != Integer.MAX_VALUE) {
            int i12 = jVar.f11010b;
            if (i12 == 16) {
                jVar.w(0);
                i11 = jVar.f11009a.y();
                eVar = pVar.b(oVar, this.f11129a, i11);
            } else if (i12 == 26) {
                if (eVar != null) {
                    pVar.h(eVar);
                } else {
                    hVar = jVar.e();
                }
            } else if (!jVar.x()) {
                break;
            }
        }
        if (jVar.f11010b != 12) {
            throw b0.a();
        }
        if (hVar != null) {
            if (eVar != null) {
                pVar.i(eVar);
            } else {
                p1Var.d(ub2, i11, hVar);
            }
        }
        return true;
    }
}
