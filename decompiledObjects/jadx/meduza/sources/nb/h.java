package nb;

import eb.a;
import eb.e1;
import eb.k0;
import eb.l0;
import eb.n;
import eb.u;
import gb.r2;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import o7.t;

/* loaded from: classes.dex */
public abstract class h extends k0 {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f11390k = Logger.getLogger(h.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public final k0.e f11391g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11392h;

    /* renamed from: j, reason: collision with root package name */
    public n f11394j;
    public final LinkedHashMap f = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final r2 f11393i = new r2();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final e1 f11395a;

        /* renamed from: b, reason: collision with root package name */
        public final List<b> f11396b;

        public a(e1 e1Var, ArrayList arrayList) {
            this.f11395a = e1Var;
            this.f11396b = arrayList;
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f11397a;

        /* renamed from: c, reason: collision with root package name */
        public final e f11399c;

        /* renamed from: d, reason: collision with root package name */
        public final l0 f11400d;

        /* renamed from: e, reason: collision with root package name */
        public n f11401e;
        public k0.j f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f11402g = false;

        /* renamed from: b, reason: collision with root package name */
        public final Object f11398b = null;

        public final class a extends nb.c {
            public a() {
            }

            @Override // nb.c, eb.k0.e
            public final void f(n nVar, k0.j jVar) {
                b bVar = b.this;
                if (h.this.f.containsKey(bVar.f11397a)) {
                    b bVar2 = b.this;
                    bVar2.f11401e = nVar;
                    bVar2.f = jVar;
                    if (bVar2.f11402g || h.this.f11392h) {
                        return;
                    }
                    if (nVar == n.IDLE) {
                        bVar2.f11399c.e();
                    }
                    h.this.i();
                }
            }

            @Override // nb.c
            public final k0.e g() {
                return h.this.f11391g;
            }
        }

        public b(c cVar, r2 r2Var, k0.d dVar) {
            this.f11397a = cVar;
            this.f11400d = r2Var;
            this.f = dVar;
            e eVar = new e(new a());
            this.f11399c = eVar;
            this.f11401e = n.CONNECTING;
            eVar.i(r2Var);
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("Address = ");
            l10.append(this.f11397a);
            l10.append(", state = ");
            l10.append(this.f11401e);
            l10.append(", picker type: ");
            l10.append(this.f.getClass());
            l10.append(", lb: ");
            l10.append(this.f11399c.g().getClass());
            l10.append(this.f11402g ? ", deactivated" : "");
            return l10.toString();
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f11405a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11406b;

        public c(u uVar) {
            x6.b.y(uVar, "eag");
            this.f11405a = new String[uVar.f5234a.size()];
            Iterator<SocketAddress> it = uVar.f5234a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                this.f11405a[i10] = it.next().toString();
                i10++;
            }
            Arrays.sort(this.f11405a);
            this.f11406b = Arrays.hashCode(this.f11405a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.f11406b == this.f11406b) {
                String[] strArr = cVar.f11405a;
                int length = strArr.length;
                String[] strArr2 = this.f11405a;
                if (length == strArr2.length) {
                    return Arrays.equals(strArr, strArr2);
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f11406b;
        }

        public final String toString() {
            return Arrays.toString(this.f11405a);
        }
    }

    public h(k0.e eVar) {
        x6.b.y(eVar, "helper");
        this.f11391g = eVar;
        f11390k.log(Level.FINE, "Created");
    }

    @Override // eb.k0
    public final e1 a(k0.h hVar) {
        try {
            this.f11392h = true;
            a g10 = g(hVar);
            if (!g10.f11395a.e()) {
                return g10.f11395a;
            }
            i();
            for (b bVar : g10.f11396b) {
                bVar.f11399c.f();
                bVar.f11401e = n.SHUTDOWN;
                f11390k.log(Level.FINE, "Child balancer {0} deleted", bVar.f11397a);
            }
            return g10.f11395a;
        } finally {
            this.f11392h = false;
        }
    }

    @Override // eb.k0
    public final void c(e1 e1Var) {
        if (this.f11394j != n.READY) {
            this.f11391g.f(n.TRANSIENT_FAILURE, new k0.d(k0.f.a(e1Var)));
        }
    }

    @Override // eb.k0
    public final void f() {
        f11390k.log(Level.FINE, "Shutdown");
        for (b bVar : this.f.values()) {
            bVar.f11399c.f();
            bVar.f11401e = n.SHUTDOWN;
            f11390k.log(Level.FINE, "Child balancer {0} deleted", bVar.f11397a);
        }
        this.f.clear();
    }

    public final a g(k0.h hVar) {
        c cVar;
        u uVar;
        f11390k.log(Level.FINE, "Received resolution result: {0}", hVar);
        HashMap hashMap = new HashMap();
        Iterator<u> it = hVar.f5165a.iterator();
        while (it.hasNext()) {
            c cVar2 = new c(it.next());
            b bVar = (b) this.f.get(cVar2);
            if (bVar == null) {
                bVar = new b(cVar2, this.f11393i, new k0.d(k0.f.f5160e));
            }
            hashMap.put(cVar2, bVar);
        }
        if (hashMap.isEmpty()) {
            e1 g10 = e1.f5078n.g("NameResolver returned no usable address. " + hVar);
            c(g10);
            return new a(g10, null);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Object key = entry.getKey();
            l0 l0Var = ((b) entry.getValue()).f11400d;
            Object obj = ((b) entry.getValue()).f11398b;
            if (this.f.containsKey(key)) {
                b bVar2 = (b) this.f.get(key);
                if (bVar2.f11402g) {
                    bVar2.f11402g = false;
                }
            } else {
                this.f.put(key, (b) entry.getValue());
            }
            b bVar3 = (b) this.f.get(key);
            if (key instanceof u) {
                cVar = new c((u) key);
            } else {
                x6.b.s("key is wrong type", key instanceof c);
                cVar = (c) key;
            }
            Iterator<u> it2 = hVar.f5165a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    uVar = null;
                    break;
                }
                uVar = it2.next();
                if (cVar.equals(new c(uVar))) {
                    break;
                }
            }
            x6.b.y(uVar, key + " no longer present in load balancer children");
            eb.a aVar = eb.a.f5012b;
            List singletonList = Collections.singletonList(uVar);
            eb.a aVar2 = eb.a.f5012b;
            a.b<Boolean> bVar4 = k0.f5150e;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(bVar4, bool);
            for (Map.Entry<a.b<?>, Object> entry2 : aVar2.f5013a.entrySet()) {
                if (!identityHashMap.containsKey(entry2.getKey())) {
                    identityHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            k0.h hVar2 = new k0.h(singletonList, new eb.a(identityHashMap), obj);
            ((b) this.f.get(key)).getClass();
            if (!bVar3.f11402g) {
                bVar3.f11399c.d(hVar2);
            }
        }
        ArrayList arrayList = new ArrayList();
        t.b listIterator = t.p(this.f.keySet()).listIterator(0);
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            if (!hashMap.containsKey(next)) {
                b bVar5 = (b) this.f.get(next);
                if (!bVar5.f11402g) {
                    h.this.f.remove(bVar5.f11397a);
                    bVar5.f11402g = true;
                    f11390k.log(Level.FINE, "Child balancer {0} deactivated", bVar5.f11397a);
                }
                arrayList.add(bVar5);
            }
        }
        return new a(e1.f5070e, arrayList);
    }

    public abstract k0.j h();

    public void i() {
        HashMap hashMap = new HashMap();
        n nVar = null;
        for (b bVar : this.f.values()) {
            if (!bVar.f11402g) {
                hashMap.put(bVar.f11397a, bVar.f);
                n nVar2 = bVar.f11401e;
                if (nVar == null) {
                    nVar = nVar2;
                } else {
                    n nVar3 = n.READY;
                    if (nVar == nVar3 || nVar2 == nVar3 || nVar == (nVar3 = n.CONNECTING) || nVar2 == nVar3 || nVar == (nVar3 = n.IDLE) || nVar2 == nVar3) {
                        nVar = nVar3;
                    }
                }
            }
        }
        if (nVar != null) {
            this.f11391g.f(nVar, h());
            this.f11394j = nVar;
        }
    }
}
