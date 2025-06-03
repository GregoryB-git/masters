package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

/* loaded from: classes.dex */
public final class RouteSelector {

    /* renamed from: a, reason: collision with root package name */
    public final Address f12428a;

    /* renamed from: b, reason: collision with root package name */
    public final RouteDatabase f12429b;

    /* renamed from: c, reason: collision with root package name */
    public final Call f12430c;

    /* renamed from: d, reason: collision with root package name */
    public final EventListener f12431d;

    /* renamed from: e, reason: collision with root package name */
    public List<Proxy> f12432e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public List<InetSocketAddress> f12433g = Collections.emptyList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f12434h = new ArrayList();

    public static final class Selection {

        /* renamed from: a, reason: collision with root package name */
        public final List<Route> f12435a;

        /* renamed from: b, reason: collision with root package name */
        public int f12436b = 0;

        public Selection(ArrayList arrayList) {
            this.f12435a = arrayList;
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        List<Proxy> o10;
        this.f12432e = Collections.emptyList();
        this.f12428a = address;
        this.f12429b = routeDatabase;
        this.f12430c = call;
        this.f12431d = eventListener;
        HttpUrl httpUrl = address.f12148a;
        Proxy proxy = address.f12154h;
        if (proxy != null) {
            o10 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = address.f12153g.select(httpUrl.n());
            o10 = (select == null || select.isEmpty()) ? Util.o(Proxy.NO_PROXY) : Util.n(select);
        }
        this.f12432e = o10;
        this.f = 0;
    }

    public final void a(Route route, IOException iOException) {
        Address address;
        ProxySelector proxySelector;
        if (route.f12362b.type() != Proxy.Type.DIRECT && (proxySelector = (address = this.f12428a).f12153g) != null) {
            proxySelector.connectFailed(address.f12148a.n(), route.f12362b.address(), iOException);
        }
        RouteDatabase routeDatabase = this.f12429b;
        synchronized (routeDatabase) {
            routeDatabase.f12425a.add(route);
        }
    }
}
