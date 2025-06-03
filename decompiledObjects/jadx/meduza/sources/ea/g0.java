package ea;

import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import fa.b;
import java.util.Collection;
import java.util.Map;

@wb.e(c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", f = "SessionLifecycleClient.kt", l = {R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g0 extends wb.i implements dc.p<nc.d0, ub.e<? super rb.h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f4920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4921b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(String str, ub.e<? super g0> eVar) {
        super(2, eVar);
        this.f4921b = str;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        return new g0(this.f4921b, eVar);
    }

    @Override // dc.p
    public final Object invoke(nc.d0 d0Var, ub.e<? super rb.h> eVar) {
        return ((g0) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        int i10 = this.f4920a;
        if (i10 == 0) {
            rb.f.b(obj);
            fa.a aVar2 = fa.a.f5511a;
            this.f4920a = 1;
            obj = aVar2.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rb.f.b(obj);
        }
        Collection<fa.b> values = ((Map) obj).values();
        String str = this.f4921b;
        for (fa.b bVar : values) {
            bVar.a(new b.C0085b(str));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Notified ");
            bVar.c();
            sb2.append(b.a.CRASHLYTICS);
            sb2.append(" of new session ");
            sb2.append(str);
            Log.d("SessionLifecycleClient", sb2.toString());
        }
        return rb.h.f13851a;
    }
}
