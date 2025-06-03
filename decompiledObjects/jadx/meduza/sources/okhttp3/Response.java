package okhttp3;

import defpackage.f;
import defpackage.g;
import java.io.Closeable;
import okhttp3.Headers;

/* loaded from: classes.dex */
public final class Response implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Request f12335a;

    /* renamed from: b, reason: collision with root package name */
    public final Protocol f12336b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12337c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12338d;

    /* renamed from: e, reason: collision with root package name */
    public final Handshake f12339e;
    public final Headers f;

    /* renamed from: o, reason: collision with root package name */
    public final ResponseBody f12340o;

    /* renamed from: p, reason: collision with root package name */
    public final Response f12341p;

    /* renamed from: q, reason: collision with root package name */
    public final Response f12342q;

    /* renamed from: r, reason: collision with root package name */
    public final Response f12343r;

    /* renamed from: s, reason: collision with root package name */
    public final long f12344s;
    public final long t;

    /* renamed from: u, reason: collision with root package name */
    public volatile CacheControl f12345u;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Request f12346a;

        /* renamed from: b, reason: collision with root package name */
        public Protocol f12347b;

        /* renamed from: c, reason: collision with root package name */
        public int f12348c;

        /* renamed from: d, reason: collision with root package name */
        public String f12349d;

        /* renamed from: e, reason: collision with root package name */
        public Handshake f12350e;
        public Headers.Builder f;

        /* renamed from: g, reason: collision with root package name */
        public ResponseBody f12351g;

        /* renamed from: h, reason: collision with root package name */
        public Response f12352h;

        /* renamed from: i, reason: collision with root package name */
        public Response f12353i;

        /* renamed from: j, reason: collision with root package name */
        public Response f12354j;

        /* renamed from: k, reason: collision with root package name */
        public long f12355k;

        /* renamed from: l, reason: collision with root package name */
        public long f12356l;

        public Builder() {
            this.f12348c = -1;
            this.f = new Headers.Builder();
        }

        public Builder(Response response) {
            this.f12348c = -1;
            this.f12346a = response.f12335a;
            this.f12347b = response.f12336b;
            this.f12348c = response.f12337c;
            this.f12349d = response.f12338d;
            this.f12350e = response.f12339e;
            this.f = response.f.e();
            this.f12351g = response.f12340o;
            this.f12352h = response.f12341p;
            this.f12353i = response.f12342q;
            this.f12354j = response.f12343r;
            this.f12355k = response.f12344s;
            this.f12356l = response.t;
        }

        public static void b(String str, Response response) {
            if (response.f12340o != null) {
                throw new IllegalArgumentException(g.d(str, ".body != null"));
            }
            if (response.f12341p != null) {
                throw new IllegalArgumentException(g.d(str, ".networkResponse != null"));
            }
            if (response.f12342q != null) {
                throw new IllegalArgumentException(g.d(str, ".cacheResponse != null"));
            }
            if (response.f12343r != null) {
                throw new IllegalArgumentException(g.d(str, ".priorResponse != null"));
            }
        }

        public final Response a() {
            if (this.f12346a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f12347b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f12348c >= 0) {
                if (this.f12349d != null) {
                    return new Response(this);
                }
                throw new IllegalStateException("message == null");
            }
            StringBuilder l10 = f.l("code < 0: ");
            l10.append(this.f12348c);
            throw new IllegalStateException(l10.toString());
        }
    }

    public Response(Builder builder) {
        this.f12335a = builder.f12346a;
        this.f12336b = builder.f12347b;
        this.f12337c = builder.f12348c;
        this.f12338d = builder.f12349d;
        this.f12339e = builder.f12350e;
        Headers.Builder builder2 = builder.f;
        builder2.getClass();
        this.f = new Headers(builder2);
        this.f12340o = builder.f12351g;
        this.f12341p = builder.f12352h;
        this.f12342q = builder.f12353i;
        this.f12343r = builder.f12354j;
        this.f12344s = builder.f12355k;
        this.t = builder.f12356l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ResponseBody responseBody = this.f12340o;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    public final CacheControl f() {
        CacheControl cacheControl = this.f12345u;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl a10 = CacheControl.a(this.f);
        this.f12345u = a10;
        return a10;
    }

    public final String g(String str) {
        String c10 = this.f.c(str);
        if (c10 != null) {
            return c10;
        }
        return null;
    }

    public final String toString() {
        StringBuilder l10 = f.l("Response{protocol=");
        l10.append(this.f12336b);
        l10.append(", code=");
        l10.append(this.f12337c);
        l10.append(", message=");
        l10.append(this.f12338d);
        l10.append(", url=");
        l10.append(this.f12335a.f12321a);
        l10.append('}');
        return l10.toString();
    }
}
