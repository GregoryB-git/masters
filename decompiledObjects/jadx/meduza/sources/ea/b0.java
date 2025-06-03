package ea;

import com.pichillilorenzo.flutter_inappwebview_android.R;

/* loaded from: classes.dex */
public final class b0 implements a0 {
    public static final double f = Math.random();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f4865g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final u7.f f4866a;

    /* renamed from: b, reason: collision with root package name */
    public final u9.d f4867b;

    /* renamed from: c, reason: collision with root package name */
    public final ga.h f4868c;

    /* renamed from: d, reason: collision with root package name */
    public final l f4869d;

    /* renamed from: e, reason: collision with root package name */
    public final ub.h f4870e;

    @wb.e(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {R.styleable.AppCompatTheme_dialogTheme, R.styleable.AppCompatTheme_dividerHorizontal, R.styleable.AppCompatTheme_editTextStyle}, m = "invokeSuspend")
    public static final class a extends wb.i implements dc.p<nc.d0, ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public q f4871a;

        /* renamed from: b, reason: collision with root package name */
        public b0 f4872b;

        /* renamed from: c, reason: collision with root package name */
        public z f4873c;

        /* renamed from: d, reason: collision with root package name */
        public u7.f f4874d;

        /* renamed from: e, reason: collision with root package name */
        public x f4875e;
        public ga.h f;

        /* renamed from: o, reason: collision with root package name */
        public int f4876o;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ x f4878q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar, ub.e<? super a> eVar) {
            super(2, eVar);
            this.f4878q = xVar;
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            return b0.this.new a(this.f4878q, eVar);
        }

        @Override // dc.p
        public final Object invoke(nc.d0 d0Var, ub.e<? super rb.h> eVar) {
            return ((a) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00d6  */
        @Override // wb.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ea.b0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b0(u7.f fVar, u9.d dVar, ga.h hVar, k kVar, ub.h hVar2) {
        this.f4866a = fVar;
        this.f4867b = dVar;
        this.f4868c = hVar;
        this.f4869d = kVar;
        this.f4870e = hVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(ea.b0 r5, ub.e r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof ea.c0
            if (r0 == 0) goto L16
            r0 = r6
            ea.c0 r0 = (ea.c0) r0
            int r1 = r0.f4888d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f4888d = r1
            goto L1b
        L16:
            ea.c0 r0 = new ea.c0
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f4886b
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f4888d
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            ea.b0 r5 = r0.f4885a
            rb.f.b(r6)
            goto L4b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            rb.f.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            ga.h r6 = r5.f4868c
            r0.f4885a = r5
            r0.f4888d = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4b
            goto L87
        L4b:
            ga.h r6 = r5.f4868c
            ga.j r0 = r6.f6139a
            java.lang.Boolean r0 = r0.a()
            if (r0 == 0) goto L5a
            boolean r6 = r0.booleanValue()
            goto L68
        L5a:
            ga.j r6 = r6.f6140b
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L67
            boolean r6 = r6.booleanValue()
            goto L68
        L67:
            r6 = r4
        L68:
            if (r6 != 0) goto L6d
            java.lang.String r5 = "Sessions SDK disabled. Events will not be sent."
            goto L7f
        L6d:
            double r0 = ea.b0.f
            ga.h r5 = r5.f4868c
            double r5 = r5.a()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L7a
            goto L7b
        L7a:
            r4 = 0
        L7b:
            if (r4 != 0) goto L85
            java.lang.String r5 = "Sessions SDK has dropped this session due to sampling."
        L7f:
            android.util.Log.d(r3, r5)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L87
        L85:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.b0.b(ea.b0, ub.e):java.lang.Object");
    }

    @Override // ea.a0
    public final void a(x xVar) {
        x6.b.g0(nc.e0.a(this.f4870e), null, new a(xVar, null), 3);
    }
}
