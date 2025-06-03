package c3;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import k3.AbstractC1466d;

/* renamed from: c3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0832j {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f10082b = Logger.getLogger(C0832j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentMap f10083a;

    /* renamed from: c3.j$a */
    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1466d f10084a;

        public a(AbstractC1466d abstractC1466d) {
            this.f10084a = abstractC1466d;
        }

        @Override // c3.C0832j.b
        public InterfaceC0830h a(Class cls) {
            try {
                return new C0831i(this.f10084a, cls);
            } catch (IllegalArgumentException e7) {
                throw new GeneralSecurityException("Primitive type not supported", e7);
            }
        }

        @Override // c3.C0832j.b
        public InterfaceC0830h b() {
            AbstractC1466d abstractC1466d = this.f10084a;
            return new C0831i(abstractC1466d, abstractC1466d.b());
        }

        @Override // c3.C0832j.b
        public Class c() {
            return this.f10084a.getClass();
        }

        @Override // c3.C0832j.b
        public Set d() {
            return this.f10084a.i();
        }
    }

    /* renamed from: c3.j$b */
    public interface b {
        InterfaceC0830h a(Class cls);

        InterfaceC0830h b();

        Class c();

        Set d();
    }

    public C0832j() {
        this.f10083a = new ConcurrentHashMap();
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static b b(AbstractC1466d abstractC1466d) {
        return new a(abstractC1466d);
    }

    public static String i(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        boolean z7 = true;
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (!z7) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z7 = false;
        }
        return sb.toString();
    }

    public InterfaceC0830h c(String str, Class cls) {
        return e(str, (Class) a(cls));
    }

    public final synchronized b d(String str) {
        if (!this.f10083a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (b) this.f10083a.get(str);
    }

    public final InterfaceC0830h e(String str, Class cls) {
        b d7 = d(str);
        if (cls == null) {
            return d7.b();
        }
        if (d7.d().contains(cls)) {
            return d7.a(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + d7.c() + ", supported primitives: " + i(d7.d()));
    }

    public InterfaceC0830h f(String str) {
        return d(str).b();
    }

    public synchronized void g(AbstractC1466d abstractC1466d) {
        if (!abstractC1466d.a().c()) {
            throw new GeneralSecurityException("failed to register key manager " + abstractC1466d.getClass() + " as it is not FIPS compatible.");
        }
        h(b(abstractC1466d), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r5.f10083a.putIfAbsent(r0, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void h(c3.C0832j.b r6, boolean r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            c3.h r0 = r6.b()     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r0.d()     // Catch: java.lang.Throwable -> L60
            java.util.concurrent.ConcurrentMap r1 = r5.f10083a     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L60
            c3.j$b r1 = (c3.C0832j.b) r1     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L62
            java.lang.Class r2 = r1.c()     // Catch: java.lang.Throwable -> L60
            java.lang.Class r3 = r6.c()     // Catch: java.lang.Throwable -> L60
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L22
            goto L62
        L22:
            java.util.logging.Logger r7 = c3.C0832j.f10082b     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r2.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch: java.lang.Throwable -> L60
            r2.append(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L60
            r7.warning(r2)     // Catch: java.lang.Throwable -> L60
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L60
            r4 = 0
            r3[r4] = r0     // Catch: java.lang.Throwable -> L60
            java.lang.Class r0 = r1.c()     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L60
            r1 = 1
            r3[r1] = r0     // Catch: java.lang.Throwable -> L60
            java.lang.Class r6 = r6.c()     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L60
            r0 = 2
            r3[r0] = r6     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L60
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L60
            throw r7     // Catch: java.lang.Throwable -> L60
        L60:
            r6 = move-exception
            goto L71
        L62:
            if (r7 != 0) goto L6a
            java.util.concurrent.ConcurrentMap r7 = r5.f10083a     // Catch: java.lang.Throwable -> L60
            r7.putIfAbsent(r0, r6)     // Catch: java.lang.Throwable -> L60
            goto L6f
        L6a:
            java.util.concurrent.ConcurrentMap r7 = r5.f10083a     // Catch: java.lang.Throwable -> L60
            r7.put(r0, r6)     // Catch: java.lang.Throwable -> L60
        L6f:
            monitor-exit(r5)
            return
        L71:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.C0832j.h(c3.j$b, boolean):void");
    }

    public boolean j(String str) {
        return this.f10083a.containsKey(str);
    }

    public C0832j(C0832j c0832j) {
        this.f10083a = new ConcurrentHashMap(c0832j.f10083a);
    }
}
