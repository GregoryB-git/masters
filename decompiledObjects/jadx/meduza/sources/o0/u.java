package o0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import o0.q;

@wb.e(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {R.styleable.AppCompatTheme_windowActionBar}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u extends wb.i implements dc.p<qc.f<Object>, ub.e<? super rb.h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f11673a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q<Object> f11675c;

    @wb.e(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
    public static final class a extends wb.i implements dc.p<b0<Object>, ub.e<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f11676a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0<Object> f11677b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0<Object> b0Var, ub.e<? super a> eVar) {
            super(2, eVar);
            this.f11677b = b0Var;
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            a aVar = new a(this.f11677b, eVar);
            aVar.f11676a = obj;
            return aVar;
        }

        @Override // dc.p
        public final Object invoke(b0<Object> b0Var, ub.e<? super Boolean> eVar) {
            return ((a) create(b0Var, eVar)).invokeSuspend(rb.h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            vb.a aVar = vb.a.f16085a;
            rb.f.b(obj);
            b0<Object> b0Var = (b0) this.f11676a;
            b0<Object> b0Var2 = this.f11677b;
            boolean z10 = false;
            if (!(b0Var2 instanceof c) && !(b0Var2 instanceof j) && b0Var == b0Var2) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q<Object> qVar, ub.e<? super u> eVar) {
        super(2, eVar);
        this.f11675c = qVar;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        u uVar = new u(this.f11675c, eVar);
        uVar.f11674b = obj;
        return uVar;
    }

    @Override // dc.p
    public final Object invoke(qc.f<Object> fVar, ub.e<? super rb.h> eVar) {
        return ((u) create(fVar, eVar)).invokeSuspend(rb.h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        int i10 = this.f11673a;
        if (i10 == 0) {
            rb.f.b(obj);
            qc.f fVar = (qc.f) this.f11674b;
            b0 b0Var = (b0) this.f11675c.f11623h.b();
            if (!(b0Var instanceof c)) {
                this.f11675c.f11625j.a(new q.a.C0183a(b0Var));
            }
            qc.t tVar = this.f11675c.f11623h;
            a aVar2 = new a(b0Var, null);
            this.f11673a = 1;
            if (fVar instanceof qc.x) {
                ((qc.x) fVar).getClass();
                throw null;
            }
            Object collect = tVar.collect(new qc.l(new ec.r(), new v(fVar), aVar2), this);
            if (collect != aVar) {
                collect = rb.h.f13851a;
            }
            if (collect != aVar) {
                collect = rb.h.f13851a;
            }
            if (collect != aVar) {
                collect = rb.h.f13851a;
            }
            if (collect == aVar) {
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
