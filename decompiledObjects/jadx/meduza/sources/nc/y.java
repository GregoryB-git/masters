package nc;

import ub.f;
import ub.h;

/* loaded from: classes.dex */
public final class y {

    public static final class a extends ec.j implements dc.p<ub.h, h.b, ub.h> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11566a = new a();

        public a() {
            super(2);
        }

        @Override // dc.p
        public final ub.h invoke(ub.h hVar, h.b bVar) {
            ub.h hVar2 = hVar;
            h.b bVar2 = bVar;
            if (bVar2 instanceof x) {
                bVar2 = ((x) bVar2).b0();
            }
            return hVar2.plus(bVar2);
        }
    }

    public static final class b extends ec.j implements dc.p<ub.h, h.b, ub.h> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ec.s<ub.h> f11567a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f11568b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ec.s<ub.h> sVar, boolean z10) {
            super(2);
            this.f11567a = sVar;
            this.f11568b = z10;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [T, ub.h] */
        @Override // dc.p
        public final ub.h invoke(ub.h hVar, h.b bVar) {
            ub.h hVar2 = hVar;
            h.b bVar2 = bVar;
            boolean z10 = bVar2 instanceof x;
            ub.h hVar3 = bVar2;
            if (z10) {
                if (this.f11567a.f5272a.get(bVar2.getKey()) == null) {
                    x xVar = (x) bVar2;
                    hVar3 = xVar;
                    if (this.f11568b) {
                        hVar3 = xVar.b0();
                    }
                } else {
                    ec.s<ub.h> sVar = this.f11567a;
                    sVar.f5272a = sVar.f5272a.minusKey(bVar2.getKey());
                    hVar3 = ((x) bVar2).r0();
                }
            }
            return hVar2.plus(hVar3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final ub.h a(ub.h hVar, ub.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        z zVar = z.f11579a;
        boolean booleanValue = ((Boolean) hVar.fold(bool, zVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, zVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        ec.s sVar = new ec.s();
        sVar.f5272a = hVar2;
        ub.i iVar = ub.i.f15164a;
        ub.h hVar3 = (ub.h) hVar.fold(iVar, new b(sVar, z10));
        if (booleanValue2) {
            sVar.f5272a = ((ub.h) sVar.f5272a).fold(iVar, a.f11566a);
        }
        return hVar3.plus((ub.h) sVar.f5272a);
    }

    public static final ub.h b(d0 d0Var, ub.h hVar) {
        ub.h a10 = a(d0Var.f(), hVar, true);
        tc.c cVar = r0.f11545a;
        return (a10 == cVar || a10.get(f.a.f15163a) != null) ? a10 : a10.plus(cVar);
    }

    public static final g2<?> c(ub.e<?> eVar, ub.h hVar, Object obj) {
        g2<?> g2Var = null;
        if (!(eVar instanceof wb.d)) {
            return null;
        }
        if (!(hVar.get(h2.f11505a) != null)) {
            return null;
        }
        wb.d dVar = (wb.d) eVar;
        while (true) {
            if ((dVar instanceof o0) || (dVar = dVar.getCallerFrame()) == null) {
                break;
            }
            if (dVar instanceof g2) {
                g2Var = (g2) dVar;
                break;
            }
        }
        if (g2Var != null) {
            g2Var.f0(hVar, obj);
        }
        return g2Var;
    }
}
