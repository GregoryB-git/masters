package k2;

import android.app.Activity;
import ec.i;
import x0.k;

/* loaded from: classes.dex */
public final class a implements j2.a {
    @Override // j2.a
    public final void a(Activity activity, m1.b bVar, k kVar) {
        i.e(activity, "context");
        bVar.execute(new u.a(kVar, 6));
    }

    @Override // j2.a
    public final void b(d0.a<i2.k> aVar) {
        i.e(aVar, "callback");
    }
}
