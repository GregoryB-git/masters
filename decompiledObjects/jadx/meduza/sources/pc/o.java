package pc;

/* loaded from: classes.dex */
public final class o {

    @wb.e(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
    public static final class a extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public q f13167a;

        /* renamed from: b, reason: collision with root package name */
        public dc.a f13168b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f13169c;

        /* renamed from: d, reason: collision with root package name */
        public int f13170d;

        public a(ub.e<? super a> eVar) {
            super(eVar);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f13169c = obj;
            this.f13170d |= Integer.MIN_VALUE;
            return o.a(null, null, this);
        }
    }

    public static final class b extends ec.j implements dc.l<Throwable, rb.h> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nc.k<rb.h> f13171a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(nc.l lVar) {
            super(1);
            this.f13171a = lVar;
        }

        @Override // dc.l
        public final rb.h invoke(Throwable th) {
            nc.k<rb.h> kVar = this.f13171a;
            rb.h hVar = rb.h.f13851a;
            kVar.resumeWith(hVar);
            return hVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(pc.q<?> r4, dc.a<rb.h> r5, ub.e<? super rb.h> r6) {
        /*
            boolean r0 = r6 instanceof pc.o.a
            if (r0 == 0) goto L13
            r0 = r6
            pc.o$a r0 = (pc.o.a) r0
            int r1 = r0.f13170d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13170d = r1
            goto L18
        L13:
            pc.o$a r0 = new pc.o$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f13169c
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f13170d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dc.a r5 = r0.f13168b
            rb.f.b(r6)     // Catch: java.lang.Throwable -> L6c
            goto L66
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            rb.f.b(r6)
            ub.h r6 = r0.getContext()
            nc.j1$b r2 = nc.j1.b.f11509a
            ub.h$b r6 = r6.get(r2)
            if (r6 != r4) goto L42
            r6 = r3
            goto L43
        L42:
            r6 = 0
        L43:
            if (r6 == 0) goto L71
            r0.f13167a = r4     // Catch: java.lang.Throwable -> L6c
            r0.f13168b = r5     // Catch: java.lang.Throwable -> L6c
            r0.f13170d = r3     // Catch: java.lang.Throwable -> L6c
            nc.l r6 = new nc.l     // Catch: java.lang.Throwable -> L6c
            ub.e r0 = p2.m0.P(r0)     // Catch: java.lang.Throwable -> L6c
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L6c
            r6.t()     // Catch: java.lang.Throwable -> L6c
            pc.o$b r0 = new pc.o$b     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L6c
            r4.a(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r4 = r6.s()     // Catch: java.lang.Throwable -> L6c
            if (r4 != r1) goto L66
            return r1
        L66:
            r5.invoke()
            rb.h r4 = rb.h.f13851a
            return r4
        L6c:
            r4 = move-exception
            r5.invoke()
            throw r4
        L71:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.o.a(pc.q, dc.a, ub.e):java.lang.Object");
    }
}
