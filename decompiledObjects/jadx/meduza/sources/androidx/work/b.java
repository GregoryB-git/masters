package androidx.work;

import androidx.work.d;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import wb.i;

@wb.e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {R.styleable.AppCompatTheme_editTextBackground}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b extends i implements p<d0, ub.e<? super h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f1451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f1452b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CoroutineWorker coroutineWorker, ub.e<? super b> eVar) {
        super(2, eVar);
        this.f1452b = coroutineWorker;
    }

    @Override // wb.a
    public final ub.e<h> create(Object obj, ub.e<?> eVar) {
        return new b(this.f1452b, eVar);
    }

    @Override // dc.p
    public final Object invoke(d0 d0Var, ub.e<? super h> eVar) {
        return ((b) create(d0Var, eVar)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        int i10 = this.f1451a;
        try {
            if (i10 == 0) {
                f.b(obj);
                CoroutineWorker coroutineWorker = this.f1452b;
                this.f1451a = 1;
                obj = coroutineWorker.j();
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            this.f1452b.f.i((d.a) obj);
        } catch (Throwable th) {
            this.f1452b.f.j(th);
        }
        return h.f13851a;
    }
}
