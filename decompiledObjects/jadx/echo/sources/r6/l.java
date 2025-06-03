package r6;

import V5.t;
import kotlin.jvm.internal.v;
import p6.P0;
import u6.O;
import u6.x;

/* loaded from: classes.dex */
public class l extends b {

    /* renamed from: n, reason: collision with root package name */
    public final int f19132n;

    /* renamed from: o, reason: collision with root package name */
    public final a f19133o;

    public l(int i7, a aVar, g6.l lVar) {
        super(i7, lVar);
        this.f19132n = i7;
        this.f19133o = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + v.b(b.class).a() + " instead").toString());
        }
        if (i7 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i7 + " was specified").toString());
    }

    public final Object A0(Object obj, boolean z7) {
        return this.f19133o == a.DROP_LATEST ? y0(obj, z7) : z0(obj);
    }

    @Override // r6.b
    public boolean T() {
        return this.f19133o == a.DROP_OLDEST;
    }

    @Override // r6.b, r6.n
    public Object d(Object obj) {
        return A0(obj, false);
    }

    public final Object y0(Object obj, boolean z7) {
        g6.l lVar;
        O d7;
        Object d8 = super.d(obj);
        if (g.f(d8) || g.e(d8)) {
            return d8;
        }
        if (!z7 || (lVar = this.f19096c) == null || (d7 = x.d(lVar, obj, null, 2, null)) == null) {
            return g.f19127a.c(t.f6803a);
        }
        throw d7;
    }

    public final Object z0(Object obj) {
        i iVar;
        Object obj2 = c.f19107d;
        i iVar2 = (i) b.f19090i.get(this);
        while (true) {
            long andIncrement = b.f19086e.getAndIncrement(this);
            long j7 = andIncrement & 1152921504606846975L;
            boolean S6 = S(andIncrement);
            int i7 = c.f19105b;
            long j8 = j7 / i7;
            int i8 = (int) (j7 % i7);
            if (iVar2.f19955q != j8) {
                i C7 = C(j8, iVar2);
                if (C7 != null) {
                    iVar = C7;
                } else if (S6) {
                    return g.f19127a.a(H());
                }
            } else {
                iVar = iVar2;
            }
            int t02 = t0(iVar, i8, obj, j7, obj2, S6);
            if (t02 == 0) {
                iVar.b();
                return g.f19127a.c(t.f6803a);
            }
            if (t02 == 1) {
                return g.f19127a.c(t.f6803a);
            }
            if (t02 == 2) {
                if (S6) {
                    iVar.p();
                    return g.f19127a.a(H());
                }
                P0 p02 = obj2 instanceof P0 ? (P0) obj2 : null;
                if (p02 != null) {
                    f0(p02, iVar, i8);
                }
                y((iVar.f19955q * i7) + i8);
                return g.f19127a.c(t.f6803a);
            }
            if (t02 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (t02 == 4) {
                if (j7 < G()) {
                    iVar.b();
                }
                return g.f19127a.a(H());
            }
            if (t02 == 5) {
                iVar.b();
            }
            iVar2 = iVar;
        }
    }
}
