package B0;

import B0.n;
import android.net.Uri;
import g0.AbstractC1297a;
import g0.M;
import i0.k;
import i0.x;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class p implements n.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f651a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.k f652b;

    /* renamed from: c, reason: collision with root package name */
    public final int f653c;

    /* renamed from: d, reason: collision with root package name */
    public final x f654d;

    /* renamed from: e, reason: collision with root package name */
    public final a f655e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f656f;

    public interface a {
        Object a(Uri uri, InputStream inputStream);
    }

    public p(i0.g gVar, Uri uri, int i7, a aVar) {
        this(gVar, new k.b().i(uri).b(1).a(), i7, aVar);
    }

    public long a() {
        return this.f654d.q();
    }

    @Override // B0.n.e
    public final void b() {
        this.f654d.t();
        i0.i iVar = new i0.i(this.f654d, this.f652b);
        try {
            iVar.b();
            this.f656f = this.f655e.a((Uri) AbstractC1297a.e(this.f654d.k()), iVar);
        } finally {
            M.m(iVar);
        }
    }

    public Map d() {
        return this.f654d.s();
    }

    public final Object e() {
        return this.f656f;
    }

    public Uri f() {
        return this.f654d.r();
    }

    public p(i0.g gVar, i0.k kVar, int i7, a aVar) {
        this.f654d = new x(gVar);
        this.f652b = kVar;
        this.f653c = i7;
        this.f655e = aVar;
        this.f651a = x0.r.a();
    }

    @Override // B0.n.e
    public final void c() {
    }
}
