package okhttp3.internal.http;

import defpackage.f;
import java.util.List;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;

/* loaded from: classes.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a, reason: collision with root package name */
    public final List<Interceptor> f12456a;

    /* renamed from: b, reason: collision with root package name */
    public final StreamAllocation f12457b;

    /* renamed from: c, reason: collision with root package name */
    public final HttpCodec f12458c;

    /* renamed from: d, reason: collision with root package name */
    public final RealConnection f12459d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12460e;
    public final Request f;

    /* renamed from: g, reason: collision with root package name */
    public final Call f12461g;

    /* renamed from: h, reason: collision with root package name */
    public final EventListener f12462h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12463i;

    /* renamed from: j, reason: collision with root package name */
    public final int f12464j;

    /* renamed from: k, reason: collision with root package name */
    public final int f12465k;

    /* renamed from: l, reason: collision with root package name */
    public int f12466l;

    public RealInterceptorChain(List<Interceptor> list, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection, int i10, Request request, Call call, EventListener eventListener, int i11, int i12, int i13) {
        this.f12456a = list;
        this.f12459d = realConnection;
        this.f12457b = streamAllocation;
        this.f12458c = httpCodec;
        this.f12460e = i10;
        this.f = request;
        this.f12461g = call;
        this.f12462h = eventListener;
        this.f12463i = i11;
        this.f12464j = i12;
        this.f12465k = i13;
    }

    @Override // okhttp3.Interceptor.Chain
    public final int a() {
        return this.f12464j;
    }

    @Override // okhttp3.Interceptor.Chain
    public final int b() {
        return this.f12465k;
    }

    public final Response c(Request request) {
        return d(request, this.f12457b, this.f12458c, this.f12459d);
    }

    public final Response d(Request request, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection) {
        if (this.f12460e >= this.f12456a.size()) {
            throw new AssertionError();
        }
        this.f12466l++;
        if (this.f12458c != null && !this.f12459d.j(request.f12321a)) {
            StringBuilder l10 = f.l("network interceptor ");
            l10.append(this.f12456a.get(this.f12460e - 1));
            l10.append(" must retain the same host and port");
            throw new IllegalStateException(l10.toString());
        }
        if (this.f12458c != null && this.f12466l > 1) {
            StringBuilder l11 = f.l("network interceptor ");
            l11.append(this.f12456a.get(this.f12460e - 1));
            l11.append(" must call proceed() exactly once");
            throw new IllegalStateException(l11.toString());
        }
        List<Interceptor> list = this.f12456a;
        int i10 = this.f12460e;
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(list, streamAllocation, httpCodec, realConnection, i10 + 1, request, this.f12461g, this.f12462h, this.f12463i, this.f12464j, this.f12465k);
        Interceptor interceptor = list.get(i10);
        Response a10 = interceptor.a(realInterceptorChain);
        if (httpCodec != null && this.f12460e + 1 < this.f12456a.size() && realInterceptorChain.f12466l != 1) {
            throw new IllegalStateException("network interceptor " + interceptor + " must call proceed() exactly once");
        }
        if (a10 == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (a10.f12340o != null) {
            return a10;
        }
        throw new IllegalStateException("interceptor " + interceptor + " returned a response with no body");
    }
}
