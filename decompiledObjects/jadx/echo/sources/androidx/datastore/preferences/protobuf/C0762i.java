package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762i implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0761h f9007a;

    /* renamed from: b, reason: collision with root package name */
    public int f9008b;

    /* renamed from: c, reason: collision with root package name */
    public int f9009c;

    /* renamed from: d, reason: collision with root package name */
    public int f9010d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9011a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f9011a = iArr;
            try {
                iArr[r0.b.f9093x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9011a[r0.b.f9078B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9011a[r0.b.f9086q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9011a[r0.b.f9080D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9011a[r0.b.f9092w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9011a[r0.b.f9091v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9011a[r0.b.f9087r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9011a[r0.b.f9090u.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9011a[r0.b.f9088s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9011a[r0.b.f9077A.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9011a[r0.b.f9081E.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9011a[r0.b.f9082F.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9011a[r0.b.f9083G.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9011a[r0.b.f9084H.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9011a[r0.b.f9094y.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9011a[r0.b.f9079C.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9011a[r0.b.f9089t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C0762i(AbstractC0761h abstractC0761h) {
        AbstractC0761h abstractC0761h2 = (AbstractC0761h) AbstractC0777y.b(abstractC0761h, "input");
        this.f9007a = abstractC0761h2;
        abstractC0761h2.f8967d = this;
    }

    public static C0762i O(AbstractC0761h abstractC0761h) {
        C0762i c0762i = abstractC0761h.f8967d;
        return c0762i != null ? c0762i : new C0762i(abstractC0761h);
    }

    private Object P(r0.b bVar, Class cls, C0768o c0768o) {
        switch (a.f9011a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(o());
            case 2:
                return u();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(b());
            case 5:
                return Integer.valueOf(n());
            case 6:
                return Long.valueOf(f());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(x());
            case 9:
                return Long.valueOf(E());
            case 10:
                return S(cls, c0768o);
            case 11:
                return Integer.valueOf(z());
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return Long.valueOf(r());
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return Integer.valueOf(h());
            case 14:
                return Long.valueOf(j());
            case 15:
                return F();
            case 16:
                return Integer.valueOf(w());
            case 17:
                return Long.valueOf(c());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private Object Q(e0 e0Var, C0768o c0768o) {
        int i7 = this.f9009c;
        this.f9009c = r0.c(r0.a(this.f9008b), 4);
        try {
            Object f7 = e0Var.f();
            e0Var.h(f7, this, c0768o);
            e0Var.b(f7);
            if (this.f9008b == this.f9009c) {
                return f7;
            }
            throw C0778z.g();
        } finally {
            this.f9009c = i7;
        }
    }

    private Object R(e0 e0Var, C0768o c0768o) {
        int C7 = this.f9007a.C();
        AbstractC0761h abstractC0761h = this.f9007a;
        if (abstractC0761h.f8964a >= abstractC0761h.f8965b) {
            throw C0778z.h();
        }
        int l7 = abstractC0761h.l(C7);
        Object f7 = e0Var.f();
        this.f9007a.f8964a++;
        e0Var.h(f7, this, c0768o);
        e0Var.b(f7);
        this.f9007a.a(0);
        r5.f8964a--;
        this.f9007a.k(l7);
        return f7;
    }

    private void U(int i7) {
        if (this.f9007a.d() != i7) {
            throw C0778z.k();
        }
    }

    private void V(int i7) {
        if (r0.b(this.f9008b) != i7) {
            throw C0778z.d();
        }
    }

    private void W(int i7) {
        if ((i7 & 3) != 0) {
            throw C0778z.g();
        }
    }

    private void X(int i7) {
        if ((i7 & 7) != 0) {
            throw C0778z.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void A(List list) {
        int B7;
        if (r0.b(this.f9008b) != 2) {
            throw C0778z.d();
        }
        do {
            list.add(u());
            if (this.f9007a.e()) {
                return;
            } else {
                B7 = this.f9007a.B();
            }
        } while (B7 == this.f9008b);
        this.f9010d = B7;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void B(List list) {
        int B7;
        if (list instanceof AbstractC0765l) {
            int b7 = r0.b(this.f9008b);
            if (b7 == 1) {
                this.f9007a.o();
                throw null;
            }
            if (b7 != 2) {
                throw C0778z.d();
            }
            X(this.f9007a.C());
            this.f9007a.d();
            this.f9007a.o();
            throw null;
        }
        int b8 = r0.b(this.f9008b);
        if (b8 == 1) {
            do {
                list.add(Double.valueOf(this.f9007a.o()));
                if (this.f9007a.e()) {
                    return;
                } else {
                    B7 = this.f9007a.B();
                }
            } while (B7 == this.f9008b);
            this.f9010d = B7;
            return;
        }
        if (b8 != 2) {
            throw C0778z.d();
        }
        int C7 = this.f9007a.C();
        X(C7);
        int d7 = this.f9007a.d() + C7;
        do {
            list.add(Double.valueOf(this.f9007a.o()));
        } while (this.f9007a.d() < d7);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void C(List list) {
        int B7;
        if (list instanceof F) {
            int b7 = r0.b(this.f9008b);
            if (b7 == 0) {
                this.f9007a.u();
                throw null;
            }
            if (b7 != 2) {
                throw C0778z.d();
            }
            this.f9007a.C();
            this.f9007a.d();
            this.f9007a.u();
            throw null;
        }
        int b8 = r0.b(this.f9008b);
        if (b8 == 0) {
            do {
                list.add(Long.valueOf(this.f9007a.u()));
                if (this.f9007a.e()) {
                    return;
                } else {
                    B7 = this.f9007a.B();
                }
            } while (B7 == this.f9008b);
            this.f9010d = B7;
            return;
        }
        if (b8 != 2) {
            throw C0778z.d();
        }
        int d7 = this.f9007a.d() + this.f9007a.C();
        do {
            list.add(Long.valueOf(this.f9007a.u()));
        } while (this.f9007a.d() < d7);
        U(d7);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void D(List list) {
        int B7;
        if (list instanceof F) {
            int b7 = r0.b(this.f9008b);
            if (b7 == 1) {
                this.f9007a.w();
                throw null;
            }
            if (b7 != 2) {
                throw C0778z.d();
            }
            X(this.f9007a.C());
            this.f9007a.d();
            this.f9007a.w();
            throw null;
        }
        int b8 = r0.b(this.f9008b);
        if (b8 == 1) {
            do {
                list.add(Long.valueOf(this.f9007a.w()));
                if (this.f9007a.e()) {
                    return;
                } else {
                    B7 = this.f9007a.B();
                }
            } while (B7 == this.f9008b);
            this.f9010d = B7;
            return;
        }
        if (b8 != 2) {
            throw C0778z.d();
        }
        int C7 = this.f9007a.C();
        X(C7);
        int d7 = this.f9007a.d() + C7;
        do {
            list.add(Long.valueOf(this.f9007a.w()));
        } while (this.f9007a.d() < d7);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long E() {
        V(0);
        return this.f9007a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public String F() {
        V(2);
        return this.f9007a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void G(List list) {
        int B7;
        if (list instanceof F) {
            int b7 = r0.b(this.f9008b);
            if (b7 == 1) {
                this.f9007a.r();
                throw null;
            }
            if (b7 != 2) {
                throw C0778z.d();
            }
            X(this.f9007a.C());
            this.f9007a.d();
            this.f9007a.r();
            throw null;
        }
        int b8 = r0.b(this.f9008b);
        if (b8 == 1) {
            do {
                list.add(Long.valueOf(this.f9007a.r()));
                if (this.f9007a.e()) {
                    return;
                } else {
                    B7 = this.f9007a.B();
                }
            } while (B7 == this.f9008b);
            this.f9010d = B7;
            return;
        }
        if (b8 != 2) {
            throw C0778z.d();
        }
        int C7 = this.f9007a.C();
        X(C7);
        int d7 = this.f9007a.d() + C7;
        do {
            list.add(Long.valueOf(this.f9007a.r()));
        } while (this.f9007a.d() < d7);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void H(List list) {
        int B7;
        if (list instanceof AbstractC0776x) {
            int b7 = r0.b(this.f9008b);
            if (b7 == 0) {
                this.f9007a.t();
                throw null;
            }
            if (b7 != 2) {
                throw C0778z.d();
            }
            this.f9007a.C();
            this.f9007a.d();
            this.f9007a.t();
            throw null;
        }
        int b8 = r0.b(this.f9008b);
        if (b8 == 0) {
            do {
                list.add(Integer.valueOf(this.f9007a.t()));
                if (this.f9007a.e()) {
                    return;
                } else {
                    B7 = this.f9007a.B();
                }
            } while (B7 == this.f9008b);
            this.f9010d = B7;
            return;
        }
        if (b8 != 2) {
            throw C0778z.d();
        }
        int d7 = this.f9007a.d() + this.f9007a.C();
        do {
            list.add(Integer.valueOf(this.f9007a.t()));
        } while (this.f9007a.d() < d7);
        U(d7);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void I(List list) {
        int B7;
        if (list instanceof AbstractC0776x) {
            int b7 = r0.b(this.f9008b);
            if (b7 == 0) {
                this.f9007a.p();
                throw null;
            }
            if (b7 != 2) {
                throw C0778z.d();
            }
            this.f9007a.C();
            this.f9007a.d();
            this.f9007a.p();
            throw null;
        }
        int b8 = r0.b(this.f9008b);
        if (b8 == 0) {
            do {
                list.add(Integer.valueOf(this.f9007a.p()));
                if (this.f9007a.e()) {
                    return;
                } else {
                    B7 = this.f9007a.B();
                }
            } while (B7 == this.f9008b);
            this.f9010d = B7;
            return;
        }
        if (b8 != 2) {
            throw C0778z.d();
        }
        int d7 = this.f9007a.d() + this.f9007a.C();
        do {
            list.add(Integer.valueOf(this.f9007a.p()));
        } while (this.f9007a.d() < d7);
        U(d7);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public Object J(e0 e0Var, C0768o c0768o) {
        V(2);
        return R(e0Var, c0768o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.f9007a.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K(java.util.Map r8, androidx.datastore.preferences.protobuf.H.a r9, androidx.datastore.preferences.protobuf.C0768o r10) {
        /*
            r7 = this;
            r0 = 2
            r7.V(r0)
            androidx.datastore.preferences.protobuf.h r1 = r7.f9007a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.h r2 = r7.f9007a
            int r1 = r2.l(r1)
            java.lang.Object r2 = r9.f8901b
            java.lang.Object r3 = r9.f8903d
        L14:
            int r4 = r7.p()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.h r5 = r7.f9007a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.y()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0778z.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.z r4 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0778z.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0778z.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0778z.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.r0$b r4 = r9.f8902c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0778z.a -> L51
            java.lang.Object r5 = r9.f8903d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0778z.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0778z.a -> L51
            java.lang.Object r3 = r7.P(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0778z.a -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.r0$b r4 = r9.f8900a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0778z.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.P(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0778z.a -> L51
            goto L14
        L51:
            boolean r4 = r7.y()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.z r8 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.h r8 = r7.f9007a
            r8.k(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.h r9 = r7.f9007a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0762i.K(java.util.Map, androidx.datastore.preferences.protobuf.H$a, androidx.datastore.preferences.protobuf.o):void");
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void L(List list, e0 e0Var, C0768o c0768o) {
        int B7;
        if (r0.b(this.f9008b) != 3) {
            throw C0778z.d();
        }
        int i7 = this.f9008b;
        do {
            list.add(Q(e0Var, c0768o));
            if (this.f9007a.e() || this.f9010d != 0) {
                return;
            } else {
                B7 = this.f9007a.B();
            }
        } while (B7 == i7);
        this.f9010d = B7;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void M(List list, e0 e0Var, C0768o c0768o) {
        int B7;
        if (r0.b(this.f9008b) != 2) {
            throw C0778z.d();
        }
        int i7 = this.f9008b;
        do {
            list.add(R(e0Var, c0768o));
            if (this.f9007a.e() || this.f9010d != 0) {
                return;
            } else {
                B7 = this.f9007a.B();
            }
        } while (B7 == i7);
        this.f9010d = B7;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public Object N(e0 e0Var, C0768o c0768o) {
        V(3);
        return Q(e0Var, c0768o);
    }

    public Object S(Class cls, C0768o c0768o) {
        V(2);
        return R(a0.a().c(cls), c0768o);
    }

    public void T(List list, boolean z7) {
        int B7;
        int B8;
        if (r0.b(this.f9008b) != 2) {
            throw C0778z.d();
        }
        if (!(list instanceof D) || z7) {
            do {
                list.add(z7 ? F() : m());
                if (this.f9007a.e()) {
                    return;
                } else {
                    B7 = this.f9007a.B();
                }
            } while (B7 == this.f9008b);
            this.f9010d = B7;
            return;
        }
        D d7 = (D) list;
        do {
            d7.H(u());
            if (this.f9007a.e()) {
                return;
            } else {
                B8 = this.f9007a.B();
            }
        } while (B8 == this.f9008b);
        this.f9010d = B8;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void a(List list) {
        int B7;
        if (list instanceof AbstractC0776x) {
            int b7 = r0.b(this.f9008b);
            if (b7 == 0) {
                this.f9007a.x();
                throw null;
            }
            if (b7 != 2) {
                throw C0778z.d();
            }
            this.f9007a.C();
            this.f9007a.d();
            this.f9007a.x();
            throw null;
        }
        int b8 = r0.b(this.f9008b);
        if (b8 == 0) {
            do {
                list.add(Integer.valueOf(this.f9007a.x()));
                if (this.f9007a.e()) {
                    return;
                } else {
                    B7 = this.f9007a.B();
                }
            } while (B7 == this.f9008b);
            this.f9010d = B7;
            return;
        }
        if (b8 != 2) {
            throw C0778z.d();
        }
        int d7 = this.f9007a.d() + this.f9007a.C();
        do {
            list.add(Integer.valueOf(this.f9007a.x()));
        } while (this.f9007a.d() < d7);
        U(d7);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int b() {
        V(0);
        return this.f9007a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long c() {
        V(0);
        return this.f9007a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void d(List list) {
        int B7;
        if (list instanceof AbstractC0776x) {
            int b7 = r0.b(this.f9008b);
            if (b7 != 2) {
                if (b7 != 5) {
                    throw C0778z.d();
                }
                this.f9007a.q();
                throw null;
            }
            W(this.f9007a.C());
            this.f9007a.d();
            this.f9007a.q();
            throw null;
        }
        int b8 = r0.b(this.f9008b);
        if (b8 == 2) {
            int C7 = this.f9007a.C();
            W(C7);
            int d7 = this.f9007a.d() + C7;
            do {
                list.add(Integer.valueOf(this.f9007a.q()));
            } while (this.f9007a.d() < d7);
            return;
        }
        if (b8 != 5) {
            throw C0778z.d();
        }
        do {
            list.add(Integer.valueOf(this.f9007a.q()));
            if (this.f9007a.e()) {
                return;
            } else {
                B7 = this.f9007a.B();
            }
        } while (B7 == this.f9008b);
        this.f9010d = B7;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int e() {
        return this.f9008b;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long f() {
        V(1);
        return this.f9007a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void g(List list) {
        int B7;
        if (list instanceof AbstractC0776x) {
            int b7 = r0.b(this.f9008b);
            if (b7 != 2) {
                if (b7 != 5) {
                    throw C0778z.d();
                }
                this.f9007a.v();
                throw null;
            }
            W(this.f9007a.C());
            this.f9007a.d();
            this.f9007a.v();
            throw null;
        }
        int b8 = r0.b(this.f9008b);
        if (b8 == 2) {
            int C7 = this.f9007a.C();
            W(C7);
            int d7 = this.f9007a.d() + C7;
            do {
                list.add(Integer.valueOf(this.f9007a.v()));
            } while (this.f9007a.d() < d7);
            return;
        }
        if (b8 != 5) {
            throw C0778z.d();
        }
        do {
            list.add(Integer.valueOf(this.f9007a.v()));
            if (this.f9007a.e()) {
                return;
            } else {
                B7 = this.f9007a.B();
            }
        } while (B7 == this.f9008b);
        this.f9010d = B7;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int h() {
        V(0);
        return this.f9007a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void i(List list) {
        int B7;
        if (list instanceof F) {
            int b7 = r0.b(this.f9008b);
            if (b7 == 0) {
                this.f9007a.y();
                throw null;
            }
            if (b7 != 2) {
                throw C0778z.d();
            }
            this.f9007a.C();
            this.f9007a.d();
            this.f9007a.y();
            throw null;
        }
        int b8 = r0.b(this.f9008b);
        if (b8 == 0) {
            do {
                list.add(Long.valueOf(this.f9007a.y()));
                if (this.f9007a.e()) {
                    return;
                } else {
                    B7 = this.f9007a.B();
                }
            } while (B7 == this.f9008b);
            this.f9010d = B7;
            return;
        }
        if (b8 != 2) {
            throw C0778z.d();
        }
        int d7 = this.f9007a.d() + this.f9007a.C();
        do {
            list.add(Long.valueOf(this.f9007a.y()));
        } while (this.f9007a.d() < d7);
        U(d7);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long j() {
        V(0);
        return this.f9007a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void k(List list) {
        int B7;
        if (list instanceof AbstractC0776x) {
            int b7 = r0.b(this.f9008b);
            if (b7 == 0) {
                this.f9007a.C();
                throw null;
            }
            if (b7 != 2) {
                throw C0778z.d();
            }
            this.f9007a.C();
            this.f9007a.d();
            this.f9007a.C();
            throw null;
        }
        int b8 = r0.b(this.f9008b);
        if (b8 == 0) {
            do {
                list.add(Integer.valueOf(this.f9007a.C()));
                if (this.f9007a.e()) {
                    return;
                } else {
                    B7 = this.f9007a.B();
                }
            } while (B7 == this.f9008b);
            this.f9010d = B7;
            return;
        }
        if (b8 != 2) {
            throw C0778z.d();
        }
        int d7 = this.f9007a.d() + this.f9007a.C();
        do {
            list.add(Integer.valueOf(this.f9007a.C()));
        } while (this.f9007a.d() < d7);
        U(d7);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void l(List list) {
        int B7;
        if (list instanceof AbstractC0758e) {
            int b7 = r0.b(this.f9008b);
            if (b7 == 0) {
                this.f9007a.m();
                throw null;
            }
            if (b7 != 2) {
                throw C0778z.d();
            }
            this.f9007a.C();
            this.f9007a.d();
            this.f9007a.m();
            throw null;
        }
        int b8 = r0.b(this.f9008b);
        if (b8 == 0) {
            do {
                list.add(Boolean.valueOf(this.f9007a.m()));
                if (this.f9007a.e()) {
                    return;
                } else {
                    B7 = this.f9007a.B();
                }
            } while (B7 == this.f9008b);
            this.f9010d = B7;
            return;
        }
        if (b8 != 2) {
            throw C0778z.d();
        }
        int d7 = this.f9007a.d() + this.f9007a.C();
        do {
            list.add(Boolean.valueOf(this.f9007a.m()));
        } while (this.f9007a.d() < d7);
        U(d7);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public String m() {
        V(2);
        return this.f9007a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int n() {
        V(5);
        return this.f9007a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public boolean o() {
        V(0);
        return this.f9007a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int p() {
        int i7 = this.f9010d;
        if (i7 != 0) {
            this.f9008b = i7;
            this.f9010d = 0;
        } else {
            this.f9008b = this.f9007a.B();
        }
        int i8 = this.f9008b;
        if (i8 == 0 || i8 == this.f9009c) {
            return Integer.MAX_VALUE;
        }
        return r0.a(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void q(List list) {
        T(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long r() {
        V(1);
        return this.f9007a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public double readDouble() {
        V(1);
        return this.f9007a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public float readFloat() {
        V(5);
        return this.f9007a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void s(List list) {
        int B7;
        if (list instanceof F) {
            int b7 = r0.b(this.f9008b);
            if (b7 == 0) {
                this.f9007a.D();
                throw null;
            }
            if (b7 != 2) {
                throw C0778z.d();
            }
            this.f9007a.C();
            this.f9007a.d();
            this.f9007a.D();
            throw null;
        }
        int b8 = r0.b(this.f9008b);
        if (b8 == 0) {
            do {
                list.add(Long.valueOf(this.f9007a.D()));
                if (this.f9007a.e()) {
                    return;
                } else {
                    B7 = this.f9007a.B();
                }
            } while (B7 == this.f9008b);
            this.f9010d = B7;
            return;
        }
        if (b8 != 2) {
            throw C0778z.d();
        }
        int d7 = this.f9007a.d() + this.f9007a.C();
        do {
            list.add(Long.valueOf(this.f9007a.D()));
        } while (this.f9007a.d() < d7);
        U(d7);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void t(List list) {
        T(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public AbstractC0760g u() {
        V(2);
        return this.f9007a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void v(List list) {
        int B7;
        if (list instanceof AbstractC0773u) {
            int b7 = r0.b(this.f9008b);
            if (b7 != 2) {
                if (b7 != 5) {
                    throw C0778z.d();
                }
                this.f9007a.s();
                throw null;
            }
            W(this.f9007a.C());
            this.f9007a.d();
            this.f9007a.s();
            throw null;
        }
        int b8 = r0.b(this.f9008b);
        if (b8 == 2) {
            int C7 = this.f9007a.C();
            W(C7);
            int d7 = this.f9007a.d() + C7;
            do {
                list.add(Float.valueOf(this.f9007a.s()));
            } while (this.f9007a.d() < d7);
            return;
        }
        if (b8 != 5) {
            throw C0778z.d();
        }
        do {
            list.add(Float.valueOf(this.f9007a.s()));
            if (this.f9007a.e()) {
                return;
            } else {
                B7 = this.f9007a.B();
            }
        } while (B7 == this.f9008b);
        this.f9010d = B7;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int w() {
        V(0);
        return this.f9007a.C();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int x() {
        V(0);
        return this.f9007a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public boolean y() {
        int i7;
        if (this.f9007a.e() || (i7 = this.f9008b) == this.f9009c) {
            return false;
        }
        return this.f9007a.E(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int z() {
        V(5);
        return this.f9007a.v();
    }
}
