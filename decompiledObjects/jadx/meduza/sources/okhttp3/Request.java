package okhttp3;

import defpackage.f;
import defpackage.g;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

/* loaded from: classes.dex */
public final class Request {

    /* renamed from: a, reason: collision with root package name */
    public final HttpUrl f12321a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12322b;

    /* renamed from: c, reason: collision with root package name */
    public final Headers f12323c;

    /* renamed from: d, reason: collision with root package name */
    public final RequestBody f12324d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, Object> f12325e;
    public volatile CacheControl f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public HttpUrl f12326a;

        /* renamed from: b, reason: collision with root package name */
        public String f12327b;

        /* renamed from: c, reason: collision with root package name */
        public Headers.Builder f12328c;

        /* renamed from: d, reason: collision with root package name */
        public RequestBody f12329d;

        /* renamed from: e, reason: collision with root package name */
        public Map<Class<?>, Object> f12330e;

        public Builder() {
            this.f12330e = Collections.emptyMap();
            this.f12327b = "GET";
            this.f12328c = new Headers.Builder();
        }

        public Builder(Request request) {
            this.f12330e = Collections.emptyMap();
            this.f12326a = request.f12321a;
            this.f12327b = request.f12322b;
            this.f12329d = request.f12324d;
            this.f12330e = request.f12325e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(request.f12325e);
            this.f12328c = request.f12323c.e();
        }

        public final Request a() {
            if (this.f12326a != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        public final void b(String str, RequestBody requestBody) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (requestBody != null && !HttpMethod.b(str)) {
                throw new IllegalArgumentException(g.e("method ", str, " must not have a request body."));
            }
            if (requestBody == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                    throw new IllegalArgumentException(g.e("method ", str, " must have a request body."));
                }
            }
            this.f12327b = str;
            this.f12329d = requestBody;
        }

        public final void c(String str) {
            this.f12328c.c(str);
        }
    }

    public Request(Builder builder) {
        this.f12321a = builder.f12326a;
        this.f12322b = builder.f12327b;
        Headers.Builder builder2 = builder.f12328c;
        builder2.getClass();
        this.f12323c = new Headers(builder2);
        this.f12324d = builder.f12329d;
        Map<Class<?>, Object> map = builder.f12330e;
        byte[] bArr = Util.f12372a;
        this.f12325e = map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public final String a(String str) {
        return this.f12323c.c(str);
    }

    public final String toString() {
        StringBuilder l10 = f.l("Request{method=");
        l10.append(this.f12322b);
        l10.append(", url=");
        l10.append(this.f12321a);
        l10.append(", tags=");
        l10.append(this.f12325e);
        l10.append('}');
        return l10.toString();
    }
}
