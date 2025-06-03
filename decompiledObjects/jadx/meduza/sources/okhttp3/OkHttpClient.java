package okhttp3;

import defpackage.f;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

/* loaded from: classes.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final List<Protocol> K = Util.o(Protocol.HTTP_2, Protocol.HTTP_1_1);
    public static final List<ConnectionSpec> L = Util.o(ConnectionSpec.f12207e, ConnectionSpec.f);
    public final ConnectionPool A;
    public final Dns B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;

    /* renamed from: a, reason: collision with root package name */
    public final Dispatcher f12265a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f12266b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Protocol> f12267c;

    /* renamed from: d, reason: collision with root package name */
    public final List<ConnectionSpec> f12268d;

    /* renamed from: e, reason: collision with root package name */
    public final List<Interceptor> f12269e;
    public final List<Interceptor> f;

    /* renamed from: o, reason: collision with root package name */
    public final EventListener.Factory f12270o;

    /* renamed from: p, reason: collision with root package name */
    public final ProxySelector f12271p;

    /* renamed from: q, reason: collision with root package name */
    public final CookieJar f12272q;

    /* renamed from: r, reason: collision with root package name */
    public final Cache f12273r;

    /* renamed from: s, reason: collision with root package name */
    public final InternalCache f12274s;
    public final SocketFactory t;

    /* renamed from: u, reason: collision with root package name */
    public final SSLSocketFactory f12275u;

    /* renamed from: v, reason: collision with root package name */
    public final CertificateChainCleaner f12276v;

    /* renamed from: w, reason: collision with root package name */
    public final HostnameVerifier f12277w;

    /* renamed from: x, reason: collision with root package name */
    public final CertificatePinner f12278x;

    /* renamed from: y, reason: collision with root package name */
    public final Authenticator f12279y;

    /* renamed from: z, reason: collision with root package name */
    public final Authenticator f12280z;

    public static final class Builder {
        public int A;
        public int B;

        /* renamed from: a, reason: collision with root package name */
        public Dispatcher f12281a;

        /* renamed from: b, reason: collision with root package name */
        public Proxy f12282b;

        /* renamed from: c, reason: collision with root package name */
        public List<Protocol> f12283c;

        /* renamed from: d, reason: collision with root package name */
        public List<ConnectionSpec> f12284d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f12285e;
        public final ArrayList f;

        /* renamed from: g, reason: collision with root package name */
        public EventListener.Factory f12286g;

        /* renamed from: h, reason: collision with root package name */
        public ProxySelector f12287h;

        /* renamed from: i, reason: collision with root package name */
        public CookieJar f12288i;

        /* renamed from: j, reason: collision with root package name */
        public Cache f12289j;

        /* renamed from: k, reason: collision with root package name */
        public InternalCache f12290k;

        /* renamed from: l, reason: collision with root package name */
        public SocketFactory f12291l;

        /* renamed from: m, reason: collision with root package name */
        public SSLSocketFactory f12292m;

        /* renamed from: n, reason: collision with root package name */
        public CertificateChainCleaner f12293n;

        /* renamed from: o, reason: collision with root package name */
        public HostnameVerifier f12294o;

        /* renamed from: p, reason: collision with root package name */
        public CertificatePinner f12295p;

        /* renamed from: q, reason: collision with root package name */
        public Authenticator f12296q;

        /* renamed from: r, reason: collision with root package name */
        public Authenticator f12297r;

        /* renamed from: s, reason: collision with root package name */
        public ConnectionPool f12298s;
        public Dns t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f12299u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f12300v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f12301w;

        /* renamed from: x, reason: collision with root package name */
        public int f12302x;

        /* renamed from: y, reason: collision with root package name */
        public int f12303y;

        /* renamed from: z, reason: collision with root package name */
        public int f12304z;

        public Builder() {
            this.f12285e = new ArrayList();
            this.f = new ArrayList();
            this.f12281a = new Dispatcher();
            this.f12283c = OkHttpClient.K;
            this.f12284d = OkHttpClient.L;
            this.f12286g = new EventListener.Factory() { // from class: okhttp3.EventListener.2
                public AnonymousClass2() {
                }

                @Override // okhttp3.EventListener.Factory
                public final EventListener a() {
                    return EventListener.this;
                }
            };
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f12287h = proxySelector;
            if (proxySelector == null) {
                this.f12287h = new NullProxySelector();
            }
            this.f12288i = CookieJar.f12228a;
            this.f12291l = SocketFactory.getDefault();
            this.f12294o = OkHostnameVerifier.f12680a;
            this.f12295p = CertificatePinner.f12177c;
            Authenticator authenticator = Authenticator.f12158a;
            this.f12296q = authenticator;
            this.f12297r = authenticator;
            this.f12298s = new ConnectionPool();
            this.t = Dns.f12234a;
            this.f12299u = true;
            this.f12300v = true;
            this.f12301w = true;
            this.f12302x = 0;
            this.f12303y = 10000;
            this.f12304z = 10000;
            this.A = 10000;
            this.B = 0;
        }

        public Builder(OkHttpClient okHttpClient) {
            ArrayList arrayList = new ArrayList();
            this.f12285e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f = arrayList2;
            this.f12281a = okHttpClient.f12265a;
            this.f12282b = okHttpClient.f12266b;
            this.f12283c = okHttpClient.f12267c;
            this.f12284d = okHttpClient.f12268d;
            arrayList.addAll(okHttpClient.f12269e);
            arrayList2.addAll(okHttpClient.f);
            this.f12286g = okHttpClient.f12270o;
            this.f12287h = okHttpClient.f12271p;
            this.f12288i = okHttpClient.f12272q;
            this.f12290k = okHttpClient.f12274s;
            this.f12289j = okHttpClient.f12273r;
            this.f12291l = okHttpClient.t;
            this.f12292m = okHttpClient.f12275u;
            this.f12293n = okHttpClient.f12276v;
            this.f12294o = okHttpClient.f12277w;
            this.f12295p = okHttpClient.f12278x;
            this.f12296q = okHttpClient.f12279y;
            this.f12297r = okHttpClient.f12280z;
            this.f12298s = okHttpClient.A;
            this.t = okHttpClient.B;
            this.f12299u = okHttpClient.C;
            this.f12300v = okHttpClient.D;
            this.f12301w = okHttpClient.E;
            this.f12302x = okHttpClient.F;
            this.f12303y = okHttpClient.G;
            this.f12304z = okHttpClient.H;
            this.A = okHttpClient.I;
            this.B = okHttpClient.J;
        }
    }

    static {
        Internal.f12370a = new Internal() { // from class: okhttp3.OkHttpClient.1
            @Override // okhttp3.internal.Internal
            public final void a(Headers.Builder builder, String str) {
                builder.a(str);
            }

            @Override // okhttp3.internal.Internal
            public final void b(Headers.Builder builder, String str, String str2) {
                builder.b(str, str2);
            }

            @Override // okhttp3.internal.Internal
            public final void c(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z10) {
                String[] p10 = connectionSpec.f12210c != null ? Util.p(CipherSuite.f12181b, sSLSocket.getEnabledCipherSuites(), connectionSpec.f12210c) : sSLSocket.getEnabledCipherSuites();
                String[] p11 = connectionSpec.f12211d != null ? Util.p(Util.f12385o, sSLSocket.getEnabledProtocols(), connectionSpec.f12211d) : sSLSocket.getEnabledProtocols();
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                Comparator<String> comparator = CipherSuite.f12181b;
                byte[] bArr = Util.f12372a;
                int length = supportedCipherSuites.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else {
                        if (((CipherSuite.AnonymousClass1) comparator).compare(supportedCipherSuites[i10], "TLS_FALLBACK_SCSV") == 0) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (z10 && i10 != -1) {
                    String str = supportedCipherSuites[i10];
                    int length2 = p10.length + 1;
                    String[] strArr = new String[length2];
                    System.arraycopy(p10, 0, strArr, 0, p10.length);
                    strArr[length2 - 1] = str;
                    p10 = strArr;
                }
                ConnectionSpec.Builder builder = new ConnectionSpec.Builder(connectionSpec);
                builder.a(p10);
                builder.c(p11);
                ConnectionSpec connectionSpec2 = new ConnectionSpec(builder);
                String[] strArr2 = connectionSpec2.f12211d;
                if (strArr2 != null) {
                    sSLSocket.setEnabledProtocols(strArr2);
                }
                String[] strArr3 = connectionSpec2.f12210c;
                if (strArr3 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr3);
                }
            }

            @Override // okhttp3.internal.Internal
            public final int d(Response.Builder builder) {
                return builder.f12348c;
            }

            @Override // okhttp3.internal.Internal
            public final boolean e(ConnectionPool connectionPool, RealConnection realConnection) {
                connectionPool.getClass();
                if (realConnection.f12420k || connectionPool.f12201a == 0) {
                    connectionPool.f12204d.remove(realConnection);
                    return true;
                }
                connectionPool.notifyAll();
                return false;
            }

            @Override // okhttp3.internal.Internal
            public final Socket f(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation) {
                Iterator it = connectionPool.f12204d.iterator();
                while (it.hasNext()) {
                    RealConnection realConnection = (RealConnection) it.next();
                    if (realConnection.g(address, null)) {
                        if ((realConnection.f12417h != null) && realConnection != streamAllocation.b()) {
                            if (streamAllocation.f12449n != null || streamAllocation.f12445j.f12423n.size() != 1) {
                                throw new IllegalStateException();
                            }
                            Reference reference = (Reference) streamAllocation.f12445j.f12423n.get(0);
                            Socket c10 = streamAllocation.c(true, false, false);
                            streamAllocation.f12445j = realConnection;
                            realConnection.f12423n.add(reference);
                            return c10;
                        }
                    }
                }
                return null;
            }

            @Override // okhttp3.internal.Internal
            public final boolean g(Address address, Address address2) {
                return address.a(address2);
            }

            @Override // okhttp3.internal.Internal
            public final RealConnection h(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation, Route route) {
                Iterator it = connectionPool.f12204d.iterator();
                while (it.hasNext()) {
                    RealConnection realConnection = (RealConnection) it.next();
                    if (realConnection.g(address, route)) {
                        streamAllocation.a(realConnection, true);
                        return realConnection;
                    }
                }
                return null;
            }

            @Override // okhttp3.internal.Internal
            public final void i(ConnectionPool connectionPool, RealConnection realConnection) {
                if (!connectionPool.f) {
                    connectionPool.f = true;
                    ConnectionPool.f12200g.execute(connectionPool.f12203c);
                }
                connectionPool.f12204d.add(realConnection);
            }

            @Override // okhttp3.internal.Internal
            public final RouteDatabase j(ConnectionPool connectionPool) {
                return connectionPool.f12205e;
            }

            @Override // okhttp3.internal.Internal
            public final IOException k(Call call, IOException iOException) {
                if (!((RealCall) call).f12314c.i()) {
                    return iOException;
                }
                InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                if (iOException != null) {
                    interruptedIOException.initCause(iOException);
                }
                return interruptedIOException;
            }
        };
    }

    public OkHttpClient() {
        this(new Builder());
    }

    public OkHttpClient(Builder builder) {
        boolean z10;
        CertificateChainCleaner certificateChainCleaner;
        this.f12265a = builder.f12281a;
        this.f12266b = builder.f12282b;
        this.f12267c = builder.f12283c;
        List<ConnectionSpec> list = builder.f12284d;
        this.f12268d = list;
        this.f12269e = Util.n(builder.f12285e);
        this.f = Util.n(builder.f);
        this.f12270o = builder.f12286g;
        this.f12271p = builder.f12287h;
        this.f12272q = builder.f12288i;
        this.f12273r = builder.f12289j;
        this.f12274s = builder.f12290k;
        this.t = builder.f12291l;
        Iterator<ConnectionSpec> it = list.iterator();
        loop0: while (true) {
            z10 = false;
            while (it.hasNext()) {
                z10 = (z10 || it.next().f12208a) ? true : z10;
            }
        }
        SSLSocketFactory sSLSocketFactory = builder.f12292m;
        if (sSLSocketFactory == null && z10) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            Platform platform = Platform.f12669a;
                            SSLContext h10 = platform.h();
                            h10.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.f12275u = h10.getSocketFactory();
                            certificateChainCleaner = platform.c(x509TrustManager);
                        } catch (GeneralSecurityException e10) {
                            throw Util.a("No System TLS", e10);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e11) {
                throw Util.a("No System TLS", e11);
            }
        }
        this.f12275u = sSLSocketFactory;
        certificateChainCleaner = builder.f12293n;
        this.f12276v = certificateChainCleaner;
        SSLSocketFactory sSLSocketFactory2 = this.f12275u;
        if (sSLSocketFactory2 != null) {
            Platform.f12669a.e(sSLSocketFactory2);
        }
        this.f12277w = builder.f12294o;
        CertificatePinner certificatePinner = builder.f12295p;
        this.f12278x = Util.k(certificatePinner.f12179b, certificateChainCleaner) ? certificatePinner : new CertificatePinner(certificatePinner.f12178a, certificateChainCleaner);
        this.f12279y = builder.f12296q;
        this.f12280z = builder.f12297r;
        this.A = builder.f12298s;
        this.B = builder.t;
        this.C = builder.f12299u;
        this.D = builder.f12300v;
        this.E = builder.f12301w;
        this.F = builder.f12302x;
        this.G = builder.f12303y;
        this.H = builder.f12304z;
        this.I = builder.A;
        this.J = builder.B;
        if (this.f12269e.contains(null)) {
            StringBuilder l10 = f.l("Null interceptor: ");
            l10.append(this.f12269e);
            throw new IllegalStateException(l10.toString());
        }
        if (this.f.contains(null)) {
            StringBuilder l11 = f.l("Null network interceptor: ");
            l11.append(this.f);
            throw new IllegalStateException(l11.toString());
        }
    }

    public final Call a(Request request) {
        RealCall realCall = new RealCall(this, request, false);
        realCall.f12315d = this.f12270o.a();
        return realCall;
    }
}
