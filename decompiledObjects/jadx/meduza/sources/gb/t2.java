package gb;

import java.lang.reflect.InvocationTargetException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class t2 implements eb.z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f6814d = Logger.getLogger(t2.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final a f6815e = new a();
    public static final b f = new b();

    /* renamed from: a, reason: collision with root package name */
    public final n7.q<ProxySelector> f6816a;

    /* renamed from: b, reason: collision with root package name */
    public final c f6817b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f6818c;

    public class a implements c {
        @Override // gb.t2.c
        public final PasswordAuthentication a(String str, InetAddress inetAddress, int i10) {
            URL url;
            try {
                url = new URL("https", str, i10, "");
            } catch (MalformedURLException unused) {
                t2.f6814d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i10, "https", "", null, url, Authenticator.RequestorType.PROXY);
        }
    }

    public class b implements n7.q<ProxySelector> {
        @Override // n7.q
        public final ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    public interface c {
        PasswordAuthentication a(String str, InetAddress inetAddress, int i10);
    }

    public t2() {
        b bVar = f;
        a aVar = f6815e;
        String str = System.getenv("GRPC_PROXY_EXP");
        bVar.getClass();
        this.f6816a = bVar;
        aVar.getClass();
        this.f6817b = aVar;
        if (str == null) {
            this.f6818c = null;
            return;
        }
        String[] split = str.split(":", 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        f6814d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.f6818c = new InetSocketAddress(split[0], parseInt);
    }

    @Override // eb.z0
    public final eb.y0 a(InetSocketAddress inetSocketAddress) {
        Logger logger;
        Level level;
        String str;
        String hostName;
        String hostName2;
        String str2;
        if (!(inetSocketAddress instanceof InetSocketAddress)) {
            return null;
        }
        InetSocketAddress inetSocketAddress2 = this.f6818c;
        if (inetSocketAddress2 != null) {
            int i10 = eb.a0.f5017e;
            x6.b.y(inetSocketAddress2, "proxyAddress");
            x6.b.y(inetSocketAddress, "targetAddress");
            return new eb.a0(inetSocketAddress2, inetSocketAddress, null, null);
        }
        try {
            Logger logger2 = v0.f6828a;
            try {
                hostName = (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                hostName = inetSocketAddress.getHostName();
            }
            try {
                URI uri = new URI("https", null, hostName, inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = this.f6816a.get();
                if (proxySelector == null) {
                    f6814d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    f6814d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                c cVar = this.f6817b;
                try {
                    hostName2 = (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress3, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    hostName2 = inetSocketAddress3.getHostName();
                }
                PasswordAuthentication a10 = cVar.a(hostName2, inetSocketAddress3.getAddress(), inetSocketAddress3.getPort());
                if (inetSocketAddress3.isUnresolved()) {
                    inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                }
                int i11 = eb.a0.f5017e;
                if (a10 == null) {
                    str2 = null;
                } else {
                    String userName = a10.getUserName();
                    str2 = a10.getPassword() != null ? new String(a10.getPassword()) : null;
                    r2 = userName;
                }
                return new eb.a0(inetSocketAddress3, inetSocketAddress, r2, str2);
            } catch (URISyntaxException e10) {
                e = e10;
                logger = f6814d;
                level = Level.WARNING;
                str = "Failed to construct URI for proxy lookup, proceeding without proxy";
                logger.log(level, str, (Throwable) e);
                return null;
            }
        } catch (Throwable th) {
            e = th;
            logger = f6814d;
            level = Level.WARNING;
            str = "Failed to get host for proxy lookup, proceeding without proxy";
        }
    }
}
