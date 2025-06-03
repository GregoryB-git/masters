// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.AbstractMap;
import W2.k;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import W2.m;
import java.util.IdentityHashMap;
import java.util.HashMap;
import W2.g;
import java.util.Iterator;
import java.util.Map;

public abstract class G
{
    public static int a(final int n) {
        if (n < 3) {
            i.b(n, "expectedSize");
            return n + 1;
        }
        if (n < 1073741824) {
            return (int)Math.ceil(n / 0.75);
        }
        return Integer.MAX_VALUE;
    }
    
    public static boolean b(final Map map, final Object o) {
        return C.d(m(map.entrySet().iterator()), o);
    }
    
    public static boolean c(final Map map, final Object o) {
        return map == o || (o instanceof Map && map.entrySet().equals(((Map)o).entrySet()));
    }
    
    public static Map.Entry d(final Object o, final Object o2) {
        return new u(o, o2);
    }
    
    public static g e() {
        return b.o;
    }
    
    public static HashMap f(final int n) {
        return new HashMap(a(n));
    }
    
    public static IdentityHashMap g() {
        return new IdentityHashMap();
    }
    
    public static boolean h(final Map map, final Object o) {
        m.j(map);
        try {
            return map.containsKey(o);
        }
        catch (ClassCastException | NullPointerException ex) {
            return false;
        }
    }
    
    public static Object i(final Map map, final Object o) {
        m.j(map);
        try {
            return map.get(o);
        }
        catch (ClassCastException | NullPointerException ex) {
            return null;
        }
    }
    
    public static Object j(final Map map, final Object o) {
        m.j(map);
        try {
            return map.remove(o);
        }
        catch (ClassCastException | NullPointerException ex) {
            return null;
        }
    }
    
