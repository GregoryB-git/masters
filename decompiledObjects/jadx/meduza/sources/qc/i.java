package qc;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import ea.w;

/* loaded from: classes.dex */
public final class i implements e<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f13413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dc.q f13414b;

    @wb.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect")
    public static final class a extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f13415a;

        /* renamed from: b, reason: collision with root package name */
        public int f13416b;

        /* renamed from: d, reason: collision with root package name */
        public i f13418d;

        /* renamed from: e, reason: collision with root package name */
        public f f13419e;

        public a(ub.e eVar) {
            super(eVar);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f13415a = obj;
            this.f13416b |= Integer.MIN_VALUE;
            return i.this.collect(null, this);
        }
    }

    public i(e eVar, w.e eVar2) {
        this.f13413a = eVar;
        this.f13414b = eVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // qc.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(qc.f<? super java.lang.Object> r6, ub.e<? super rb.h> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qc.i.a
            if (r0 == 0) goto L13
            r0 = r7
            qc.i$a r0 = (qc.i.a) r0
            int r1 = r0.f13416b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13416b = r1
            goto L18
        L13:
            qc.i$a r0 = new qc.i$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13415a
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f13416b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            rb.f.b(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            qc.f r6 = r0.f13419e
            qc.i r2 = r0.f13418d
            rb.f.b(r7)
            goto L4d
        L3a:
            rb.f.b(r7)
            qc.e r7 = r5.f13413a
            r0.f13418d = r5
            r0.f13419e = r6
            r0.f13416b = r4
            java.io.Serializable r7 = x6.b.k(r0, r7, r6)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L61
            dc.q r2 = r2.f13414b
            r4 = 0
            r0.f13418d = r4
            r0.f13419e = r4
            r0.f13416b = r3
            java.lang.Object r6 = r2.f(r6, r7, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            rb.h r6 = rb.h.f13851a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.i.collect(qc.f, ub.e):java.lang.Object");
    }
}
