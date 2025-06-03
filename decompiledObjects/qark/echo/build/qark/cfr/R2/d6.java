/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.BitSet
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package R2;

import R2.K;
import R2.N5;
import R2.P1;
import R2.b6;
import R2.d;
import R2.g;
import R2.g6;
import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.W1;
import com.google.android.gms.internal.measurement.X1;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.g2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t.a;

public final class d6 {
    public String a;
    public boolean b;
    public f2 c;
    public BitSet d;
    public BitSet e;
    public Map f;
    public Map g;
    public final /* synthetic */ b6 h;

    public d6(b6 b62, String string2) {
        this.h = b62;
        this.a = string2;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new a();
        this.g = new a();
    }

    public /* synthetic */ d6(b6 b62, String string2, g6 g62) {
        this(b62, string2);
    }

    public d6(b6 b62, String string22, f2 f22, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.h = b62;
        this.a = string22;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new a();
        if (map2 != null) {
            for (String string22 : map2.keySet()) {
                bitSet = new ArrayList();
                bitSet.add((Object)((Long)map2.get((Object)string22)));
                this.g.put((Object)string22, (Object)bitSet);
            }
        }
        this.b = false;
        this.c = f22;
    }

    public /* synthetic */ d6(b6 b62, String string2, f2 f22, BitSet bitSet, BitSet bitSet2, Map map, Map map2, g6 g62) {
        this(b62, string2, f22, bitSet, bitSet2, map, map2);
    }

    public final W1 a(int n8) {
        Iterator iterator;
        ArrayList arrayList;
        W1.a a8 = W1.M();
        a8.w(n8);
        a8.z(this.b);
        K4 k42 = this.c;
        if (k42 != null) {
            a8.y((f2)k42);
        }
        f2.a a9 = f2.V().z((Iterable)N5.M(this.d)).D((Iterable)N5.M(this.e));
        if (this.f == null) {
            k42 = null;
        } else {
            arrayList = new ArrayList(this.f.size());
            iterator = this.f.keySet().iterator();
            do {
                k42 = arrayList;
                if (!iterator.hasNext()) break;
                k42 = (Integer)iterator.next();
                n8 = k42.intValue();
                if ((k42 = (Long)this.f.get((Object)k42)) == null) continue;
                arrayList.add((Object)((X1)((Y3)X1.L().w(n8).x(k42.longValue()).p())));
            } while (true);
        }
        if (k42 != null) {
            a9.x((Iterable)k42);
        }
        if (this.g == null) {
            k42 = Collections.emptyList();
        } else {
            arrayList = new ArrayList(this.g.size());
            iterator = this.g.keySet().iterator();
            do {
                k42 = arrayList;
                if (!iterator.hasNext()) break;
                Integer n9 = (Integer)iterator.next();
                k42 = g2.M().w(n9);
                if ((n9 = (List)this.g.get((Object)n9)) != null) {
                    Collections.sort((List)n9);
                    k42.x((Iterable)n9);
                }
                arrayList.add((Object)((g2)((Y3)k42.p())));
            } while (true);
        }
        a9.B((Iterable)k42);
        a8.x(a9);
        return (W1)((Y3)a8.p());
    }

    public final void c(d d8) {
        long l8;
        int n8 = d8.a();
        Boolean bl = d8.c;
        if (bl != null) {
            this.e.set(n8, bl.booleanValue());
        }
        if ((bl = d8.d) != null) {
            this.d.set(n8, bl.booleanValue());
        }
        if (d8.e != null) {
            bl = (Long)this.f.get((Object)n8);
            l8 = d8.e / 1000L;
            if (bl == null || l8 > bl.longValue()) {
                this.f.put((Object)n8, (Object)l8);
            }
        }
        if (d8.f != null) {
            List list = (List)this.g.get((Object)n8);
            bl = list;
            if (list == null) {
                bl = new ArrayList();
                this.g.put((Object)n8, (Object)bl);
            }
            if (d8.j()) {
                bl.clear();
            }
            if (A6.a() && this.h.f().D(this.a, K.j0) && d8.i()) {
                bl.clear();
            }
            if (A6.a() && this.h.f().D(this.a, K.j0)) {
                l8 = d8.f / 1000L;
                if (!bl.contains((Object)l8)) {
                    bl.add((Object)l8);
                }
                return;
            }
            bl.add((Object)(d8.f / 1000L));
        }
    }
}

