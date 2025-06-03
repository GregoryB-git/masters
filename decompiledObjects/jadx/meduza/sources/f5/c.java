package f5;

import java.util.List;
import t5.f0;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f5371a;

    /* renamed from: b, reason: collision with root package name */
    public final List<y4.c> f5372b;

    public c(a aVar, List list) {
        this.f5371a = aVar;
        this.f5372b = list;
    }

    @Override // f5.i
    public final f0.a<g> a(f fVar, e eVar) {
        return new y4.b(this.f5371a.a(fVar, eVar), this.f5372b);
    }

    @Override // f5.i
    public final f0.a<g> b() {
        return new y4.b(this.f5371a.b(), this.f5372b);
    }
}
