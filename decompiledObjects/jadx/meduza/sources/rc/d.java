package rc;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import nc.d0;
import nc.y;

@wb.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {R.styleable.AppCompatTheme_windowFixedWidthMinor}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends wb.i implements dc.p<d0, ub.e<? super rb.h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f13856a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qc.f<Object> f13858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f<Object> f13859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ub.e eVar, qc.f fVar, f fVar2) {
        super(2, eVar);
        this.f13858c = fVar;
        this.f13859d = fVar2;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        d dVar = new d(eVar, this.f13858c, this.f13859d);
        dVar.f13857b = obj;
        return dVar;
    }

    @Override // dc.p
    public final Object invoke(d0 d0Var, ub.e<? super rb.h> eVar) {
        return ((d) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = vb.a.f16085a;
        int i10 = this.f13856a;
        if (i10 == 0) {
            rb.f.b(obj);
            d0 d0Var = (d0) this.f13857b;
            qc.f<Object> fVar = this.f13858c;
            f<Object> fVar2 = this.f13859d;
            ub.h hVar = fVar2.f13863a;
            int i11 = fVar2.f13864b;
            if (i11 == -3) {
                i11 = -2;
            }
            pc.a aVar = fVar2.f13865c;
            dc.p eVar = new e(fVar2, null);
            pc.p pVar = new pc.p(y.b(d0Var, hVar), pc.i.a(i11, aVar, 4));
            pVar.d0(3, pVar, eVar);
            this.f13856a = 1;
            Object b10 = eb.y.b(fVar, pVar, true, this);
            if (b10 != obj2) {
                b10 = rb.h.f13851a;
            }
            if (b10 == obj2) {
                return obj2;
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
