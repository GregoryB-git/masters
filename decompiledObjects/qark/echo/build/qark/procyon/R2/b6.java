// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.measurement.W1;
import java.util.Iterator;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.x1;
import java.util.BitSet;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.g2;
import com.google.android.gms.internal.measurement.X1;
import java.util.ArrayList;
import com.google.android.gms.internal.measurement.f2;
import java.util.Collection;
import java.util.Collections;
import android.database.sqlite.SQLiteException;
import android.content.ContentValues;
import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.Y1;
import t.a;
import java.util.HashSet;
import A2.n;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b6 extends C5
{
    public String d;
    public Set e;
    public Map f;
    public Long g;
    public Long h;
    
    public b6(final D5 d5) {
        super(d5);
    }
    
    public final boolean A(final int i, final int bitIndex) {
        final d6 d6 = this.f.get(i);
        return d6 != null && R2.d6.b(d6).get(bitIndex);
    }
    
    @Override
    public final boolean x() {
        return false;
    }
    
    public final d6 y(final Integer n) {
        if (this.f.containsKey(n)) {
            return this.f.get(n);
        }
        final d6 d6 = new d6(this, this.d, null);
        this.f.put(n, d6);
        return d6;
    }
    
    public final List z(String d, List list, List iterator, Long g, Long d2) {
        n.e((String)d);
        n.i(list);
        n.i(iterator);
        this.d = (String)d;
        this.e = new HashSet();
        this.f = new a();
        this.g = g;
        this.h = d2;
        final Iterator<Object> iterator2 = list.iterator();
        while (true) {
            while (iterator2.hasNext()) {
                if ("_s".equals(iterator2.next().b0())) {
                    final boolean b = true;
                    final boolean b2 = A6.a() && this.f().D(this.d, K.j0);
                    final boolean b3 = A6.a() && this.f().D(this.d, K.i0);
                    if (b) {
                        d = (SQLiteException)this.q();
                        g = (Long)this.d;
                        ((C5)d).u();
                        ((m3)d).n();
                        n.e((String)g);
                        final ContentValues contentValues = new ContentValues();
                        contentValues.put("current_session_count", Integer.valueOf(0));
                        try {
                            ((p)d).B().update("events", contentValues, "app_id = ?", new String[] { (String)g });
                        }
                        catch (SQLiteException ex) {
                            ((m3)d).j().G().c("Error resetting session-scoped event counts. appId", R2.Y1.v((String)g), ex);
                        }
                    }
                    Object o;
                    final Map<Object, Object> map = (Map<Object, Object>)(o = Collections.emptyMap());
                    if (b3) {
                        o = map;
                        if (b2) {
                            o = this.q().O0(this.d);
                        }
                    }
                    final Map n0 = this.q().N0(this.d);
                    if (!n0.isEmpty()) {
                        final HashSet set = new HashSet<Object>(n0.keySet());
                        Map<Integer, f2> map2;
                        if (b) {
                            final String d3 = this.d;
                            final Map p0 = this.q().P0(this.d);
                            n.e(d3);
                            n.i(n0);
                            final a a = new a();
                            if (!n0.isEmpty()) {
                                for (final Integer n2 : n0.keySet()) {
                                    n2;
                                    final f2 f2 = n0.get(n2);
                                    final List list2 = p0.get(n2);
                                    if (list2 == null || list2.isEmpty()) {
                                        a.put(n2, f2);
                                    }
                                    else {
                                        final List n3 = this.o().N(f2.Z(), list2);
                                        if (n3.isEmpty()) {
                                            continue;
                                        }
                                        final f2.a z = ((f2.a)f2.x()).y().z(n3);
                                        z.C().D(this.o().N(f2.b0(), list2));
                                        final ArrayList<X1> list3 = new ArrayList<X1>();
                                        for (final X1 x1 : f2.Y()) {
                                            if (!list2.contains(x1.k())) {
                                                list3.add(x1);
                                            }
                                        }
                                        z.w().x(list3);
                                        final ArrayList<g2> list4 = new ArrayList<g2>();
                                        for (final g2 g2 : f2.a0()) {
                                            if (!list2.contains(g2.K())) {
                                                list4.add(g2);
                                            }
                                        }
                                        z.A().B(list4);
                                        a.put(n2, (f2)((Y3.b)z).p());
                                    }
                                }
                            }
                            map2 = (Map<Integer, f2>)a;
                        }
                        else {
                            map2 = (Map<Integer, f2>)n0;
                        }
                        for (final Integer n4 : set) {
                            n4;
                            final f2 f3 = map2.get(n4);
                            final BitSet set2 = new BitSet();
                            final BitSet set3 = new BitSet();
                            final a a2 = new a();
                            if (f3 != null) {
                                if (f3.k() != 0) {
                                    for (final X1 x2 : f3.Y()) {
                                        if (x2.O()) {
                                            final int k = x2.k();
                                            if (x2.N()) {
                                                g = x2.K();
                                            }
                                            else {
                                                g = null;
                                            }
                                            a2.put(k, g);
                                        }
                                    }
                                }
                            }
                            final a a3 = new a();
                            if (f3 != null) {
                                if (f3.N() != 0) {
                                    for (final g2 g3 : f3.a0()) {
                                        if (g3.P() && g3.k() > 0) {
                                            a3.put(g3.K(), g3.G(g3.k() - 1));
                                        }
                                    }
                                }
                            }
                            Map<Integer, f2> map3 = map2;
                            if (f3 != null) {
                                int n5 = 0;
                                while (true) {
                                    map3 = map2;
                                    if (n5 >= f3.R() << 6) {
                                        break;
                                    }
                                    Label_1161: {
                                        if (N5.d0(f3.b0(), n5)) {
                                            this.j().K().c("Filter already evaluated. audience ID, filter ID", n4, n5);
                                            set3.set(n5);
                                            if (N5.d0(f3.Z(), n5)) {
                                                set2.set(n5);
                                                break Label_1161;
                                            }
                                        }
                                        a2.remove(n5);
                                    }
                                    ++n5;
                                }
                            }
                            final f2 f4 = n0.get(n4);
                            if (b3 && b2) {
                                final List<x1> list5 = ((Map<K, List<x1>>)o).get(n4);
                                if (list5 != null && this.h != null) {
                                    if (this.g != null) {
                                        for (final x1 x3 : list5) {
                                            final int l = x3.L();
                                            long n6 = this.h / 1000L;
                                            if (x3.S()) {
                                                n6 = this.g / 1000L;
                                            }
                                            if (a2.containsKey(l)) {
                                                a2.put(l, n6);
                                            }
                                            if (a3.containsKey(l)) {
                                                a3.put(l, n6);
                                            }
                                        }
                                    }
                                }
                            }
                            this.f.put(n4, new d6(this, this.d, f4, set2, set3, a2, a3, null));
                            map2 = map3;
                        }
                    }
                    if (!list.isEmpty()) {
                        f6 f5 = new f6(this, null);
                        Map<String, Map<Integer, Map<Integer, Map<Integer, Map>>>> map4 = (Map<String, Map<Integer, Map<Integer, Map<Integer, Map>>>>)new a();
                        for (final Y1 y1 : list) {
                            final Y1 a4 = f5.a(this.d, y1);
                            if (a4 != null) {
                                final p q = this.q();
                                final String d4 = this.d;
                                final String b4 = a4.b0();
                                final E c0 = q.C0(d4, y1.b0());
                                E e;
                                if (c0 == null) {
                                    q.j().L().c("Event aggregate wasn't created during raw event logging. appId, event", R2.Y1.v(d4), q.h().c(b4));
                                    e = new E(d4, y1.b0(), 1L, 1L, 1L, y1.Y(), 0L, null, null, null, null);
                                }
                                else {
                                    e = new E(c0.a, c0.b, c0.c + 1L, c0.d + 1L, c0.e + 1L, c0.f, c0.g, c0.h, c0.i, c0.j, c0.k);
                                }
                                this.q().T(e);
                                final long c2 = e.c;
                                final String b5 = a4.b0();
                                Map<Integer, Map<Integer, Map<Integer, Map>>> h0;
                                if ((h0 = map4.get(b5)) == null) {
                                    h0 = (Map<Integer, Map<Integer, Map<Integer, Map>>>)this.q().H0(this.d, b5);
                                    map4.put(b5, h0);
                                }
                                final Iterator<Integer> iterator11 = h0.keySet().iterator();
                                final Map<String, Map<Integer, Map<Integer, Map<Integer, Map>>>> map5 = map4;
                                final f6 f6 = f5;
                                while (true) {
                                    f5 = f6;
                                    map4 = map5;
                                    if (!iterator11.hasNext()) {
                                        break;
                                    }
                                    final Integer n7 = iterator11.next();
                                    final int intValue = n7;
                                    if (this.e.contains(n7)) {
                                        this.j().K().b("Skipping failed audience ID", n7);
                                    }
                                    else {
                                        final Iterator iterator12 = ((List)h0.get(n7)).iterator();
                                        boolean i = true;
                                        while (iterator12.hasNext()) {
                                            final x1 x4 = iterator12.next();
                                            final h6 h2 = new h6(this, this.d, intValue, x4);
                                            i = h2.k(this.g, this.h, a4, c2, e, this.A(intValue, x4.L()));
                                            if (!i) {
                                                this.e.add(n7);
                                                break;
                                            }
                                            this.y(n7).c(h2);
                                        }
                                        if (i) {
                                            continue;
                                        }
                                        this.e.add(n7);
                                    }
                                }
                            }
                        }
                    }
                    if (!((List)iterator).isEmpty()) {
                        final a a5 = new a();
                        for (final h2 h3 : iterator) {
                            final String z2 = h3.Z();
                            Map<Integer, Map<Integer, Map<Integer, Map>>> j0;
                            if ((j0 = a5.get(z2)) == null) {
                                j0 = (Map<Integer, Map<Integer, Map<Integer, Map>>>)this.q().J0(this.d, z2);
                                a5.put(z2, j0);
                            }
                        Label_2059:
                            for (final Integer n8 : j0.keySet()) {
                                final int intValue2 = n8;
                                if (this.e.contains(n8)) {
                                    this.j().K().b("Skipping failed audience ID", n8);
                                    break;
                                }
                                final Iterator iterator15 = ((List)j0.get(n8)).iterator();
                                boolean m = true;
                                while (true) {
                                    while (iterator15.hasNext()) {
                                        final A1 a6 = iterator15.next();
                                        if (this.j().C(2)) {
                                            final a2 k2 = this.j().K();
                                            Integer value;
                                            if (a6.P()) {
                                                value = a6.k();
                                            }
                                            else {
                                                value = null;
                                            }
                                            k2.d("Evaluating filter. audience, filter, property", n8, value, this.h().g(a6.L()));
                                            this.j().K().b("Filter definition", this.o().J(a6));
                                        }
                                        if (!a6.P() || a6.k() > 256) {
                                            final a2 l2 = this.j().L();
                                            final Object v = R2.Y1.v(this.d);
                                            Integer value2;
                                            if (a6.P()) {
                                                value2 = a6.k();
                                            }
                                            else {
                                                value2 = null;
                                            }
                                            l2.c("Invalid property filter ID. appId, id", v, String.valueOf(value2));
                                            this.e.add(n8);
                                            continue Label_2059;
                                        }
                                        final c c3 = new c(this, this.d, intValue2, a6);
                                        m = c3.k(this.g, this.h, h3, this.A(intValue2, a6.k()));
                                        if (!m) {
                                            this.e.add(n8);
                                            break;
                                        }
                                        this.y(n8).c(c3);
                                    }
                                    if (!m) {
                                        continue;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    list = (ArrayList<Y1>)new ArrayList<Object>();
                    final Set keySet = this.f.keySet();
                    keySet.removeAll(this.e);
                    iterator = keySet.iterator();
                    while (iterator.hasNext()) {
                        d = (SQLiteException)Integer.valueOf(iterator.next());
                        final int intValue3 = (int)d;
                        final d6 d5 = this.f.get(d);
                        n.i(d5);
                        final W1 a7 = d5.a(intValue3);
                        list.add((Y1)a7);
                        g = (Long)this.q();
                        d2 = (Long)this.d;
                        final f2 q2 = a7.Q();
                        ((C5)g).u();
                        ((m3)g).n();
                        n.e((String)d2);
                        n.i(q2);
                        final byte[] h4 = q2.h();
                        final ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", (String)d2);
                        contentValues2.put("audience_id", (Integer)d);
                        contentValues2.put("current_results", h4);
                        try {
                            d = (SQLiteException)((p)g).B();
                            try {
                                if (((SQLiteDatabase)d).insertWithOnConflict("audience_filter_values", (String)null, contentValues2, 5) == -1L) {
                                    ((m3)g).j().G().b("Failed to insert filter results (got -1). appId", R2.Y1.v((String)d2));
                                    continue;
                                }
                                continue;
                            }
                            catch (SQLiteException d) {}
                        }
                        catch (SQLiteException ex2) {}
                        ((m3)g).j().G().c("Error storing filter results. appId", R2.Y1.v((String)d2), d);
                    }
                    return list;
                }
            }
            final boolean b = false;
            continue;
        }
    }
}
