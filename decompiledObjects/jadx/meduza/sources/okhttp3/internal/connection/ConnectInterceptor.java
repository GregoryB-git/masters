package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes.dex */
public final class ConnectInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f12407a;

    public ConnectInterceptor(OkHttpClient okHttpClient) {
        this.f12407a = okHttpClient;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request request = realInterceptorChain.f;
        StreamAllocation streamAllocation = realInterceptorChain.f12457b;
        boolean z10 = !request.f12322b.equals("GET");
        OkHttpClient okHttpClient = this.f12407a;
        streamAllocation.getClass();
        try {
            HttpCodec h10 = streamAllocation.e(realInterceptorChain.f12463i, realInterceptorChain.f12464j, realInterceptorChain.f12465k, okHttpClient.J, okHttpClient.E, z10).h(okHttpClient, realInterceptorChain, streamAllocation);
            synchronized (streamAllocation.f12440d) {
                streamAllocation.f12449n = h10;
            }
            return realInterceptorChain.d(request, streamAllocation, h10, streamAllocation.b());
        } catch (IOException e10) {
            throw new RouteException(e10);
        }
    }
}
