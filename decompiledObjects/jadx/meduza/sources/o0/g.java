package o0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.Iterator;
import java.util.List;

@wb.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle, R.styleable.AppCompatTheme_buttonStyle}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends wb.i implements dc.p<Object, ub.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f11594a;

    /* renamed from: b, reason: collision with root package name */
    public d f11595b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11596c;

    /* renamed from: d, reason: collision with root package name */
    public int f11597d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f11598e;
    public final /* synthetic */ List<d<Object>> f;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List<dc.l<ub.e<? super rb.h>, Object>> f11599o;

    @wb.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {R.styleable.AppCompatTheme_buttonBarStyle}, m = "invokeSuspend")
    public static final class a extends wb.i implements dc.l<ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11600a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d<Object> f11601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<Object> dVar, ub.e<? super a> eVar) {
            super(1, eVar);
            this.f11601b = dVar;
        }

        @Override // wb.a
        public final ub.e<rb.h> create(ub.e<?> eVar) {
            return new a(this.f11601b, eVar);
        }

        @Override // dc.l
        public final Object invoke(ub.e<? super rb.h> eVar) {
            return ((a) create(eVar)).invokeSuspend(rb.h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            vb.a aVar = vb.a.f16085a;
            int i10 = this.f11600a;
            if (i10 == 0) {
                rb.f.b(obj);
                d<Object> dVar = this.f11601b;
                this.f11600a = 1;
                if (dVar.a() == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rb.f.b(obj);
            }
            return rb.h.f13851a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends d<Object>> list, List<dc.l<ub.e<? super rb.h>, Object>> list2, ub.e<? super g> eVar) {
        super(2, eVar);
        this.f = list;
        this.f11599o = list2;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        g gVar = new g(this.f, this.f11599o, eVar);
        gVar.f11598e = obj;
        return gVar;
    }

    @Override // dc.p
    public final Object invoke(Object obj, ub.e<Object> eVar) {
        return ((g) create(obj, eVar)).invokeSuspend(rb.h.f13851a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    @Override // wb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            vb.a r0 = vb.a.f16085a
            int r1 = r10.f11597d
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L1e
            if (r1 != r3) goto L16
            java.util.Iterator r1 = r10.f11594a
            java.lang.Object r4 = r10.f11598e
            java.util.List r4 = (java.util.List) r4
            rb.f.b(r11)
            goto L3a
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            java.lang.Object r1 = r10.f11596c
            o0.d r4 = r10.f11595b
            java.util.Iterator r5 = r10.f11594a
            java.lang.Object r6 = r10.f11598e
            java.util.List r6 = (java.util.List) r6
            rb.f.b(r11)
            r7 = r10
            goto L60
        L2d:
            rb.f.b(r11)
            java.lang.Object r11 = r10.f11598e
            java.util.List<o0.d<java.lang.Object>> r1 = r10.f
            java.util.List<dc.l<ub.e<? super rb.h>, java.lang.Object>> r4 = r10.f11599o
            java.util.Iterator r1 = r1.iterator()
        L3a:
            r5 = r10
        L3b:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L87
            java.lang.Object r6 = r1.next()
            o0.d r6 = (o0.d) r6
            r5.f11598e = r4
            r5.f11594a = r1
            r5.f11595b = r6
            r5.f11596c = r11
            r5.f11597d = r2
            java.lang.Object r7 = r6.c()
            if (r7 != r0) goto L58
            return r0
        L58:
            r8 = r1
            r1 = r11
            r11 = r7
            r7 = r5
            r5 = r8
            r9 = r6
            r6 = r4
            r4 = r9
        L60:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L82
            o0.g$a r11 = new o0.g$a
            r1 = 0
            r11.<init>(r4, r1)
            r6.add(r11)
            r7.f11598e = r6
            r7.f11594a = r5
            r7.f11595b = r1
            r7.f11596c = r1
            r7.f11597d = r3
            java.lang.Object r11 = r4.b()
            if (r11 != r0) goto L83
            return r0
        L82:
            r11 = r1
        L83:
            r1 = r5
            r4 = r6
            r5 = r7
            goto L3b
        L87:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
