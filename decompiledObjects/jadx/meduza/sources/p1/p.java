package p1;

import b.z;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final j f12848a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f12849b;

    /* renamed from: c, reason: collision with root package name */
    public final rb.g f12850c;

    public static final class a extends ec.j implements dc.a<t1.f> {
        public a() {
            super(0);
        }

        @Override // dc.a
        public final t1.f invoke() {
            return p.this.b();
        }
    }

    public p(j jVar) {
        ec.i.e(jVar, "database");
        this.f12848a = jVar;
        this.f12849b = new AtomicBoolean(false);
        this.f12850c = z.n(new a());
    }

    public final t1.f a() {
        this.f12848a.a();
        return this.f12849b.compareAndSet(false, true) ? (t1.f) this.f12850c.getValue() : b();
    }

    public final t1.f b() {
        String c10 = c();
        j jVar = this.f12848a;
        jVar.getClass();
        ec.i.e(c10, "sql");
        jVar.a();
        jVar.b();
        return jVar.g().getWritableDatabase().q(c10);
    }

    public abstract String c();

    public final void d(t1.f fVar) {
        ec.i.e(fVar, "statement");
        if (fVar == ((t1.f) this.f12850c.getValue())) {
            this.f12849b.set(false);
        }
    }
}
