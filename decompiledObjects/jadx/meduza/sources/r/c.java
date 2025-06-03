package r;

import java.util.Map;

/* loaded from: classes.dex */
public final class c extends g<Object, Object> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f13465d;

    public c(d dVar) {
        this.f13465d = dVar;
    }

    @Override // r.g
    public final void a() {
        this.f13465d.clear();
    }

    @Override // r.g
    public final Object b(int i10, int i11) {
        return this.f13465d.f13472b[i10];
    }

    @Override // r.g
    public final Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // r.g
    public final int d() {
        return this.f13465d.f13473c;
    }

    @Override // r.g
    public final int e(Object obj) {
        return this.f13465d.indexOf(obj);
    }

    @Override // r.g
    public final int f(Object obj) {
        return this.f13465d.indexOf(obj);
    }

    @Override // r.g
    public final void g(Object obj, Object obj2) {
        this.f13465d.add(obj);
    }

    @Override // r.g
    public final void h(int i10) {
        this.f13465d.l(i10);
    }

    @Override // r.g
    public final Object i(int i10, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}
