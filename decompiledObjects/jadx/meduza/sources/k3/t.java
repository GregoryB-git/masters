package k3;

import java.util.Set;

/* loaded from: classes.dex */
public final class t implements h3.i {

    /* renamed from: a, reason: collision with root package name */
    public final Set<h3.c> f8913a;

    /* renamed from: b, reason: collision with root package name */
    public final s f8914b;

    /* renamed from: c, reason: collision with root package name */
    public final v f8915c;

    public t(Set set, j jVar, v vVar) {
        this.f8913a = set;
        this.f8914b = jVar;
        this.f8915c = vVar;
    }

    @Override // h3.i
    public final u a(String str, h3.c cVar, h3.g gVar) {
        if (this.f8913a.contains(cVar)) {
            return new u(this.f8914b, str, cVar, gVar, this.f8915c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f8913a));
    }
}
