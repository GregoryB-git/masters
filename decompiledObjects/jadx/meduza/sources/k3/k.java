package k3;

import android.content.Context;
import java.util.concurrent.Executor;
import k3.o;
import r3.a0;
import r3.f;
import r3.g;
import t3.b;
import t3.c;
import x0.f0;

/* loaded from: classes.dex */
public final class k extends x {

    /* renamed from: a, reason: collision with root package name */
    public qb.a<Executor> f8902a = m3.a.a(o.a.f8909a);

    /* renamed from: b, reason: collision with root package name */
    public m3.c f8903b;

    /* renamed from: c, reason: collision with root package name */
    public qb.a f8904c;

    /* renamed from: d, reason: collision with root package name */
    public a0 f8905d;

    /* renamed from: e, reason: collision with root package name */
    public qb.a<r3.t> f8906e;
    public qb.a<w> f;

    public k(Context context) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        m3.c cVar = new m3.c(context);
        this.f8903b = cVar;
        t3.b bVar = b.a.f14432a;
        t3.c cVar2 = c.a.f14433a;
        this.f8904c = m3.a.a(new l3.l(cVar, new l3.j(cVar, bVar, cVar2)));
        m3.c cVar3 = this.f8903b;
        this.f8905d = new a0(cVar3, f.a.f13556a, g.a.f13557a);
        qb.a<r3.t> a10 = m3.a.a(new r3.u(this.f8905d, m3.a.a(new p3.e(cVar3, 1))));
        this.f8906e = a10;
        p3.e eVar = new p3.e(bVar, 0);
        m3.c cVar4 = this.f8903b;
        p3.f fVar = new p3.f(cVar4, a10, eVar, cVar2, 0);
        qb.a<Executor> aVar = this.f8902a;
        qb.a aVar2 = this.f8904c;
        this.f = m3.a.a(new y(bVar, cVar2, new y(aVar, aVar2, fVar, a10, a10, 1), new q3.l(cVar4, aVar2, a10, fVar, aVar, a10, a10), new f0(aVar, a10, fVar, a10), 0));
    }
}
