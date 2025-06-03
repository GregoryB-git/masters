package qc;

import com.pichillilorenzo.flutter_inappwebview_android.R;

/* loaded from: classes.dex */
public final class l<T> implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec.r f13429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f<T> f13430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dc.p<T, ub.e<? super Boolean>, Object> f13431c;

    @wb.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {R.styleable.AppCompatTheme_alertDialogStyle, R.styleable.AppCompatTheme_alertDialogTheme, 40}, m = "emit")
    public static final class a extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public l f13432a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13433b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f13434c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<T> f13435d;

        /* renamed from: e, reason: collision with root package name */
        public int f13436e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super T> lVar, ub.e<? super a> eVar) {
            super(eVar);
            this.f13435d = lVar;
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f13434c = obj;
            this.f13436e |= Integer.MIN_VALUE;
            return this.f13435d.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(ec.r rVar, f<? super T> fVar, dc.p<? super T, ? super ub.e<? super Boolean>, ? extends Object> pVar) {
        this.f13429a = rVar;
        this.f13430b = fVar;
        this.f13431c = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // qc.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r7, ub.e<? super rb.h> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof qc.l.a
            if (r0 == 0) goto L13
            r0 = r8
            qc.l$a r0 = (qc.l.a) r0
            int r1 = r0.f13436e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13436e = r1
            goto L18
        L13:
            qc.l$a r0 = new qc.l$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f13434c
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f13436e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            rb.f.b(r8)
            goto L84
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f13433b
            qc.l r2 = r0.f13432a
            rb.f.b(r8)
            goto L68
        L3d:
            rb.f.b(r8)
            goto L55
        L41:
            rb.f.b(r8)
            ec.r r8 = r6.f13429a
            boolean r8 = r8.f5271a
            if (r8 == 0) goto L58
            qc.f<T> r8 = r6.f13430b
            r0.f13436e = r5
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            rb.h r7 = rb.h.f13851a
            return r7
        L58:
            dc.p<T, ub.e<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f13431c
            r0.f13432a = r6
            r0.f13433b = r7
            r0.f13436e = r4
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r2 = r6
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L87
            ec.r r8 = r2.f13429a
            r8.f5271a = r5
            qc.f<T> r8 = r2.f13430b
            r2 = 0
            r0.f13432a = r2
            r0.f13433b = r2
            r0.f13436e = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L84
            return r1
        L84:
            rb.h r7 = rb.h.f13851a
            return r7
        L87:
            rb.h r7 = rb.h.f13851a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.l.emit(java.lang.Object, ub.e):java.lang.Object");
    }
}
