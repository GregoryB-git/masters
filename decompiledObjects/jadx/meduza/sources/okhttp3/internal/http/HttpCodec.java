package okhttp3.internal.http;

import okhttp3.Request;
import okhttp3.Response;
import xc.w;

/* loaded from: classes.dex */
public interface HttpCodec {
    void a();

    void b(Request request);

    RealResponseBody c(Response response);

    void cancel();

    Response.Builder d(boolean z10);

    void e();

    w f(Request request, long j10);
}
