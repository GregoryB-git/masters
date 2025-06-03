package s6;

/* loaded from: classes.dex */
public abstract class a implements b {

    /* renamed from: s6.a$a, reason: collision with other inner class name */
    public static final class C0268a extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f19318o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f19319p;

        /* renamed from: r, reason: collision with root package name */
        public int f19321r;

        public C0268a(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f19319p = obj;
            this.f19321r |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // s6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(s6.c r6, X5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s6.a.C0268a
            if (r0 == 0) goto L13
            r0 = r7
            s6.a$a r0 = (s6.a.C0268a) r0
            int r1 = r0.f19321r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19321r = r1
            goto L18
        L13:
            s6.a$a r0 = new s6.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19319p
            java.lang.Object r1 = Y5.b.c()
            int r2 = r0.f19321r
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f19318o
            t6.i r6 = (t6.i) r6
            V5.o.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            V5.o.b(r7)
            t6.i r7 = new t6.i
            X5.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f19318o = r7     // Catch: java.lang.Throwable -> L55
            r0.f19321r = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            V5.t r6 = V5.t.f6803a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.a.a(s6.c, X5.d):java.lang.Object");
    }

    public abstract Object b(c cVar, X5.d dVar);
}
