package D4;

import A4.e;
import E4.c;
import E4.d;
import E4.f;
import E4.g;
import E4.h;
import q5.AbstractC1906b;
import q5.C1905a;

/* loaded from: classes.dex */
public final class a implements D4.b {

    /* renamed from: a, reason: collision with root package name */
    public U5.a f1264a;

    /* renamed from: b, reason: collision with root package name */
    public U5.a f1265b;

    /* renamed from: c, reason: collision with root package name */
    public U5.a f1266c;

    /* renamed from: d, reason: collision with root package name */
    public U5.a f1267d;

    /* renamed from: e, reason: collision with root package name */
    public U5.a f1268e;

    /* renamed from: f, reason: collision with root package name */
    public U5.a f1269f;

    /* renamed from: g, reason: collision with root package name */
    public U5.a f1270g;

    /* renamed from: h, reason: collision with root package name */
    public U5.a f1271h;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public E4.a f1272a;

        public b() {
        }

        public D4.b a() {
            AbstractC1906b.a(this.f1272a, E4.a.class);
            return new a(this.f1272a);
        }

        public b b(E4.a aVar) {
            this.f1272a = (E4.a) AbstractC1906b.b(aVar);
            return this;
        }
    }

    public a(E4.a aVar) {
        c(aVar);
    }

    public static b b() {
        return new b();
    }

    @Override // D4.b
    public e a() {
        return (e) this.f1271h.get();
    }

    public final void c(E4.a aVar) {
        this.f1264a = c.a(aVar);
        this.f1265b = E4.e.a(aVar);
        this.f1266c = d.a(aVar);
        this.f1267d = h.a(aVar);
        this.f1268e = f.a(aVar);
        this.f1269f = E4.b.a(aVar);
        g a7 = g.a(aVar);
        this.f1270g = a7;
        this.f1271h = C1905a.a(A4.g.a(this.f1264a, this.f1265b, this.f1266c, this.f1267d, this.f1268e, this.f1269f, a7));
    }
}
