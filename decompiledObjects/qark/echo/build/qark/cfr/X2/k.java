/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InvalidObjectException
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.io.Serializable
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.AbstractCollection
 *  java.util.AbstractMap
 *  java.util.AbstractSet
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.ConcurrentModificationException
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NoSuchElementException
 *  java.util.Objects
 *  java.util.Set
 */
package X2;

import W2.m;
import X2.N;
import X2.i;
import X2.l;
import X2.s;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public class k
extends AbstractMap
implements Serializable {
    public static final Object x = new Object();
    public transient Object o;
    public transient int[] p;
    public transient Object[] q;
    public transient Object[] r;
    public transient int s;
    public transient int t;
    public transient Set u;
    public transient Set v;
    public transient Collection w;

    public k() {
        this.E(3);
    }

    public static /* synthetic */ int e(k k8) {
        int n8 = k8.t;
        k8.t = n8 - 1;
        return n8;
    }

    public static k r() {
        return new k();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int n8 = objectInputStream.readInt();
        if (n8 >= 0) {
            this.E(n8);
            for (int i8 = 0; i8 < n8; ++i8) {
                this.put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        objectInputStream = new StringBuilder();
        objectInputStream.append("Invalid size: ");
        objectInputStream.append(n8);
        throw new InvalidObjectException(objectInputStream.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.size());
        Iterator iterator = this.y();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public int A(int n8) {
        if (++n8 < this.t) {
            return n8;
        }
        return -1;
    }

    public final int B() {
        return (1 << (this.s & 31)) - 1;
    }

    public void C() {
        this.s += 32;
    }

    public final int D(Object object) {
        if (this.J()) {
            return -1;
        }
        int n8 = s.c(object);
        int n9 = this.B();
        int n10 = l.h(this.N(), n8 & n9);
        if (n10 == 0) {
            return -1;
        }
        int n11 = l.b(n8, n9);
        do {
            if (l.b(n8 = this.x(--n10), n9) == n11 && W2.k.a(object, this.G(n10))) {
                return n10;
            }
            n10 = n8 = l.c(n8, n9);
        } while (n8 != 0);
        return -1;
    }

    public void E(int n8) {
        boolean bl = n8 >= 0;
        m.e(bl, "Expected size must be >= 0");
        this.s = a3.f.f(n8, 1, 1073741823);
    }

    public void F(int n8, Object object, Object object2, int n9, int n10) {
        this.S(n8, l.d(n9, 0, n10));
        this.U(n8, object);
        this.V(n8, object2);
    }

    public final Object G(int n8) {
        return this.M()[n8];
    }

    public Iterator H() {
        Map map = this.w();
        if (map != null) {
            return map.keySet().iterator();
        }
        return new e(){

            @Override
            public Object d(int n8) {
                return k.this.G(n8);
            }
        };
    }

    public void I(int n8, int n9) {
        Object object = this.N();
        int[] arrn = this.L();
        Object[] arrobject = this.M();
        Object[] arrobject2 = this.O();
        int n10 = this.size();
        int n11 = n10 - 1;
        if (n8 < n11) {
            int n12;
            Object object2;
            arrobject[n8] = object2 = arrobject[n11];
            arrobject2[n8] = arrobject2[n11];
            arrobject[n11] = null;
            arrobject2[n11] = null;
            arrn[n8] = arrn[n11];
            arrn[n11] = 0;
            int n13 = s.c(object2) & n9;
            n11 = n12 = l.h(object, n13);
            if (n12 == n10) {
                l.i(object, n13, n8 + 1);
                return;
            }
            do {
                n12 = n11 - 1;
            } while ((n11 = l.c(n13 = arrn[n12], n9)) != n10);
            arrn[n12] = l.d(n13, n8 + 1, n9);
            return;
        }
        arrobject[n8] = null;
        arrobject2[n8] = null;
        arrn[n8] = 0;
    }

    public boolean J() {
        if (this.o == null) {
            return true;
        }
        return false;
    }

    public final Object K(Object object) {
        if (this.J()) {
            return x;
        }
        int n8 = this.B();
        int n9 = l.f(object, null, n8, this.N(), this.L(), this.M(), null);
        if (n9 == -1) {
            return x;
        }
        object = this.W(n9);
        this.I(n9, n8);
        --this.t;
        this.C();
        return object;
    }

    public final int[] L() {
        int[] arrn = this.p;
        Objects.requireNonNull((Object)arrn);
        return arrn;
    }

    public final Object[] M() {
        Object[] arrobject = this.q;
        Objects.requireNonNull((Object)arrobject);
        return arrobject;
    }

    public final Object N() {
        Object object = this.o;
        Objects.requireNonNull((Object)object);
        return object;
    }

    public final Object[] O() {
        Object[] arrobject = this.r;
        Objects.requireNonNull((Object)arrobject);
        return arrobject;
    }

    public void P(int n8) {
        this.p = Arrays.copyOf((int[])this.L(), (int)n8);
        this.q = Arrays.copyOf((Object[])this.M(), (int)n8);
        this.r = Arrays.copyOf((Object[])this.O(), (int)n8);
    }

    public final void Q(int n8) {
        int n9 = this.L().length;
        if (n8 > n9 && (n8 = Math.min((int)1073741823, (int)(Math.max((int)1, (int)(n9 >>> 1)) + n9 | 1))) != n9) {
            this.P(n8);
        }
    }

    public final int R(int n8, int n9, int n10, int n11) {
        Object object = l.a(n9);
        int n12 = n9 - 1;
        if (n11 != 0) {
            l.i(object, n10 & n12, n11 + 1);
        }
        Object object2 = this.N();
        int[] arrn = this.L();
        for (n9 = 0; n9 <= n8; ++n9) {
            n10 = l.h(object2, n9);
            while (n10 != 0) {
                n11 = n10 - 1;
                int n13 = arrn[n11];
                int n14 = l.b(n13, n8) | n9;
                int n15 = n14 & n12;
                int n16 = l.h(object, n15);
                l.i(object, n15, n10);
                arrn[n11] = l.d(n14, n16, n12);
                n10 = l.c(n13, n8);
            }
        }
        this.o = object;
        this.T(n12);
        return n12;
    }

    public final void S(int n8, int n9) {
        this.L()[n8] = n9;
    }

    public final void T(int n8) {
        n8 = Integer.numberOfLeadingZeros((int)n8);
        this.s = l.d(this.s, 32 - n8, 31);
    }

    public final void U(int n8, Object object) {
        this.M()[n8] = object;
    }

    public final void V(int n8, Object object) {
        this.O()[n8] = object;
    }

    public final Object W(int n8) {
        return this.O()[n8];
    }

    public Iterator X() {
        Map map = this.w();
        if (map != null) {
            return map.values().iterator();
        }
        return new e(){

            @Override
            public Object d(int n8) {
                return k.this.W(n8);
            }
        };
    }

    /*
     * Enabled aggressive block sorting
     */
    public void clear() {
        if (this.J()) {
            return;
        }
        this.C();
        Map map = this.w();
        if (map != null) {
            this.s = a3.f.f(this.size(), 3, 1073741823);
            map.clear();
            this.o = null;
        } else {
            Arrays.fill((Object[])this.M(), (int)0, (int)this.t, (Object)null);
            Arrays.fill((Object[])this.O(), (int)0, (int)this.t, (Object)null);
            l.g(this.N());
            Arrays.fill((int[])this.L(), (int)0, (int)this.t, (int)0);
        }
        this.t = 0;
    }

    public boolean containsKey(Object object) {
        Map map = this.w();
        if (map != null) {
            return map.containsKey(object);
        }
        if (this.D(object) != -1) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object object) {
        Map map = this.w();
        if (map != null) {
            return map.containsValue(object);
        }
        for (int i8 = 0; i8 < this.t; ++i8) {
            if (!W2.k.a(object, this.W(i8))) continue;
            return true;
        }
        return false;
    }

    public Set entrySet() {
        Set set;
        Set set2 = set = this.v;
        if (set == null) {
            this.v = set2 = this.s();
        }
        return set2;
    }

    public Object get(Object object) {
        Map map = this.w();
        if (map != null) {
            return map.get(object);
        }
        int n8 = this.D(object);
        if (n8 == -1) {
            return null;
        }
        this.n(n8);
        return this.W(n8);
    }

    public boolean isEmpty() {
        if (this.size() == 0) {
            return true;
        }
        return false;
    }

    public Set keySet() {
        Set set;
        Set set2 = set = this.u;
        if (set == null) {
            this.u = set2 = this.u();
        }
        return set2;
    }

    public void n(int n8) {
    }

    public int o(int n8, int n9) {
        return n8 - 1;
    }

    public int p() {
        m.p(this.J(), "Arrays already allocated");
        int n8 = this.s;
        int n9 = l.j(n8);
        this.o = l.a(n9);
        this.T(n9 - 1);
        this.p = new int[n8];
        this.q = new Object[n8];
        this.r = new Object[n8];
        return n8;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public Object put(Object var1_1, Object var2_2) {
        block6 : {
            block9 : {
                block10 : {
                    block8 : {
                        block7 : {
                            if (this.J()) {
                                this.p();
                            }
                            if ((var12_3 = this.w()) != null) {
                                return var12_3.put(var1_1, var2_2);
                            }
                            var13_4 = this.L();
                            var14_5 = this.M();
                            var12_3 = this.O();
                            var6_6 = this.t;
                            var7_7 = var6_6 + 1;
                            var8_8 = s.c(var1_1);
                            var5_9 = this.B();
                            var3_10 = var8_8 & var5_9;
                            var4_11 = l.h(this.N(), var3_10);
                            if (var4_11 != 0) break block7;
                            if (var7_7 > var5_9) break block8;
                            l.i(this.N(), var3_10, var7_7);
                            break block9;
                        }
                        var9_12 = l.b(var8_8, var5_9);
                        var3_10 = 0;
                        break block10;
                    }
lbl23: // 2 sources:
                    do {
                        var3_10 = this.R(var5_9, l.e(var5_9), var8_8, var6_6);
                        break block6;
                        break;
                    } while (true);
                }
                do {
                    if (l.b(var11_14 = var13_4[var10_13 = var4_11 - 1], var5_9) == var9_12 && W2.k.a(var1_1, var14_5[var10_13])) {
                        var1_1 = var12_3[var10_13];
                        var12_3[var10_13] = var2_2;
                        this.n(var10_13);
                        return var1_1;
                    }
                    var4_11 = l.c(var11_14, var5_9);
                    ++var3_10;
                } while (var4_11 != 0);
                if (var3_10 >= 9) {
                    return this.q().put(var1_1, var2_2);
                }
                ** while (var7_7 > var5_9)
lbl39: // 1 sources:
                var13_4[var10_13] = l.d(var11_14, var7_7, var5_9);
            }
            var3_10 = var5_9;
        }
        this.Q(var7_7);
        this.F(var6_6, var1_1, var2_2, var8_8, var3_10);
        this.t = var7_7;
        this.C();
        return null;
    }

    public Map q() {
        Map map = this.t(this.B() + 1);
        int n8 = this.z();
        while (n8 >= 0) {
            map.put(this.G(n8), this.W(n8));
            n8 = this.A(n8);
        }
        this.o = map;
        this.p = null;
        this.q = null;
        this.r = null;
        this.C();
        return map;
    }

    public Object remove(Object object) {
        Object object2 = this.w();
        if (object2 != null) {
            return object2.remove(object);
        }
        object = object2 = this.K(object);
        if (object2 == x) {
            object = null;
        }
        return object;
    }

    public Set s() {
        return new d();
    }

    public int size() {
        Map map = this.w();
        if (map != null) {
            return map.size();
        }
        return this.t;
    }

    public Map t(int n8) {
        return new LinkedHashMap(n8, 1.0f);
    }

    public Set u() {
        return new f();
    }

    public Collection v() {
        return new h();
    }

    public Collection values() {
        Collection collection;
        Collection collection2 = collection = this.w;
        if (collection == null) {
            this.w = collection2 = this.v();
        }
        return collection2;
    }

    public Map w() {
        Object object = this.o;
        if (object instanceof Map) {
            return (Map)object;
        }
        return null;
    }

    public final int x(int n8) {
        return this.L()[n8];
    }

    public Iterator y() {
        Map map = this.w();
        if (map != null) {
            return map.entrySet().iterator();
        }
        return new e(){

            public Map.Entry f(int n8) {
                return new g(n8);
            }
        };
    }

    public int z() {
        if (this.isEmpty()) {
            return -1;
        }
        return 0;
    }

    public class d
    extends AbstractSet {
        public void clear() {
            k.this.clear();
        }

        public boolean contains(Object object) {
            boolean bl;
            Map map = k.this.w();
            if (map != null) {
                return map.entrySet().contains(object);
            }
            boolean bl2 = object instanceof Map.Entry;
            boolean bl3 = bl = false;
            if (bl2) {
                object = (Map.Entry)object;
                int n8 = k.this.D(object.getKey());
                bl3 = bl;
                if (n8 != -1) {
                    bl3 = bl;
                    if (W2.k.a(k.this.W(n8), object.getValue())) {
                        bl3 = true;
                    }
                }
            }
            return bl3;
        }

        public Iterator iterator() {
            return k.this.y();
        }

        public boolean remove(Object object) {
            Map map = k.this.w();
            if (map != null) {
                return map.entrySet().remove(object);
            }
            if (object instanceof Map.Entry) {
                object = (Map.Entry)object;
                if (k.this.J()) {
                    return false;
                }
                int n8 = k.this.B();
                int n9 = l.f(object.getKey(), object.getValue(), n8, k.this.N(), k.this.L(), k.this.M(), k.this.O());
                if (n9 == -1) {
                    return false;
                }
                k.this.I(n9, n8);
                k.e(k.this);
                k.this.C();
                return true;
            }
            return false;
        }

        public int size() {
            return k.this.size();
        }
    }

    public abstract class e
    implements Iterator {
        public int o;
        public int p;
        public int q;

        public e() {
            this.o = k.this.s;
            this.p = k.this.z();
            this.q = -1;
        }

        public /* synthetic */ e( a8) {
            this();
        }

        public final void b() {
            if (k.this.s == this.o) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        public abstract Object d(int var1);

        public void e() {
            this.o += 32;
        }

        public boolean hasNext() {
            if (this.p >= 0) {
                return true;
            }
            return false;
        }

        public Object next() {
            this.b();
            if (this.hasNext()) {
                int n8;
                this.q = n8 = this.p;
                Object object = this.d(n8);
                this.p = k.this.A(this.p);
                return object;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            this.b();
            boolean bl = this.q >= 0;
            i.c(bl);
            this.e();
            k k8 = k.this;
            k8.remove(k8.G(this.q));
            this.p = k.this.o(this.p, this.q);
            this.q = -1;
        }
    }

    public class f
    extends AbstractSet {
        public void clear() {
            k.this.clear();
        }

        public boolean contains(Object object) {
            return k.this.containsKey(object);
        }

        public Iterator iterator() {
            return k.this.H();
        }

        public boolean remove(Object object) {
            Map map = k.this.w();
            if (map != null) {
                return map.keySet().remove(object);
            }
            if (k.this.K(object) != x) {
                return true;
            }
            return false;
        }

        public int size() {
            return k.this.size();
        }
    }

    public final class g
    extends X2.e {
        public final Object o;
        public int p;

        public g(int n8) {
            this.o = k.this.G(n8);
            this.p = n8;
        }

        public final void a() {
            int n8 = this.p;
            if (n8 == -1 || n8 >= k.this.size() || !W2.k.a(this.o, k.this.G(this.p))) {
                this.p = k.this.D(this.o);
            }
        }

        @Override
        public Object getKey() {
            return this.o;
        }

        @Override
        public Object getValue() {
            Map map = k.this.w();
            if (map != null) {
                return N.a(map.get(this.o));
            }
            this.a();
            int n8 = this.p;
            if (n8 == -1) {
                return N.b();
            }
            return k.this.W(n8);
        }

        public Object setValue(Object object) {
            Object object2 = k.this.w();
            if (object2 != null) {
                return N.a(object2.put(this.o, object));
            }
            this.a();
            int n8 = this.p;
            if (n8 == -1) {
                k.this.put(this.o, object);
                return N.b();
            }
            object2 = k.this.W(n8);
            k.this.V(this.p, object);
            return object2;
        }
    }

    public class h
    extends AbstractCollection {
        public void clear() {
            k.this.clear();
        }

        public Iterator iterator() {
            return k.this.X();
        }

        public int size() {
            return k.this.size();
        }
    }

}

