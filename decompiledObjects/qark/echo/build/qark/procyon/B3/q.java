// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B3;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public abstract class q
{
    public static void a(final List list) {
        final Set c = c(list);
        final Set b = b(c);
        int n = 0;
        while (!b.isEmpty()) {
            final b b2 = b.iterator().next();
            b.remove(b2);
            final int n2 = n + 1;
            final Iterator iterator = b2.d().iterator();
            while (true) {
                n = n2;
                if (!iterator.hasNext()) {
                    break;
                }
                final b b3 = iterator.next();
                b3.g(b2);
                if (!b3.f()) {
                    continue;
                }
                b.add(b3);
            }
        }
        if (n == list.size()) {
            return;
        }
        final ArrayList<B3.c> list2 = new ArrayList<B3.c>();
        for (final b b4 : c) {
            if (!b4.f() && !b4.e()) {
                list2.add(b4.c());
            }
        }
        throw new s(list2);
    }
    
    public static Set b(final Set set) {
        final HashSet<b> set2 = new HashSet<b>();
        for (final b b : set) {
            if (b.f()) {
                set2.add(b);
            }
        }
        return set2;
    }
    
    public static Set c(final List list) {
        final HashMap<Object, HashSet<Object>> hashMap = new HashMap<Object, HashSet<Object>>(list.size());
        for (final B3.c c : list) {
            final b b = new b(c);
            for (final F f : c.j()) {
                final c c2 = new c(f, c.p() ^ true, null);
                if (!hashMap.containsKey(c2)) {
                    hashMap.put(c2, new HashSet<Object>());
                }
                final HashSet<Object> set = hashMap.get(c2);
                if (!set.isEmpty() && !c.a(c2)) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", f));
                }
                set.add(b);
            }
        }
        final Iterator<HashSet<Object>> iterator3 = hashMap.values().iterator();
        while (iterator3.hasNext()) {
            for (final b b2 : iterator3.next()) {
                for (final r r : b2.c().g()) {
                    if (!r.e()) {
                        continue;
                    }
                    final HashSet<Object> set2 = hashMap.get(new c(r.c(), r.g(), null));
                    if (set2 == null) {
                        continue;
                    }
                    for (final b b3 : set2) {
                        b2.a(b3);
                        b3.b(b2);
                    }
                }
            }
        }
        final HashSet set3 = new HashSet();
        final Iterator<HashSet<Object>> iterator7 = hashMap.values().iterator();
        while (iterator7.hasNext()) {
            set3.addAll(iterator7.next());
        }
        return set3;
    }
    
    public static class b
    {
        public final B3.c a;
        public final Set b;
        public final Set c;
        
        public b(final B3.c a) {
            this.b = new HashSet();
            this.c = new HashSet();
            this.a = a;
        }
        
        public void a(final b b) {
            this.b.add(b);
        }
        
        public void b(final b b) {
            this.c.add(b);
        }
        
        public B3.c c() {
            return this.a;
        }
        
        public Set d() {
            return this.b;
        }
        
        public boolean e() {
            return this.b.isEmpty();
        }
        
        public boolean f() {
            return this.c.isEmpty();
        }
        
        public void g(final b b) {
            this.c.remove(b);
        }
    }
    
    public static class c
    {
        public final F a;
        public final boolean b;
        
        public c(final F a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        public static /* synthetic */ boolean a(final c c) {
            return c.b;
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = o instanceof c;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final c c = (c)o;
                b3 = b2;
                if (c.a.equals(this.a)) {
                    b3 = b2;
                    if (c.b == this.b) {
                        b3 = true;
                    }
                }
            }
            return b3;
        }
        
        @Override
        public int hashCode() {
            return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Boolean.valueOf(this.b).hashCode();
        }
    }
}
