package qc;

/* loaded from: classes.dex */
public abstract class a<T> implements e<T> {

    @wb.e(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: qc.a$a, reason: collision with other inner class name */
    public static final class C0201a extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public rc.o f13385a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13386b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<T> f13387c;

        /* renamed from: d, reason: collision with root package name */
        public int f13388d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0201a(a<T> aVar, ub.e<? super C0201a> eVar) {
            super(eVar);
            this.f13387c = aVar;
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f13386b = obj;
            this.f13388d |= Integer.MIN_VALUE;
            return this.f13387c.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qc.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(qc.f<? super T> r6, ub.e<? super rb.h> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qc.a.C0201a
            if (r0 == 0) goto L13
            r0 = r7
            qc.a$a r0 = (qc.a.C0201a) r0
            int r1 = r0.f13388d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13388d = r1
            goto L18
        L13:
            qc.a$a r0 = new qc.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13386b
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f13388d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            rc.o r6 = r0.f13385a
            rb.f.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L55
        L29:
            r7 = move-exception
            goto L5f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            rb.f.b(r7)
            rc.o r7 = new rc.o
            ub.h r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f13385a = r7     // Catch: java.lang.Throwable -> L5b
            r0.f13388d = r3     // Catch: java.lang.Throwable -> L5b
            r6 = r5
            qc.r r6 = (qc.r) r6     // Catch: java.lang.Throwable -> L5b
            dc.p<qc.f<? super T>, ub.e<? super rb.h>, java.lang.Object> r6 = r6.f13447a     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L5b
            if (r6 != r1) goto L4f
            goto L51
        L4f:
            rb.h r6 = rb.h.f13851a     // Catch: java.lang.Throwable -> L5b
        L51:
            if (r6 != r1) goto L54
            return r1
        L54:
            r6 = r7
        L55:
            r6.releaseIntercepted()
            rb.h r6 = rb.h.f13851a
            return r6
        L5b:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L5f:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.a.collect(qc.f, ub.e):java.lang.Object");
    }
}
