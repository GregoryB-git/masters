package o0;

import o0.q;

@wb.e(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends wb.i implements dc.p<q.a<Object>, ub.e<? super rb.h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f11670a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q<Object> f11672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q<Object> qVar, ub.e<? super t> eVar) {
        super(2, eVar);
        this.f11672c = qVar;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        t tVar = new t(this.f11672c, eVar);
        tVar.f11671b = obj;
        return tVar;
    }

    @Override // dc.p
    public final Object invoke(q.a<Object> aVar, ub.e<? super rb.h> eVar) {
        return ((t) create(aVar, eVar)).invokeSuspend(rb.h.f13851a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r5 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r5 == r0) goto L30;
     */
    @Override // wb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            vb.a r0 = vb.a.f16085a
            int r1 = r4.f11670a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            rb.f.b(r5)
            goto L7b
        L19:
            rb.f.b(r5)
            java.lang.Object r5 = r4.f11671b
            o0.q$a r5 = (o0.q.a) r5
            boolean r1 = r5 instanceof o0.q.a.C0183a
            if (r1 == 0) goto L6a
            o0.q<java.lang.Object> r1 = r4.f11672c
            o0.q$a$a r5 = (o0.q.a.C0183a) r5
            r4.f11670a = r3
            qc.t r2 = r1.f11623h
            java.lang.Object r2 = r2.b()
            o0.b0 r2 = (o0.b0) r2
            boolean r3 = r2 instanceof o0.c
            if (r3 == 0) goto L37
            goto L59
        L37:
            boolean r3 = r2 instanceof o0.l
            if (r3 == 0) goto L46
            o0.b0<T> r5 = r5.f11626a
            if (r2 != r5) goto L59
            java.lang.Object r5 = r1.f(r4)
            if (r5 != r0) goto L59
            goto L5b
        L46:
            o0.c0 r5 = o0.c0.f11585a
            boolean r5 = ec.i.a(r2, r5)
            if (r5 == 0) goto L55
            java.lang.Object r5 = r1.f(r4)
            if (r5 != r0) goto L59
            goto L5b
        L55:
            boolean r5 = r2 instanceof o0.j
            if (r5 != 0) goto L5e
        L59:
            rb.h r5 = rb.h.f13851a
        L5b:
            if (r5 != r0) goto L7b
            return r0
        L5e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L6a:
            boolean r1 = r5 instanceof o0.q.a.b
            if (r1 == 0) goto L7b
            o0.q<java.lang.Object> r1 = r4.f11672c
            o0.q$a$b r5 = (o0.q.a.b) r5
            r4.f11670a = r2
            java.lang.Object r5 = o0.q.b(r1, r5, r4)
            if (r5 != r0) goto L7b
            return r0
        L7b:
            rb.h r5 = rb.h.f13851a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
