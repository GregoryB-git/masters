/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.util.Pair
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Random
 *  java.util.Set
 */
package n0;

import X2.B;
import android.os.SystemClock;
import android.util.Pair;
import g0.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import n0.a;

public final class b {
    public final Map a;
    public final Map b;
    public final Map c = new HashMap();
    public final Random d;

    public b() {
        this(new Random());
    }

    public b(Random random) {
        this.d = random;
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public static /* synthetic */ int a(o0.b b8, o0.b b9) {
        return b.d(b8, b9);
    }

    public static void b(Object object, long l8, Map map) {
        long l9 = l8;
        if (map.containsKey(object)) {
            l9 = Math.max((long)l8, (long)((Long)M.i((Object)((Long)map.get(object)))));
        }
        map.put(object, (Object)l9);
    }

    public static int d(o0.b b8, o0.b b9) {
        int n8 = Integer.compare((int)b8.c, (int)b9.c);
        if (n8 != 0) {
            return n8;
        }
        return b8.b.compareTo(b9.b);
    }

    public static int f(List list) {
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            hashSet.add((Object)((o0.b)list.get((int)i8)).c);
        }
        return hashSet.size();
    }

    public static void h(long l8, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if ((Long)entry.getValue() > l8) continue;
            arrayList.add(entry.getKey());
        }
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            map.remove(arrayList.get(i8));
        }
    }

    public final List c(List list) {
        long l8 = SystemClock.elapsedRealtime();
        b.h(l8, this.a);
        b.h(l8, this.b);
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            o0.b b8 = (o0.b)list.get(i8);
            if (this.a.containsKey((Object)b8.b) || this.b.containsKey((Object)b8.c)) continue;
            arrayList.add((Object)b8);
        }
        return arrayList;
    }

    public void e(o0.b b8, long l8) {
        l8 = SystemClock.elapsedRealtime() + l8;
        b.b(b8.b, l8, this.a);
        int n8 = b8.c;
        if (n8 != Integer.MIN_VALUE) {
            b.b(n8, l8, this.b);
        }
    }

    public int g(List list) {
        HashSet hashSet = new HashSet();
        list = this.c(list);
        for (int i8 = 0; i8 < list.size(); ++i8) {
            hashSet.add((Object)((o0.b)list.get((int)i8)).c);
        }
        return hashSet.size();
    }

    public void i() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public o0.b j(List object) {
        List list = this.c((List)object);
        if (list.size() < 2) {
            object = B.c((Iterable)list, null);
            do {
                return (o0.b)object;
                break;
            } while (true);
        }
        Collections.sort((List)list, (Comparator)new a());
        ArrayList arrayList = new ArrayList();
        int n8 = ((o0.b)list.get((int)0)).c;
        for (int i8 = 0; i8 < list.size(); ++i8) {
            object = (o0.b)list.get(i8);
            if (n8 != object.c) {
                if (arrayList.size() != 1) break;
                object = list.get(0);
                return (o0.b)object;
            }
            arrayList.add((Object)new Pair((Object)object.b, (Object)object.d));
        }
        o0.b b8 = (o0.b)this.c.get((Object)arrayList);
        object = b8;
        if (b8 != null) return object;
        object = this.k(list.subList(0, arrayList.size()));
        this.c.put((Object)arrayList, object);
        return object;
    }

    public final o0.b k(List list) {
        int n8;
        int n9 = 0;
        int n10 = n8 = 0;
        while (n8 < list.size()) {
            n10 += ((o0.b)list.get((int)n8)).d;
            ++n8;
        }
        int n11 = this.d.nextInt(n10);
        n10 = 0;
        for (n8 = n9; n8 < list.size(); ++n8) {
            o0.b b8 = (o0.b)list.get(n8);
            if (n11 >= (n10 += b8.d)) continue;
            return b8;
        }
        return (o0.b)B.d((Iterable)list);
    }
}

