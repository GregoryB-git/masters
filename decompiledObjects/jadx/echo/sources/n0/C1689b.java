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
import o0.C1751b;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1689b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f17847a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f17848b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f17849c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f17850d;

    public C1689b() {
        this(new Random());
    }

    public static void b(Object obj, long j7, Map map) {
        if (map.containsKey(obj)) {
            j7 = Math.max(j7, ((Long) M.i((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j7));
    }

    public static int d(C1751b c1751b, C1751b c1751b2) {
        int compare = Integer.compare(c1751b.f18080c, c1751b2.f18080c);
        return compare != 0 ? compare : c1751b.f18079b.compareTo(c1751b2.f18079b);
    }

    public static int f(List list) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < list.size(); i7++) {
            hashSet.add(Integer.valueOf(((C1751b) list.get(i7)).f18080c));
        }
        return hashSet.size();
    }

    public static void h(long j7, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j7) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            map.remove(arrayList.get(i7));
        }
    }

    public final List c(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.f17847a);
        h(elapsedRealtime, this.f17848b);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            C1751b c1751b = (C1751b) list.get(i7);
            if (!this.f17847a.containsKey(c1751b.f18079b) && !this.f17848b.containsKey(Integer.valueOf(c1751b.f18080c))) {
                arrayList.add(c1751b);
            }
        }
        return arrayList;
    }

    public void e(C1751b c1751b, long j7) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j7;
        b(c1751b.f18079b, elapsedRealtime, this.f17847a);
        int i7 = c1751b.f18080c;
        if (i7 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i7), elapsedRealtime, this.f17848b);
        }
    }

    public int g(List list) {
        HashSet hashSet = new HashSet();
        List c7 = c(list);
        for (int i7 = 0; i7 < c7.size(); i7++) {
            hashSet.add(Integer.valueOf(((C1751b) c7.get(i7)).f18080c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f17847a.clear();
        this.f17848b.clear();
        this.f17849c.clear();
    }

    public C1751b j(List list) {
        Object obj;
        List c7 = c(list);
        if (c7.size() >= 2) {
            Collections.sort(c7, new Comparator() { // from class: n0.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int d7;
                    d7 = C1689b.d((C1751b) obj2, (C1751b) obj3);
                    return d7;
                }
            });
            ArrayList arrayList = new ArrayList();
            int i7 = ((C1751b) c7.get(0)).f18080c;
            int i8 = 0;
            while (true) {
                if (i8 >= c7.size()) {
                    break;
                }
                C1751b c1751b = (C1751b) c7.get(i8);
                if (i7 == c1751b.f18080c) {
                    arrayList.add(new Pair(c1751b.f18079b, Integer.valueOf(c1751b.f18081d)));
                    i8++;
                } else if (arrayList.size() == 1) {
                    obj = c7.get(0);
                }
            }
            C1751b c1751b2 = (C1751b) this.f17849c.get(arrayList);
            if (c1751b2 != null) {
                return c1751b2;
            }
            C1751b k7 = k(c7.subList(0, arrayList.size()));
            this.f17849c.put(arrayList, k7);
            return k7;
        }
        obj = B.c(c7, null);
        return (C1751b) obj;
    }

    public final C1751b k(List list) {
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += ((C1751b) list.get(i8)).f18081d;
        }
        int nextInt = this.f17850d.nextInt(i7);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C1751b c1751b = (C1751b) list.get(i10);
            i9 += c1751b.f18081d;
            if (nextInt < i9) {
                return c1751b;
            }
        }
        return (C1751b) B.d(list);
    }

    public C1689b(Random random) {
        this.f17849c = new HashMap();
        this.f17850d = random;
        this.f17847a = new HashMap();
        this.f17848b = new HashMap();
    }
}
