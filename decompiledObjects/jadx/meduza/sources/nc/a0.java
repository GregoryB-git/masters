package nc;

import io.flutter.plugins.firebase.crashlytics.Constants;
import ub.f;
import ub.h;

/* loaded from: classes.dex */
public abstract class a0 extends ub.a implements ub.f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f11467b = new a();

    public static final class a extends ub.b<ub.f, a0> {

        /* renamed from: nc.a0$a$a, reason: collision with other inner class name */
        public static final class C0182a extends ec.j implements dc.l<h.b, a0> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0182a f11468a = new C0182a();

            public C0182a() {
                super(1);
            }

            @Override // dc.l
            public final a0 invoke(h.b bVar) {
                h.b bVar2 = bVar;
                if (bVar2 instanceof a0) {
                    return (a0) bVar2;
                }
                return null;
            }
        }

        public a() {
            super(f.a.f15163a, C0182a.f11468a);
        }
    }

    public a0() {
        super(f.a.f15163a);
    }

    public void A0(ub.h hVar, Runnable runnable) {
        z0(hVar, runnable);
    }

    public boolean B0() {
        return !(this instanceof f2);
    }

    @Override // ub.f
    public final sc.g C(ub.e eVar) {
        return new sc.g(this, eVar);
    }

    @Override // ub.f
    public final void Q(ub.e<?> eVar) {
        sc.g gVar = (sc.g) eVar;
        while (sc.g.f14336p.get(gVar) == b.a0.Z) {
        }
        Object obj = sc.g.f14336p.get(gVar);
        l lVar = obj instanceof l ? (l) obj : null;
        if (lVar != null) {
            lVar.p();
        }
    }

    @Override // ub.a, ub.h.b, ub.h
    public final <E extends h.b> E get(h.c<E> cVar) {
        ec.i.e(cVar, Constants.KEY);
        if (cVar instanceof ub.b) {
            ub.b bVar = (ub.b) cVar;
            h.c<?> cVar2 = this.f15157a;
            ec.i.e(cVar2, Constants.KEY);
            if (cVar2 == bVar || bVar.f15159b == cVar2) {
                E e10 = (E) bVar.f15158a.invoke(this);
                if (e10 instanceof h.b) {
                    return e10;
                }
            }
        } else if (f.a.f15163a == cVar) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (((ub.h.b) r3.f15158a.invoke(r2)) != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return ub.i.f15164a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (ub.f.a.f15163a == r3) goto L17;
     */
    @Override // ub.a, ub.h.b, ub.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ub.h minusKey(ub.h.c<?> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            ec.i.e(r3, r0)
            boolean r1 = r3 instanceof ub.b
            if (r1 == 0) goto L27
            ub.b r3 = (ub.b) r3
            ub.h$c<?> r1 = r2.f15157a
            ec.i.e(r1, r0)
            if (r1 == r3) goto L19
            ub.h$c<?> r0 = r3.f15159b
            if (r0 != r1) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L2e
            dc.l<ub.h$b, E extends B> r3 = r3.f15158a
            java.lang.Object r3 = r3.invoke(r2)
            ub.h$b r3 = (ub.h.b) r3
            if (r3 == 0) goto L2e
            goto L2b
        L27:
            ub.f$a r0 = ub.f.a.f15163a
            if (r0 != r3) goto L2e
        L2b:
            ub.i r3 = ub.i.f15164a
            goto L2f
        L2e:
            r3 = r2
        L2f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.a0.minusKey(ub.h$c):ub.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + g0.b(this);
    }

    public abstract void z0(ub.h hVar, Runnable runnable);
}
