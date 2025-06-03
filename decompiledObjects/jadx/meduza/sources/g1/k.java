package g1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import g1.c;
import g1.c.C0091c;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.l f5756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5758c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f5760e;
    public final /* synthetic */ c.k f;

    public k(int i10, int i11, Bundle bundle, c.k kVar, c.m mVar, String str) {
        this.f = kVar;
        this.f5756a = mVar;
        this.f5757b = str;
        this.f5758c = i10;
        this.f5759d = i11;
        this.f5760e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((c.m) this.f5756a).a();
        c.this.f5717d.remove(a10);
        c.C0091c c0091c = c.this.new C0091c(this.f5757b, this.f5758c, this.f5759d, this.f5756a);
        c.this.getClass();
        c0091c.f = c.this.b(this.f5760e);
        c.this.getClass();
        if (c0091c.f == null) {
            StringBuilder l10 = defpackage.f.l("No root for client ");
            l10.append(this.f5757b);
            l10.append(" from service ");
            l10.append(k.class.getName());
            Log.i("MBServiceCompat", l10.toString());
            try {
                ((c.m) this.f5756a).c(2, null);
                return;
            } catch (RemoteException unused) {
                StringBuilder l11 = defpackage.f.l("Calling onConnectFailed() failed. Ignoring. pkg=");
                l11.append(this.f5757b);
                Log.w("MBServiceCompat", l11.toString());
                return;
            }
        }
        try {
            c.this.f5717d.put(a10, c0091c);
            a10.linkToDeath(c0091c, 0);
            MediaSessionCompat.Token token = c.this.f;
            if (token != null) {
                c.l lVar = this.f5756a;
                c.b bVar = c0091c.f;
                String str = bVar.f5723a;
                Bundle bundle = bVar.f5724b;
                c.m mVar = (c.m) lVar;
                mVar.getClass();
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putInt("extra_service_version", 2);
                Bundle bundle2 = new Bundle();
                bundle2.putString("data_media_item_id", str);
                bundle2.putParcelable("data_media_session_token", token);
                bundle2.putBundle("data_root_hints", bundle);
                mVar.c(1, bundle2);
            }
        } catch (RemoteException unused2) {
            StringBuilder l12 = defpackage.f.l("Calling onConnect() failed. Dropping client. pkg=");
            l12.append(this.f5757b);
            Log.w("MBServiceCompat", l12.toString());
            c.this.f5717d.remove(a10);
        }
    }
}
