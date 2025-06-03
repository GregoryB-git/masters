package x1;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f20989a;

    /* renamed from: b, reason: collision with root package name */
    public final F f20990b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20991c;

    /* renamed from: d, reason: collision with root package name */
    public long f20992d;

    /* renamed from: e, reason: collision with root package name */
    public long f20993e;

    /* renamed from: f, reason: collision with root package name */
    public long f20994f;

    public V(Handler handler, F request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f20989a = handler;
        this.f20990b = request;
        this.f20991c = C2146B.A();
    }

    public final void a(long j7) {
        long j8 = this.f20992d + j7;
        this.f20992d = j8;
        if (j8 >= this.f20993e + this.f20991c || j8 >= this.f20994f) {
            c();
        }
    }

    public final void b(long j7) {
        this.f20994f += j7;
    }

    public final void c() {
        if (this.f20992d > this.f20993e) {
            this.f20990b.o();
        }
    }
}
