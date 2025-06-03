package u;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public q f14845a;

    public void a(Bundle bundle) {
        String c10 = c();
        if (c10 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
        }
    }

    public abstract void b(t tVar);

    public String c() {
        return null;
    }

    public void d() {
    }

    public void e() {
    }

    public final void f(q qVar) {
        if (this.f14845a != qVar) {
            this.f14845a = qVar;
            if (qVar != null) {
                qVar.g(this);
            }
        }
    }
}
