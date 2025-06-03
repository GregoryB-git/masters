/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
package B3;

import B3.F;
import B3.r;
import B3.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class q {
    public static void a(List list) {
        Set set = q.c(list);
        Object object2 = q.b(set);
        int n8 = 0;
        block0 : while (!object2.isEmpty()) {
            b b8 = (b)object2.iterator().next();
            object2.remove((Object)b8);
            int n9 = n8 + 1;
            Iterator iterator = b8.d().iterator();
            do {
                n8 = n9;
                if (!iterator.hasNext()) continue block0;
                b b9 = (b)iterator.next();
                b9.g(b8);
                if (!b9.f()) continue;
                object2.add((Object)b9);
            } while (true);
        }
        if (n8 == list.size()) {
            return;
        }
        list = new ArrayList();
        for (Object object2 : set) {
            if (object2.f() || object2.e()) continue;
            list.add((Object)object2.c());
        }
        throw new s(list);
    }

    public static Set b(Set set) {
        HashSet hashSet = new HashSet();
        for (b b8 : set) {
            if (!b8.f()) continue;
            hashSet.add((Object)b8);
        }
        return hashSet;
    }

    public static Set c(List list) {
        Object object;
        HashMap hashMap = new HashMap(list.size());
        for (B3.c c8 : list) {
            b b8 = new b(c8);
            for (Object object2 : c8.j()) {
                Set set;
                object = new c((F)object2, c8.p() ^ true, null);
                if (!hashMap.containsKey(object)) {
                    hashMap.put(object, (Object)new HashSet());
                }
                if (!(set = (Set)hashMap.get(object)).isEmpty() && !((c)object).b) {
                    throw new IllegalArgumentException(String.format((String)"Multiple components provide %s.", (Object[])new Object[]{object2}));
                }
                set.add((Object)b8);
            }
        }
        list = hashMap.values().iterator();
        while (list.hasNext()) {
            for (b b8 : (Set)list.next()) {
                Iterator iterator = b8.c().g().iterator();
                while (iterator.hasNext()) {
                    Object object2;
                    object2 = (r)iterator.next();
                    if (!object2.e() || (object2 = (Set)hashMap.get((Object)new c(object2.c(), object2.g(), null))) == null) continue;
                    object2 = object2.iterator();
                    while (object2.hasNext()) {
                        object = (b)object2.next();
                        b8.a((b)object);
                        object.b(b8);
                    }
                }
            }
        }
        list = new HashSet();
        hashMap = hashMap.values().iterator();
        while (hashMap.hasNext()) {
            list.addAll((Collection)((Set)hashMap.next()));
        }
        return list;
    }

    public static class b {
        public final B3.c a;
        public final Set b = new HashSet();
        public final Set c = new HashSet();

        public b(B3.c c8) {
            this.a = c8;
        }

        public void a(b b8) {
            this.b.add((Object)b8);
        }

        public void b(b b8) {
            this.c.add((Object)b8);
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

        public void g(b b8) {
            this.c.remove((Object)b8);
        }
    }

    public static class c {
        public final F a;
        public final boolean b;

        public c(F f8, boolean bl) {
            this.a = f8;
            this.b = bl;
        }

        public /* synthetic */ c(F f8, boolean bl,  a8) {
            this(f8, bl);
        }

        public boolean equals(Object object) {
            boolean bl;
            boolean bl2 = object instanceof c;
            boolean bl3 = bl = false;
            if (bl2) {
                object = (c)object;
                bl3 = bl;
                if (object.a.equals(this.a)) {
                    bl3 = bl;
                    if (object.b == this.b) {
                        bl3 = true;
                    }
                }
            }
            return bl3;
        }

        public int hashCode() {
            return (this.a.hashCode() ^ 1000003) * 1000003 ^ Boolean.valueOf((boolean)this.b).hashCode();
        }
    }

}

