package g1;

import android.os.Bundle;
import android.util.Log;
import g1.c;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.l f5788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f5790c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.os.a f5791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c.k f5792e;

    public s(c.k kVar, c.m mVar, String str, Bundle bundle, android.support.v4.os.a aVar) {
        this.f5792e = kVar;
        this.f5788a = mVar;
        this.f5789b = str;
        this.f5790c = bundle;
        this.f5791d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (c.this.f5717d.getOrDefault(((c.m) this.f5788a).a(), null) != null) {
            c cVar = c.this;
            android.support.v4.os.a aVar = this.f5791d;
            cVar.getClass();
            aVar.b(-1, null);
            return;
        }
        StringBuilder l10 = defpackage.f.l("sendCustomAction for callback that isn't registered action=");
        l10.append(this.f5789b);
        l10.append(", extras=");
        l10.append(this.f5790c);
        Log.w("MBServiceCompat", l10.toString());
    }
}
