package qc;

/* loaded from: classes.dex */
public final class b<T> extends c<T> {

    /* renamed from: e, reason: collision with root package name */
    public final dc.p<pc.q<? super T>, ub.e<? super rb.h>, Object> f13389e;

    @wb.e(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {334}, m = "collectTo")
    public static final class a extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public pc.q f13390a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13391b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b<T> f13392c;

        /* renamed from: d, reason: collision with root package name */
        public int f13393d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, ub.e<? super a> eVar) {
            super(eVar);
            this.f13392c = bVar;
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f13391b = obj;
            this.f13393d |= Integer.MIN_VALUE;
            return this.f13392c.b(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(dc.p<? super pc.q<? super T>, ? super ub.e<? super rb.h>, ? extends Object> pVar, ub.h hVar, int i10, pc.a aVar) {
        super(pVar, hVar, i10, aVar);
        this.f13389e = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // rc.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(pc.q<? super T> r5, ub.e<? super rb.h> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof qc.b.a
            if (r0 == 0) goto L13
            r0 = r6
            qc.b$a r0 = (qc.b.a) r0
            int r1 = r0.f13393d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13393d = r1
            goto L18
        L13:
            qc.b$a r0 = new qc.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f13391b
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f13393d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            pc.q r5 = r0.f13390a
            rb.f.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            rb.f.b(r6)
            r0.f13390a = r5
            r0.f13393d = r3
            dc.p<pc.q<? super T>, ub.e<? super rb.h>, java.lang.Object> r6 = r4.f13394d
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L41
            goto L43
        L41:
            rb.h r6 = rb.h.f13851a
        L43:
            if (r6 != r1) goto L46
            return r1
        L46:
            boolean r5 = r5.m()
            if (r5 == 0) goto L4f
            rb.h r5 = rb.h.f13851a
            return r5
        L4f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.b.b(pc.q, ub.e):java.lang.Object");
    }

    @Override // rc.f
    public final rc.f<T> c(ub.h hVar, int i10, pc.a aVar) {
        return new b(this.f13389e, hVar, i10, aVar);
    }
}
