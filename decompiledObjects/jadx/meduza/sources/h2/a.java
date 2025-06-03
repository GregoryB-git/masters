package h2;

import android.app.Activity;
import g2.b;
import i2.i;
import i2.j;
import i2.k;
import qc.e;

/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: b, reason: collision with root package name */
    public final i f7059b;

    /* renamed from: c, reason: collision with root package name */
    public final b f7060c;

    public a(j jVar) {
        b bVar = new b();
        this.f7059b = jVar;
        this.f7060c = bVar;
    }

    @Override // i2.i
    public final e<k> a(Activity activity) {
        ec.i.e(activity, "activity");
        return this.f7059b.a(activity);
    }
}
