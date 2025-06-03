package eb;

import eb.d1;
import gb.r2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f5174c = Logger.getLogger(m0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static m0 f5175d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f5176e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<l0> f5177a = new LinkedHashSet<>();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap<String, l0> f5178b = new LinkedHashMap<>();

    public static final class a implements d1.a<l0> {
        @Override // eb.d1.a
        public final boolean a(l0 l0Var) {
            return l0Var.d();
        }

        @Override // eb.d1.a
        public final int b(l0 l0Var) {
            return l0Var.c();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        try {
            boolean z10 = r2.f6798b;
            arrayList.add(r2.class);
        } catch (ClassNotFoundException e10) {
            f5174c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e10);
        }
        try {
            int i10 = nb.l.f11465b;
            arrayList.add(nb.l.class);
        } catch (ClassNotFoundException e11) {
            f5174c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e11);
        }
        f5176e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized m0 a() {
        m0 m0Var;
        synchronized (m0.class) {
            if (f5175d == null) {
                List<l0> a10 = d1.a(l0.class, f5176e, l0.class.getClassLoader(), new a());
                f5175d = new m0();
                for (l0 l0Var : a10) {
                    f5174c.fine("Service loader found " + l0Var);
                    m0 m0Var2 = f5175d;
                    synchronized (m0Var2) {
                        x6.b.s("isAvailable() returned false", l0Var.d());
                        m0Var2.f5177a.add(l0Var);
                    }
                }
                f5175d.c();
            }
            m0Var = f5175d;
        }
        return m0Var;
    }

    public final synchronized l0 b(String str) {
        LinkedHashMap<String, l0> linkedHashMap;
        linkedHashMap = this.f5178b;
        x6.b.y(str, "policy");
        return linkedHashMap.get(str);
    }

    public final synchronized void c() {
        this.f5178b.clear();
        Iterator<l0> it = this.f5177a.iterator();
        while (it.hasNext()) {
            l0 next = it.next();
            String b10 = next.b();
            l0 l0Var = this.f5178b.get(b10);
            if (l0Var == null || l0Var.c() < next.c()) {
                this.f5178b.put(b10, next);
            }
        }
    }
}
