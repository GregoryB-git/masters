package okhttp3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import o9.e;
import okhttp3.HttpUrl;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import xc.c;

/* loaded from: classes.dex */
final class RealCall implements Call {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f12312a;

    /* renamed from: b, reason: collision with root package name */
    public final RetryAndFollowUpInterceptor f12313b;

    /* renamed from: c, reason: collision with root package name */
    public final c f12314c;

    /* renamed from: d, reason: collision with root package name */
    public EventListener f12315d;

    /* renamed from: e, reason: collision with root package name */
    public final Request f12316e;
    public final boolean f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12317o;

    public final class AsyncCall extends NamedRunnable {

        /* renamed from: b, reason: collision with root package name */
        public final Callback f12319b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public AsyncCall(o9.e.a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                okhttp3.RealCall.this = r1
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                okhttp3.Request r1 = r1.f12316e
                okhttp3.HttpUrl r1 = r1.f12321a
                r1.getClass()
                java.lang.String r3 = "/..."
                okhttp3.HttpUrl$Builder r4 = new okhttp3.HttpUrl$Builder     // Catch: java.lang.IllegalArgumentException -> L1b
                r4.<init>()     // Catch: java.lang.IllegalArgumentException -> L1b
                r4.b(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L1b
                goto L1c
            L1b:
                r4 = 0
            L1c:
                r4.getClass()
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 1
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 1
                java.lang.String r11 = ""
                java.lang.String r12 = " \"':;<=>@[]^`{}|/\\?#"
                java.lang.String r1 = okhttp3.HttpUrl.b(r11, r12, r13, r14, r15, r16)
                r4.f12254b = r1
                java.lang.String r5 = ""
                java.lang.String r6 = " \"':;<=>@[]^`{}|/\\?#"
                java.lang.String r1 = okhttp3.HttpUrl.b(r5, r6, r7, r8, r9, r10)
                r4.f12255c = r1
                okhttp3.HttpUrl r1 = r4.a()
                java.lang.String r1 = r1.f12252i
                r3 = 0
                r2[r3] = r1
                java.lang.String r1 = "OkHttp %s"
                r0.<init>(r1, r2)
                r1 = r19
                r0.f12319b = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RealCall.AsyncCall.<init>(okhttp3.RealCall, o9.e$a):void");
        }

        @Override // okhttp3.internal.NamedRunnable
        public final void k() {
            boolean z10;
            IOException e10;
            OkHttpClient okHttpClient;
            RealCall.this.f12314c.h();
            boolean z11 = false;
            try {
                try {
                    z10 = true;
                    try {
                        this.f12319b.a(RealCall.this, RealCall.this.b());
                        okHttpClient = RealCall.this.f12312a;
                    } catch (IOException e11) {
                        e10 = e11;
                        if (RealCall.this.f12314c.i()) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                            interruptedIOException.initCause(e10);
                            e10 = interruptedIOException;
                        }
                        if (z10) {
                            Platform.f12669a.l(4, "Callback failure for " + RealCall.this.c(), e10);
                        } else {
                            RealCall.this.f12315d.getClass();
                            this.f12319b.b(RealCall.this, e10);
                        }
                        okHttpClient = RealCall.this.f12312a;
                        okHttpClient.f12265a.a(this);
                    } catch (Throwable th) {
                        th = th;
                        z11 = true;
                        RealCall.this.a();
                        if (!z11) {
                            this.f12319b.b(RealCall.this, new IOException("canceled due to " + th));
                        }
                        throw th;
                    }
                } catch (IOException e12) {
                    z10 = false;
                    e10 = e12;
                } catch (Throwable th2) {
                    th = th2;
                }
                okHttpClient.f12265a.a(this);
            } catch (Throwable th3) {
                RealCall.this.f12312a.f12265a.a(this);
                throw th3;
            }
        }
    }

    public RealCall(OkHttpClient okHttpClient, Request request, boolean z10) {
        this.f12312a = okHttpClient;
        this.f12316e = request;
        this.f = z10;
        this.f12313b = new RetryAndFollowUpInterceptor(okHttpClient);
        c cVar = new c() { // from class: okhttp3.RealCall.1
            @Override // xc.c
            public final void k() {
                RealCall.this.a();
            }
        };
        this.f12314c = cVar;
        cVar.g(okHttpClient.F, TimeUnit.MILLISECONDS);
    }

    @Override // okhttp3.Call
    public final void C(e.a aVar) {
        synchronized (this) {
            if (this.f12317o) {
                throw new IllegalStateException("Already Executed");
            }
            this.f12317o = true;
        }
        this.f12313b.f12472c = Platform.f12669a.j();
        this.f12315d.getClass();
        Dispatcher dispatcher = this.f12312a.f12265a;
        AsyncCall asyncCall = new AsyncCall(this, aVar);
        synchronized (dispatcher) {
            dispatcher.f12232d.add(asyncCall);
        }
        dispatcher.b();
    }

    public final void a() {
        HttpCodec httpCodec;
        RealConnection realConnection;
        RetryAndFollowUpInterceptor retryAndFollowUpInterceptor = this.f12313b;
        retryAndFollowUpInterceptor.f12473d = true;
        StreamAllocation streamAllocation = retryAndFollowUpInterceptor.f12471b;
        if (streamAllocation != null) {
            synchronized (streamAllocation.f12440d) {
                streamAllocation.f12448m = true;
                httpCodec = streamAllocation.f12449n;
                realConnection = streamAllocation.f12445j;
            }
            if (httpCodec != null) {
                httpCodec.cancel();
            } else if (realConnection != null) {
                Util.f(realConnection.f12414d);
            }
        }
    }

    public final Response b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f12312a.f12269e);
        arrayList.add(this.f12313b);
        arrayList.add(new BridgeInterceptor(this.f12312a.f12272q));
        OkHttpClient okHttpClient = this.f12312a;
        arrayList.add(new CacheInterceptor(okHttpClient.f12273r != null ? null : okHttpClient.f12274s));
        arrayList.add(new ConnectInterceptor(this.f12312a));
        if (!this.f) {
            arrayList.addAll(this.f12312a.f);
        }
        arrayList.add(new CallServerInterceptor(this.f));
        Request request = this.f12316e;
        EventListener eventListener = this.f12315d;
        OkHttpClient okHttpClient2 = this.f12312a;
        Response c10 = new RealInterceptorChain(arrayList, null, null, null, 0, request, this, eventListener, okHttpClient2.G, okHttpClient2.H, okHttpClient2.I).c(request);
        if (!this.f12313b.f12473d) {
            return c10;
        }
        Util.e(c10);
        throw new IOException("Canceled");
    }

    public final String c() {
        HttpUrl.Builder builder;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f12313b.f12473d ? "canceled " : "");
        sb2.append(this.f ? "web socket" : "call");
        sb2.append(" to ");
        HttpUrl httpUrl = this.f12316e.f12321a;
        httpUrl.getClass();
        try {
            builder = new HttpUrl.Builder();
            builder.b(httpUrl, "/...");
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        builder.getClass();
        builder.f12254b = HttpUrl.b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        builder.f12255c = HttpUrl.b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        sb2.append(builder.a().f12252i);
        return sb2.toString();
    }

    public final Object clone() {
        OkHttpClient okHttpClient = this.f12312a;
        RealCall realCall = new RealCall(okHttpClient, this.f12316e, this.f);
        realCall.f12315d = okHttpClient.f12270o.a();
        return realCall;
    }
}
