package okhttp3.internal.http;

import java.net.ProtocolException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import xc.f;
import xc.j;
import xc.r;
import xc.w;

/* loaded from: classes.dex */
public final class CallServerInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12452a;

    public static final class CountingSink extends j {
        public CountingSink(w wVar) {
            super(wVar);
        }

        @Override // xc.j, xc.w
        public final void g0(f fVar, long j10) {
            super.g0(fVar, j10);
        }
    }

    public CallServerInterceptor(boolean z10) {
        this.f12452a = z10;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Response.Builder builder;
        ResponseBody c10;
        HttpCodec httpCodec = realInterceptorChain.f12458c;
        StreamAllocation streamAllocation = realInterceptorChain.f12457b;
        RealConnection realConnection = realInterceptorChain.f12459d;
        Request request = realInterceptorChain.f;
        long currentTimeMillis = System.currentTimeMillis();
        realInterceptorChain.f12462h.getClass();
        httpCodec.b(request);
        realInterceptorChain.f12462h.getClass();
        Response.Builder builder2 = null;
        if (HttpMethod.b(request.f12322b) && request.f12324d != null) {
            if ("100-continue".equalsIgnoreCase(request.a("Expect"))) {
                httpCodec.e();
                realInterceptorChain.f12462h.getClass();
                builder2 = httpCodec.d(true);
            }
            if (builder2 == null) {
                realInterceptorChain.f12462h.getClass();
                r rVar = new r(new CountingSink(httpCodec.f(request, request.f12324d.a())));
                request.f12324d.d(rVar);
                rVar.close();
                realInterceptorChain.f12462h.getClass();
            } else {
                if (!(realConnection.f12417h != null)) {
                    streamAllocation.f();
                }
            }
        }
        httpCodec.a();
        if (builder2 == null) {
            realInterceptorChain.f12462h.getClass();
            builder2 = httpCodec.d(false);
        }
        builder2.f12346a = request;
        builder2.f12350e = streamAllocation.b().f;
        builder2.f12355k = currentTimeMillis;
        builder2.f12356l = System.currentTimeMillis();
        Response a10 = builder2.a();
        int i10 = a10.f12337c;
        if (i10 == 100) {
            Response.Builder d10 = httpCodec.d(false);
            d10.f12346a = request;
            d10.f12350e = streamAllocation.b().f;
            d10.f12355k = currentTimeMillis;
            d10.f12356l = System.currentTimeMillis();
            a10 = d10.a();
            i10 = a10.f12337c;
        }
        realInterceptorChain.f12462h.getClass();
        if (this.f12452a && i10 == 101) {
            builder = new Response.Builder(a10);
            c10 = Util.f12374c;
        } else {
            builder = new Response.Builder(a10);
            c10 = httpCodec.c(a10);
        }
        builder.f12351g = c10;
        Response a11 = builder.a();
        if ("close".equalsIgnoreCase(a11.f12335a.a("Connection")) || "close".equalsIgnoreCase(a11.g("Connection"))) {
            streamAllocation.f();
        }
        if ((i10 != 204 && i10 != 205) || a11.f12340o.f() <= 0) {
            return a11;
        }
        StringBuilder n2 = a0.j.n("HTTP ", i10, " had non-zero Content-Length: ");
        n2.append(a11.f12340o.f());
        throw new ProtocolException(n2.toString());
    }
}
