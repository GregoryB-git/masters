package okhttp3.internal.http1;

import a0.j;
import ec.i;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import xc.f;
import xc.g;
import xc.h;
import xc.l;
import xc.s;
import xc.w;
import xc.y;
import xc.z;

/* loaded from: classes.dex */
public final class Http1Codec implements HttpCodec {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f12477a;

    /* renamed from: b, reason: collision with root package name */
    public final StreamAllocation f12478b;

    /* renamed from: c, reason: collision with root package name */
    public final h f12479c;

    /* renamed from: d, reason: collision with root package name */
    public final g f12480d;

    /* renamed from: e, reason: collision with root package name */
    public int f12481e = 0;
    public long f = 262144;

    public abstract class AbstractSource implements y {

        /* renamed from: a, reason: collision with root package name */
        public final l f12482a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f12483b;

        /* renamed from: c, reason: collision with root package name */
        public long f12484c = 0;

        public AbstractSource() {
            this.f12482a = new l(Http1Codec.this.f12479c.c());
        }

        @Override // xc.y
        public final z c() {
            return this.f12482a;
        }

        @Override // xc.y
        public long e0(f fVar, long j10) {
            try {
                long e02 = Http1Codec.this.f12479c.e0(fVar, j10);
                if (e02 > 0) {
                    this.f12484c += e02;
                }
                return e02;
            } catch (IOException e10) {
                f(e10, false);
                throw e10;
            }
        }

        public final void f(IOException iOException, boolean z10) {
            int i10 = Http1Codec.this.f12481e;
            if (i10 == 6) {
                return;
            }
            if (i10 != 5) {
                StringBuilder l10 = defpackage.f.l("state: ");
                l10.append(Http1Codec.this.f12481e);
                throw new IllegalStateException(l10.toString());
            }
            Http1Codec.g(this.f12482a);
            Http1Codec http1Codec = Http1Codec.this;
            http1Codec.f12481e = 6;
            StreamAllocation streamAllocation = http1Codec.f12478b;
            if (streamAllocation != null) {
                streamAllocation.i(!z10, http1Codec, iOException);
            }
        }
    }

    public final class ChunkedSink implements w {

        /* renamed from: a, reason: collision with root package name */
        public final l f12486a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f12487b;

        public ChunkedSink() {
            this.f12486a = new l(Http1Codec.this.f12480d.c());
        }

        @Override // xc.w
        public final z c() {
            return this.f12486a;
        }

