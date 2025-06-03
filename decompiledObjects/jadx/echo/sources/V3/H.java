package V3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class H implements i {

    /* renamed from: b, reason: collision with root package name */
    public static H f6496b = new H();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6497a = new HashMap();

    public static H b() {
        return f6496b;
    }

    @Override // V3.i
    public void a(AbstractC0669h abstractC0669h) {
        d(abstractC0669h);
    }

    public void c(AbstractC0669h abstractC0669h) {
        synchronized (this.f6497a) {
            try {
                List list = (List) this.f6497a.get(abstractC0669h);
                if (list == null) {
                    list = new ArrayList();
                    this.f6497a.put(abstractC0669h, list);
                }
                list.add(abstractC0669h);
                if (!abstractC0669h.e().f()) {
                    AbstractC0669h a7 = abstractC0669h.a(a4.i.a(abstractC0669h.e().e()));
                    List list2 = (List) this.f6497a.get(a7);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        this.f6497a.put(a7, list2);
                    }
                    list2.add(abstractC0669h);
                }
                abstractC0669h.j(true);
                abstractC0669h.k(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r4 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(V3.AbstractC0669h r7) {
        /*
            r6 = this;
            java.util.HashMap r0 = r6.f6497a
            monitor-enter(r0)
            java.util.HashMap r1 = r6.f6497a     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L21
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L21
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            r4 = r3
        L10:
            int r5 = r1.size()     // Catch: java.lang.Throwable -> L21
            if (r4 >= r5) goto L26
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Throwable -> L21
            if (r5 != r7) goto L23
            r1.remove(r4)     // Catch: java.lang.Throwable -> L21
            r4 = r2
            goto L27
        L21:
            r7 = move-exception
            goto L83
        L23:
            int r4 = r4 + 1
            goto L10
        L26:
            r4 = r3
        L27:
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L32
            java.util.HashMap r1 = r6.f6497a     // Catch: java.lang.Throwable -> L21
            r1.remove(r7)     // Catch: java.lang.Throwable -> L21
        L32:
            if (r4 != 0) goto L3c
        L34:
            boolean r1 = r7.g()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L3b
            goto L3c
        L3b:
            r2 = r3
        L3c:
            Y3.m.f(r2)     // Catch: java.lang.Throwable -> L21
            a4.i r1 = r7.e()     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.f()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L81
            a4.i r1 = r7.e()     // Catch: java.lang.Throwable -> L21
            V3.k r1 = r1.e()     // Catch: java.lang.Throwable -> L21
            a4.i r1 = a4.i.a(r1)     // Catch: java.lang.Throwable -> L21
            V3.h r1 = r7.a(r1)     // Catch: java.lang.Throwable -> L21
            java.util.HashMap r2 = r6.f6497a     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L21
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L81
        L63:
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L21
            if (r3 >= r4) goto L76
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L21
            if (r4 != r7) goto L73
            r2.remove(r3)     // Catch: java.lang.Throwable -> L21
            goto L76
        L73:
            int r3 = r3 + 1
            goto L63
        L76:
            boolean r7 = r2.isEmpty()     // Catch: java.lang.Throwable -> L21
            if (r7 == 0) goto L81
            java.util.HashMap r7 = r6.f6497a     // Catch: java.lang.Throwable -> L21
            r7.remove(r1)     // Catch: java.lang.Throwable -> L21
        L81:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L83:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.H.d(V3.h):void");
    }

    public void e(AbstractC0669h abstractC0669h) {
        synchronized (this.f6497a) {
            try {
                List list = (List) this.f6497a.get(abstractC0669h);
                if (list != null && !list.isEmpty()) {
                    if (abstractC0669h.e().f()) {
                        HashSet hashSet = new HashSet();
                        for (int size = list.size() - 1; size >= 0; size--) {
                            AbstractC0669h abstractC0669h2 = (AbstractC0669h) list.get(size);
                            if (!hashSet.contains(abstractC0669h2.e())) {
                                hashSet.add(abstractC0669h2.e());
                                abstractC0669h2.l();
                            }
                        }
                    } else {
                        ((AbstractC0669h) list.get(0)).l();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
