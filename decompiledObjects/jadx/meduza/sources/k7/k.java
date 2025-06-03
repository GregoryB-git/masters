package k7;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.review.internal.zze;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f9114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f9115c;

    public k(m mVar, IBinder iBinder) {
        this.f9114b = iBinder;
        this.f9115c = mVar;
    }

    @Override // k7.e
    public final void a() {
        c zzb = zze.zzb(this.f9114b);
        n nVar = this.f9115c.f9117a;
        nVar.f9130m = zzb;
        nVar.f9120b.a("linkToDeath", new Object[0]);
        try {
            nVar.f9130m.asBinder().linkToDeath(nVar.f9127j, 0);
        } catch (RemoteException e10) {
            d dVar = nVar.f9120b;
            Object[] objArr = new Object[0];
            dVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", d.c(dVar.f9105a, "linkToDeath failed", objArr), e10);
            }
        }
        n nVar2 = this.f9115c.f9117a;
        nVar2.f9124g = false;
        Iterator it = nVar2.f9122d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f9115c.f9117a.f9122d.clear();
    }
}
