package okhttp3.internal.http;

import defpackage.f;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http2.ConnectionShutdownException;

/* loaded from: classes.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f12470a;

    /* renamed from: b, reason: collision with root package name */
    public volatile StreamAllocation f12471b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12472c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f12473d;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        this.f12470a = okHttpClient;
    }

    public static int e(Response response, int i10) {
        String g10 = response.g("Retry-After");
        if (g10 == null) {
            return i10;
        }
        if (g10.matches("\\d+")) {
            return Integer.valueOf(g10).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public static boolean f(Response response, HttpUrl httpUrl) {
        HttpUrl httpUrl2 = response.f12335a.f12321a;
        return httpUrl2.f12248d.equals(httpUrl.f12248d) && httpUrl2.f12249e == httpUrl.f12249e && httpUrl2.f12245a.equals(httpUrl.f12245a);
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Response d10;
        HttpCodec httpCodec;
        Request request = realInterceptorChain.f;
        Call call = realInterceptorChain.f12461g;
        EventListener eventListener = realInterceptorChain.f12462h;
        StreamAllocation streamAllocation = new StreamAllocation(this.f12470a.A, b(request.f12321a), call, eventListener, this.f12472c);
        this.f12471b = streamAllocation;
        int i10 = 0;
        Response response = null;
        while (!this.f12473d) {
            try {
                try {
                    d10 = realInterceptorChain.d(request, streamAllocation, null, null);
                    if (response != null) {
                        Response.Builder builder = new Response.Builder(d10);
                        Response.Builder builder2 = new Response.Builder(response);
                        builder2.f12351g = null;
                        Response a10 = builder2.a();
                        if (a10.f12340o != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        builder.f12354j = a10;
                        d10 = builder.a();
                    }
                } catch (IOException e10) {
                    if (!d(e10, streamAllocation, !(e10 instanceof ConnectionShutdownException), request)) {
                        throw e10;
                    }
                } catch (RouteException e11) {
                    if (!d(e11.f12427b, streamAllocation, false, request)) {
                        throw e11.f12426a;
                    }
                }
                try {
                    Request c10 = c(d10, streamAllocation.f12439c);
                    if (c10 == null) {
                        streamAllocation.g();
                        return d10;
                    }
                    Util.e(d10.f12340o);
                    int i11 = i10 + 1;
                    if (i11 > 20) {
                        streamAllocation.g();
                        throw new ProtocolException(f.h("Too many follow-up requests: ", i11));
                    }
                    if (c10.f12324d instanceof UnrepeatableRequestBody) {
                        streamAllocation.g();
                        throw new HttpRetryException("Cannot retry streamed HTTP body", d10.f12337c);
                    }
                    if (f(d10, c10.f12321a)) {
                        synchronized (streamAllocation.f12440d) {
                            httpCodec = streamAllocation.f12449n;
                        }
                        if (httpCodec != null) {
                            throw new IllegalStateException("Closing the body of " + d10 + " didn't close its backing stream. Bad interceptor?");
                        }
                    } else {
                        streamAllocation.g();
                        streamAllocation = new StreamAllocation(this.f12470a.A, b(c10.f12321a), call, eventListener, this.f12472c);
                        this.f12471b = streamAllocation;
                    }
                    response = d10;
                    request = c10;
                    i10 = i11;
                } catch (IOException e12) {
                    streamAllocation.g();
                    throw e12;
                }
            } catch (Throwable th) {
                streamAllocation.h(null);
                streamAllocation.g();
                throw th;
            }
        }
        streamAllocation.g();
        throw new IOException("Canceled");
    }

    public final Address b(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.f12245a.equals("https")) {
            OkHttpClient okHttpClient = this.f12470a;
            SSLSocketFactory sSLSocketFactory2 = okHttpClient.f12275u;
            HostnameVerifier hostnameVerifier2 = okHttpClient.f12277w;
            certificatePinner = okHttpClient.f12278x;
            sSLSocketFactory = sSLSocketFactory2;
            hostnameVerifier = hostnameVerifier2;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        String str = httpUrl.f12248d;
        int i10 = httpUrl.f12249e;
        OkHttpClient okHttpClient2 = this.f12470a;
        return new Address(str, i10, okHttpClient2.B, okHttpClient2.t, sSLSocketFactory, hostnameVerifier, certificatePinner, okHttpClient2.f12279y, okHttpClient2.f12266b, okHttpClient2.f12267c, okHttpClient2.f12268d, okHttpClient2.f12271p);
    }

    public final Request c(Response response, Route route) {
        String g10;
        HttpUrl.Builder builder;
        Authenticator authenticator;
        int i10 = response.f12337c;
        Request request = response.f12335a;
        String str = request.f12322b;
        if (i10 != 307 && i10 != 308) {
            if (i10 == 401) {
                authenticator = this.f12470a.f12280z;
            } else {
                if (i10 == 503) {
                    Response response2 = response.f12343r;
                    if ((response2 == null || response2.f12337c != 503) && e(response, Integer.MAX_VALUE) == 0) {
                        return response.f12335a;
                    }
                    return null;
                }
                if (i10 != 407) {
                    if (i10 == 408) {
                        if (!this.f12470a.E || (request.f12324d instanceof UnrepeatableRequestBody)) {
                            return null;
                        }
                        Response response3 = response.f12343r;
                        if ((response3 == null || response3.f12337c != 408) && e(response, 0) <= 0) {
                            return response.f12335a;
                        }
                        return null;
                    }
                    switch (i10) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                } else {
                    if (route.f12362b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    authenticator = this.f12470a.f12279y;
                }
            }
            authenticator.a();
            return null;
        }
        if (!str.equals("GET") && !str.equals("HEAD")) {
            return null;
        }
        if (!this.f12470a.D || (g10 = response.g("Location")) == null) {
            return null;
        }
        HttpUrl httpUrl = response.f12335a.f12321a;
        httpUrl.getClass();
        try {
            builder = new HttpUrl.Builder();
            builder.b(httpUrl, g10);
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        HttpUrl a10 = builder != null ? builder.a() : null;
        if (a10 == null) {
            return null;
        }
        if (!a10.f12245a.equals(response.f12335a.f12321a.f12245a) && !this.f12470a.C) {
            return null;
        }
        Request request2 = response.f12335a;
        request2.getClass();
        Request.Builder builder2 = new Request.Builder(request2);
        if (HttpMethod.b(str)) {
            boolean equals = str.equals("PROPFIND");
            if (!str.equals("PROPFIND")) {
                builder2.b("GET", null);
            } else {
                builder2.b(str, equals ? response.f12335a.f12324d : null);
            }
            if (!equals) {
                builder2.c("Transfer-Encoding");
                builder2.c("Content-Length");
                builder2.c("Content-Type");
            }
        }
        if (!f(response, a10)) {
            builder2.c("Authorization");
        }
        builder2.f12326a = a10;
        return builder2.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if ((r3.f12436b < r3.f12435a.size()) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.io.IOException r3, okhttp3.internal.connection.StreamAllocation r4, boolean r5, okhttp3.Request r6) {
        /*
            r2 = this;
            r4.h(r3)
            okhttp3.OkHttpClient r0 = r2.f12470a
            boolean r0 = r0.E
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            r0 = 1
            if (r5 == 0) goto L1f
            okhttp3.RequestBody r6 = r6.f12324d
            boolean r6 = r6 instanceof okhttp3.internal.http.UnrepeatableRequestBody
            if (r6 != 0) goto L1b
            boolean r6 = r3 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L19
            goto L1b
        L19:
            r6 = r1
            goto L1c
        L1b:
            r6 = r0
        L1c:
            if (r6 == 0) goto L1f
            return r1
        L1f:
            boolean r6 = r3 instanceof java.net.ProtocolException
            if (r6 == 0) goto L24
            goto L40
        L24:
            boolean r6 = r3 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L2f
            boolean r3 = r3 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L40
            if (r5 != 0) goto L40
            goto L42
        L2f:
            boolean r5 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L3c
            java.lang.Throwable r5 = r3.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L3c
            goto L40
        L3c:
            boolean r3 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L42
        L40:
            r3 = r1
            goto L43
        L42:
            r3 = r0
        L43:
            if (r3 != 0) goto L46
            return r1
        L46:
            okhttp3.Route r3 = r4.f12439c
            if (r3 != 0) goto L7f
            okhttp3.internal.connection.RouteSelector$Selection r3 = r4.f12438b
            if (r3 == 0) goto L5d
            int r5 = r3.f12436b
            java.util.List<okhttp3.Route> r3 = r3.f12435a
            int r3 = r3.size()
            if (r5 >= r3) goto L5a
            r3 = r0
            goto L5b
        L5a:
            r3 = r1
        L5b:
            if (r3 != 0) goto L7f
        L5d:
            okhttp3.internal.connection.RouteSelector r3 = r4.f12443h
            int r4 = r3.f
            java.util.List<java.net.Proxy> r5 = r3.f12432e
            int r5 = r5.size()
            if (r4 >= r5) goto L6b
            r4 = r0
            goto L6c
        L6b:
            r4 = r1
        L6c:
            if (r4 != 0) goto L79
            java.util.ArrayList r3 = r3.f12434h
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L77
            goto L79
        L77:
            r3 = r1
            goto L7a
        L79:
            r3 = r0
        L7a:
            if (r3 == 0) goto L7d
            goto L7f
        L7d:
            r3 = r1
            goto L80
        L7f:
            r3 = r0
        L80:
            if (r3 != 0) goto L83
            return r1
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.d(java.io.IOException, okhttp3.internal.connection.StreamAllocation, boolean, okhttp3.Request):boolean");
    }
}
