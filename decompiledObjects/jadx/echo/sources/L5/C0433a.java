package L5;

import E5.d;

/* renamed from: L5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0433a extends AbstractC0435c implements Q3.a {
    public C0433a(d.b bVar, String str) {
        super(bVar, str);
    }

    @Override // Q3.a
    public void a(Q3.c cVar) {
        y a7 = y.a(cVar);
        this.f3402a.b(a7.e(), a7.getMessage(), a7.d());
    }

    @Override // Q3.a
    public void c(Q3.b bVar) {
        h("childRemoved", bVar, null);
    }

    @Override // Q3.a
    public void d(Q3.b bVar, String str) {
        h("childMoved", bVar, str);
    }

    @Override // Q3.a
    public void e(Q3.b bVar, String str) {
        h("childChanged", bVar, str);
    }

    @Override // Q3.a
    public void f(Q3.b bVar, String str) {
        h("childAdded", bVar, str);
    }
}
