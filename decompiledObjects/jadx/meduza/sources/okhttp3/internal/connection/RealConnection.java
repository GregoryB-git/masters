package okhttp3.internal.connection;

import defpackage.f;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Codec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import p2.m0;
import xc.r;
import xc.s;
import xc.y;
import xc.z;

/* loaded from: classes.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* renamed from: b, reason: collision with root package name */
    public final ConnectionPool f12412b;

    /* renamed from: c, reason: collision with root package name */
    public final Route f12413c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f12414d;

    /* renamed from: e, reason: collision with root package name */
    public Socket f12415e;
    public Handshake f;

    /* renamed from: g, reason: collision with root package name */
    public Protocol f12416g;

    /* renamed from: h, reason: collision with root package name */
    public Http2Connection f12417h;

    /* renamed from: i, reason: collision with root package name */
    public s f12418i;

    /* renamed from: j, reason: collision with root package name */
    public r f12419j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12420k;

    /* renamed from: l, reason: collision with root package name */
    public int f12421l;

    /* renamed from: m, reason: collision with root package name */
    public int f12422m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f12423n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public long f12424o = Long.MAX_VALUE;

    /* renamed from: okhttp3.internal.connection.RealConnection$1, reason: invalid class name */
    class AnonymousClass1 extends RealWebSocket.Streams {
        public AnonymousClass1() {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    public RealConnection(ConnectionPool connectionPool, Route route) {
        this.f12412b = connectionPool;
        this.f12413c = route;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void a(Http2Connection http2Connection) {
        int i10;
        synchronized (this.f12412b) {
            try {
                synchronized (http2Connection) {
                    Settings settings = http2Connection.A;
                    i10 = (settings.f12643a & 16) != 0 ? settings.f12644b[4] : Integer.MAX_VALUE;
                }
                this.f12422m = i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void b(Http2Stream http2Stream) {
        http2Stream.c(ErrorCode.REFUSED_STREAM);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r10, int r11, int r12, int r13, boolean r14, okhttp3.EventListener r15) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.c(int, int, int, int, boolean, okhttp3.EventListener):void");
    }

    public final void d(int i10, int i11, EventListener eventListener) {
        Route route = this.f12413c;
        Proxy proxy = route.f12362b;
        this.f12414d = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? route.f12361a.f12150c.createSocket() : new Socket(proxy);
        InetSocketAddress inetSocketAddress = this.f12413c.f12363c;
        eventListener.getClass();
        this.f12414d.setSoTimeout(i11);
        try {
            Platform.f12669a.g(this.f12414d, this.f12413c.f12363c, i10);
            try {
                this.f12418i = new s(m0.b0(this.f12414d));
                this.f12419j = new r(m0.a0(this.f12414d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            StringBuilder l10 = f.l("Failed to connect to ");
            l10.append(this.f12413c.f12363c);
            ConnectException connectException = new ConnectException(l10.toString());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void e(int i10, int i11, int i12, EventListener eventListener) {
        Request.Builder builder = new Request.Builder();
        HttpUrl httpUrl = this.f12413c.f12361a.f12148a;
        if (httpUrl == null) {
            throw new NullPointerException("url == null");
        }
        builder.f12326a = httpUrl;
        builder.b("CONNECT", null);
        builder.f12328c.d("Host", Util.m(this.f12413c.f12361a.f12148a, true));
        builder.f12328c.d("Proxy-Connection", "Keep-Alive");
        builder.f12328c.d("User-Agent", "okhttp/3.12.13");
        Request a10 = builder.a();
        Response.Builder builder2 = new Response.Builder();
        builder2.f12346a = a10;
        builder2.f12347b = Protocol.HTTP_1_1;
        builder2.f12348c = 407;
        builder2.f12349d = "Preemptive Authenticate";
        builder2.f12351g = Util.f12374c;
        builder2.f12355k = -1L;
        builder2.f12356l = -1L;
        builder2.f.d("Proxy-Authenticate", "OkHttp-Preemptive");
        builder2.a();
        this.f12413c.f12361a.f12151d.a();
        HttpUrl httpUrl2 = a10.f12321a;
        d(i10, i11, eventListener);
        String str = "CONNECT " + Util.m(httpUrl2, true) + " HTTP/1.1";
        s sVar = this.f12418i;
        Http1Codec http1Codec = new Http1Codec(null, null, sVar, this.f12419j);
        z c10 = sVar.c();
        long j10 = i11;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c10.g(j10, timeUnit);
        this.f12419j.c().g(i12, timeUnit);
        http1Codec.i(a10.f12323c, str);
        http1Codec.a();
        Response.Builder d10 = http1Codec.d(false);
        d10.f12346a = a10;
        Response a11 = d10.a();
        long a12 = HttpHeaders.a(a11);
        if (a12 == -1) {
            a12 = 0;
        }
        y h10 = http1Codec.h(a12);
        Util.s(h10, Integer.MAX_VALUE, timeUnit);
        h10.close();
        int i13 = a11.f12337c;
        if (i13 == 200) {
            if (!this.f12418i.f17284b.v() || !this.f12419j.f17281b.v()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            if (i13 == 407) {
                this.f12413c.f12361a.f12151d.a();
                throw new IOException("Failed to authenticate with proxy");
            }
            StringBuilder l10 = f.l("Unexpected response code for CONNECT: ");
            l10.append(a11.f12337c);
            throw new IOException(l10.toString());
        }
    }

    public final void f(ConnectionSpecSelector connectionSpecSelector, int i10, EventListener eventListener) {
        SSLSocket sSLSocket;
        Protocol protocol = Protocol.HTTP_1_1;
        Address address = this.f12413c.f12361a;
        if (address.f12155i == null) {
            List<Protocol> list = address.f12152e;
            Protocol protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol2)) {
                this.f12415e = this.f12414d;
                this.f12416g = protocol;
                return;
            } else {
                this.f12415e = this.f12414d;
                this.f12416g = protocol2;
                i(i10);
                return;
            }
        }
        eventListener.getClass();
        Address address2 = this.f12413c.f12361a;
        SSLSocketFactory sSLSocketFactory = address2.f12155i;
        try {
            try {
                Socket socket = this.f12414d;
                HttpUrl httpUrl = address2.f12148a;
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, httpUrl.f12248d, httpUrl.f12249e, true);
                try {
                    ConnectionSpec a10 = connectionSpecSelector.a(sSLSocket);
                    if (a10.f12209b) {
                        Platform.f12669a.f(sSLSocket, address2.f12148a.f12248d, address2.f12152e);
                    }
                    sSLSocket.startHandshake();
                    SSLSession session = sSLSocket.getSession();
                    Handshake a11 = Handshake.a(session);
                    if (address2.f12156j.verify(address2.f12148a.f12248d, session)) {
                        address2.f12157k.a(address2.f12148a.f12248d, a11.f12240c);
                        String i11 = a10.f12209b ? Platform.f12669a.i(sSLSocket) : null;
                        this.f12415e = sSLSocket;
                        this.f12418i = new s(m0.b0(sSLSocket));
                        this.f12419j = new r(m0.a0(this.f12415e));
                        this.f = a11;
                        if (i11 != null) {
                            protocol = Protocol.f(i11);
                        }
                        this.f12416g = protocol;
                        Platform.f12669a.a(sSLSocket);
                        if (this.f12416g == Protocol.HTTP_2) {
                            i(i10);
                            return;
                        }
                        return;
                    }
                    List<Certificate> list2 = a11.f12240c;
                    if (list2.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + address2.f12148a.f12248d + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) list2.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + address2.f12148a.f12248d + " not verified:\n    certificate: " + CertificatePinner.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + OkHostnameVerifier.a(x509Certificate));
                } catch (AssertionError e10) {
                    e = e10;
                    if (!Util.q(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    if (sSLSocket != null) {
                        Platform.f12669a.a(sSLSocket);
                    }
                    Util.f(sSLSocket);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = null;
            }
        } catch (AssertionError e11) {
            e = e11;
        }
    }

    public final boolean g(Address address, Route route) {
        if (this.f12423n.size() >= this.f12422m || this.f12420k || !Internal.f12370a.g(this.f12413c.f12361a, address)) {
            return false;
        }
        if (address.f12148a.f12248d.equals(this.f12413c.f12361a.f12148a.f12248d)) {
            return true;
        }
        if (this.f12417h == null || route == null || route.f12362b.type() != Proxy.Type.DIRECT || this.f12413c.f12362b.type() != Proxy.Type.DIRECT || !this.f12413c.f12363c.equals(route.f12363c) || route.f12361a.f12156j != OkHostnameVerifier.f12680a || !j(address.f12148a)) {
            return false;
        }
        try {
            address.f12157k.a(address.f12148a.f12248d, this.f.f12240c);
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final HttpCodec h(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain, StreamAllocation streamAllocation) {
        if (this.f12417h != null) {
            return new Http2Codec(okHttpClient, realInterceptorChain, streamAllocation, this.f12417h);
        }
        this.f12415e.setSoTimeout(realInterceptorChain.f12464j);
        z c10 = this.f12418i.c();
        long j10 = realInterceptorChain.f12464j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c10.g(j10, timeUnit);
        this.f12419j.c().g(realInterceptorChain.f12465k, timeUnit);
        return new Http1Codec(okHttpClient, streamAllocation, this.f12418i, this.f12419j);
    }

    public final void i(int i10) {
        this.f12415e.setSoTimeout(0);
        Http2Connection.Builder builder = new Http2Connection.Builder();
        Socket socket = this.f12415e;
        String str = this.f12413c.f12361a.f12148a.f12248d;
        s sVar = this.f12418i;
        r rVar = this.f12419j;
        builder.f12578a = socket;
        builder.f12579b = str;
        builder.f12580c = sVar;
        builder.f12581d = rVar;
        builder.f12582e = this;
        builder.f12584h = i10;
        Http2Connection http2Connection = new Http2Connection(builder);
        this.f12417h = http2Connection;
        http2Connection.Q();
    }

    public final boolean j(HttpUrl httpUrl) {
        int i10 = httpUrl.f12249e;
        HttpUrl httpUrl2 = this.f12413c.f12361a.f12148a;
        if (i10 != httpUrl2.f12249e) {
            return false;
        }
        if (httpUrl.f12248d.equals(httpUrl2.f12248d)) {
            return true;
        }
        Handshake handshake = this.f;
        if (handshake == null) {
            return false;
        }
        OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.f12680a;
        String str = httpUrl.f12248d;
        X509Certificate x509Certificate = (X509Certificate) handshake.f12240c.get(0);
        okHostnameVerifier.getClass();
        return OkHostnameVerifier.c(str, x509Certificate);
    }

    public final String toString() {
        StringBuilder l10 = f.l("Connection{");
        l10.append(this.f12413c.f12361a.f12148a.f12248d);
        l10.append(":");
        l10.append(this.f12413c.f12361a.f12148a.f12249e);
        l10.append(", proxy=");
        l10.append(this.f12413c.f12362b);
        l10.append(" hostAddress=");
        l10.append(this.f12413c.f12363c);
        l10.append(" cipherSuite=");
        Handshake handshake = this.f;
        l10.append(handshake != null ? handshake.f12239b : "none");
        l10.append(" protocol=");
        l10.append(this.f12416g);
        l10.append('}');
        return l10.toString();
    }
}
