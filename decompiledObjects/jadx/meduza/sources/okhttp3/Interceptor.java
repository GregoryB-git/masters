package okhttp3;

import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes.dex */
public interface Interceptor {

    public interface Chain {
        int a();

        int b();
    }

    Response a(RealInterceptorChain realInterceptorChain);
}
