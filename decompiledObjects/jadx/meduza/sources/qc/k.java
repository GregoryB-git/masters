package qc;

/* loaded from: classes.dex */
public final class k<T> implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f<T> f13423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ec.s<Throwable> f13424b;

    @wb.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {158}, m = "emit")
    public static final class a extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public k f13425a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13426b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k<T> f13427c;

        /* renamed from: d, reason: collision with root package name */
        public int f13428d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(k<? super T> kVar, ub.e<? super a> eVar) {
            super(eVar);
            this.f13427c = kVar;
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f13426b = obj;
            this.f13428d |= Integer.MIN_VALUE;
            return this.f13427c.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(f<? super T> fVar, ec.s<Throwable> sVar) {
        this.f13423a = fVar;
        this.f13424b = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qc.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r5, ub.e<? super rb.h> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof qc.k.a
            if (r0 == 0) goto L13
            r0 = r6
            qc.k$a r0 = (qc.k.a) r0
            int r1 = r0.f13428d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13428d = r1
            goto L18
        L13:
            qc.k$a r0 = new qc.k$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f13426b
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f13428d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            qc.k r5 = r0.f13425a
            rb.f.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L43
        L29:
            r6 = move-exception
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            rb.f.b(r6)
            qc.f<T> r6 = r4.f13423a     // Catch: java.lang.Throwable -> L46
            r0.f13425a = r4     // Catch: java.lang.Throwable -> L46
            r0.f13428d = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L46
            if (r5 != r1) goto L43
            return r1
        L43:
            rb.h r5 = rb.h.f13851a
            return r5
        L46:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L49:
            ec.s<java.lang.Throwable> r5 = r5.f13424b
            r5.f5272a = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.k.emit(java.lang.Object, ub.e):java.lang.Object");
    }
}
