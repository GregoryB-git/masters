/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.SortedMap
 *  java.util.TreeMap
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.H;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.i;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.p;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public final class g
implements m,
s,
Iterable {
    public final SortedMap o = new TreeMap();
    public final Map p = new TreeMap();

    public g() {
    }

    public g(List list) {
        this();
        if (list != null) {
            for (int i8 = 0; i8 < list.size(); ++i8) {
                this.X(i8, (s)list.get(i8));
            }
        }
    }

    public /* varargs */ g(s ... arrs) {
        this(Arrays.asList((Object[])arrs));
    }

    public final int D() {
        return this.o.size();
    }

    public final s M(int n8) {
        if (n8 < this.U()) {
            s s8;
            if (this.Y(n8) && (s8 = (s)this.o.get((Object)n8)) != null) {
                return s8;
            }
            return s.d;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void S(int n8, s s8) {
        if (n8 >= 0) {
            if (n8 >= this.U()) {
                this.X(n8, s8);
                return;
            }
            for (int i8 = ((Integer)this.o.lastKey()).intValue(); i8 >= n8; --i8) {
                s s9 = (s)this.o.get((Object)i8);
                if (s9 == null) continue;
                this.X(i8 + 1, s9);
                this.o.remove((Object)i8);
            }
            this.X(n8, s8);
            return;
        }
        s8 = new StringBuilder("Invalid value index: ");
        s8.append(n8);
        throw new IllegalArgumentException(s8.toString());
    }

    public final void T(s s8) {
        this.X(this.U(), s8);
    }

    public final int U() {
        if (this.o.isEmpty()) {
            return 0;
        }
        return (Integer)this.o.lastKey() + 1;
    }

    public final String V(String string2) {
        String string3 = string2;
        if (string2 == null) {
            string3 = "";
        }
        string2 = new StringBuilder();
        if (!this.o.isEmpty()) {
            for (int i8 = 0; i8 < this.U(); ++i8) {
                s s8 = this.M(i8);
                string2.append(string3);
                if (s8 instanceof z || s8 instanceof q) continue;
                string2.append(s8.g());
            }
            string2.delete(0, string3.length());
        }
        return string2.toString();
    }

    public final void W(int n8) {
        int n9 = (Integer)this.o.lastKey();
        if (n8 <= n9) {
            if (n8 < 0) {
                return;
            }
            this.o.remove((Object)n8);
            int n10 = n8;
            if (n8 == n9) {
                SortedMap sortedMap = this.o;
                if (!sortedMap.containsKey((Object)(--n8)) && n8 >= 0) {
                    this.o.put((Object)n8, (Object)s.d);
                }
                return;
            }
            while (++n10 <= (Integer)this.o.lastKey()) {
                s s8 = (s)this.o.get((Object)n10);
                if (s8 == null) continue;
                this.o.put((Object)(n10 - 1), (Object)s8);
                this.o.remove((Object)n10);
            }
        }
    }

    public final void X(int n8, s s8) {
        if (n8 <= 32468) {
            if (n8 >= 0) {
                if (s8 == null) {
                    this.o.remove((Object)n8);
                    return;
                }
                this.o.put((Object)n8, (Object)s8);
                return;
            }
            s8 = new StringBuilder("Out of bounds index: ");
            s8.append(n8);
            throw new IndexOutOfBoundsException(s8.toString());
        }
        throw new IllegalStateException("Array too large");
    }

    public final boolean Y(int n8) {
        if (n8 >= 0 && n8 <= (Integer)this.o.lastKey()) {
            return this.o.containsKey((Object)n8);
        }
        StringBuilder stringBuilder = new StringBuilder("Out of bounds index: ");
        stringBuilder.append(n8);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public final Iterator Z() {
        return this.o.keySet().iterator();
    }

    @Override
    public final void a(String string2, s s8) {
        if (s8 == null) {
            this.p.remove((Object)string2);
            return;
        }
        this.p.put((Object)string2, (Object)s8);
    }

    public final List a0() {
        ArrayList arrayList = new ArrayList(this.U());
        for (int i8 = 0; i8 < this.U(); ++i8) {
            arrayList.add((Object)this.M(i8));
        }
        return arrayList;
    }

    public final void b0() {
        this.o.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final s c() {
        g g8 = new g();
        Iterator iterator = this.o.entrySet().iterator();
        while (iterator.hasNext()) {
            Integer n8;
            SortedMap sortedMap;
            Object object = (Map.Entry)iterator.next();
            if (object.getValue() instanceof m) {
                sortedMap = g8.o;
                n8 = (Integer)object.getKey();
                object = (s)object.getValue();
            } else {
                sortedMap = g8.o;
                n8 = (Integer)object.getKey();
                object = ((s)object.getValue()).c();
            }
            sortedMap.put((Object)n8, object);
        }
        return g8;
    }

    @Override
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof g)) {
            return false;
        }
        object = (g)object;
        if (this.U() != object.U()) {
            return false;
        }
        if (this.o.isEmpty()) {
            return object.o.isEmpty();
        }
        for (int i8 = ((Integer)this.o.firstKey()).intValue(); i8 <= (Integer)this.o.lastKey(); ++i8) {
            if (this.M(i8).equals((Object)object.M(i8))) continue;
            return false;
        }
        return true;
    }

    @Override
    public final Double f() {
        if (this.o.size() == 1) {
            return this.M(0).f();
        }
        if (this.o.size() <= 0) {
            return 0.0;
        }
        return Double.NaN;
    }

    @Override
    public final String g() {
        return this.toString();
    }

    public final int hashCode() {
        return this.o.hashCode() * 31;
    }

    @Override
    public final s i(String object) {
        if ("length".equals(object)) {
            return new k((double)this.U());
        }
        if (this.q((String)object) && (object = (s)this.p.get(object)) != null) {
            return object;
        }
        return s.d;
    }

    public final Iterator iterator() {
        return new i(this);
    }

    @Override
    public final Iterator k() {
        return new f(this, this.o.keySet().iterator(), this.p.keySet().iterator());
    }

    @Override
    public final boolean q(String string2) {
        if (!"length".equals((Object)string2) && !this.p.containsKey((Object)string2)) {
            return false;
        }
        return true;
    }

    @Override
    public final s s(String string2, f3 f32, List list) {
        if (!("concat".equals((Object)string2) || "every".equals((Object)string2) || "filter".equals((Object)string2) || "forEach".equals((Object)string2) || "indexOf".equals((Object)string2) || "join".equals((Object)string2) || "lastIndexOf".equals((Object)string2) || "map".equals((Object)string2) || "pop".equals((Object)string2) || "push".equals((Object)string2) || "reduce".equals((Object)string2) || "reduceRight".equals((Object)string2) || "reverse".equals((Object)string2) || "shift".equals((Object)string2) || "slice".equals((Object)string2) || "some".equals((Object)string2) || "sort".equals((Object)string2) || "splice".equals((Object)string2) || "toString".equals((Object)string2) || "unshift".equals((Object)string2))) {
            return p.a(this, new u(string2), f32, list);
        }
        return H.d(string2, this, f32, list);
    }

    public final String toString() {
        return this.V(",");
    }
}

