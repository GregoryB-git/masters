package g9;

import g9.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import t8.e;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f6063a;

    /* renamed from: b, reason: collision with root package name */
    public int f6064b = 1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6065c;

    /* renamed from: d, reason: collision with root package name */
    public j9.j f6066d;

    /* renamed from: e, reason: collision with root package name */
    public t8.e<j9.i> f6067e;
    public t8.e<j9.i> f;

    /* renamed from: g, reason: collision with root package name */
    public t8.e<j9.i> f6068g;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final j9.j f6069a;

        /* renamed from: b, reason: collision with root package name */
        public final j f6070b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f6071c;

        /* renamed from: d, reason: collision with root package name */
        public final t8.e<j9.i> f6072d;

        public a(j9.j jVar, j jVar2, t8.e eVar, boolean z10) {
            this.f6069a = jVar;
            this.f6070b = jVar2;
            this.f6072d = eVar;
            this.f6071c = z10;
        }
    }

    public r0(f0 f0Var, t8.e<j9.i> eVar) {
        this.f6063a = f0Var;
        this.f6066d = new j9.j(j9.h.f8681a, new t8.e(Collections.emptyList(), new o4.o(f0Var.a(), 1)));
        this.f6067e = eVar;
        t8.e<j9.i> eVar2 = j9.i.f8683c;
        this.f = eVar2;
        this.f6068g = eVar2;
    }

    public static int b(i iVar) {
        int ordinal = iVar.f5971a.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i10 = 1;
        if (ordinal != 1) {
            i10 = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 2;
                }
                StringBuilder l10 = defpackage.f.l("Unknown change type: ");
                l10.append(iVar.f5971a);
                throw new IllegalArgumentException(l10.toString());
            }
        }
        return i10;
    }

    public final d5.n a(a aVar, m9.k0 k0Var, boolean z10) {
        List list;
        j9.g h10;
        x6.b.Z("Cannot apply changes that need a refill", !aVar.f6071c, new Object[0]);
        j9.j jVar = this.f6066d;
        this.f6066d = aVar.f6069a;
        this.f6068g = aVar.f6072d;
        j jVar2 = aVar.f6070b;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList(jVar2.f5978a.values());
        Collections.sort(arrayList, new Comparator() { // from class: g9.q0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                r0 r0Var = r0.this;
                i iVar = (i) obj;
                i iVar2 = (i) obj2;
                r0Var.getClass();
                int d10 = n9.o.d(r0.b(iVar), r0.b(iVar2));
                return d10 != 0 ? d10 : r0Var.f6063a.a().compare(iVar.f5972b, iVar2.f5972b);
            }
        });
        if (k0Var != null) {
            Iterator<j9.i> it = k0Var.f10823c.iterator();
            while (true) {
                e.a aVar2 = (e.a) it;
                if (!aVar2.hasNext()) {
                    break;
                }
                this.f6067e = this.f6067e.a((j9.i) aVar2.next());
            }
            Iterator<j9.i> it2 = k0Var.f10824d.iterator();
            while (true) {
                e.a aVar3 = (e.a) it2;
                if (!aVar3.hasNext()) {
                    break;
                }
                j9.i iVar = (j9.i) aVar3.next();
                x6.b.Z("Modified document %s not found in view.", this.f6067e.contains(iVar), iVar);
            }
            Iterator<j9.i> it3 = k0Var.f10825e.iterator();
            while (true) {
                e.a aVar4 = (e.a) it3;
                if (!aVar4.hasNext()) {
                    break;
                }
                this.f6067e = this.f6067e.i((j9.i) aVar4.next());
            }
            this.f6065c = k0Var.f10822b;
        }
        if (z10) {
            list = Collections.emptyList();
        } else if (this.f6065c) {
            t8.e<j9.i> eVar = this.f;
            this.f = j9.i.f8683c;
            Iterator<j9.g> it4 = this.f6066d.iterator();
            while (true) {
                e.a aVar5 = (e.a) it4;
                if (!aVar5.hasNext()) {
                    break;
                }
                j9.g gVar = (j9.g) aVar5.next();
                j9.i key = gVar.getKey();
                if ((this.f6067e.contains(key) || (h10 = this.f6066d.f8685a.h(key)) == null || h10.d()) ? false : true) {
                    this.f = this.f.a(gVar.getKey());
                }
            }
            ArrayList arrayList2 = new ArrayList(this.f.size() + eVar.size());
            Iterator<j9.i> it5 = eVar.iterator();
            while (true) {
                e.a aVar6 = (e.a) it5;
                if (!aVar6.hasNext()) {
                    break;
                }
                j9.i iVar2 = (j9.i) aVar6.next();
                if (!this.f.contains(iVar2)) {
                    arrayList2.add(new z(z.a.REMOVED, iVar2));
                }
            }
            Iterator<j9.i> it6 = this.f.iterator();
            while (true) {
                e.a aVar7 = (e.a) it6;
                if (!aVar7.hasNext()) {
                    break;
                }
                j9.i iVar3 = (j9.i) aVar7.next();
                if (!eVar.contains(iVar3)) {
                    arrayList2.add(new z(z.a.ADDED, iVar3));
                }
            }
            list = arrayList2;
        } else {
            list = Collections.emptyList();
        }
        int i10 = this.f.size() == 0 && this.f6065c && !z10 ? 3 : 2;
        boolean z11 = i10 != this.f6064b;
        this.f6064b = i10;
        s0 s0Var = null;
        if (arrayList.size() != 0 || z11) {
            s0Var = new s0(this.f6063a, aVar.f6069a, jVar, arrayList, i10 == 2, aVar.f6072d, z11, false, (k0Var == null || k0Var.f10821a.isEmpty()) ? false : true);
        }
        return new d5.n(2, s0Var, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        if (r7.c() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0114, code lost:
    
        if (r18.f6063a.a().compare(r7, r6) > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0122, code lost:
    
        if (r18.f6063a.a().compare(r7, r9) < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014f, code lost:
    
        if (r9 == null) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g9.r0.a c(t8.c<j9.i, j9.g> r19, g9.r0.a r20) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.r0.c(t8.c, g9.r0$a):g9.r0$a");
    }
}
