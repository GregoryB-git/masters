package b;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements c.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f1595b;

    public /* synthetic */ g(j jVar, int i10) {
        this.f1594a = i10;
        this.f1595b = jVar;
    }

    @Override // c.b
    public final void a(Context context) {
        switch (this.f1594a) {
            case 0:
                this.f1595b.lambda$new$2(context);
                break;
            default:
                ((x0.m) this.f1595b).lambda$init$3(context);
                break;
        }
    }
}
