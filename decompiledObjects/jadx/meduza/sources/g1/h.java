package g1;

import android.os.Bundle;
import android.os.IBinder;
import g1.c;
import java.util.Iterator;
import java.util.List;
import p2.m0;
import r.g;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f5752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.e f5753c;

    public h(c.e eVar, String str, Bundle bundle) {
        this.f5753c = eVar;
        this.f5751a = str;
        this.f5752b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = ((g.c) c.this.f5717d.keySet()).iterator();
        while (it.hasNext()) {
            c.C0091c orDefault = c.this.f5717d.getOrDefault((IBinder) it.next(), null);
            c.e eVar = this.f5753c;
            String str = this.f5751a;
            Bundle bundle = this.f5752b;
            eVar.getClass();
            List<d0.b<IBinder, Bundle>> list = orDefault.f5729e.get(str);
            if (list != null) {
                for (d0.b<IBinder, Bundle> bVar : list) {
                    if (m0.N(bundle, bVar.f3329b)) {
                        c.this.g(str, orDefault, bVar.f3329b, bundle);
                    }
                }
            }
        }
    }
}
