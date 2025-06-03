package B3;

import B3.o;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import h4.InterfaceC1337a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import n4.InterfaceC1730c;
import n4.InterfaceC1731d;
import r4.InterfaceC1921a;
import r4.InterfaceC1922b;
import t0.AbstractC1977f;

/* loaded from: classes.dex */
public class o implements InterfaceC0344e, InterfaceC1337a {

    /* renamed from: i, reason: collision with root package name */
    public static final InterfaceC1922b f775i = new InterfaceC1922b() { // from class: B3.k
        @Override // r4.InterfaceC1922b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Map f776a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f777b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f778c;

    /* renamed from: d, reason: collision with root package name */
    public final List f779d;

    /* renamed from: e, reason: collision with root package name */
    public Set f780e;

    /* renamed from: f, reason: collision with root package name */
    public final v f781f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f782g;

    /* renamed from: h, reason: collision with root package name */
    public final j f783h;

    public o(Executor executor, Iterable iterable, Collection collection, j jVar) {
        this.f776a = new HashMap();
        this.f777b = new HashMap();
        this.f778c = new HashMap();
        this.f780e = new HashSet();
        this.f782g = new AtomicReference();
        v vVar = new v(executor);
        this.f781f = vVar;
        this.f783h = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0342c.s(vVar, v.class, InterfaceC1731d.class, InterfaceC1730c.class));
        arrayList.add(C0342c.s(this, InterfaceC1337a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C0342c c0342c = (C0342c) it.next();
            if (c0342c != null) {
                arrayList.add(c0342c);
            }
        }
        this.f779d = q(iterable);
        n(arrayList);
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    public static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // B3.InterfaceC0344e
    public /* synthetic */ Object a(Class cls) {
        return AbstractC0343d.b(this, cls);
    }

    @Override // B3.InterfaceC0344e
    public synchronized InterfaceC1922b b(F f7) {
        E.c(f7, "Null interface requested.");
        return (InterfaceC1922b) this.f777b.get(f7);
    }

    @Override // B3.InterfaceC0344e
    public /* synthetic */ Set c(Class cls) {
        return AbstractC0343d.f(this, cls);
    }

    @Override // B3.InterfaceC0344e
    public InterfaceC1921a d(F f7) {
        InterfaceC1922b b7 = b(f7);
        return b7 == null ? D.e() : b7 instanceof D ? (D) b7 : D.i(b7);
    }

    @Override // B3.InterfaceC0344e
    public /* synthetic */ Set e(F f7) {
        return AbstractC0343d.e(this, f7);
    }

    @Override // B3.InterfaceC0344e
    public synchronized InterfaceC1922b f(F f7) {
        y yVar = (y) this.f778c.get(f7);
        if (yVar != null) {
            return yVar;
        }
        return f775i;
    }

    @Override // B3.InterfaceC0344e
    public /* synthetic */ InterfaceC1922b g(Class cls) {
        return AbstractC0343d.d(this, cls);
    }

    @Override // B3.InterfaceC0344e
    public /* synthetic */ Object h(F f7) {
        return AbstractC0343d.a(this, f7);
    }

    @Override // B3.InterfaceC0344e
    public /* synthetic */ InterfaceC1921a i(Class cls) {
        return AbstractC0343d.c(this, cls);
    }

    public final void n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f779d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC1922b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f783h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e7) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e7);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C0342c) it2.next()).j().toArray();
                int length = array.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        Object obj = array[i7];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f780e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f780e.add(obj.toString());
                        }
                        i7++;
                    }
                }
            }
            if (this.f776a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f776a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C0342c c0342c = (C0342c) it3.next();
                this.f776a.put(c0342c, new x(new InterfaceC1922b() { // from class: B3.l
                    @Override // r4.InterfaceC1922b
                    public final Object get() {
                        Object r7;
                        r7 = o.this.r(c0342c);
                        return r7;
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        u();
    }

    public final void o(Map map, boolean z7) {
        for (Map.Entry entry : map.entrySet()) {
            C0342c c0342c = (C0342c) entry.getKey();
            InterfaceC1922b interfaceC1922b = (InterfaceC1922b) entry.getValue();
            if (c0342c.n() || (c0342c.o() && z7)) {
                interfaceC1922b.get();
            }
        }
        this.f781f.f();
    }

    public void p(boolean z7) {
        HashMap hashMap;
        if (AbstractC1977f.a(this.f782g, null, Boolean.valueOf(z7))) {
            synchronized (this) {
                hashMap = new HashMap(this.f776a);
            }
            o(hashMap, z7);
        }
    }

    public final /* synthetic */ Object r(C0342c c0342c) {
        return c0342c.h().a(new G(c0342c, this));
    }

    public final void u() {
        Boolean bool = (Boolean) this.f782g.get();
        if (bool != null) {
            o(this.f776a, bool.booleanValue());
        }
    }

    public final void v() {
        Map map;
        F c7;
        InterfaceC1922b e7;
        for (C0342c c0342c : this.f776a.keySet()) {
            for (r rVar : c0342c.g()) {
                if (rVar.g() && !this.f778c.containsKey(rVar.c())) {
                    map = this.f778c;
                    c7 = rVar.c();
                    e7 = y.b(Collections.emptySet());
                } else if (this.f777b.containsKey(rVar.c())) {
                    continue;
                } else {
                    if (rVar.f()) {
                        throw new z(String.format("Unsatisfied dependency for component %s: %s", c0342c, rVar.c()));
                    }
                    if (!rVar.g()) {
                        map = this.f777b;
                        c7 = rVar.c();
                        e7 = D.e();
                    }
                }
                map.put(c7, e7);
            }
        }
    }

    public final List w(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0342c c0342c = (C0342c) it.next();
            if (c0342c.p()) {
                final InterfaceC1922b interfaceC1922b = (InterfaceC1922b) this.f776a.get(c0342c);
                for (F f7 : c0342c.j()) {
                    if (this.f777b.containsKey(f7)) {
                        final D d7 = (D) ((InterfaceC1922b) this.f777b.get(f7));
                        arrayList.add(new Runnable() { // from class: B3.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                D.this.j(interfaceC1922b);
                            }
                        });
                    } else {
                        this.f777b.put(f7, interfaceC1922b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f776a.entrySet()) {
            C0342c c0342c = (C0342c) entry.getKey();
            if (!c0342c.p()) {
                InterfaceC1922b interfaceC1922b = (InterfaceC1922b) entry.getValue();
                for (F f7 : c0342c.j()) {
                    if (!hashMap.containsKey(f7)) {
                        hashMap.put(f7, new HashSet());
                    }
                    ((Set) hashMap.get(f7)).add(interfaceC1922b);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f778c.containsKey(entry2.getKey())) {
                final y yVar = (y) this.f778c.get(entry2.getKey());
                for (final InterfaceC1922b interfaceC1922b2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: B3.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.this.a(interfaceC1922b2);
                        }
                    });
                }
            } else {
                this.f778c.put((F) entry2.getKey(), y.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f784a;

        /* renamed from: b, reason: collision with root package name */
        public final List f785b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final List f786c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public j f787d = j.f768a;

        public b(Executor executor) {
            this.f784a = executor;
        }

        public b b(C0342c c0342c) {
            this.f786c.add(c0342c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f785b.add(new InterfaceC1922b() { // from class: B3.p
                @Override // r4.InterfaceC1922b
                public final Object get() {
                    ComponentRegistrar f7;
                    f7 = o.b.f(ComponentRegistrar.this);
                    return f7;
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f785b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f784a, this.f785b, this.f786c, this.f787d);
        }

        public b g(j jVar) {
            this.f787d = jVar;
            return this;
        }

        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
