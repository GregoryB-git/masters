/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.AbstractMap
 *  java.util.AbstractMap$SimpleImmutableEntry
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 */
package X2;

import W2.m;
import X2.g0;
import X2.i;
import X2.s;
import X2.t;
import X2.v;
import X2.w;
import X2.y;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class T
extends w {
    private static final long serialVersionUID = 0L;
    public static final w v = new T(null, new Object[0], 0);
    public final transient Object s;
    public final transient Object[] t;
    public final transient int u;

    public T(Object object, Object[] arrobject, int n8) {
        this.s = object;
        this.t = arrobject;
        this.u = n8;
    }

    public static T l(int n8, Object[] arrobject, w.a object) {
        Object object2;
        if (n8 == 0) {
            return (T)v;
        }
        if (n8 == 1) {
            object = arrobject[0];
            Objects.requireNonNull((Object)object);
            Object object3 = arrobject[1];
            Objects.requireNonNull((Object)object3);
            i.a(object, object3);
            return new T(null, arrobject, 1);
        }
        m.l(n8, arrobject.length >> 1);
        Object object4 = object2 = T.m(arrobject, n8, y.M(n8), 0);
        Object[] arrobject2 = arrobject;
        if (object2 instanceof Object[]) {
            arrobject2 = (Object[])object2;
            object4 = (w.a.a)arrobject2[2];
            if (object != null) {
                object.e = object4;
                object4 = arrobject2[0];
                n8 = (Integer)arrobject2[1];
                arrobject2 = Arrays.copyOf((Object[])arrobject, (int)(n8 * 2));
            } else {
                throw object4.a();
            }
        }
        return new T(object4, arrobject2, n8);
    }

    public static Object m(Object[] object, int n8, int n9, int n10) {
        Object object2;
        int n11;
        Object object3;
        Object object4;
        block26 : {
            block22 : {
                object4 = null;
                object2 = null;
                object3 = null;
                if (n8 == 1) {
                    object3 = object[n10];
                    Objects.requireNonNull((Object)object3);
                    object = object[n10 ^ 1];
                    Objects.requireNonNull((Object)object);
                    i.a(object3, object);
                    return null;
                }
                n11 = n9 - 1;
                if (n9 > 128) break block22;
                object4 = new byte[n9];
                Arrays.fill((byte[])object4, (byte)-1);
                int n12 = n9 = 0;
                block0 : while (n9 < n8) {
                    int n13 = n9 * 2 + n10;
                    int n14 = n12 * 2 + n10;
                    Object object5 = object[n13];
                    Objects.requireNonNull((Object)object5);
                    object2 = object[n13 ^ 1];
                    Objects.requireNonNull((Object)object2);
                    i.a(object5, object2);
                    n13 = s.b(object5.hashCode());
                    do {
                        block25 : {
                            block24 : {
                                int n15;
                                block23 : {
                                    if ((n15 = object4[n13 &= n11] & 255) != 255) break block23;
                                    object4[n13] = (byte)n14;
                                    if (n12 < n9) {
                                        object[n14] = object5;
                                        object[n14 ^ 1] = object2;
                                    }
                                    ++n12;
                                    break block24;
                                }
                                if (!object5.equals(object[n15])) break block25;
                                n13 = n15 ^ 1;
                                object3 = object[n13];
                                Objects.requireNonNull((Object)object3);
                                object3 = new w.a.a(object5, object2, object3);
                                object[n13] = object2;
                            }
                            ++n9;
                            continue block0;
                        }
                        ++n13;
                    } while (true);
                }
                if (n12 == n8) {
                    return object4;
                }
                return new Object[]{object4, n12, object3};
            }
            if (n9 > 32768) break block26;
            object2 = new short[n9];
            Arrays.fill((short[])object2, (short)-1);
            int n16 = n9 = 0;
            object3 = object4;
            block2 : while (n9 < n8) {
                int n17 = n9 * 2 + n10;
                int n18 = n16 * 2 + n10;
                Object object6 = object[n17];
                Objects.requireNonNull((Object)object6);
                object4 = object[n17 ^ 1];
                Objects.requireNonNull((Object)object4);
                i.a(object6, object4);
                n17 = s.b(object6.hashCode());
                do {
                    block29 : {
                        block28 : {
                            int n19;
                            block27 : {
                                if ((n19 = object2[n17 &= n11] & 65535) != 65535) break block27;
                                object2[n17] = (short)n18;
                                if (n16 < n9) {
                                    object[n18] = object6;
                                    object[n18 ^ 1] = object4;
                                }
                                ++n16;
                                break block28;
                            }
                            if (!object6.equals(object[n19])) break block29;
                            n17 = n19 ^ 1;
                            object3 = object[n17];
                            Objects.requireNonNull((Object)object3);
                            object3 = new w.a.a(object6, object4, object3);
                            object[n17] = object4;
                        }
                        ++n9;
                        continue block2;
                    }
                    ++n17;
                } while (true);
            }
            if (n16 == n8) {
                return object2;
            }
            return new Object[]{object2, n16, object3};
        }
        object4 = new int[n9];
        Arrays.fill((int[])object4, (int)-1);
        int n20 = n9 = 0;
        object3 = object2;
        block4 : while (n9 < n8) {
            int n21 = n9 * 2 + n10;
            int n22 = n20 * 2 + n10;
            Object object7 = object[n21];
            Objects.requireNonNull((Object)object7);
            object2 = object[n21 ^ 1];
            Objects.requireNonNull((Object)object2);
            i.a(object7, object2);
            n21 = s.b(object7.hashCode());
            do {
                block32 : {
                    block31 : {
                        Object object8;
                        block30 : {
                            if ((object8 = object4[n21 &= n11]) != -1) break block30;
                            object4[n21] = n22;
                            if (n20 < n9) {
                                object[n22] = object7;
                                object[n22 ^ 1] = object2;
                            }
                            ++n20;
                            break block31;
                        }
                        if (!object7.equals(object[object8])) break block32;
                        n21 = object8 ^ true;
                        object3 = object[n21];
                        Objects.requireNonNull((Object)object3);
                        object3 = new w.a.a(object7, object2, object3);
                        object[n21] = object2;
                    }
                    ++n9;
                    continue block4;
                }
                ++n21;
            } while (true);
        }
        if (n20 == n8) {
            return object4;
        }
        return new Object[]{object4, n20, object3};
    }

    public static Object n(Object object, Object[] arrobject, int n8, int n9, Object object2) {
        Object var6_5 = null;
        if (object2 == null) {
            return null;
        }
        if (n8 == 1) {
            Object object3 = arrobject[n9];
            Objects.requireNonNull((Object)object3);
            object = var6_5;
            if (object3.equals(object2)) {
                object = arrobject[n9 ^ 1];
                Objects.requireNonNull((Object)object);
            }
            return object;
        }
        if (object == null) {
            return null;
        }
        if (object instanceof byte[]) {
            object = (byte[])object;
            n9 = object.length;
            n8 = s.b(object2.hashCode());
            do {
                int n10;
                if ((n10 = object[n8 &= n9 - 1] & 255) == 255) {
                    return null;
                }
                if (object2.equals(arrobject[n10])) {
                    return arrobject[n10 ^ 1];
                }
                ++n8;
            } while (true);
        }
        if (object instanceof short[]) {
            object = (short[])object;
            n9 = object.length;
            n8 = s.b(object2.hashCode());
            do {
                int n11;
                if ((n11 = object[n8 &= n9 - 1] & 65535) == 65535) {
                    return null;
                }
                if (object2.equals(arrobject[n11])) {
                    return arrobject[n11 ^ 1];
                }
                ++n8;
            } while (true);
        }
        object = (int[])object;
        n9 = object.length;
        n8 = s.b(object2.hashCode());
        Object object4;
        while ((object4 = object[n8 &= n9 - 1]) != -1) {
            if (object2.equals(arrobject[object4])) {
                return arrobject[object4 ^ true];
            }
            ++n8;
        }
        return null;
    }

    @Override
    public y d() {
        return new a(this, this.t, 0, this.u);
    }

    @Override
    public y e() {
        return new b(this, new c(this.t, 0, this.u));
    }

    @Override
    public t f() {
        return new c(this.t, 1, this.u);
    }

    @Override
    public Object get(Object object) {
        Object object2;
        object = object2 = T.n(this.s, this.t, this.u, 0, object);
        if (object2 == null) {
            object = null;
        }
        return object;
    }

    @Override
    public boolean h() {
        return false;
    }

    public int size() {
        return this.u;
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }

    public static class a
    extends y {
        public final transient w q;
        public final transient Object[] r;
        public final transient int s;
        public final transient int t;

        public a(w w8, Object[] arrobject, int n8, int n9) {
            this.q = w8;
            this.r = arrobject;
            this.s = n8;
            this.t = n9;
        }

        @Override
        public v V() {
            return new v(){

                public Map.Entry j0(int n8) {
                    m.h(n8, a.this.t);
                    Object object = a.this.r;
                    object = object[a.this.s + (n8 *= 2)];
                    Objects.requireNonNull((Object)object);
                    Object object2 = a.this.r[n8 + (a.this.s ^ 1)];
                    Objects.requireNonNull((Object)object2);
                    return new AbstractMap.SimpleImmutableEntry(object, object2);
                }

                @Override
                public boolean k() {
                    return true;
                }

                public int size() {
                    return a.this.t;
                }

                @Override
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override
        public boolean contains(Object object) {
            boolean bl;
            boolean bl2 = object instanceof Map.Entry;
            boolean bl3 = bl = false;
            if (bl2) {
                Object object2 = (Map.Entry)object;
                object = object2.getKey();
                object2 = object2.getValue();
                bl3 = bl;
                if (object2 != null) {
                    bl3 = bl;
                    if (object2.equals(this.q.get(object))) {
                        bl3 = true;
                    }
                }
            }
            return bl3;
        }

        @Override
        public int d(Object[] arrobject, int n8) {
            return this.a().d(arrobject, n8);
        }

        @Override
        public boolean k() {
            return true;
        }

        @Override
        public g0 q() {
            return this.a().q();
        }

        public int size() {
            return this.t;
        }

        @Override
        public Object writeReplace() {
            return super.writeReplace();
        }

    }

    public static final class b
    extends y {
        public final transient w q;
        public final transient v r;

        public b(w w8, v v8) {
            this.q = w8;
            this.r = v8;
        }

        @Override
        public v a() {
            return this.r;
        }

        @Override
        public boolean contains(Object object) {
            if (this.q.get(object) != null) {
                return true;
            }
            return false;
        }

        @Override
        public int d(Object[] arrobject, int n8) {
            return this.a().d(arrobject, n8);
        }

        @Override
        public boolean k() {
            return true;
        }

        @Override
        public g0 q() {
            return this.a().q();
        }

        public int size() {
            return this.q.size();
        }

        @Override
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class c
    extends v {
        public final transient Object[] q;
        public final transient int r;
        public final transient int s;

        public c(Object[] arrobject, int n8, int n9) {
            this.q = arrobject;
            this.r = n8;
            this.s = n9;
        }

        public Object get(int n8) {
            m.h(n8, this.s);
            Object object = this.q[n8 * 2 + this.r];
            Objects.requireNonNull((Object)object);
            return object;
        }

        @Override
        public boolean k() {
            return true;
        }

        public int size() {
            return this.s;
        }

        @Override
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

}

