package pc;

import n7.w;
import p2.m0;
import pc.j;

/* loaded from: classes.dex */
public final class n<E> extends b<E> {
    public final a t;

    public n(int i10, a aVar, dc.l<? super E, rb.h> lVar) {
        super(i10, lVar);
        this.t = aVar;
        if (aVar != a.SUSPEND) {
            if (!(i10 >= 1)) {
                throw new IllegalArgumentException(a0.j.h("Buffered channel capacity must be at least 1, but ", i10, " was specified").toString());
            }
        } else {
            StringBuilder l10 = defpackage.f.l("This implementation does not support suspension for senders, use ");
            l10.append(ec.t.a(b.class).e());
            l10.append(" instead");
            throw new IllegalArgumentException(l10.toString().toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ec, code lost:
    
        return rb.h.f13851a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object L(E r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.n.L(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // pc.b, pc.t
    public final Object k(E e10, ub.e<? super rb.h> eVar) {
        w k10;
        Object L = L(e10, true);
        boolean z10 = L instanceof j.a;
        if (!z10) {
            return rb.h.f13851a;
        }
        if (z10) {
        }
        dc.l<E, rb.h> lVar = this.f13126b;
        if (lVar == null || (k10 = m0.k(lVar, e10, null)) == null) {
            throw t();
        }
        x6.b.e(k10, t());
        throw k10;
    }

    @Override // pc.b, pc.t
    public final Object l(E e10) {
        return L(e10, false);
    }

    @Override // pc.b
    public final boolean y() {
        return this.t == a.DROP_OLDEST;
    }
}
