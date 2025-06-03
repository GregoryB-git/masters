package qc;

/* loaded from: classes.dex */
public final class w<T> implements f<T> {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, rc.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rb.h a(ub.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof qc.v
            if (r0 == 0) goto L13
            r0 = r5
            qc.v r0 = (qc.v) r0
            int r1 = r0.f13462e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13462e = r1
            goto L18
        L13:
            qc.v r0 = new qc.v
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13460c
            vb.a r1 = vb.a.f16085a
            int r1 = r0.f13462e
            r2 = 1
            if (r1 == 0) goto L42
            if (r1 == r2) goto L34
            r0 = 2
            if (r1 != r0) goto L2c
            rb.f.b(r5)
        L29:
            rb.h r5 = rb.h.f13851a
            return r5
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L34:
            rc.o r1 = r0.f13459b
            qc.w r0 = r0.f13458a
            rb.f.b(r5)     // Catch: java.lang.Throwable -> L56
            r1.releaseIntercepted()
            r0.getClass()
            goto L29
        L42:
            rb.f.b(r5)
            rc.o r1 = new rc.o
            ub.h r5 = r0.getContext()
            r3 = 0
            r1.<init>(r3, r5)
            r0.f13458a = r4     // Catch: java.lang.Throwable -> L56
            r0.f13459b = r1     // Catch: java.lang.Throwable -> L56
            r0.f13462e = r2     // Catch: java.lang.Throwable -> L56
            throw r3     // Catch: java.lang.Throwable -> L56
        L56:
            r5 = move-exception
            r1.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.w.a(ub.e):rb.h");
    }

    @Override // qc.f
    public final Object emit(T t, ub.e<? super rb.h> eVar) {
        throw null;
    }
}
