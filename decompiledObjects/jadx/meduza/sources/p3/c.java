package p3;

import h3.j;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import k3.h;
import k3.w;
import q3.n;

/* loaded from: classes.dex */
public final class c implements d {
    public static final Logger f = Logger.getLogger(w.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final n f12984a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f12985b;

    /* renamed from: c, reason: collision with root package name */
    public final l3.e f12986c;

    /* renamed from: d, reason: collision with root package name */
    public final r3.d f12987d;

    /* renamed from: e, reason: collision with root package name */
    public final s3.b f12988e;

    public c(Executor executor, l3.e eVar, n nVar, r3.d dVar, s3.b bVar) {
        this.f12985b = executor;
        this.f12986c = eVar;
        this.f12984a = nVar;
        this.f12987d = dVar;
        this.f12988e = bVar;
    }

    @Override // p3.d
    public final void a(j jVar, h hVar, k3.j jVar2) {
        this.f12985b.execute(new a(this, jVar2, jVar, hVar, 0));
    }
}
