package d9;

import android.app.Activity;
import g9.k;

/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements n9.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.firestore.i f3703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k.a f3704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g9.d f3705c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f3706d = null;

    public /* synthetic */ p0(com.google.firebase.firestore.i iVar, k.a aVar, g9.d dVar) {
        this.f3703a = iVar;
        this.f3704b = aVar;
        this.f3705c = dVar;
    }

    @Override // n9.i
    public final Object apply(Object obj) {
        com.google.firebase.firestore.i iVar = this.f3703a;
        k.a aVar = this.f3704b;
        final g9.d dVar = this.f3705c;
        Activity activity = this.f3706d;
        final g9.u uVar = (g9.u) obj;
        g9.f0 f0Var = iVar.f3189a;
        uVar.d();
        final g9.g0 g0Var = new g9.g0(f0Var, aVar, dVar);
        uVar.f6090d.a(new x0.f(18, uVar, g0Var));
        b0 b0Var = new b0() { // from class: d9.q0
            @Override // d9.b0
            public final void remove() {
                g9.d dVar2 = g9.d.this;
                g9.u uVar2 = uVar;
                g9.g0 g0Var2 = g0Var;
                dVar2.f5922c = true;
                uVar2.f6090d.a(new w.g(18, uVar2, g0Var2));
            }
        };
        g9.a.a(activity, b0Var);
        return b0Var;
    }
}
