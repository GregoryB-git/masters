package w1;

import A5.a;
import android.app.Activity;
import android.content.Context;

/* loaded from: classes.dex */
public final class m implements A5.a, B5.a {

    /* renamed from: a, reason: collision with root package name */
    public final q f20313a = new q();

    /* renamed from: b, reason: collision with root package name */
    public E5.k f20314b;

    /* renamed from: c, reason: collision with root package name */
    public B5.c f20315c;

    /* renamed from: d, reason: collision with root package name */
    public l f20316d;

    public final void a() {
        B5.c cVar = this.f20315c;
        if (cVar != null) {
            cVar.d(this.f20313a);
            this.f20315c.f(this.f20313a);
        }
    }

    public final void b() {
        B5.c cVar = this.f20315c;
        if (cVar != null) {
            cVar.h(this.f20313a);
            this.f20315c.e(this.f20313a);
        }
    }

    public final void c(Context context, E5.c cVar) {
        this.f20314b = new E5.k(cVar, "flutter.baseflow.com/permissions/methods");
        l lVar = new l(context, new C2074a(), this.f20313a, new y());
        this.f20316d = lVar;
        this.f20314b.e(lVar);
    }

    public final void d(Activity activity) {
        l lVar = this.f20316d;
        if (lVar != null) {
            lVar.i(activity);
        }
    }

    public final void e() {
        this.f20314b.e(null);
        this.f20314b = null;
        this.f20316d = null;
    }

    public final void f() {
        l lVar = this.f20316d;
        if (lVar != null) {
            lVar.i(null);
        }
    }

    @Override // B5.a
    public void onAttachedToActivity(B5.c cVar) {
        d(cVar.c());
        this.f20315c = cVar;
        b();
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        c(bVar.a(), bVar.b());
    }

    @Override // B5.a
    public void onDetachedFromActivity() {
        f();
        a();
    }

    @Override // B5.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        e();
    }

    @Override // B5.a
    public void onReattachedToActivityForConfigChanges(B5.c cVar) {
        onAttachedToActivity(cVar);
    }
}
