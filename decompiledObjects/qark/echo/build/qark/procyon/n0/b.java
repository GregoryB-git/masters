// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n0;

import X2.B;
import android.util.Pair;
import java.util.Comparator;
import java.util.Collections;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import g0.M;
import java.util.HashMap;
import java.util.Random;
import java.util.Map;

public final class b
{
    public final Map a;
    public final Map b;
    public final Map c;
    public final Random d;
    
    public b() {
        this(new Random());
    }
    
    public b(final Random d) {
        this.c = new HashMap();
        this.d = d;
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    public static void b(final Object o, final long a, final Map map) {
        long max = a;
        if (map.containsKey(o)) {
            max = Math.max(a, (long)M.i(map.get(o)));
        }
        map.put(o, max);
    }
    
    public static int d(final o0.b b, final o0.b b2) {
        final int compare = Integer.compare(b.c, b2.c);
        if (compare != 0) {
            return compare;
        }
        return b.b.compareTo(b2.b);
    }
    
    public static int f(final List list) {
        final HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < list.size(); ++i) {
            set.add(list.get(i).c);
        }
        return set.size();
    }
    
    public static void h(final long n, final Map map) {
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final Map.Entry<K, Long> entry : map.entrySet()) {
            if (entry.getValue() <= n) {
                list.add(entry.getKey());
            }
        }
        for (int i = 0; i < list.size(); ++i) {
            map.remove(list.get(i));
        }
    }
    
    public final List c(final List list) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.a);
        h(elapsedRealtime, this.b);
        final ArrayList<o0.b> list2 = new ArrayList<o0.b>();
        for (int i = 0; i < list.size(); ++i) {
            final o0.b b = list.get(i);
            if (!this.a.containsKey(b.b) && !this.b.containsKey(b.c)) {
                list2.add(b);
            }
        }
        return list2;
    }
    
    public void e(final o0.b b, long n) {
        n += SystemClock.elapsedRealtime();
        b(b.b, n, this.a);
        final int c = b.c;
        if (c != Integer.MIN_VALUE) {
            b(c, n, this.b);
        }
    }
    
    public int g(List c) {
        final HashSet<Integer> set = new HashSet<Integer>();
        c = this.c(c);
        for (int i = 0; i < c.size(); ++i) {
            set.add(c.get(i).c);
        }
        return set.size();
    }
    
    public void i() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
    }
    
    public o0.b j(final List list) {
        final List c = this.c(list);
        if (c.size() >= 2) {
            Collections.sort((List<Object>)c, new a());
            final ArrayList<Pair> list2 = new ArrayList<Pair>();
            final int c2 = c.get(0).c;
            int i = 0;
            while (i < c.size()) {
                final o0.b b = c.get(i);
                if (c2 != b.c) {
                    if (list2.size() == 1) {
                        final Object o = c.get(0);
                        return (o0.b)o;
                    }
                    break;
                }
                else {
                    list2.add(new Pair((Object)b.b, (Object)b.d));
                    ++i;
                }
            }
            o0.b k;
            if ((k = this.c.get(list2)) == null) {
                k = this.k(c.subList(0, list2.size()));
                this.c.put(list2, k);
            }
            return k;
        }
        final Object o = B.c(c, null);
        return (o0.b)o;
    }
    
    public final o0.b k(final List list) {
        final int n = 0;
        int bound;
        for (int i = bound = 0; i < list.size(); ++i) {
            bound += list.get(i).d;
        }
        final int nextInt = this.d.nextInt(bound);
        int n2 = 0;
        for (int j = n; j < list.size(); ++j) {
            final o0.b b = list.get(j);
            n2 += b.d;
            if (nextInt < n2) {
                return b;
            }
        }
        return (o0.b)B.d(list);
    }
}
