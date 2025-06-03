package g2;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import dc.p;
import nc.d0;
import qc.f;
import rb.h;
import wb.e;
import wb.i;

@e(c = "androidx.window.java.core.CallbackToFlowAdapter$connect$1$1", f = "CallbackToFlowAdapter.kt", l = {R.styleable.AppCompatTheme_buttonStyle}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a extends i implements p<d0, ub.e<? super h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f5804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qc.e<Object> f5805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0.a<Object> f5806c;

    /* renamed from: g2.a$a, reason: collision with other inner class name */
    public static final class C0092a<T> implements f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0.a<T> f5807a;

        public C0092a(d0.a<T> aVar) {
            this.f5807a = aVar;
        }

        @Override // qc.f
        public final Object emit(T t, ub.e<? super h> eVar) {
            this.f5807a.accept(t);
            return h.f13851a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qc.e<Object> eVar, d0.a<Object> aVar, ub.e<? super a> eVar2) {
        super(2, eVar2);
        this.f5805b = eVar;
        this.f5806c = aVar;
    }

    @Override // wb.a
    public final ub.e<h> create(Object obj, ub.e<?> eVar) {
        return new a(this.f5805b, this.f5806c, eVar);
    }

    @Override // dc.p
    public final Object invoke(d0 d0Var, ub.e<? super h> eVar) {
        return ((a) create(d0Var, eVar)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        int i10 = this.f5804a;
        if (i10 == 0) {
            rb.f.b(obj);
            qc.e<Object> eVar = this.f5805b;
            C0092a c0092a = new C0092a(this.f5806c);
            this.f5804a = 1;
            if (eVar.collect(c0092a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rb.f.b(obj);
        }
        return h.f13851a;
    }
}
