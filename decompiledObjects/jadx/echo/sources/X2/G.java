package X2;

import X2.a0;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class G {

    public class a extends e0 {
        public a(Iterator it) {
            super(it);
        }

        @Override // X2.e0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object b(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b implements W2.g {

        /* renamed from: o, reason: collision with root package name */
        public static final b f7055o = new a("KEY", 0);

        /* renamed from: p, reason: collision with root package name */
        public static final b f7056p = new C0121b("VALUE", 1);

        /* renamed from: q, reason: collision with root package name */
        public static final /* synthetic */ b[] f7057q = c();

        public enum a extends b {
            public a(String str, int i7) {
                super(str, i7, null);
            }

            @Override // W2.g
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* renamed from: X2.G$b$b, reason: collision with other inner class name */
        public enum C0121b extends b {
            public C0121b(String str, int i7) {
                super(str, i7, null);
            }

            @Override // W2.g
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        public b(String str, int i7) {
        }

        public static /* synthetic */ b[] c() {
            return new b[]{f7055o, f7056p};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f7057q.clone();
        }

        public /* synthetic */ b(String str, int i7, F f7) {
            this(str, i7);
        }
    }

    public static abstract class c extends a0.d {
        public abstract Map a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // X2.a0.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) W2.m.j(collection));
            } catch (UnsupportedOperationException unused) {
                return a0.j(this, collection.iterator());
            }
        }

        @Override // X2.a0.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) W2.m.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g7 = a0.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        g7.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(g7);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    public static class d extends a0.d {

        /* renamed from: o, reason: collision with root package name */
        public final Map f7058o;

        public d(Map map) {
            this.f7058o = (Map) W2.m.j(map);
        }

        public Map a() {
            return this.f7058o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    public static class e extends AbstractCollection {

        /* renamed from: o, reason: collision with root package name */
        public final Map f7059o;

        public e(Map map) {
            this.f7059o = (Map) W2.m.j(map);
        }

        public final Map a() {
            return this.f7059o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return G.m(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : a().entrySet()) {
                    if (W2.k.a(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) W2.m.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f7 = a0.f();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f7.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(f7);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) W2.m.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f7 = a0.f();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f7.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(f7);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    public static abstract class f extends AbstractMap {

        /* renamed from: o, reason: collision with root package name */
        public transient Set f7060o;

        /* renamed from: p, reason: collision with root package name */
        public transient Collection f7061p;

        public abstract Set a();

        public Collection b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f7060o;
            if (set != null) {
                return set;
            }
            Set a7 = a();
            this.f7060o = a7;
            return a7;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.f7061p;
            if (collection != null) {
                return collection;
            }
            Collection b7 = b();
            this.f7061p = b7;
            return b7;
        }
    }

    public static int a(int i7) {
        if (i7 < 3) {
            AbstractC0691i.b(i7, "expectedSize");
            return i7 + 1;
        }
        if (i7 < 1073741824) {
            return (int) Math.ceil(i7 / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(Map map, Object obj) {
        return C.d(m(map.entrySet().iterator()), obj);
    }

    public static boolean c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry d(Object obj, Object obj2) {
        return new C0702u(obj, obj2);
    }

    public static W2.g e() {
        return b.f7055o;
    }

    public static HashMap f(int i7) {
        return new HashMap(a(i7));
    }

    public static IdentityHashMap g() {
        return new IdentityHashMap();
    }

    public static boolean h(Map map, Object obj) {
        W2.m.j(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static Object i(Map map, Object obj) {
        W2.m.j(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static Object j(Map map, Object obj) {
        W2.m.j(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String k(Map map) {
        StringBuilder b7 = AbstractC0692j.b(map.size());
        b7.append('{');
        boolean z7 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z7) {
                b7.append(", ");
            }
            b7.append(entry.getKey());
            b7.append('=');
            b7.append(entry.getValue());
            z7 = false;
        }
        b7.append('}');
        return b7.toString();
    }

    public static W2.g l() {
        return b.f7056p;
    }

    public static Iterator m(Iterator it) {
        return new a(it);
    }
}
