package m7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends w {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ IBinder f10341o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f10342p;

    public b(d dVar, IBinder iBinder) {
        this.f10342p = dVar;
        this.f10341o = iBinder;
    }

    @Override // m7.w
    public final void b() {
        IInterface iInterface = (IInterface) this.f10342p.f10345a.f10354i.a(this.f10341o);
        e eVar = this.f10342p.f10345a;
        eVar.f10359n = iInterface;
        eVar.f10348b.b("linkToDeath", new Object[0]);
        try {
            eVar.f10359n.asBinder().linkToDeath(eVar.f10356k, 0);
        } catch (RemoteException e10) {
            eVar.f10348b.a("linkToDeath failed", e10, new Object[0]);
        }
        e eVar2 = this.f10342p.f10345a;
        eVar2.f10352g = false;
        Iterator it = eVar2.f10350d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f10342p.f10345a.f10350d.clear();
    }
}
