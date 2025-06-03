package v2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class i extends g<t2.c> {
    public final ConnectivityManager f;

    /* renamed from: g, reason: collision with root package name */
    public final a f15222g;

    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            ec.i.e(network, "network");
            ec.i.e(networkCapabilities, "capabilities");
            o2.j.d().a(j.f15224a, "Network capabilities changed: " + networkCapabilities);
            i iVar = i.this;
            iVar.b(j.a(iVar.f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            ec.i.e(network, "network");
            o2.j.d().a(j.f15224a, "Network connection lost");
            i iVar = i.this;
            iVar.b(j.a(iVar.f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, a3.b bVar) {
        super(context, bVar);
        ec.i.e(bVar, "taskExecutor");
        Object systemService = this.f15217b.getSystemService("connectivity");
        ec.i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager) systemService;
        this.f15222g = new a();
    }

    @Override // v2.g
    public final t2.c a() {
        return j.a(this.f);
    }

    @Override // v2.g
    public final void c() {
        o2.j d10;
        try {
            o2.j.d().a(j.f15224a, "Registering network callback");
            y2.n.a(this.f, this.f15222g);
        } catch (IllegalArgumentException e10) {
            e = e10;
            d10 = o2.j.d();
            d10.c(j.f15224a, "Received exception while registering network callback", e);
        } catch (SecurityException e11) {
            e = e11;
            d10 = o2.j.d();
            d10.c(j.f15224a, "Received exception while registering network callback", e);
        }
    }

    @Override // v2.g
    public final void d() {
        o2.j d10;
        try {
            o2.j.d().a(j.f15224a, "Unregistering network callback");
            y2.l.c(this.f, this.f15222g);
        } catch (IllegalArgumentException e10) {
            e = e10;
            d10 = o2.j.d();
            d10.c(j.f15224a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e11) {
            e = e11;
            d10 = o2.j.d();
            d10.c(j.f15224a, "Received exception while unregistering network callback", e);
        }
    }
}
