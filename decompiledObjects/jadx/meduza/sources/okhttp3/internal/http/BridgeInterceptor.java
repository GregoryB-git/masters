package okhttp3.internal.http;

import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import xc.m;
import xc.s;

/* loaded from: classes.dex */
public final class BridgeInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final CookieJar f12451a;

    public BridgeInterceptor(CookieJar cookieJar) {
        this.f12451a = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        boolean z10;
        Request request = realInterceptorChain.f;
        request.getClass();
        Request.Builder builder = new Request.Builder(request);
        RequestBody requestBody = request.f12324d;
        if (requestBody != null) {
            MediaType b10 = requestBody.b();
            if (b10 != null) {
                builder.f12328c.d("Content-Type", b10.f12262a);
            }
            long a10 = requestBody.a();
            if (a10 != -1) {
                builder.f12328c.d("Content-Length", Long.toString(a10));
                builder.c("Transfer-Encoding");
            } else {
                builder.f12328c.d("Transfer-Encoding", "chunked");
                builder.c("Content-Length");
            }
        }
        if (request.a("Host") == null) {
            builder.f12328c.d("Host", Util.m(request.f12321a, false));
        }
        if (request.a("Connection") == null) {
            builder.f12328c.d("Connection", "Keep-Alive");
        }
        if (request.a("Accept-Encoding") == null && request.a("Range") == null) {
            builder.f12328c.d("Accept-Encoding", "gzip");
            z10 = true;
        } else {
            z10 = false;
        }
        List a11 = this.f12451a.a();
        if (!a11.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            int size = a11.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append("; ");
                }
                Cookie cookie = (Cookie) a11.get(i10);
                sb2.append(cookie.f12220a);
                sb2.append('=');
                sb2.append(cookie.f12221b);
            }
            builder.f12328c.d("Cookie", sb2.toString());
        }
        if (request.a("User-Agent") == null) {
            builder.f12328c.d("User-Agent", "okhttp/3.12.13");
        }
        Response c10 = realInterceptorChain.c(builder.a());
        HttpHeaders.d(this.f12451a, request.f12321a, c10.f);
        Response.Builder builder2 = new Response.Builder(c10);
        builder2.f12346a = request;
        if (z10 && "gzip".equalsIgnoreCase(c10.g("Content-Encoding")) && HttpHeaders.b(c10)) {
            m mVar = new m(c10.f12340o.H());
            Headers.Builder e10 = c10.f.e();
            e10.c("Content-Encoding");
            e10.c("Content-Length");
            builder2.f = new Headers(e10).e();
            builder2.f12351g = new RealResponseBody(c10.g("Content-Type"), -1L, new s(mVar));
        }
        return builder2.a();
    }
}
