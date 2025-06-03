package o0;

/* loaded from: classes.dex */
public final class v implements qc.f<b0<Object>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qc.f f11678a;

    @wb.e(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
    public static final class a extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f11679a;

        /* renamed from: b, reason: collision with root package name */
        public int f11680b;

        public a(ub.e eVar) {
            super(eVar);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f11679a = obj;
            this.f11680b |= Integer.MIN_VALUE;
            return v.this.emit(null, this);
        }
    }

    public v(qc.f fVar) {
        this.f11678a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qc.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(o0.b0<java.lang.Object> r5, ub.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o0.v.a
            if (r0 == 0) goto L13
            r0 = r6
            o0.v$a r0 = (o0.v.a) r0
            int r1 = r0.f11680b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11680b = r1
            goto L18
        L13:
            o0.v$a r0 = new o0.v$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f11679a
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f11680b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            rb.f.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            rb.f.b(r6)
            qc.f r6 = r4.f11678a
            o0.b0 r5 = (o0.b0) r5
            boolean r2 = r5 instanceof o0.l
            if (r2 != 0) goto L6d
            boolean r2 = r5 instanceof o0.j
            if (r2 != 0) goto L68
            boolean r2 = r5 instanceof o0.c
            if (r2 == 0) goto L52
            o0.c r5 = (o0.c) r5
            T r5 = r5.f11583a
            r0.f11680b = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            rb.h r5 = rb.h.f13851a
            return r5
        L52:
            boolean r5 = r5 instanceof o0.c0
            if (r5 == 0) goto L62
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L62:
            n7.w r5 = new n7.w
            r5.<init>()
            throw r5
        L68:
            o0.j r5 = (o0.j) r5
            java.lang.Throwable r5 = r5.f11603a
            throw r5
        L6d:
            o0.l r5 = (o0.l) r5
            java.lang.Throwable r5 = r5.f11604a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.v.emit(java.lang.Object, ub.e):java.lang.Object");
    }
}
