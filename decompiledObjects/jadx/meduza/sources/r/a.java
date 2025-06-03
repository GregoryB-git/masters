package r;

import java.util.Map;

/* loaded from: classes.dex */
public final class a extends g<Object, Object> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f13463d;

    public a(b bVar) {
        this.f13463d = bVar;
    }

    @Override // r.g
    public final void a() {
        this.f13463d.clear();
    }

    @Override // r.g
    public final Object b(int i10, int i11) {
        return this.f13463d.f13499b[(i10 << 1) + i11];
    }

    @Override // r.g
    public final Map<Object, Object> c() {
        return this.f13463d;
    }

    @Override // r.g
    public final int d() {
        return this.f13463d.f13500c;
    }

    @Override // r.g
    public final int e(Object obj) {
        return this.f13463d.f(obj);
    }

    @Override // r.g
    public final int f(Object obj) {
        return this.f13463d.h(obj);
    }

    @Override // r.g
    public final void g(Object obj, Object obj2) {
        this.f13463d.put(obj, obj2);
    }

    @Override // r.g
    public final void h(int i10) {
        this.f13463d.j(i10);
    }

    @Override // r.g
    public final Object i(int i10, Object obj) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f13463d.f13499b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }
}
