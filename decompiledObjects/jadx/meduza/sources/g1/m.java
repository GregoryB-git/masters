package g1;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import g1.c;
import java.util.ArrayList;
import java.util.List;
import p2.m0;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.l f5763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5764b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f5765c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f5766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c.k f5767e;

    public m(c.k kVar, c.m mVar, String str, IBinder iBinder, Bundle bundle) {
        this.f5767e = kVar;
        this.f5763a = mVar;
        this.f5764b = str;
        this.f5765c = iBinder;
        this.f5766d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.C0091c orDefault = c.this.f5717d.getOrDefault(((c.m) this.f5763a).a(), null);
        if (orDefault == null) {
            StringBuilder l10 = defpackage.f.l("addSubscription for callback that isn't registered id=");
            l10.append(this.f5764b);
            Log.w("MBServiceCompat", l10.toString());
            return;
        }
        c cVar = c.this;
        String str = this.f5764b;
        IBinder iBinder = this.f5765c;
        Bundle bundle = this.f5766d;
        cVar.getClass();
        List<d0.b<IBinder, Bundle>> list = orDefault.f5729e.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (d0.b<IBinder, Bundle> bVar : list) {
            if (iBinder == bVar.f3328a && m0.h(bundle, bVar.f3329b)) {
                return;
            }
        }
        list.add(new d0.b<>(iBinder, bundle));
        orDefault.f5729e.put(str, list);
        cVar.g(str, orDefault, bundle, null);
    }
}
