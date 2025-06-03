package okhttp3.internal.cache;

import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes.dex */
public final class CacheInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final InternalCache f12390a;

    public CacheInterceptor(InternalCache internalCache) {
        this.f12390a = internalCache;
    }

    public static boolean b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    public static boolean c(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static Response d(Response response) {
        if (response == null || response.f12340o == null) {
            return response;
        }
        Response.Builder builder = new Response.Builder(response);
        builder.f12351g = null;
        return builder.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x00d3, code lost:
    
        if (r9 > 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x021c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x026f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain r23) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheInterceptor.a(okhttp3.internal.http.RealInterceptorChain):okhttp3.Response");
    }
}
