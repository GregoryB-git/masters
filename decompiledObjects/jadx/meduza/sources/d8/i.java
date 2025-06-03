package d8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i implements c, x8.a {

    /* renamed from: h, reason: collision with root package name */
    public static final g f3598h = new g(0);

    /* renamed from: e, reason: collision with root package name */
    public final m f3603e;

    /* renamed from: g, reason: collision with root package name */
    public final f f3604g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3599a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3600b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3601c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public HashSet f3602d = new HashSet();
    public final AtomicReference<Boolean> f = new AtomicReference<>();

    public i(Executor executor, ArrayList arrayList, ArrayList arrayList2, f fVar) {
        m mVar = new m(executor);
        this.f3603e = mVar;
        this.f3604g = fVar;
        ArrayList arrayList3 = new ArrayList();
        int i10 = 1;
        arrayList3.add(b.c(mVar, m.class, c9.d.class, c9.c.class));
        arrayList3.add(b.c(this, x8.a.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((t9.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f3604g.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (n e10) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((b) it4.next()).f3583b.toArray();
                int length = array.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        Object obj = array[i11];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f3602d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f3602d.add(obj.toString());
                        }
                        i11++;
                    }
                }
            }
            if (this.f3599a.isEmpty()) {
                j.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f3599a.keySet());
                arrayList6.addAll(arrayList3);
                j.a(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                b bVar2 = (b) it5.next();
                this.f3599a.put(bVar2, new o(new u7.d(i10, this, bVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = this.f.get();
        if (bool != null) {
            g(this.f3599a, bool.booleanValue());
        }
    }

    @Override // d8.c
    public final <T> t9.a<T> a(t<T> tVar) {
        t9.b<T> c10 = c(tVar);
        return c10 == null ? new s(s.f3623c, s.f3624d) : c10 instanceof s ? (s) c10 : new s(null, c10);
    }

    @Override // d8.c
    public final t9.b b(Class cls) {
        return c(t.a(cls));
    }

    @Override // d8.c
    public final synchronized <T> t9.b<T> c(t<T> tVar) {
        if (tVar == null) {
            throw new NullPointerException("Null interface requested.");
        }
        return (t9.b) this.f3600b.get(tVar);
    }

    @Override // d8.c
    public final Set d(t tVar) {
        return (Set) k(tVar).get();
    }

    @Override // d8.c
    public final Object e(t tVar) {
        t9.b c10 = c(tVar);
        if (c10 == null) {
            return null;
        }
        return c10.get();
    }

    @Override // d8.c
    public final t9.a f(Class cls) {
        return a(t.a(cls));
    }

    public final void g(Map<b<?>, t9.b<?>> map, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry<b<?>, t9.b<?>> entry : map.entrySet()) {
            b<?> key = entry.getKey();
            t9.b<?> value = entry.getValue();
            int i10 = key.f3585d;
            if (!(i10 == 1)) {
                if ((i10 == 2) && z10) {
                }
            }
            value.get();
        }
        m mVar = this.f3603e;
        synchronized (mVar) {
            try {
                arrayDeque = mVar.f3615b;
                if (arrayDeque != null) {
                    mVar.f3615b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                mVar.b((c9.a) it.next());
            }
        }
    }

    @Override // d8.c
    public final Object get(Class cls) {
        return e(t.a(cls));
    }

    public final void h() {
        HashMap hashMap;
        t<?> tVar;
        Object sVar;
        for (b bVar : this.f3599a.keySet()) {
            for (k kVar : bVar.f3584c) {
                if ((kVar.f3611b == 2) && !this.f3601c.containsKey(kVar.f3610a)) {
                    hashMap = this.f3601c;
                    tVar = kVar.f3610a;
                    sVar = new p(Collections.emptySet());
                } else if (this.f3600b.containsKey(kVar.f3610a)) {
                    continue;
                } else {
                    int i10 = kVar.f3611b;
                    if (i10 == 1) {
                        throw new q(String.format("Unsatisfied dependency for component %s: %s", bVar, kVar.f3610a));
                    }
                    if (!(i10 == 2)) {
                        hashMap = this.f3600b;
                        tVar = kVar.f3610a;
                        sVar = new s(s.f3623c, s.f3624d);
                    }
                }
                hashMap.put(tVar, sVar);
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f3586e == 0) {
                t9.b bVar2 = (t9.b) this.f3599a.get(bVar);
                Iterator it2 = bVar.f3583b.iterator();
                while (it2.hasNext()) {
                    t tVar = (t) it2.next();
                    if (this.f3600b.containsKey(tVar)) {
                        arrayList2.add(new w.g(14, (s) ((t9.b) this.f3600b.get(tVar)), bVar2));
                    } else {
                        this.f3600b.put(tVar, bVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f3599a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (!(bVar.f3586e == 0)) {
                t9.b bVar2 = (t9.b) entry.getValue();
                Iterator it = bVar.f3583b.iterator();
                while (it.hasNext()) {
                    t tVar = (t) it.next();
                    if (!hashMap.containsKey(tVar)) {
                        hashMap.put(tVar, new HashSet());
                    }
                    ((Set) hashMap.get(tVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f3601c.containsKey(entry2.getKey())) {
                p pVar = (p) this.f3601c.get(entry2.getKey());
                Iterator it2 = ((Set) entry2.getValue()).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new g.q(10, pVar, (t9.b) it2.next()));
                }
            } else {
                this.f3601c.put((t) entry2.getKey(), new p((Set) ((Collection) entry2.getValue())));
            }
        }
        return arrayList;
    }

    public final synchronized <T> t9.b<Set<T>> k(t<T> tVar) {
        p pVar = (p) this.f3601c.get(tVar);
        if (pVar != null) {
            return pVar;
        }
        return f3598h;
    }
}
