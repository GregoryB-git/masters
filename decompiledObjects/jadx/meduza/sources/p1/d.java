package p1;

/* loaded from: classes.dex */
public abstract class d extends p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, int i10) {
        super(jVar);
        if (i10 != 1) {
            ec.i.e(jVar, "database");
        } else {
            ec.i.e(jVar, "database");
            super(jVar);
        }
    }

    public abstract void e(t1.f fVar, Object obj);

    public final void f(Object obj) {
        t1.f a10 = a();
        try {
            e(a10, obj);
            a10.w0();
        } finally {
            d(a10);
        }
    }
}
