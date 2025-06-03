package t5;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import t5.d0;

/* loaded from: classes.dex */
public final class f0<T> implements d0.d {

    /* renamed from: a, reason: collision with root package name */
    public final long f14492a;

    /* renamed from: b, reason: collision with root package name */
    public final n f14493b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14494c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f14495d;

    /* renamed from: e, reason: collision with root package name */
    public final a<? extends T> f14496e;
    public volatile T f;

    public interface a<T> {
        Object a(Uri uri, m mVar);
    }

    public f0() {
        throw null;
    }

    public f0(k kVar, Uri uri, int i10, a<? extends T> aVar) {
        Map emptyMap = Collections.emptyMap();
        if (uri == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        n nVar = new n(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.f14495d = new j0(kVar);
        this.f14493b = nVar;
        this.f14494c = i10;
        this.f14496e = aVar;
        this.f14492a = z4.n.f17701b.getAndIncrement();
    }

    @Override // t5.d0.d
    public final void a() {
        this.f14495d.f14524b = 0L;
        m mVar = new m(this.f14495d, this.f14493b);
        try {
            mVar.f();
            Uri l10 = this.f14495d.l();
            l10.getClass();
            this.f = (T) this.f14496e.a(l10, mVar);
        } finally {
            v5.e0.g(mVar);
        }
    }

    @Override // t5.d0.d
    public final void b() {
    }
}
