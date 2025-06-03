package okhttp3.internal.cache;

import java.util.Date;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.http.HttpHeaders;

/* loaded from: classes.dex */
public final class CacheStrategy {

    /* renamed from: a, reason: collision with root package name */
    public final Request f12395a;

    /* renamed from: b, reason: collision with root package name */
    public final Response f12396b;

    public static class Factory {

        /* renamed from: a, reason: collision with root package name */
        public Date f12397a;

        /* renamed from: b, reason: collision with root package name */
        public String f12398b;

        /* renamed from: c, reason: collision with root package name */
        public Date f12399c;

        /* renamed from: d, reason: collision with root package name */
        public String f12400d;

        /* renamed from: e, reason: collision with root package name */
        public Date f12401e;
        public long f;

        /* renamed from: g, reason: collision with root package name */
        public long f12402g;

        /* renamed from: h, reason: collision with root package name */
        public String f12403h;

        /* renamed from: i, reason: collision with root package name */
        public int f12404i;

        public Factory(long j10, Request request, Response response) {
            this.f12404i = -1;
            if (response != null) {
                this.f = response.f12344s;
                this.f12402g = response.t;
                Headers headers = response.f;
                int length = headers.f12242a.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    String d10 = headers.d(i10);
                    String f = headers.f(i10);
                    if ("Date".equalsIgnoreCase(d10)) {
                        this.f12397a = HttpDate.a(f);
                        this.f12398b = f;
                    } else if ("Expires".equalsIgnoreCase(d10)) {
                        this.f12401e = HttpDate.a(f);
                    } else if ("Last-Modified".equalsIgnoreCase(d10)) {
                        this.f12399c = HttpDate.a(f);
                        this.f12400d = f;
                    } else if ("ETag".equalsIgnoreCase(d10)) {
                        this.f12403h = f;
                    } else if ("Age".equalsIgnoreCase(d10)) {
                        this.f12404i = HttpHeaders.c(-1, f);
                    }
                }
            }
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.f12395a = request;
        this.f12396b = response;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        if (r4.f().f12164e == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(okhttp3.Request r3, okhttp3.Response r4) {
        /*
            int r0 = r4.f12337c
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L52
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L52
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L52
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L52
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L52
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L52
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L2f
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L52
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L52
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L52
            switch(r0) {
                case 300: goto L52;
                case 301: goto L52;
                case 302: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L51
        L2f:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r4.g(r0)
            if (r0 != 0) goto L52
            okhttp3.CacheControl r0 = r4.f()
            int r0 = r0.f12162c
            r1 = -1
            if (r0 != r1) goto L52
            okhttp3.CacheControl r0 = r4.f()
            boolean r0 = r0.f
            if (r0 != 0) goto L52
            okhttp3.CacheControl r0 = r4.f()
            boolean r0 = r0.f12164e
            if (r0 == 0) goto L51
            goto L52
        L51:
            return r2
        L52:
            okhttp3.CacheControl r4 = r4.f()
            boolean r4 = r4.f12161b
            if (r4 != 0) goto L6c
            okhttp3.CacheControl r4 = r3.f
            if (r4 == 0) goto L5f
            goto L67
        L5f:
            okhttp3.Headers r4 = r3.f12323c
            okhttp3.CacheControl r4 = okhttp3.CacheControl.a(r4)
            r3.f = r4
        L67:
            boolean r3 = r4.f12161b
            if (r3 != 0) goto L6c
            r2 = 1
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheStrategy.a(okhttp3.Request, okhttp3.Response):boolean");
    }
}
