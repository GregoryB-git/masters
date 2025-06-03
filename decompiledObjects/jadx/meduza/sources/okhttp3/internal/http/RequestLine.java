package okhttp3.internal.http;

import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class RequestLine {
    private RequestLine() {
    }

    public static String a(HttpUrl httpUrl) {
        String e10 = httpUrl.e();
        String g10 = httpUrl.g();
        if (g10 == null) {
            return e10;
        }
        return e10 + '?' + g10;
    }
}
