package n9;

import g9.l;
import g9.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ka.d0;

/* loaded from: classes.dex */
public final class k {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [g9.m] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [g9.g] */
    public static g9.m a(g9.m mVar) {
        boolean z10;
        d(mVar);
        if (mVar instanceof g9.l) {
            return mVar;
        }
        g9.g gVar = (g9.g) mVar;
        List<g9.m> b10 = gVar.b();
        if (b10.size() == 1) {
            return a(b10.get(0));
        }
        Iterator it = gVar.f5956a.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = true;
                break;
            }
            if (((g9.m) it.next()) instanceof g9.g) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return gVar;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<g9.m> it2 = b10.iterator();
        while (it2.hasNext()) {
            arrayList.add(a(it2.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ?? r42 = (g9.m) it3.next();
            if (!(r42 instanceof g9.l)) {
                if (r42 instanceof g9.g) {
                    r42 = (g9.g) r42;
                    if (q0.g.b(r42.f5957b, gVar.f5957b)) {
                        arrayList2.addAll(r42.b());
                    }
                }
            }
            arrayList2.add(r42);
        }
        return arrayList2.size() == 1 ? (g9.m) arrayList2.get(0) : new g9.g(arrayList2, gVar.f5957b);
    }

    public static g9.g b(g9.l lVar, g9.g gVar) {
        if (gVar.e()) {
            List singletonList = Collections.singletonList(lVar);
            ArrayList arrayList = new ArrayList(gVar.f5956a);
            arrayList.addAll(singletonList);
            return new g9.g(arrayList, gVar.f5957b);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<g9.m> it = gVar.b().iterator();
        while (it.hasNext()) {
            arrayList2.add(c(lVar, it.next()));
        }
        return new g9.g(arrayList2, 2);
    }

    public static g9.m c(g9.m mVar, g9.m mVar2) {
        g9.g gVar;
        d(mVar);
        d(mVar2);
        boolean z10 = mVar instanceof g9.l;
        if (z10 && (mVar2 instanceof g9.l)) {
            gVar = new g9.g(Arrays.asList((g9.l) mVar, (g9.l) mVar2), 1);
        } else if (z10 && (mVar2 instanceof g9.g)) {
            gVar = b((g9.l) mVar, (g9.g) mVar2);
        } else if ((mVar instanceof g9.g) && (mVar2 instanceof g9.l)) {
            gVar = b((g9.l) mVar2, (g9.g) mVar);
        } else {
            g9.g gVar2 = (g9.g) mVar;
            g9.g gVar3 = (g9.g) mVar2;
            x6.b.Z("Found an empty composite filter", (gVar2.b().isEmpty() || gVar3.b().isEmpty()) ? false : true, new Object[0]);
            if (gVar2.e() && gVar3.e()) {
                List<g9.m> b10 = gVar3.b();
                ArrayList arrayList = new ArrayList(gVar2.f5956a);
                arrayList.addAll(b10);
                gVar = new g9.g(arrayList, gVar2.f5957b);
            } else {
                int i10 = gVar2.f5957b;
                g9.g gVar4 = i10 == 2 ? gVar2 : gVar3;
                if (i10 == 2) {
                    gVar2 = gVar3;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<g9.m> it = gVar4.b().iterator();
                while (it.hasNext()) {
                    arrayList2.add(c(it.next(), gVar2));
                }
                gVar = new g9.g(arrayList2, 2);
            }
        }
        return a(gVar);
    }

    public static void d(g9.m mVar) {
        x6.b.Z("Only field filters and composite filters are accepted.", (mVar instanceof g9.l) || (mVar instanceof g9.g), new Object[0]);
    }

    public static g9.m e(g9.m mVar) {
        d(mVar);
        if (mVar instanceof g9.l) {
            return mVar;
        }
        g9.g gVar = (g9.g) mVar;
        if (gVar.b().size() == 1) {
            return e(mVar.b().get(0));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<g9.m> it = gVar.b().iterator();
        while (it.hasNext()) {
            arrayList.add(e(it.next()));
        }
        g9.m a10 = a(new g9.g(arrayList, gVar.f5957b));
        if (g(a10)) {
            return a10;
        }
        x6.b.Z("field filters are already in DNF form.", a10 instanceof g9.g, new Object[0]);
        g9.g gVar2 = (g9.g) a10;
        x6.b.Z("Disjunction of filters all of which are already in DNF form is itself in DNF form.", gVar2.e(), new Object[0]);
        x6.b.Z("Single-filter composite filters are already in DNF form.", gVar2.b().size() > 1, new Object[0]);
        g9.m mVar2 = gVar2.b().get(0);
        for (int i10 = 1; i10 < gVar2.b().size(); i10++) {
            mVar2 = c(mVar2, gVar2.b().get(i10));
        }
        return mVar2;
    }

    public static g9.m f(g9.m mVar) {
        d(mVar);
        ArrayList arrayList = new ArrayList();
        if (!(mVar instanceof g9.l)) {
            g9.g gVar = (g9.g) mVar;
            Iterator<g9.m> it = gVar.b().iterator();
            while (it.hasNext()) {
                arrayList.add(f(it.next()));
            }
            return new g9.g(arrayList, gVar.f5957b);
        }
        if (!(mVar instanceof v)) {
            return mVar;
        }
        v vVar = (v) mVar;
        Iterator<d0> it2 = vVar.f6012b.R().h().iterator();
        while (it2.hasNext()) {
            arrayList.add(g9.l.e(vVar.f6013c, l.a.EQUAL, it2.next()));
        }
        return new g9.g(arrayList, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(g9.m r6) {
        /*
            boolean r0 = r6 instanceof g9.l
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L97
            boolean r0 = r6 instanceof g9.g
            if (r0 == 0) goto L35
            r3 = r6
            g9.g r3 = (g9.g) r3
            java.util.ArrayList r4 = r3.f5956a
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L25
            java.lang.Object r5 = r4.next()
            g9.m r5 = (g9.m) r5
            boolean r5 = r5 instanceof g9.g
            if (r5 == 0) goto L13
            r4 = r2
            goto L26
        L25:
            r4 = r1
        L26:
            if (r4 == 0) goto L30
            boolean r3 = r3.e()
            if (r3 == 0) goto L30
            r3 = r1
            goto L31
        L30:
            r3 = r2
        L31:
            if (r3 == 0) goto L35
            r3 = r1
            goto L36
        L35:
            r3 = r2
        L36:
            if (r3 != 0) goto L97
            if (r0 == 0) goto L92
            g9.g r6 = (g9.g) r6
            int r0 = r6.f5957b
            r3 = 2
            if (r0 != r3) goto L43
            r0 = r1
            goto L44
        L43:
            r0 = r2
        L44:
            if (r0 == 0) goto L92
            java.util.List r6 = r6.b()
            java.util.Iterator r6 = r6.iterator()
        L4e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r6.next()
            g9.m r0 = (g9.m) r0
            boolean r3 = r0 instanceof g9.l
            if (r3 != 0) goto L4e
            boolean r3 = r0 instanceof g9.g
            if (r3 == 0) goto L8c
            g9.g r0 = (g9.g) r0
            java.util.ArrayList r3 = r0.f5956a
            java.util.Iterator r3 = r3.iterator()
        L6a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r3.next()
            g9.m r4 = (g9.m) r4
            boolean r4 = r4 instanceof g9.g
            if (r4 == 0) goto L6a
            r3 = r2
            goto L7d
        L7c:
            r3 = r1
        L7d:
            if (r3 == 0) goto L87
            boolean r0 = r0.e()
            if (r0 == 0) goto L87
            r0 = r1
            goto L88
        L87:
            r0 = r2
        L88:
            if (r0 == 0) goto L8c
            r0 = r1
            goto L8d
        L8c:
            r0 = r2
        L8d:
            if (r0 != 0) goto L4e
            goto L92
        L90:
            r6 = r1
            goto L93
        L92:
            r6 = r2
        L93:
            if (r6 == 0) goto L96
            goto L97
        L96:
            r1 = r2
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.k.g(g9.m):boolean");
    }
}
