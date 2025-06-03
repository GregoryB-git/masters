package okhttp3;

import defpackage.f;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class Route {

    /* renamed from: a, reason: collision with root package name */
    public final Address f12361a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f12362b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f12363c;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (address == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f12361a = address;
        this.f12362b = proxy;
        this.f12363c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (route.f12361a.equals(this.f12361a) && route.f12362b.equals(this.f12362b) && route.f12363c.equals(this.f12363c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12363c.hashCode() + ((this.f12362b.hashCode() + ((this.f12361a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder l10 = f.l("Route{");
        l10.append(this.f12363c);
        l10.append("}");
        return l10.toString();
    }
}
