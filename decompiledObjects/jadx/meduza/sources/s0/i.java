package s0;

import java.nio.charset.Charset;
import java.util.List;
import s0.y;

/* loaded from: classes.dex */
public final class i implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final h f14013a;

    /* renamed from: b, reason: collision with root package name */
    public int f14014b;

    /* renamed from: c, reason: collision with root package name */
    public int f14015c;

    /* renamed from: d, reason: collision with root package name */
    public int f14016d = 0;

    public i(h hVar) {
        Charset charset = x.f14119a;
        if (hVar == null) {
            throw new NullPointerException("input");
        }
        this.f14013a = hVar;
        hVar.f13992d = this;
    }

    @Override // s0.b1
    public final int A() {
        int i10 = this.f14016d;
        if (i10 != 0) {
            this.f14014b = i10;
            this.f14016d = 0;
        } else {
            this.f14014b = this.f14013a.u();
        }
        int i11 = this.f14014b;
        if (i11 == 0 || i11 == this.f14015c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    @Override // s0.b1
    public final <T> T B(c1<T> c1Var, n nVar) {
        T(3);
        return (T) P(c1Var, nVar);
    }

    @Override // s0.b1
    public final void C(List<String> list) {
        R(list, false);
    }

    @Override // s0.b1
    public final void D(List<String> list) {
        R(list, true);
    }

    @Override // s0.b1
    public final g E() {
        T(2);
        return this.f14013a.g();
    }

    @Override // s0.b1
    public final void F(List<Float> list) {
        int u10;
        int u11;
        if (!(list instanceof t)) {
            int i10 = this.f14014b & 7;
            if (i10 == 2) {
                int v10 = this.f14013a.v();
                U(v10);
                int b10 = this.f14013a.b() + v10;
                do {
                    list.add(Float.valueOf(this.f14013a.l()));
                } while (this.f14013a.b() < b10);
                return;
            }
            if (i10 != 5) {
                throw y.b();
            }
            do {
                list.add(Float.valueOf(this.f14013a.l()));
                if (this.f14013a.c()) {
                    return;
                } else {
                    u10 = this.f14013a.u();
                }
            } while (u10 == this.f14014b);
            this.f14016d = u10;
            return;
        }
        t tVar = (t) list;
        int i11 = this.f14014b & 7;
        if (i11 == 2) {
            int v11 = this.f14013a.v();
            U(v11);
            int b11 = this.f14013a.b() + v11;
            do {
                tVar.h(this.f14013a.l());
            } while (this.f14013a.b() < b11);
            return;
        }
        if (i11 != 5) {
            throw y.b();
        }
        do {
            tVar.h(this.f14013a.l());
            if (this.f14013a.c()) {
                return;
            } else {
                u11 = this.f14013a.u();
            }
        } while (u11 == this.f14014b);
        this.f14016d = u11;
    }

    @Override // s0.b1
    public final int G() {
        T(0);
        return this.f14013a.m();
    }

    @Override // s0.b1
    public final boolean H() {
        int i10;
        if (this.f14013a.c() || (i10 = this.f14014b) == this.f14015c) {
            return false;
        }
        return this.f14013a.x(i10);
    }

    @Override // s0.b1
    public final int I() {
        T(5);
        return this.f14013a.o();
    }

    @Override // s0.b1
    public final void J(List<g> list) {
        int u10;
        if ((this.f14014b & 7) != 2) {
            throw y.b();
        }
        do {
            list.add(E());
            if (this.f14013a.c()) {
                return;
            } else {
                u10 = this.f14013a.u();
            }
        } while (u10 == this.f14014b);
        this.f14016d = u10;
    }

    @Override // s0.b1
    public final void K(List<Double> list) {
        int u10;
        int u11;
        if (!(list instanceof l)) {
            int i10 = this.f14014b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(this.f14013a.h()));
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u10 = this.f14013a.u();
                    }
                } while (u10 == this.f14014b);
                this.f14016d = u10;
                return;
            }
            if (i10 != 2) {
                throw y.b();
            }
            int v10 = this.f14013a.v();
            V(v10);
            int b10 = this.f14013a.b() + v10;
            do {
                list.add(Double.valueOf(this.f14013a.h()));
            } while (this.f14013a.b() < b10);
            return;
        }
        l lVar = (l) list;
        int i11 = this.f14014b & 7;
        if (i11 == 1) {
            do {
                lVar.h(this.f14013a.h());
                if (this.f14013a.c()) {
                    return;
                } else {
                    u11 = this.f14013a.u();
                }
            } while (u11 == this.f14014b);
            this.f14016d = u11;
            return;
        }
        if (i11 != 2) {
            throw y.b();
        }
        int v11 = this.f14013a.v();
        V(v11);
        int b11 = this.f14013a.b() + v11;
        do {
            lVar.h(this.f14013a.h());
        } while (this.f14013a.b() < b11);
    }

    @Override // s0.b1
    public final long L() {
        T(0);
        return this.f14013a.n();
    }

    @Override // s0.b1
    public final String M() {
        T(2);
        return this.f14013a.t();
    }

    @Override // s0.b1
    public final void N(List<Long> list) {
        int u10;
        int u11;
        if (!(list instanceof f0)) {
            int i10 = this.f14014b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f14013a.k()));
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u10 = this.f14013a.u();
                    }
                } while (u10 == this.f14014b);
                this.f14016d = u10;
                return;
            }
            if (i10 != 2) {
                throw y.b();
            }
            int v10 = this.f14013a.v();
            V(v10);
            int b10 = this.f14013a.b() + v10;
            do {
                list.add(Long.valueOf(this.f14013a.k()));
            } while (this.f14013a.b() < b10);
            return;
        }
        f0 f0Var = (f0) list;
        int i11 = this.f14014b & 7;
        if (i11 == 1) {
            do {
                f0Var.h(this.f14013a.k());
                if (this.f14013a.c()) {
                    return;
                } else {
                    u11 = this.f14013a.u();
                }
            } while (u11 == this.f14014b);
            this.f14016d = u11;
            return;
        }
        if (i11 != 2) {
            throw y.b();
        }
        int v11 = this.f14013a.v();
        V(v11);
        int b11 = this.f14013a.b() + v11;
        do {
            f0Var.h(this.f14013a.k());
        } while (this.f14013a.b() < b11);
    }

    public final Object O(n1 n1Var, Class<?> cls, n nVar) {
        switch (n1Var.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(L());
            case 3:
                return Long.valueOf(c());
            case 4:
                return Integer.valueOf(G());
            case 5:
                return Long.valueOf(d());
            case 6:
                return Integer.valueOf(j());
            case 7:
                return Boolean.valueOf(k());
            case 8:
                return M();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                T(2);
                return Q(y0.f14122c.a(cls), nVar);
            case 11:
                return E();
            case 12:
                return Integer.valueOf(n());
            case 13:
                return Integer.valueOf(t());
            case 14:
                return Integer.valueOf(I());
            case 15:
                return Long.valueOf(l());
            case 16:
                return Integer.valueOf(v());
            case 17:
                return Long.valueOf(w());
        }
    }

    public final <T> T P(c1<T> c1Var, n nVar) {
        int i10 = this.f14015c;
        this.f14015c = ((this.f14014b >>> 3) << 3) | 4;
        try {
            T f = c1Var.f();
            c1Var.i(f, this, nVar);
            c1Var.b(f);
            if (this.f14014b == this.f14015c) {
                return f;
            }
            throw y.e();
        } finally {
            this.f14015c = i10;
        }
    }

    public final <T> T Q(c1<T> c1Var, n nVar) {
        int v10 = this.f14013a.v();
        h hVar = this.f14013a;
        if (hVar.f13989a >= hVar.f13990b) {
            throw new y("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e10 = hVar.e(v10);
        T f = c1Var.f();
        this.f14013a.f13989a++;
        c1Var.i(f, this, nVar);
        c1Var.b(f);
        this.f14013a.a(0);
        r5.f13989a--;
        this.f14013a.d(e10);
        return f;
    }

    public final void R(List<String> list, boolean z10) {
        int u10;
        int u11;
        if ((this.f14014b & 7) != 2) {
            throw y.b();
        }
        if (!(list instanceof d0) || z10) {
            do {
                list.add(z10 ? M() : z());
                if (this.f14013a.c()) {
                    return;
                } else {
                    u10 = this.f14013a.u();
                }
            } while (u10 == this.f14014b);
            this.f14016d = u10;
            return;
        }
        d0 d0Var = (d0) list;
        do {
            d0Var.w(E());
            if (this.f14013a.c()) {
                return;
            } else {
                u11 = this.f14013a.u();
            }
        } while (u11 == this.f14014b);
        this.f14016d = u11;
    }

    public final void S(int i10) {
        if (this.f14013a.b() != i10) {
            throw y.f();
        }
    }

    public final void T(int i10) {
        if ((this.f14014b & 7) != i10) {
            throw y.b();
        }
    }

    public final void U(int i10) {
        if ((i10 & 3) != 0) {
            throw y.e();
        }
    }

    public final void V(int i10) {
        if ((i10 & 7) != 0) {
            throw y.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // s0.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void a(java.util.Map<K, V> r8, s0.h0.a<K, V> r9, s0.n r10) {
        /*
            r7 = this;
            r0 = 2
            r7.T(r0)
            s0.h r1 = r7.f14013a
            int r1 = r1.v()
            s0.h r2 = r7.f14013a
            int r1 = r2.e(r1)
            K r2 = r9.f14010b
            V r3 = r9.f14012d
        L14:
            int r4 = r7.A()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            s0.h r5 = r7.f14013a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.c()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.H()     // Catch: s0.y.a -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            s0.y r4 = new s0.y     // Catch: s0.y.a -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: s0.y.a -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: s0.y.a -> L4f java.lang.Throwable -> L65
        L3a:
            s0.n1 r4 = r9.f14011c     // Catch: s0.y.a -> L4f java.lang.Throwable -> L65
            V r5 = r9.f14012d     // Catch: s0.y.a -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: s0.y.a -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.O(r4, r5, r10)     // Catch: s0.y.a -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            s0.n1 r4 = r9.f14009a     // Catch: s0.y.a -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.O(r4, r5, r5)     // Catch: s0.y.a -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.H()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            s0.y r8 = new s0.y     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            s0.h r8 = r7.f14013a
            r8.d(r1)
            return
        L65:
            r8 = move-exception
            s0.h r9 = r7.f14013a
            r9.d(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.i.a(java.util.Map, s0.h0$a, s0.n):void");
    }

    @Override // s0.b1
    public final void b(List<Integer> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof w) {
            w wVar = (w) list;
            int i10 = this.f14014b & 7;
            if (i10 == 0) {
                do {
                    wVar.h(this.f14013a.q());
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u11 = this.f14013a.u();
                    }
                } while (u11 == this.f14014b);
                this.f14016d = u11;
                return;
            }
            if (i10 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                wVar.h(this.f14013a.q());
            } while (this.f14013a.b() < b10);
        } else {
            int i11 = this.f14014b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f14013a.q()));
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u10 = this.f14013a.u();
                    }
                } while (u10 == this.f14014b);
                this.f14016d = u10;
                return;
            }
            if (i11 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                list.add(Integer.valueOf(this.f14013a.q()));
            } while (this.f14013a.b() < b10);
        }
        S(b10);
    }

    @Override // s0.b1
    public final long c() {
        T(0);
        return this.f14013a.w();
    }

    @Override // s0.b1
    public final long d() {
        T(1);
        return this.f14013a.k();
    }

    @Override // s0.b1
    public final void e(List<Integer> list) {
        int u10;
        int u11;
        if (!(list instanceof w)) {
            int i10 = this.f14014b & 7;
            if (i10 == 2) {
                int v10 = this.f14013a.v();
                U(v10);
                int b10 = this.f14013a.b() + v10;
                do {
                    list.add(Integer.valueOf(this.f14013a.o()));
                } while (this.f14013a.b() < b10);
                return;
            }
            if (i10 != 5) {
                throw y.b();
            }
            do {
                list.add(Integer.valueOf(this.f14013a.o()));
                if (this.f14013a.c()) {
                    return;
                } else {
                    u10 = this.f14013a.u();
                }
            } while (u10 == this.f14014b);
            this.f14016d = u10;
            return;
        }
        w wVar = (w) list;
        int i11 = this.f14014b & 7;
        if (i11 == 2) {
            int v11 = this.f14013a.v();
            U(v11);
            int b11 = this.f14013a.b() + v11;
            do {
                wVar.h(this.f14013a.o());
            } while (this.f14013a.b() < b11);
            return;
        }
        if (i11 != 5) {
            throw y.b();
        }
        do {
            wVar.h(this.f14013a.o());
            if (this.f14013a.c()) {
                return;
            } else {
                u11 = this.f14013a.u();
            }
        } while (u11 == this.f14014b);
        this.f14016d = u11;
    }

    @Override // s0.b1
    public final void f(List<Long> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            int i10 = this.f14014b & 7;
            if (i10 == 0) {
                do {
                    f0Var.h(this.f14013a.r());
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u11 = this.f14013a.u();
                    }
                } while (u11 == this.f14014b);
                this.f14016d = u11;
                return;
            }
            if (i10 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                f0Var.h(this.f14013a.r());
            } while (this.f14013a.b() < b10);
        } else {
            int i11 = this.f14014b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f14013a.r()));
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u10 = this.f14013a.u();
                    }
                } while (u10 == this.f14014b);
                this.f14016d = u10;
                return;
            }
            if (i11 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                list.add(Long.valueOf(this.f14013a.r()));
            } while (this.f14013a.b() < b10);
        }
        S(b10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s0.b1
    public final <T> void g(List<T> list, c1<T> c1Var, n nVar) {
        int u10;
        int i10 = this.f14014b;
        if ((i10 & 7) != 3) {
            int i11 = y.f14121a;
            throw new y.a();
        }
        do {
            list.add(P(c1Var, nVar));
            if (this.f14013a.c() || this.f14016d != 0) {
                return;
            } else {
                u10 = this.f14013a.u();
            }
        } while (u10 == i10);
        this.f14016d = u10;
    }

    @Override // s0.b1
    public final void h(List<Integer> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof w) {
            w wVar = (w) list;
            int i10 = this.f14014b & 7;
            if (i10 == 0) {
                do {
                    wVar.h(this.f14013a.v());
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u11 = this.f14013a.u();
                    }
                } while (u11 == this.f14014b);
                this.f14016d = u11;
                return;
            }
            if (i10 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                wVar.h(this.f14013a.v());
            } while (this.f14013a.b() < b10);
        } else {
            int i11 = this.f14014b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f14013a.v()));
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u10 = this.f14013a.u();
                    }
                } while (u10 == this.f14014b);
                this.f14016d = u10;
                return;
            }
            if (i11 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                list.add(Integer.valueOf(this.f14013a.v()));
            } while (this.f14013a.b() < b10);
        }
        S(b10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s0.b1
    public final <T> void i(List<T> list, c1<T> c1Var, n nVar) {
        int u10;
        int i10 = this.f14014b;
        if ((i10 & 7) != 2) {
            int i11 = y.f14121a;
            throw new y.a();
        }
        do {
            list.add(Q(c1Var, nVar));
            if (this.f14013a.c() || this.f14016d != 0) {
                return;
            } else {
                u10 = this.f14013a.u();
            }
        } while (u10 == i10);
        this.f14016d = u10;
    }

    @Override // s0.b1
    public final int j() {
        T(5);
        return this.f14013a.j();
    }

    @Override // s0.b1
    public final boolean k() {
        T(0);
        return this.f14013a.f();
    }

    @Override // s0.b1
    public final long l() {
        T(1);
        return this.f14013a.p();
    }

    @Override // s0.b1
    public final void m(List<Long> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            int i10 = this.f14014b & 7;
            if (i10 == 0) {
                do {
                    f0Var.h(this.f14013a.w());
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u11 = this.f14013a.u();
                    }
                } while (u11 == this.f14014b);
                this.f14016d = u11;
                return;
            }
            if (i10 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                f0Var.h(this.f14013a.w());
            } while (this.f14013a.b() < b10);
        } else {
            int i11 = this.f14014b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f14013a.w()));
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u10 = this.f14013a.u();
                    }
                } while (u10 == this.f14014b);
                this.f14016d = u10;
                return;
            }
            if (i11 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                list.add(Long.valueOf(this.f14013a.w()));
            } while (this.f14013a.b() < b10);
        }
        S(b10);
    }

    @Override // s0.b1
    public final int n() {
        T(0);
        return this.f14013a.v();
    }

    @Override // s0.b1
    public final void o(List<Long> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            int i10 = this.f14014b & 7;
            if (i10 == 0) {
                do {
                    f0Var.h(this.f14013a.n());
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u11 = this.f14013a.u();
                    }
                } while (u11 == this.f14014b);
                this.f14016d = u11;
                return;
            }
            if (i10 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                f0Var.h(this.f14013a.n());
            } while (this.f14013a.b() < b10);
        } else {
            int i11 = this.f14014b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f14013a.n()));
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u10 = this.f14013a.u();
                    }
                } while (u10 == this.f14014b);
                this.f14016d = u10;
                return;
            }
            if (i11 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                list.add(Long.valueOf(this.f14013a.n()));
            } while (this.f14013a.b() < b10);
        }
        S(b10);
    }

    @Override // s0.b1
    public final int p() {
        return this.f14014b;
    }

    @Override // s0.b1
    public final void q(List<Long> list) {
        int u10;
        int u11;
        if (!(list instanceof f0)) {
            int i10 = this.f14014b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f14013a.p()));
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u10 = this.f14013a.u();
                    }
                } while (u10 == this.f14014b);
                this.f14016d = u10;
                return;
            }
            if (i10 != 2) {
                throw y.b();
            }
            int v10 = this.f14013a.v();
            V(v10);
            int b10 = this.f14013a.b() + v10;
            do {
                list.add(Long.valueOf(this.f14013a.p()));
            } while (this.f14013a.b() < b10);
            return;
        }
        f0 f0Var = (f0) list;
        int i11 = this.f14014b & 7;
        if (i11 == 1) {
            do {
                f0Var.h(this.f14013a.p());
                if (this.f14013a.c()) {
                    return;
                } else {
                    u11 = this.f14013a.u();
                }
            } while (u11 == this.f14014b);
            this.f14016d = u11;
            return;
        }
        if (i11 != 2) {
            throw y.b();
        }
        int v11 = this.f14013a.v();
        V(v11);
        int b11 = this.f14013a.b() + v11;
        do {
            f0Var.h(this.f14013a.p());
        } while (this.f14013a.b() < b11);
    }

    @Override // s0.b1
    public final void r(List<Integer> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof w) {
            w wVar = (w) list;
            int i10 = this.f14014b & 7;
            if (i10 == 0) {
                do {
                    wVar.h(this.f14013a.m());
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u11 = this.f14013a.u();
                    }
                } while (u11 == this.f14014b);
                this.f14016d = u11;
                return;
            }
            if (i10 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                wVar.h(this.f14013a.m());
            } while (this.f14013a.b() < b10);
        } else {
            int i11 = this.f14014b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f14013a.m()));
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u10 = this.f14013a.u();
                    }
                } while (u10 == this.f14014b);
                this.f14016d = u10;
                return;
            }
            if (i11 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                list.add(Integer.valueOf(this.f14013a.m()));
            } while (this.f14013a.b() < b10);
        }
        S(b10);
    }

    @Override // s0.b1
    public final double readDouble() {
        T(1);
        return this.f14013a.h();
    }

    @Override // s0.b1
    public final float readFloat() {
        T(5);
        return this.f14013a.l();
    }

    @Override // s0.b1
    public final void s(List<Integer> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof w) {
            w wVar = (w) list;
            int i10 = this.f14014b & 7;
            if (i10 == 0) {
                do {
                    wVar.h(this.f14013a.i());
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u11 = this.f14013a.u();
                    }
                } while (u11 == this.f14014b);
                this.f14016d = u11;
                return;
            }
            if (i10 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                wVar.h(this.f14013a.i());
            } while (this.f14013a.b() < b10);
        } else {
            int i11 = this.f14014b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f14013a.i()));
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u10 = this.f14013a.u();
                    }
                } while (u10 == this.f14014b);
                this.f14016d = u10;
                return;
            }
            if (i11 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                list.add(Integer.valueOf(this.f14013a.i()));
            } while (this.f14013a.b() < b10);
        }
        S(b10);
    }

    @Override // s0.b1
    public final int t() {
        T(0);
        return this.f14013a.i();
    }

    @Override // s0.b1
    public final void u(List<Integer> list) {
        int u10;
        int u11;
        if (!(list instanceof w)) {
            int i10 = this.f14014b & 7;
            if (i10 == 2) {
                int v10 = this.f14013a.v();
                U(v10);
                int b10 = this.f14013a.b() + v10;
                do {
                    list.add(Integer.valueOf(this.f14013a.j()));
                } while (this.f14013a.b() < b10);
                return;
            }
            if (i10 != 5) {
                throw y.b();
            }
            do {
                list.add(Integer.valueOf(this.f14013a.j()));
                if (this.f14013a.c()) {
                    return;
                } else {
                    u10 = this.f14013a.u();
                }
            } while (u10 == this.f14014b);
            this.f14016d = u10;
            return;
        }
        w wVar = (w) list;
        int i11 = this.f14014b & 7;
        if (i11 == 2) {
            int v11 = this.f14013a.v();
            U(v11);
            int b11 = this.f14013a.b() + v11;
            do {
                wVar.h(this.f14013a.j());
            } while (this.f14013a.b() < b11);
            return;
        }
        if (i11 != 5) {
            throw y.b();
        }
        do {
            wVar.h(this.f14013a.j());
            if (this.f14013a.c()) {
                return;
            } else {
                u11 = this.f14013a.u();
            }
        } while (u11 == this.f14014b);
        this.f14016d = u11;
    }

    @Override // s0.b1
    public final int v() {
        T(0);
        return this.f14013a.q();
    }

    @Override // s0.b1
    public final long w() {
        T(0);
        return this.f14013a.r();
    }

    @Override // s0.b1
    public final void x(List<Boolean> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof e) {
            e eVar = (e) list;
            int i10 = this.f14014b & 7;
            if (i10 == 0) {
                do {
                    eVar.h(this.f14013a.f());
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u11 = this.f14013a.u();
                    }
                } while (u11 == this.f14014b);
                this.f14016d = u11;
                return;
            }
            if (i10 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                eVar.h(this.f14013a.f());
            } while (this.f14013a.b() < b10);
        } else {
            int i11 = this.f14014b & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f14013a.f()));
                    if (this.f14013a.c()) {
                        return;
                    } else {
                        u10 = this.f14013a.u();
                    }
                } while (u10 == this.f14014b);
                this.f14016d = u10;
                return;
            }
            if (i11 != 2) {
                throw y.b();
            }
            b10 = this.f14013a.b() + this.f14013a.v();
            do {
                list.add(Boolean.valueOf(this.f14013a.f()));
            } while (this.f14013a.b() < b10);
        }
        S(b10);
    }

    @Override // s0.b1
    public final <T> T y(c1<T> c1Var, n nVar) {
        T(2);
        return (T) Q(c1Var, nVar);
    }

    @Override // s0.b1
    public final String z() {
        T(2);
        return this.f14013a.s();
    }
}
