package rc;

import com.pichillilorenzo.flutter_inappwebview_android.R;

@wb.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {R.styleable.AppCompatTheme_controlBackground}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends wb.i implements dc.p<pc.q<Object>, ub.e<? super rb.h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f13860a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f<Object> f13862c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f<Object> fVar, ub.e<? super e> eVar) {
        super(2, eVar);
        this.f13862c = fVar;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        e eVar2 = new e(this.f13862c, eVar);
        eVar2.f13861b = obj;
        return eVar2;
    }

    @Override // dc.p
    public final Object invoke(pc.q<Object> qVar, ub.e<? super rb.h> eVar) {
        return ((e) create(qVar, eVar)).invokeSuspend(rb.h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        int i10 = this.f13860a;
        if (i10 == 0) {
            rb.f.b(obj);
            pc.q<? super Object> qVar = (pc.q) this.f13861b;
            f<Object> fVar = this.f13862c;
            this.f13860a = 1;
            if (fVar.b(qVar, this) == aVar) {
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
