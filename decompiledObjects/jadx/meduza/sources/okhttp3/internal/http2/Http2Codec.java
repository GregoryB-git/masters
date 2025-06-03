package okhttp3.internal.http2;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.http2.Http2Stream;
import xc.f;
import xc.i;
import xc.k;
import xc.s;
import xc.w;
import xc.y;

/* loaded from: classes.dex */
public final class Http2Codec implements HttpCodec {
    public static final List<String> f = Util.o("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g, reason: collision with root package name */
    public static final List<String> f12534g = Util.o("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final Interceptor.Chain f12535a;

    /* renamed from: b, reason: collision with root package name */
    public final StreamAllocation f12536b;

    /* renamed from: c, reason: collision with root package name */
    public final Http2Connection f12537c;

    /* renamed from: d, reason: collision with root package name */
    public Http2Stream f12538d;

    /* renamed from: e, reason: collision with root package name */
    public final Protocol f12539e;

    public class StreamFinishingSource extends k {

        /* renamed from: b, reason: collision with root package name */
        public boolean f12540b;

        /* renamed from: c, reason: collision with root package name */
        public long f12541c;

        public StreamFinishingSource(y yVar) {
            super(yVar);
            this.f12540b = false;
            this.f12541c = 0L;
        }

        @Override // xc.k, xc.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            super.close();
            if (this.f12540b) {
                return;
            }
            this.f12540b = true;
            Http2Codec http2Codec = Http2Codec.this;
            http2Codec.f12536b.i(false, http2Codec, null);
        }

        @Override // xc.k, xc.y
        public final long e0(f fVar, long j10) {
            try {
                long e02 = this.f17264a.e0(fVar, j10);
                if (e02 > 0) {
                    this.f12541c += e02;
                }
                return e02;
            } catch (IOException e10) {
                if (!this.f12540b) {
                    this.f12540b = true;
                    Http2Codec http2Codec = Http2Codec.this;
                    http2Codec.f12536b.i(false, http2Codec, e10);
                }
                throw e10;
            }
        }
    }

    public Http2Codec(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain, StreamAllocation streamAllocation, Http2Connection http2Connection) {
        this.f12535a = realInterceptorChain;
        this.f12536b = streamAllocation;
        this.f12537c = http2Connection;
        List<Protocol> list = okHttpClient.f12267c;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f12539e = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void a() {
        Http2Stream http2Stream = this.f12538d;
        synchronized (http2Stream) {
            if (!http2Stream.f && !http2Stream.e()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        http2Stream.f12615h.close();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void b(Request request) {
        int i10;
        Http2Stream http2Stream;
        boolean z10;
        if (this.f12538d != null) {
            return;
        }
        boolean z11 = request.f12324d != null;
        Headers headers = request.f12323c;
        ArrayList arrayList = new ArrayList((headers.f12242a.length / 2) + 4);
        arrayList.add(new Header(Header.f, request.f12322b));
        arrayList.add(new Header(Header.f12507g, RequestLine.a(request.f12321a)));
        String a10 = request.a("Host");
        if (a10 != null) {
            arrayList.add(new Header(Header.f12509i, a10));
        }
        arrayList.add(new Header(Header.f12508h, request.f12321a.f12245a));
        int length = headers.f12242a.length / 2;
        for (int i11 = 0; i11 < length; i11++) {
            i a11 = i.a.a(headers.d(i11).toLowerCase(Locale.US));
            if (!f.contains(a11.t())) {
                arrayList.add(new Header(a11, headers.f(i11)));
            }
        }
        Http2Connection http2Connection = this.f12537c;
        boolean z12 = !z11;
        synchronized (http2Connection.C) {
            synchronized (http2Connection) {
                if (http2Connection.f > 1073741823) {
                    http2Connection.M(ErrorCode.REFUSED_STREAM);
                }
                if (http2Connection.f12548o) {
                    throw new ConnectionShutdownException();
                }
                i10 = http2Connection.f;
                http2Connection.f = i10 + 2;
                http2Stream = new Http2Stream(i10, http2Connection, z12, false, null);
                z10 = !z11 || http2Connection.f12557y == 0 || http2Stream.f12610b == 0;
                if (http2Stream.f()) {
                    http2Connection.f12545c.put(Integer.valueOf(i10), http2Stream);
                }
            }
            Http2Writer http2Writer = http2Connection.C;
            synchronized (http2Writer) {
                if (http2Writer.f12634e) {
                    throw new IOException("closed");
                }
                http2Writer.H(i10, arrayList, z12);
            }
        }
        if (z10) {
            Http2Writer http2Writer2 = http2Connection.C;
            synchronized (http2Writer2) {
                if (http2Writer2.f12634e) {
                    throw new IOException("closed");
                }
                http2Writer2.f12630a.flush();
            }
        }
        this.f12538d = http2Stream;
        Http2Stream.StreamTimeout streamTimeout = http2Stream.f12616i;
        long a12 = this.f12535a.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        streamTimeout.g(a12, timeUnit);
        this.f12538d.f12617j.g(this.f12535a.b(), timeUnit);
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final RealResponseBody c(Response response) {
        this.f12536b.f.getClass();
        return new RealResponseBody(response.g("Content-Type"), HttpHeaders.a(response), new s(new StreamFinishingSource(this.f12538d.f12614g)));
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void cancel() {
        Http2Stream http2Stream = this.f12538d;
        if (http2Stream != null) {
            ErrorCode errorCode = ErrorCode.CANCEL;
            if (http2Stream.d(errorCode)) {
                http2Stream.f12612d.h0(http2Stream.f12611c, errorCode);
            }
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final Response.Builder d(boolean z10) {
        Headers headers;
        Http2Stream http2Stream = this.f12538d;
        synchronized (http2Stream) {
            http2Stream.f12616i.h();
            while (http2Stream.f12613e.isEmpty() && http2Stream.f12618k == null) {
                try {
                    http2Stream.g();
                } catch (Throwable th) {
                    http2Stream.f12616i.l();
                    throw th;
                }
            }
            http2Stream.f12616i.l();
            if (http2Stream.f12613e.isEmpty()) {
                throw new StreamResetException(http2Stream.f12618k);
            }
            headers = (Headers) http2Stream.f12613e.removeFirst();
        }
        Protocol protocol = this.f12539e;
        Headers.Builder builder = new Headers.Builder();
        int length = headers.f12242a.length / 2;
        StatusLine statusLine = null;
        for (int i10 = 0; i10 < length; i10++) {
            String d10 = headers.d(i10);
            String f10 = headers.f(i10);
            if (d10.equals(":status")) {
                statusLine = StatusLine.a("HTTP/1.1 " + f10);
            } else if (!f12534g.contains(d10)) {
                Internal.f12370a.b(builder, d10, f10);
            }
        }
        if (statusLine == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        Response.Builder builder2 = new Response.Builder();
        builder2.f12347b = protocol;
        builder2.f12348c = statusLine.f12475b;
        builder2.f12349d = statusLine.f12476c;
        builder2.f = new Headers(builder).e();
        if (z10 && Internal.f12370a.d(builder2) == 100) {
            return null;
        }
        return builder2;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void e() {
        this.f12537c.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final w f(Request request, long j10) {
        Http2Stream http2Stream = this.f12538d;
        synchronized (http2Stream) {
            if (!http2Stream.f && !http2Stream.e()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return http2Stream.f12615h;
    }
}
