package i2;

import android.app.Activity;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import dc.p;
import nc.j1;
import nc.r0;
import nc.s1;
import pc.q;

/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: b, reason: collision with root package name */
    public final n f7382b;

    /* renamed from: c, reason: collision with root package name */
    public final j2.a f7383c;

    @wb.e(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", f = "WindowInfoTrackerImpl.kt", l = {R.styleable.AppCompatTheme_dialogTheme}, m = "invokeSuspend")
    public static final class a extends wb.i implements p<q<? super k>, ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7384a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f7385b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f7387d;

        /* renamed from: i2.j$a$a, reason: collision with other inner class name */
        public static final class C0110a extends ec.j implements dc.a<rb.h> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f7388a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0.a<k> f7389b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0110a(j jVar, x0.k kVar) {
                super(0);
                this.f7388a = jVar;
                this.f7389b = kVar;
            }

            @Override // dc.a
            public final rb.h invoke() {
                this.f7388a.f7383c.b(this.f7389b);
                return rb.h.f13851a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, ub.e<? super a> eVar) {
            super(2, eVar);
            this.f7387d = activity;
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            a aVar = j.this.new a(this.f7387d, eVar);
            aVar.f7385b = obj;
            return aVar;
        }

        @Override // dc.p
        public final Object invoke(q<? super k> qVar, ub.e<? super rb.h> eVar) {
            return ((a) create(qVar, eVar)).invokeSuspend(rb.h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            vb.a aVar = vb.a.f16085a;
            int i10 = this.f7384a;
            if (i10 == 0) {
                rb.f.b(obj);
                q qVar = (q) this.f7385b;
                x0.k kVar = new x0.k(qVar, 2);
                j.this.f7383c.a(this.f7387d, new m1.b(4), kVar);
                C0110a c0110a = new C0110a(j.this, kVar);
                this.f7384a = 1;
                if (pc.o.a(qVar, c0110a, this) == aVar) {
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

    public j(o oVar, j2.a aVar) {
        ec.i.e(oVar, "windowMetricsCalculator");
        this.f7382b = oVar;
        this.f7383c = aVar;
    }

    @Override // i2.i
    public final qc.e<k> a(Activity activity) {
        ec.i.e(activity, "activity");
        a aVar = new a(activity, null);
        ub.i iVar = ub.i.f15164a;
        pc.a aVar2 = pc.a.SUSPEND;
        qc.b bVar = new qc.b(aVar, iVar, -2, aVar2);
        tc.c cVar = r0.f11545a;
        s1 s1Var = sc.n.f14360a;
        if (s1Var.get(j1.b.f11509a) == null) {
            return ec.i.a(s1Var, iVar) ? bVar : bVar.a(s1Var, -3, aVar2);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + s1Var).toString());
    }
}
