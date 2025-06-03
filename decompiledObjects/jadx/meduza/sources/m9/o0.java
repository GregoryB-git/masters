package m9;

import g9.i;
import i9.m1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f10863a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10864b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public HashMap f10865c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public HashMap f10866d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public HashMap f10867e = new HashMap();
    public final j9.f f;

    public interface a {
    }

    public o0(j9.f fVar, a aVar) {
        this.f = fVar;
        this.f10863a = aVar;
    }

    public final l0 a(int i10) {
        l0 l0Var = (l0) this.f10864b.get(Integer.valueOf(i10));
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0();
        this.f10864b.put(Integer.valueOf(i10), l0Var2);
        return l0Var2;
    }

    public final boolean b(int i10) {
        return c(i10) != null;
    }

    public final m1 c(int i10) {
        l0 l0Var = (l0) this.f10864b.get(Integer.valueOf(i10));
        if (l0Var != null) {
            if (l0Var.f10831a != 0) {
                return null;
            }
        }
        return (m1) ((h0) this.f10863a).f.get(Integer.valueOf(i10));
    }

    public final void d(int i10, j9.i iVar, j9.m mVar) {
        if (b(i10)) {
            l0 a10 = a(i10);
            if (((h0) this.f10863a).f10795b.d(i10).contains(iVar)) {
                i.a aVar = i.a.REMOVED;
                a10.f10833c = true;
                a10.f10832b.put(iVar, aVar);
            } else {
                a10.f10833c = true;
                a10.f10832b.remove(iVar);
            }
            Set set = (Set) this.f10866d.get(iVar);
            if (set == null) {
                set = new HashSet();
                this.f10866d.put(iVar, set);
            }
            set.add(Integer.valueOf(i10));
            if (mVar != null) {
                this.f10865c.put(iVar, mVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if ((((m9.l0) r4.f10864b.get(java.lang.Integer.valueOf(r5))).f10831a != 0) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r5) {
        /*
            r4 = this;
            java.util.HashMap r0 = r4.f10864b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r0.get(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            java.util.HashMap r0 = r4.f10864b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r0.get(r3)
            m9.l0 r0 = (m9.l0) r0
            int r0 = r0.f10831a
            if (r0 == 0) goto L20
            r0 = r1
            goto L21
        L20:
            r0 = r2
        L21:
            if (r0 != 0) goto L24
            goto L25
        L24:
            r1 = r2
        L25:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "Should only reset active targets"
            x6.b.Z(r2, r1, r0)
            java.util.HashMap r0 = r4.f10864b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            m9.l0 r2 = new m9.l0
            r2.<init>()
            r0.put(r1, r2)
            m9.o0$a r0 = r4.f10863a
            m9.h0 r0 = (m9.h0) r0
            m9.h0$a r0 = r0.f10795b
            t8.e r0 = r0.d(r5)
            java.util.Iterator r0 = r0.iterator()
        L48:
            r1 = r0
            t8.e$a r1 = (t8.e.a) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r1 = r1.next()
            j9.i r1 = (j9.i) r1
            r2 = 0
            r4.d(r5, r1, r2)
            goto L48
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.o0.e(int):void");
    }
}
