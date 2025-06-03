package r0;

import B0.p;
import java.util.List;
import v0.C2048b;

/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f18948a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18949b;

    public e(j jVar, List list) {
        this.f18948a = jVar;
        this.f18949b = list;
    }

    @Override // r0.j
    public p.a a(g gVar, f fVar) {
        return new C2048b(this.f18948a.a(gVar, fVar), this.f18949b);
    }

    @Override // r0.j
    public p.a b() {
        return new C2048b(this.f18948a.b(), this.f18949b);
    }
}