    public static String k(final Map map) {
        final StringBuilder b = j.b(map.size());
        b.append('{');
        final Iterator<Map.Entry<Object, V>> iterator = map.entrySet().iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Map.Entry<Object, V> entry = iterator.next();
            if (n == 0) {
                b.append(", ");
            }
            b.append(entry.getKey());
            b.append('=');
            b.append(entry.getValue());
            n = 0;
        }
        b.append('}');
        return b.toString();
    }
    
    public static g l() {
        return b.p;
    }
    
    public static Iterator m(final Iterator iterator) {
        return new e0(iterator) {
            public Object d(final Map.Entry entry) {
                return entry.getValue();
            }
        };
    }
    
    public enum b implements g
    {
        o {
            public Object e(final Map.Entry entry) {
                return entry.getKey();
            }
        }, 
        p {
            public Object e(final Map.Entry entry) {
                return entry.getValue();
            }
        };
        
        static {
            q = c();
        }
        
        public b(final String name, final int ordinal) {
        }
        
        public static /* synthetic */ b[] c() {
            return new b[] { b.o, b.p };
        }
    }
    
    public abstract static class c extends a0.d
    {
        public abstract Map a();
        
        @Override
        public void clear() {
            this.a().clear();
        }
        
        @Override
        public abstract boolean contains(final Object p0);
        
        @Override
        public boolean isEmpty() {
            return this.a().isEmpty();
        }
        
        @Override
        public boolean removeAll(final Collection collection) {
            try {
                return super.removeAll((Collection)m.j(collection));
            }
            catch (UnsupportedOperationException ex) {
                return a0.j(this, collection.iterator());
            }
        }
        
        @Override
        public boolean retainAll(Collection iterator) {
        Block_4_Outer:
            while (true) {
                try {
                    return super.retainAll((Collection)m.j(iterator));
                    final HashSet g = a0.g(((Collection)iterator).size());
                    iterator = ((Collection<Map.Entry<Object, V>>)iterator).iterator();
                    // iftrue(Label_0085:, !iterator.hasNext())
                    // iftrue(Label_0031:, !this.contains((Object)next) || !next instanceof Map.Entry)
                    while (true) {
                    Block_2:
                        while (true) {
                            break Block_2;
                            final Map.Entry<Object, V> next;
                            g.add(next.getKey());
                            continue Block_4_Outer;
                        }
                        final Map.Entry<Object, V> next = iterator.next();
                        continue;
                    }
                    Label_0085: {
                        return this.a().keySet().retainAll(g);
                    }
                }
                catch (UnsupportedOperationException ex) {
                    continue;
                }
                break;
            }
        }
        
        @Override
        public int size() {
            return this.a().size();
        }
    }
    
    public abstract static class d extends a0.d
    {
        public final Map o;
        
        public d(final Map map) {
            this.o = (Map)m.j(map);
        }
        
        public Map a() {
            return this.o;
        }
        
        @Override
        public boolean contains(final Object o) {
            return this.a().containsKey(o);
        }
        
        @Override
        public boolean isEmpty() {
            return this.a().isEmpty();
        }
        
        @Override
        public int size() {
            return this.a().size();
        }
    }
    
    public static class e extends AbstractCollection
    {
        public final Map o;
        
        public e(final Map map) {
            this.o = (Map)m.j(map);
        }
        
        public final Map a() {
            return this.o;
        }
        
        @Override
        public void clear() {
            this.a().clear();
        }
        
        @Override
        public boolean contains(final Object o) {
            return this.a().containsValue(o);
        }
        
        @Override
        public boolean isEmpty() {
            return this.a().isEmpty();
        }
        
        @Override
        public Iterator iterator() {
            return G.m(this.a().entrySet().iterator());
        }
        
        @Override
        public boolean remove(final Object o) {
            while (true) {
                try {
                    return super.remove(o);
                    Label_0076: {
                        return false;
                    }
                    // iftrue(Label_0076:, !iterator.hasNext())
                    // iftrue(Label_0023:, !k.a(o, entry.getValue()))
                    while (true) {
                        while (true) {
                            final Map.Entry<K, Object> entry;
                            this.a().remove(entry.getKey());
                            return true;
                            final Iterator<Map.Entry<K, Object>> iterator;
                            entry = iterator.next();
                            continue;
                        }
                        final Iterator<Map.Entry<K, Object>> iterator = this.a().entrySet().iterator();
                        continue;
                    }
                }
                catch (UnsupportedOperationException ex) {
                    continue;
                }
                break;
            }
        }
        
        @Override
        public boolean removeAll(final Collection collection) {
        Block_3_Outer:
            while (true) {
                try {
                    return super.removeAll((Collection<?>)m.j(collection));
                    // iftrue(Label_0089:, !iterator.hasNext())
                    while (true) {
                        Iterator<Map.Entry<K, Object>> iterator = null;
                        Block_2: {
                            HashSet f;
                            while (true) {
                                break Block_2;
                                f = a0.f();
                                iterator = this.a().entrySet().iterator();
                                continue Block_3_Outer;
                                final Map.Entry<K, Object> entry;
                                f.add(entry.getKey());
                                continue Block_3_Outer;
                            }
                            Label_0089: {
                                return this.a().keySet().removeAll(f);
                            }
                        }
                        final Map.Entry<K, Object> entry = iterator.next();
                        continue;
                    }
                }
                // iftrue(Label_0034:, !collection.contains(entry.getValue()))
                catch (UnsupportedOperationException ex) {
                    continue;
                }
                break;
            }
        }
        
        @Override
        public boolean retainAll(final Collection collection) {
            while (true) {
                try {
                    return super.retainAll((Collection<?>)m.j(collection));
                    Label_0089: {
                        final HashSet f;
                        return this.a().keySet().retainAll(f);
                    }
                    final HashSet f = a0.f();
                    final Iterator<Map.Entry<K, Object>> iterator = this.a().entrySet().iterator();
                    while (true) {
                        final Map.Entry<K, Object> entry = iterator.next();
                        f.add(entry.getKey());
                        continue;
                    }
                }
                // iftrue(Label_0089:, !iterator.hasNext())
                // iftrue(Label_0034:, !collection.contains(entry.getValue()))
                catch (UnsupportedOperationException ex) {
                    continue;
                }
                break;
            }
        }
        
        @Override
        public int size() {
            return this.a().size();
        }
    }
    
    public abstract static class f extends AbstractMap
    {
        public transient Set o;
        public transient Collection p;
        
        public abstract Set a();
        
        public Collection b() {
            return new e(this);
        }
        
        @Override
        public Set entrySet() {
            Set o;
            if ((o = this.o) == null) {
                o = this.a();
                this.o = o;
            }
            return o;
        }
        
        @Override
        public Collection values() {
            Collection p;
            if ((p = this.p) == null) {
                p = this.b();
                this.p = p;
            }
            return p;
        }
    }
}
