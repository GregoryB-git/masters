package t2;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import dc.p;
import nc.d0;
import wb.i;
import x2.s;

@wb.e(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {R.styleable.AppCompatTheme_colorControlHighlight}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends i implements p<d0, ub.e<? super rb.h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f14426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f14427c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f14428d;

    public static final class a<T> implements qc.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f14429a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f14430b;

        public a(d dVar, s sVar) {
            this.f14429a = dVar;
            this.f14430b = sVar;
        }

        @Override // qc.f
        public final Object emit(Object obj, ub.e eVar) {
            this.f14429a.d(this.f14430b, (b) obj);
            return rb.h.f13851a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, s sVar, d dVar, ub.e<? super g> eVar2) {
        super(2, eVar2);
        this.f14426b = eVar;
        this.f14427c = sVar;
        this.f14428d = dVar;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        return new g(this.f14426b, this.f14427c, this.f14428d, eVar);
    }

    @Override // dc.p
    public final Object invoke(d0 d0Var, ub.e<? super rb.h> eVar) {
        return ((g) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r4.f13397c == r3) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // wb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            vb.a r0 = vb.a.f16085a
            int r1 = r8.f14425a
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            rb.f.b(r9)
            goto Lbc
        Le:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L16:
            rb.f.b(r9)
            t2.e r9 = r8.f14426b
            x2.s r1 = r8.f14427c
            r9.getClass()
            java.lang.String r3 = "spec"
            ec.i.e(r1, r3)
            java.util.List<u2.d<?>> r9 = r9.f14418a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r9 = r9.iterator()
        L30:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L47
            java.lang.Object r4 = r9.next()
            r5 = r4
            u2.d r5 = (u2.d) r5
            boolean r5 = r5.b(r1)
            if (r5 == 0) goto L30
            r3.add(r4)
            goto L30
        L47:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r1 = sb.m.j(r3)
            r9.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        L54:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L77
            java.lang.Object r3 = r1.next()
            u2.d r3 = (u2.d) r3
            r3.getClass()
            u2.c r4 = new u2.c
            r5 = 0
            r4.<init>(r3, r5)
            qc.b r3 = new qc.b
            ub.i r5 = ub.i.f15164a
            pc.a r6 = pc.a.SUSPEND
            r7 = -2
            r3.<init>(r4, r5, r7, r6)
            r9.add(r3)
            goto L54
        L77:
            java.util.List r9 = sb.q.u(r9)
            r1 = 0
            qc.e[] r1 = new qc.e[r1]
            java.lang.Object[] r9 = r9.toArray(r1)
            qc.e[] r9 = (qc.e[]) r9
            t2.f r1 = new t2.f
            r1.<init>(r9)
            qc.h$b r9 = qc.h.f13409a
            boolean r9 = r1 instanceof qc.s
            if (r9 == 0) goto L90
            goto Laa
        L90:
            qc.h$b r9 = qc.h.f13409a
            qc.h$a r3 = qc.h.f13410b
            boolean r4 = r1 instanceof qc.d
            if (r4 == 0) goto La4
            r4 = r1
            qc.d r4 = (qc.d) r4
            dc.l<T, java.lang.Object> r5 = r4.f13396b
            if (r5 != r9) goto La4
            dc.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f13397c
            if (r4 != r3) goto La4
            goto Laa
        La4:
            qc.d r4 = new qc.d
            r4.<init>(r1, r9, r3)
            r1 = r4
        Laa:
            t2.g$a r9 = new t2.g$a
            t2.d r3 = r8.f14428d
            x2.s r4 = r8.f14427c
            r9.<init>(r3, r4)
            r8.f14425a = r2
            java.lang.Object r9 = r1.collect(r9, r8)
            if (r9 != r0) goto Lbc
            return r0
        Lbc:
            rb.h r9 = rb.h.f13851a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
