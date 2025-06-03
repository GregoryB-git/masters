package g9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: l, reason: collision with root package name */
    public static final e0 f5943l;

    /* renamed from: m, reason: collision with root package name */
    public static final e0 f5944m;

    /* renamed from: a, reason: collision with root package name */
    public final List<e0> f5945a;

    /* renamed from: b, reason: collision with root package name */
    public List<e0> f5946b;

    /* renamed from: c, reason: collision with root package name */
    public k0 f5947c;

    /* renamed from: d, reason: collision with root package name */
    public k0 f5948d;

    /* renamed from: e, reason: collision with root package name */
    public final List<m> f5949e;
    public final j9.o f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5950g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5951h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5952i;

    /* renamed from: j, reason: collision with root package name */
    public final e f5953j;

    /* renamed from: k, reason: collision with root package name */
    public final e f5954k;

    public static class a implements Comparator<j9.g> {

        /* renamed from: a, reason: collision with root package name */
        public final List<e0> f5955a;

        public a(List<e0> list) {
            boolean z10;
            Iterator<e0> it = list.iterator();
            loop0: while (true) {
                z10 = false;
                while (it.hasNext()) {
                    z10 = (z10 || it.next().f5930b.equals(j9.l.f8691b)) ? true : z10;
                }
            }
            if (!z10) {
                throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
            }
            this.f5955a = list;
        }

        @Override // java.util.Comparator
        public final int compare(j9.g gVar, j9.g gVar2) {
            int i10;
            int c10;
            int c11;
            j9.g gVar3 = gVar;
            j9.g gVar4 = gVar2;
            Iterator<e0> it = this.f5955a.iterator();
            do {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                e0 next = it.next();
                if (next.f5930b.equals(j9.l.f8691b)) {
                    c10 = defpackage.f.c(next.f5929a);
                    c11 = gVar3.getKey().compareTo(gVar4.getKey());
                } else {
                    ka.d0 g10 = gVar3.g(next.f5930b);
                    ka.d0 g11 = gVar4.g(next.f5930b);
                    x6.b.Z("Trying to compare documents on fields that don't exist.", (g10 == null || g11 == null) ? false : true, new Object[0]);
                    c10 = defpackage.f.c(next.f5929a);
                    c11 = j9.s.c(g10, g11);
                }
                i10 = c11 * c10;
            } while (i10 == 0);
            return i10;
        }
    }

    static {
        j9.l lVar = j9.l.f8691b;
        f5943l = new e0(1, lVar);
        f5944m = new e0(2, lVar);
    }

    public f0(j9.o oVar, String str) {
        this(oVar, str, Collections.emptyList(), Collections.emptyList(), -1L, 1, null, null);
    }

    /* JADX WARN: Incorrect types in method signature: (Lj9/o;Ljava/lang/String;Ljava/util/List<Lg9/m;>;Ljava/util/List<Lg9/e0;>;JLjava/lang/Object;Lg9/e;Lg9/e;)V */
    public f0(j9.o oVar, String str, List list, List list2, long j10, int i10, e eVar, e eVar2) {
        this.f = oVar;
        this.f5950g = str;
        this.f5945a = list2;
        this.f5949e = list;
        this.f5951h = j10;
        this.f5952i = i10;
        this.f5953j = eVar;
        this.f5954k = eVar2;
    }

    public final a a() {
        return new a(d());
    }

    public final f0 b(m mVar) {
        x6.b.Z("No filter is allowed for document query", !e(), new Object[0]);
        ArrayList arrayList = new ArrayList(this.f5949e);
        arrayList.add(mVar);
        return new f0(this.f, this.f5950g, arrayList, this.f5945a, this.f5951h, this.f5952i, this.f5953j, this.f5954k);
    }

    public final TreeSet c() {
        TreeSet treeSet = new TreeSet();
        Iterator<m> it = this.f5949e.iterator();
        while (it.hasNext()) {
            for (l lVar : it.next().c()) {
                if (lVar.f()) {
                    treeSet.add(lVar.f6013c);
                }
            }
        }
        return treeSet;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final synchronized java.util.List<g9.e0> d() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.List<g9.e0> r0 = r7.f5946b     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L98
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.List<g9.e0> r2 = r7.f5945a     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2e
        L15:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2e
            g9.e0 r3 = (g9.e0) r3     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
            j9.l r3 = r3.f5930b     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r3.h()     // Catch: java.lang.Throwable -> L2e
            r1.add(r3)     // Catch: java.lang.Throwable -> L2e
            goto L15
        L2e:
            r0 = move-exception
            goto L9c
        L30:
            java.util.List<g9.e0> r2 = r7.f5945a     // Catch: java.lang.Throwable -> L2e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L2e
            r3 = 1
            if (r2 <= 0) goto L4a
            java.util.List<g9.e0> r2 = r7.f5945a     // Catch: java.lang.Throwable -> L2e
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L2e
            int r4 = r4 + (-1)
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L2e
            g9.e0 r2 = (g9.e0) r2     // Catch: java.lang.Throwable -> L2e
            int r2 = r2.f5929a     // Catch: java.lang.Throwable -> L2e
            goto L4b
        L4a:
            r2 = r3
        L4b:
            java.util.TreeSet r4 = r7.c()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2e
        L53:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L78
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L2e
            j9.l r5 = (j9.l) r5     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = r5.h()     // Catch: java.lang.Throwable -> L2e
            boolean r6 = r1.contains(r6)     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L53
            boolean r6 = r5.u()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L53
            g9.e0 r6 = new g9.e0     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r2, r5)     // Catch: java.lang.Throwable -> L2e
            r0.add(r6)     // Catch: java.lang.Throwable -> L2e
            goto L53
        L78:
            j9.l r4 = j9.l.f8691b     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r4.h()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r1.contains(r4)     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L92
            boolean r1 = q0.g.b(r2, r3)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L8d
            g9.e0 r1 = g9.f0.f5943l     // Catch: java.lang.Throwable -> L2e
            goto L8f
        L8d:
            g9.e0 r1 = g9.f0.f5944m     // Catch: java.lang.Throwable -> L2e
        L8f:
            r0.add(r1)     // Catch: java.lang.Throwable -> L2e
        L92:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> L2e
            r7.f5946b = r0     // Catch: java.lang.Throwable -> L2e
        L98:
            java.util.List<g9.e0> r0 = r7.f5946b     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r7)
            return r0
        L9c:
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.f0.d():java.util.List");
    }

    public final boolean e() {
        return j9.i.l(this.f) && this.f5950g == null && this.f5949e.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f5952i != f0Var.f5952i) {
            return false;
        }
        return i().equals(f0Var.i());
    }

    public final f0 f(long j10) {
        return new f0(this.f, this.f5950g, this.f5949e, this.f5945a, j10, 1, this.f5953j, this.f5954k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r7.f.p(r0) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:
    
        if ((!r0.f5927a ? r3 >= 0 : r3 > 0) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        if ((!r0.f5927a ? r8 <= 0 : r8 < 0) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0069, code lost:
    
        if (r7.f.q() == (r0.q() - 1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(j9.g r8) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.f0.g(j9.g):boolean");
    }

    public final boolean h() {
        if (this.f5949e.isEmpty() && this.f5951h == -1 && this.f5953j == null && this.f5954k == null) {
            if (this.f5945a.isEmpty()) {
                return true;
            }
            if (this.f5945a.size() == 1 && this.f5945a.get(0).f5930b.u()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return q0.g.c(this.f5952i) + (i().hashCode() * 31);
    }

    public final synchronized k0 i() {
        if (this.f5947c == null) {
            this.f5947c = j(d());
        }
        return this.f5947c;
    }

    public final synchronized k0 j(List<e0> list) {
        if (this.f5952i == 1) {
            return new k0(this.f, this.f5950g, this.f5949e, list, this.f5951h, this.f5953j, this.f5954k);
        }
        ArrayList arrayList = new ArrayList();
        for (e0 e0Var : list) {
            int i10 = 2;
            if (e0Var.f5929a == 2) {
                i10 = 1;
            }
            arrayList.add(new e0(i10, e0Var.f5930b));
        }
        e eVar = this.f5954k;
        e eVar2 = eVar != null ? new e(eVar.f5928b, eVar.f5927a) : null;
        e eVar3 = this.f5953j;
        return new k0(this.f, this.f5950g, this.f5949e, arrayList, this.f5951h, eVar2, eVar3 != null ? new e(eVar3.f5928b, eVar3.f5927a) : null);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Query(target=");
        l10.append(i().toString());
        l10.append(";limitType=");
        l10.append(defpackage.g.l(this.f5952i));
        l10.append(")");
        return l10.toString();
    }
}