        @Override // xc.w, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f12487b) {
                return;
            }
            this.f12487b = true;
            Http1Codec.this.f12480d.O("0\r\n\r\n");
            Http1Codec http1Codec = Http1Codec.this;
            l lVar = this.f12486a;
            http1Codec.getClass();
            Http1Codec.g(lVar);
            Http1Codec.this.f12481e = 3;
        }

        @Override // xc.w, java.io.Flushable
        public final synchronized void flush() {
            if (this.f12487b) {
                return;
            }
            Http1Codec.this.f12480d.flush();
        }

        @Override // xc.w
        public final void g0(f fVar, long j10) {
            if (this.f12487b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            Http1Codec.this.f12480d.Y(j10);
            Http1Codec.this.f12480d.O("\r\n");
            Http1Codec.this.f12480d.g0(fVar, j10);
            Http1Codec.this.f12480d.O("\r\n");
        }
    }

    public class ChunkedSource extends AbstractSource {

        /* renamed from: e, reason: collision with root package name */
        public final HttpUrl f12489e;
        public long f;

        /* renamed from: o, reason: collision with root package name */
        public boolean f12490o;

        public ChunkedSource(HttpUrl httpUrl) {
            super();
            this.f = -1L;
            this.f12490o = true;
            this.f12489e = httpUrl;
        }

        @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean z10;
            if (this.f12483b) {
                return;
            }
            if (this.f12490o) {
                try {
                    z10 = Util.s(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    z10 = false;
                }
                if (!z10) {
                    f(null, false);
                }
            }
            this.f12483b = true;
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, xc.y
        public final long e0(f fVar, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(j.i("byteCount < 0: ", j10));
            }
            if (this.f12483b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f12490o) {
                return -1L;
            }
            long j11 = this.f;
            if (j11 == 0 || j11 == -1) {
                if (j11 != -1) {
                    Http1Codec.this.f12479c.f0();
                }
                try {
                    this.f = Http1Codec.this.f12479c.x0();
                    String trim = Http1Codec.this.f12479c.f0().trim();
                    if (this.f < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f + trim + "\"");
                    }
                    if (this.f == 0) {
                        this.f12490o = false;
                        Http1Codec http1Codec = Http1Codec.this;
                        CookieJar cookieJar = http1Codec.f12477a.f12272q;
                        HttpUrl httpUrl = this.f12489e;
                        Headers.Builder builder = new Headers.Builder();
                        while (true) {
                            String E = http1Codec.f12479c.E(http1Codec.f);
                            http1Codec.f -= E.length();
                            if (E.length() == 0) {
                                break;
                            }
                            Internal.f12370a.a(builder, E);
                        }
                        HttpHeaders.d(cookieJar, httpUrl, new Headers(builder));
                        f(null, true);
                    }
                    if (!this.f12490o) {
                        return -1L;
                    }
                } catch (NumberFormatException e10) {
                    throw new ProtocolException(e10.getMessage());
                }
            }
            long e02 = super.e0(fVar, Math.min(j10, this.f));
            if (e02 != -1) {
                this.f -= e02;
                return e02;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            f(protocolException, false);
            throw protocolException;
        }
    }

    public final class FixedLengthSink implements w {

        /* renamed from: a, reason: collision with root package name */
        public final l f12492a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f12493b;

        /* renamed from: c, reason: collision with root package name */
        public long f12494c;

        public FixedLengthSink(long j10) {
            this.f12492a = new l(Http1Codec.this.f12480d.c());
            this.f12494c = j10;
        }

        @Override // xc.w
        public final z c() {
            return this.f12492a;
        }

        @Override // xc.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f12493b) {
                return;
            }
            this.f12493b = true;
            if (this.f12494c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            Http1Codec http1Codec = Http1Codec.this;
            l lVar = this.f12492a;
            http1Codec.getClass();
            Http1Codec.g(lVar);
            Http1Codec.this.f12481e = 3;
        }

        @Override // xc.w, java.io.Flushable
        public final void flush() {
            if (this.f12493b) {
                return;
            }
            Http1Codec.this.f12480d.flush();
        }

        @Override // xc.w
        public final void g0(f fVar, long j10) {
            if (this.f12493b) {
                throw new IllegalStateException("closed");
            }
            long j11 = fVar.f17252b;
            byte[] bArr = Util.f12372a;
            if ((j10 | 0) < 0 || 0 > j11 || j11 - 0 < j10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (j10 <= this.f12494c) {
                Http1Codec.this.f12480d.g0(fVar, j10);
                this.f12494c -= j10;
            } else {
                StringBuilder l10 = defpackage.f.l("expected ");
                l10.append(this.f12494c);
                l10.append(" bytes but received ");
                l10.append(j10);
                throw new ProtocolException(l10.toString());
            }
        }
    }

    public class FixedLengthSource extends AbstractSource {

        /* renamed from: e, reason: collision with root package name */
        public long f12496e;

        public FixedLengthSource(Http1Codec http1Codec, long j10) {
            super();
            this.f12496e = j10;
            if (j10 == 0) {
                f(null, true);
            }
        }

        @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean z10;
            if (this.f12483b) {
                return;
            }
            if (this.f12496e != 0) {
                try {
                    z10 = Util.s(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    z10 = false;
                }
                if (!z10) {
                    f(null, false);
                }
            }
            this.f12483b = true;
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, xc.y
        public final long e0(f fVar, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(j.i("byteCount < 0: ", j10));
            }
            if (this.f12483b) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f12496e;
            if (j11 == 0) {
                return -1L;
            }
            long e02 = super.e0(fVar, Math.min(j11, j10));
            if (e02 == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                f(protocolException, false);
                throw protocolException;
            }
            long j12 = this.f12496e - e02;
            this.f12496e = j12;
            if (j12 == 0) {
                f(null, true);
            }
            return e02;
        }
    }

    public class UnknownLengthSource extends AbstractSource {

        /* renamed from: e, reason: collision with root package name */
        public boolean f12497e;

        public UnknownLengthSource(Http1Codec http1Codec) {
            super();
        }

        @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f12483b) {
                return;
            }
            if (!this.f12497e) {
                f(null, false);
            }
            this.f12483b = true;
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, xc.y
        public final long e0(f fVar, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(j.i("byteCount < 0: ", j10));
            }
            if (this.f12483b) {
                throw new IllegalStateException("closed");
            }
            if (this.f12497e) {
                return -1L;
            }
            long e02 = super.e0(fVar, j10);
            if (e02 != -1) {
                return e02;
            }
            this.f12497e = true;
            f(null, true);
            return -1L;
        }
    }

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation, h hVar, g gVar) {
        this.f12477a = okHttpClient;
        this.f12478b = streamAllocation;
        this.f12479c = hVar;
        this.f12480d = gVar;
    }

    public static void g(l lVar) {
        z zVar = lVar.f17265e;
        z.a aVar = z.f17297d;
        i.e(aVar, "delegate");
        lVar.f17265e = aVar;
        zVar.a();
        zVar.b();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void a() {
        this.f12480d.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void b(Request request) {
        Proxy.Type type = this.f12478b.b().f12413c.f12362b.type();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f12322b);
        sb2.append(' ');
        if (!request.f12321a.f12245a.equals("https") && type == Proxy.Type.HTTP) {
            sb2.append(request.f12321a);
        } else {
            sb2.append(RequestLine.a(request.f12321a));
        }
        sb2.append(" HTTP/1.1");
        i(request.f12323c, sb2.toString());
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final RealResponseBody c(Response response) {
        this.f12478b.f.getClass();
        String g10 = response.g("Content-Type");
        if (!HttpHeaders.b(response)) {
            return new RealResponseBody(g10, 0L, new s(h(0L)));
        }
        if ("chunked".equalsIgnoreCase(response.g("Transfer-Encoding"))) {
            HttpUrl httpUrl = response.f12335a.f12321a;
            if (this.f12481e == 4) {
                this.f12481e = 5;
                return new RealResponseBody(g10, -1L, new s(new ChunkedSource(httpUrl)));
            }
            StringBuilder l10 = defpackage.f.l("state: ");
            l10.append(this.f12481e);
            throw new IllegalStateException(l10.toString());
        }
        long a10 = HttpHeaders.a(response);
        if (a10 != -1) {
            return new RealResponseBody(g10, a10, new s(h(a10)));
        }
        if (this.f12481e != 4) {
            StringBuilder l11 = defpackage.f.l("state: ");
            l11.append(this.f12481e);
            throw new IllegalStateException(l11.toString());
        }
        StreamAllocation streamAllocation = this.f12478b;
        if (streamAllocation == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f12481e = 5;
        streamAllocation.f();
        return new RealResponseBody(g10, -1L, new s(new UnknownLengthSource(this)));
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void cancel() {
        RealConnection b10 = this.f12478b.b();
        if (b10 != null) {
            Util.f(b10.f12414d);
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final Response.Builder d(boolean z10) {
        int i10 = this.f12481e;
        if (i10 != 1 && i10 != 3) {
            StringBuilder l10 = defpackage.f.l("state: ");
            l10.append(this.f12481e);
            throw new IllegalStateException(l10.toString());
        }
        try {
            String E = this.f12479c.E(this.f);
            this.f -= E.length();
            StatusLine a10 = StatusLine.a(E);
            Response.Builder builder = new Response.Builder();
            builder.f12347b = a10.f12474a;
            builder.f12348c = a10.f12475b;
            builder.f12349d = a10.f12476c;
            Headers.Builder builder2 = new Headers.Builder();
            while (true) {
                String E2 = this.f12479c.E(this.f);
                this.f -= E2.length();
                if (E2.length() == 0) {
                    break;
                }
                Internal.f12370a.a(builder2, E2);
            }
            builder.f = new Headers(builder2).e();
            if (z10 && a10.f12475b == 100) {
                return null;
            }
            if (a10.f12475b == 100) {
                this.f12481e = 3;
                return builder;
            }
            this.f12481e = 4;
            return builder;
        } catch (EOFException e10) {
            StringBuilder l11 = defpackage.f.l("unexpected end of stream on ");
            l11.append(this.f12478b);
            IOException iOException = new IOException(l11.toString());
            iOException.initCause(e10);
            throw iOException;
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void e() {
        this.f12480d.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final w f(Request request, long j10) {
        if ("chunked".equalsIgnoreCase(request.a("Transfer-Encoding"))) {
            if (this.f12481e == 1) {
                this.f12481e = 2;
                return new ChunkedSink();
            }
            StringBuilder l10 = defpackage.f.l("state: ");
            l10.append(this.f12481e);
            throw new IllegalStateException(l10.toString());
        }
        if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f12481e == 1) {
            this.f12481e = 2;
            return new FixedLengthSink(j10);
        }
        StringBuilder l11 = defpackage.f.l("state: ");
        l11.append(this.f12481e);
        throw new IllegalStateException(l11.toString());
    }

    public final y h(long j10) {
        if (this.f12481e == 4) {
            this.f12481e = 5;
            return new FixedLengthSource(this, j10);
        }
        StringBuilder l10 = defpackage.f.l("state: ");
        l10.append(this.f12481e);
        throw new IllegalStateException(l10.toString());
    }

    public final void i(Headers headers, String str) {
        if (this.f12481e != 0) {
            StringBuilder l10 = defpackage.f.l("state: ");
            l10.append(this.f12481e);
            throw new IllegalStateException(l10.toString());
        }
        this.f12480d.O(str).O("\r\n");
        int length = headers.f12242a.length / 2;
        for (int i10 = 0; i10 < length; i10++) {
            this.f12480d.O(headers.d(i10)).O(": ").O(headers.f(i10)).O("\r\n");
        }
        this.f12480d.O("\r\n");
        this.f12481e = 1;
    }
}
