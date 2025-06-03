package c3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.O;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import k3.AbstractC1466d;
import k3.C1470h;
import p3.C1792A;

/* renamed from: c3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0846x {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f10125a = Logger.getLogger(AbstractC0846x.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f10126b = new AtomicReference(new C0832j());

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentMap f10127c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentMap f10128d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentMap f10129e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentMap f10130f = new ConcurrentHashMap();

    /* renamed from: c3.x$a */
    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1466d f10131a;

        public a(AbstractC1466d abstractC1466d) {
            this.f10131a = abstractC1466d;
        }
    }

    /* renamed from: c3.x$b */
    public interface b {
    }

    public static b a(AbstractC1466d abstractC1466d) {
        return new a(abstractC1466d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        r5 = (java.util.Map.Entry) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (c3.AbstractC0846x.f10130f.containsKey(r5.getKey()) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + ((java.lang.String) r5.getKey()) + " from an existing key manager of type " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r3 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if (r3.hasNext() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        r4 = (java.util.Map.Entry) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (c3.AbstractC0846x.f10130f.containsKey(r4.getKey()) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c7, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + ((java.lang.String) r4.getKey()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (((c3.C0832j) c3.AbstractC0846x.f10126b.get()).j(r3) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
    
        r4 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        if (r4.hasNext() == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void b(java.lang.String r3, java.util.Map r4, boolean r5) {
        /*
            java.lang.Class<c3.x> r0 = c3.AbstractC0846x.class
            monitor-enter(r0)
            if (r5 == 0) goto L34
            java.util.concurrent.ConcurrentMap r1 = c3.AbstractC0846x.f10128d     // Catch: java.lang.Throwable -> L31
            boolean r2 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L34
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L1a
            goto L34
        L1a:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "New keys are already disallowed for key type "
            r5.append(r1)     // Catch: java.lang.Throwable -> L31
            r5.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L31
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L31
            throw r4     // Catch: java.lang.Throwable -> L31
        L31:
            r3 = move-exception
            goto Lc8
        L34:
            if (r5 == 0) goto Lca
            java.util.concurrent.atomic.AtomicReference r5 = c3.AbstractC0846x.f10126b     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L31
            c3.j r5 = (c3.C0832j) r5     // Catch: java.lang.Throwable -> L31
            boolean r5 = r5.j(r3)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L8a
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L31
        L4c:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto Lca
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L31
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentMap r1 = c3.AbstractC0846x.f10130f     // Catch: java.lang.Throwable -> L31
            java.lang.Object r2 = r5.getKey()     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L65
            goto L4c
        L65:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "Attempted to register a new key template "
            r1.append(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L31
            r1.append(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = " from an existing key manager of type "
            r1.append(r5)     // Catch: java.lang.Throwable -> L31
            r1.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L31
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L31
            throw r4     // Catch: java.lang.Throwable -> L31
        L8a:
            java.util.Set r3 = r4.entrySet()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L92:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto Lca
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L31
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentMap r5 = c3.AbstractC0846x.f10130f     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r4.getKey()     // Catch: java.lang.Throwable -> L31
            boolean r5 = r5.containsKey(r1)     // Catch: java.lang.Throwable -> L31
            if (r5 != 0) goto Lab
            goto L92
        Lab:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "Attempted overwrite of a registered key template "
            r5.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r4 = r4.getKey()     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L31
            r5.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L31
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        Lc8:
            monitor-exit(r0)
            throw r3
        Lca:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.AbstractC0846x.b(java.lang.String, java.util.Map, boolean):void");
    }

    public static Object c(AbstractC0829g abstractC0829g, Class cls) {
        return C1470h.c().b(abstractC0829g, cls);
    }

    public static Class d(Class cls) {
        try {
            return C1470h.c().a(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object e(String str, AbstractC1093h abstractC1093h, Class cls) {
        return ((C0832j) f10126b.get()).c(str, cls).a(abstractC1093h);
    }

    public static Object f(String str, byte[] bArr, Class cls) {
        return e(str, AbstractC1093h.i(bArr), cls);
    }

    public static Object g(p3.y yVar, Class cls) {
        return e(yVar.a0(), yVar.b0(), cls);
    }

    public static InterfaceC0830h h(String str) {
        return ((C0832j) f10126b.get()).f(str);
    }

    public static synchronized Map i() {
        Map unmodifiableMap;
        synchronized (AbstractC0846x.class) {
            unmodifiableMap = Collections.unmodifiableMap(f10130f);
        }
        return unmodifiableMap;
    }

    public static synchronized O j(C1792A c1792a) {
        O b7;
        synchronized (AbstractC0846x.class) {
            InterfaceC0830h h7 = h(c1792a.a0());
            if (!((Boolean) f10128d.get(c1792a.a0())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + c1792a.a0());
            }
            b7 = h7.b(c1792a.b0());
        }
        return b7;
    }

    public static synchronized p3.y k(C1792A c1792a) {
        p3.y c7;
        synchronized (AbstractC0846x.class) {
            InterfaceC0830h h7 = h(c1792a.a0());
            if (!((Boolean) f10128d.get(c1792a.a0())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + c1792a.a0());
            }
            c7 = h7.c(c1792a.b0());
        }
        return c7;
    }

    public static synchronized void l(AbstractC1466d abstractC1466d, boolean z7) {
        synchronized (AbstractC0846x.class) {
            try {
                if (abstractC1466d == null) {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
                AtomicReference atomicReference = f10126b;
                C0832j c0832j = new C0832j((C0832j) atomicReference.get());
                c0832j.g(abstractC1466d);
                String d7 = abstractC1466d.d();
                b(d7, z7 ? abstractC1466d.f().c() : Collections.emptyMap(), z7);
                if (!((C0832j) atomicReference.get()).j(d7)) {
                    f10127c.put(d7, a(abstractC1466d));
                    if (z7) {
                        m(d7, abstractC1466d.f().c());
                    }
                }
                f10128d.put(d7, Boolean.valueOf(z7));
                atomicReference.set(c0832j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void m(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f10130f.put((String) entry.getKey(), C0834l.a(str, ((O) ((AbstractC1466d.a.C0228a) entry.getValue()).f16144a).f(), ((AbstractC1466d.a.C0228a) entry.getValue()).f16145b));
        }
    }

    public static synchronized void n(InterfaceC0845w interfaceC0845w) {
        synchronized (AbstractC0846x.class) {
            C1470h.c().e(interfaceC0845w);
        }
    }

    public static Object o(C0844v c0844v, Class cls) {
        return C1470h.c().f(c0844v, cls);
    }
}
