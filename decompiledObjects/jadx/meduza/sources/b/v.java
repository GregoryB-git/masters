package b;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1636b;

    public /* synthetic */ v(Object obj, int i10) {
        this.f1635a = i10;
        this.f1636b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f1635a) {
            case 0:
                dc.a aVar = (dc.a) this.f1636b;
                ec.i.e(aVar, "$onBackInvoked");
                aVar.invoke();
                break;
            default:
                ((Runnable) this.f1636b).run();
                break;
        }
    }
}
