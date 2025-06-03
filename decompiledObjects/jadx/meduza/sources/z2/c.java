package z2;

import s7.e;
import z2.a;

/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    public final boolean i(V v10) {
        if (v10 == null) {
            v10 = (V) a.f17482o;
        }
        if (!a.f.b(this, null, v10)) {
            return false;
        }
        a.b(this);
        return true;
    }

    public final boolean j(Throwable th) {
        th.getClass();
        if (!a.f.b(this, null, new a.c(th))) {
            return false;
        }
        a.b(this);
        return true;
    }

    public final boolean k(e<? extends V> eVar) {
        a.c cVar;
        eVar.getClass();
        Object obj = this.f17483a;
        if (obj == null) {
            if (eVar.isDone()) {
                if (!a.f.b(this, null, a.e(eVar))) {
                    return false;
                }
                a.b(this);
            } else {
                a.f fVar = new a.f(this, eVar);
                if (a.f.b(this, null, fVar)) {
                    try {
                        eVar.f(fVar, b.f17506a);
                    } catch (Throwable th) {
                        try {
                            cVar = new a.c(th);
                        } catch (Throwable unused) {
                            cVar = a.c.f17490b;
                        }
                        a.f.b(this, fVar, cVar);
                    }
                } else {
                    obj = this.f17483a;
                }
            }
            return true;
        }
        if (!(obj instanceof a.b)) {
            return false;
        }
        eVar.cancel(((a.b) obj).f17488a);
        return false;
    }
}
