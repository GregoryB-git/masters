package g1;

import android.os.Bundle;
import android.util.Log;
import g1.c;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.l f5783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f5785c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.os.a f5786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c.k f5787e;

    public r(c.k kVar, c.m mVar, String str, Bundle bundle, android.support.v4.os.a aVar) {
        this.f5787e = kVar;
        this.f5783a = mVar;
        this.f5784b = str;
        this.f5785c = bundle;
        this.f5786d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (c.this.f5717d.getOrDefault(((c.m) this.f5783a).a(), null) == null) {
            StringBuilder l10 = defpackage.f.l("search for callback that isn't registered query=");
            l10.append(this.f5784b);
            Log.w("MBServiceCompat", l10.toString());
            return;
        }
        c cVar = c.this;
        String str = this.f5784b;
        Bundle bundle = this.f5785c;
        android.support.v4.os.a aVar = this.f5786d;
        cVar.getClass();
        e eVar = new e(str, aVar);
        cVar.f(bundle, eVar, str);
        if (!eVar.b()) {
            throw new IllegalStateException(defpackage.g.d("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }
}
