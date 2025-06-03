package qc;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import eb.y;
import qc.h;

/* loaded from: classes.dex */
public final class d<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e<T> f13395a;

    /* renamed from: b, reason: collision with root package name */
    public final dc.l<T, Object> f13396b;

    /* renamed from: c, reason: collision with root package name */
    public final dc.p<Object, Object, Boolean> f13397c;

    public static final class a<T> implements f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<T> f13398a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ec.s<Object> f13399b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f<T> f13400c;

        @wb.e(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {R.styleable.AppCompatTheme_listMenuViewStyle}, m = "emit")
        /* renamed from: qc.d$a$a, reason: collision with other inner class name */
        public static final class C0202a extends wb.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f13401a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a<T> f13402b;

            /* renamed from: c, reason: collision with root package name */
            public int f13403c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0202a(a<? super T> aVar, ub.e<? super C0202a> eVar) {
                super(eVar);
                this.f13402b = aVar;
            }

            @Override // wb.a
            public final Object invokeSuspend(Object obj) {
                this.f13401a = obj;
                this.f13403c |= Integer.MIN_VALUE;
                return this.f13402b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(d<T> dVar, ec.s<Object> sVar, f<? super T> fVar) {
            this.f13398a = dVar;
            this.f13399b = sVar;
            this.f13400c = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // qc.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, ub.e<? super rb.h> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof qc.d.a.C0202a
                if (r0 == 0) goto L13
                r0 = r7
                qc.d$a$a r0 = (qc.d.a.C0202a) r0
                int r1 = r0.f13403c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13403c = r1
                goto L18
            L13:
                qc.d$a$a r0 = new qc.d$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f13401a
                vb.a r1 = vb.a.f16085a
                int r2 = r0.f13403c
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                rb.f.b(r7)
                goto L65
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                rb.f.b(r7)
                qc.d<T> r7 = r5.f13398a
                dc.l<T, java.lang.Object> r7 = r7.f13396b
                java.lang.Object r7 = r7.invoke(r6)
                ec.s<java.lang.Object> r2 = r5.f13399b
                T r2 = r2.f5272a
                d2.h0 r4 = eb.y.f5255b
                if (r2 == r4) goto L56
                qc.d<T> r4 = r5.f13398a
                dc.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f13397c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L53
                goto L56
            L53:
                rb.h r6 = rb.h.f13851a
                return r6
            L56:
                ec.s<java.lang.Object> r2 = r5.f13399b
                r2.f5272a = r7
                qc.f<T> r7 = r5.f13400c
                r0.f13403c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L65
                return r1
            L65:
                rb.h r6 = rb.h.f13851a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: qc.d.a.emit(java.lang.Object, ub.e):java.lang.Object");
        }
    }

    public d(t2.f fVar, h.b bVar, h.a aVar) {
        this.f13395a = fVar;
        this.f13396b = bVar;
        this.f13397c = aVar;
    }

    @Override // qc.e
    public final Object collect(f<? super T> fVar, ub.e<? super rb.h> eVar) {
        ec.s sVar = new ec.s();
        sVar.f5272a = (T) y.f5255b;
        Object collect = this.f13395a.collect(new a(this, sVar, fVar), eVar);
        return collect == vb.a.f16085a ? collect : rb.h.f13851a;
    }
}
