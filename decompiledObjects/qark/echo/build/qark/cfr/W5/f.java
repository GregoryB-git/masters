/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package W5;

import W5.c;
import W5.d;
import W5.h;
import W5.j;
import W5.k;
import W5.m;
import W5.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class f
extends d {
    public static final a r = new a(null);
    public static final Object[] s = new Object[0];
    public int o;
    public Object[] p = s;
    public int q;

    public final int D(int n8) {
        if (n8 == k.k(this.p)) {
            return 0;
        }
        return n8 + 1;
    }

    public final int M(int n8) {
        int n9 = n8;
        if (n8 < 0) {
            n9 = n8 + this.p.length;
        }
        return n9;
    }

    public final void S(int n8, int n9) {
        Object[] arrobject = this.p;
        if (n8 < n9) {
            j.e(arrobject, null, n8, n9);
            return;
        }
        j.e(arrobject, null, n8, arrobject.length);
        j.e(this.p, null, 0, n9);
    }

    public final int T(int n8) {
        Object[] arrobject = this.p;
        int n9 = n8;
        if (n8 >= arrobject.length) {
            n9 = n8 - arrobject.length;
        }
        return n9;
    }

    public final void U() {
        ++this.modCount;
    }

    public final Object V() {
        if (!this.isEmpty()) {
            this.U();
            Object[] arrobject = this.p;
            int n8 = this.o;
            Object object = arrobject[n8];
            arrobject[n8] = null;
            this.o = this.D(n8);
            this.q = this.size() - 1;
            return object;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object W() {
        if (this.isEmpty()) {
            return null;
        }
        return this.V();
    }

    public final Object X() {
        if (!this.isEmpty()) {
            this.U();
            int n8 = this.T(this.o + m.h(this));
            Object[] arrobject = this.p;
            Object object = arrobject[n8];
            arrobject[n8] = null;
            this.q = this.size() - 1;
            return object;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void Y(int n8, int n9) {
        int n10 = this.T(this.o + (n8 - 1));
        int n11 = this.T(this.o + (n9 - 1));
        n9 = n10;
        while (n8 > 0) {
            int n12 = n9 + 1;
            n10 = Math.min((int)n8, (int)Math.min((int)n12, (int)(n11 + 1)));
            Object[] arrobject = this.p;
            j.c(arrobject, arrobject, (n11 -= n10) + 1, (n9 -= n10) + 1, n12);
            n9 = this.M(n9);
            n11 = this.M(n11);
            n8 -= n10;
        }
    }

    public final void Z(int n8, int n9) {
        int n10 = this.T(this.o + n9);
        n8 = this.T(this.o + n8);
        int n11 = this.size();
        int n12 = n9;
        n9 = n10;
        while ((n11 -= n12) > 0) {
            Object[] arrobject = this.p;
            n12 = Math.min((int)n11, (int)Math.min((int)(arrobject.length - n9), (int)(arrobject.length - n8)));
            arrobject = this.p;
            n10 = n9 + n12;
            j.c(arrobject, arrobject, n8, n9, n10);
            n9 = this.T(n10);
            n8 = this.T(n8 + n12);
        }
    }

    @Override
    public int a() {
        return this.q;
    }

    public void add(int n8, Object object) {
        c.o.b(n8, this.size());
        if (n8 == this.size()) {
            this.g(object);
            return;
        }
        if (n8 == 0) {
            this.f(object);
            return;
        }
        this.U();
        this.s(this.size() + 1);
        int n9 = this.T(this.o + n8);
        if (n8 < this.size() + 1 >> 1) {
            n8 = this.q(n9);
            n9 = this.q(this.o);
            int n10 = this.o;
            if (n8 >= n10) {
                Object[] arrobject = this.p;
                arrobject[n9] = arrobject[n10];
                j.c(arrobject, arrobject, n10, n10 + 1, n8 + 1);
            } else {
                Object[] arrobject = this.p;
                j.c(arrobject, arrobject, n10 - 1, n10, arrobject.length);
                arrobject = this.p;
                arrobject[arrobject.length - 1] = arrobject[0];
                j.c(arrobject, arrobject, 0, 1, n8 + 1);
            }
            this.p[n8] = object;
            this.o = n9;
        } else {
            n8 = this.T(this.o + this.size());
            Object[] arrobject = this.p;
            if (n9 < n8) {
                j.c(arrobject, arrobject, n9 + 1, n9, n8);
            } else {
                j.c(arrobject, arrobject, 1, 0, n8);
                arrobject = this.p;
                arrobject[0] = arrobject[arrobject.length - 1];
                j.c(arrobject, arrobject, n9 + 1, n9, arrobject.length - 1);
            }
            this.p[n9] = object;
        }
        this.q = this.size() + 1;
    }

    public boolean add(Object object) {
        this.g(object);
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean addAll(int var1_1, Collection var2_2) {
        block16 : {
            block15 : {
                Intrinsics.checkNotNullParameter((Object)var2_2, "elements");
                c.o.b(var1_1, this.size());
                if (var2_2.isEmpty()) {
                    return false;
                }
                if (var1_1 == this.size()) {
                    return this.addAll(var2_2);
                }
                this.U();
                this.s(this.size() + var2_2.size());
                var5_3 = this.T(this.o + this.size());
                var3_4 = this.T(this.o + var1_1);
                var4_5 = var2_2.size();
                if (var1_1 < this.size() + 1 >> 1) {
                    var5_3 = this.o;
                    var1_1 = var5_3 - var4_5;
                    if (var3_4 >= var5_3) {
                        if (var1_1 >= 0) {
                            var7_6 = this.p;
                            j.c(var7_6, var7_6, var1_1, var5_3, var3_4);
                        } else {
                            var7_7 = this.p;
                            var6_11 = var7_7.length - (var1_1 += var7_7.length);
                            if (var6_11 >= var3_4 - var5_3) {
                                j.c(var7_7, var7_7, var1_1, var5_3, var3_4);
                            } else {
                                j.c(var7_7, var7_7, var1_1, var5_3, var5_3 + var6_11);
                                var7_7 = this.p;
                                j.c(var7_7, var7_7, 0, this.o + var6_11, var3_4);
                            }
                        }
                    } else {
                        var7_8 = this.p;
                        j.c(var7_8, var7_8, var1_1, var5_3, var7_8.length);
                        var7_8 = this.p;
                        if (var4_5 >= var3_4) {
                            j.c(var7_8, var7_8, var7_8.length - var4_5, 0, var3_4);
                        } else {
                            j.c(var7_8, var7_8, var7_8.length - var4_5, 0, var4_5);
                            var7_8 = this.p;
                            j.c(var7_8, var7_8, 0, var4_5, var3_4);
                        }
                    }
                    this.o = var1_1;
                    this.i(this.M(var3_4 - var4_5), var2_2);
                    return true;
                }
                var1_1 = var3_4 + var4_5;
                if (var3_4 >= var5_3) break block15;
                var7_9 = this.p;
                if ((var4_5 += var5_3) <= var7_9.length) ** GOTO lbl47
                if (var1_1 >= var7_9.length) {
                    var1_1 -= var7_9.length;
lbl47: // 2 sources:
                    j.c(var7_9, var7_9, var1_1, var3_4, var5_3);
                } else {
                    var4_5 = var5_3 - (var4_5 - var7_9.length);
                    j.c(var7_9, var7_9, 0, var4_5, var5_3);
                    var7_9 = this.p;
                    j.c(var7_9, var7_9, var1_1, var3_4, var4_5);
                }
                break block16;
            }
            var7_10 = this.p;
            j.c(var7_10, var7_10, var4_5, 0, var5_3);
            var7_10 = this.p;
            if (var1_1 >= var7_10.length) {
                j.c(var7_10, var7_10, var1_1 - var7_10.length, var3_4, var7_10.length);
            } else {
                j.c(var7_10, var7_10, 0, var7_10.length - var4_5, var7_10.length);
                var7_10 = this.p;
                j.c(var7_10, var7_10, var1_1, var3_4, var7_10.length - var4_5);
            }
        }
        this.i(var3_4, var2_2);
        return true;
    }

    public boolean addAll(Collection collection) {
        Intrinsics.checkNotNullParameter((Object)collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.U();
        this.s(this.size() + collection.size());
        this.i(this.T(this.o + this.size()), collection);
        return true;
    }

    public void clear() {
        if (this.isEmpty() ^ true) {
            this.U();
            int n8 = this.T(this.o + this.size());
            this.S(this.o, n8);
        }
        this.o = 0;
        this.q = 0;
    }

    public boolean contains(Object object) {
        if (this.indexOf(object) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public Object d(int n8) {
        c.o.a(n8, this.size());
        if (n8 == m.h(this)) {
            return this.X();
        }
        if (n8 == 0) {
            return this.V();
        }
        this.U();
        int n9 = this.T(this.o + n8);
        Object object = this.p[n9];
        if (n8 < this.size() >> 1) {
            Object[] arrobject;
            n8 = this.o;
            if (n9 >= n8) {
                arrobject = this.p;
                j.c(arrobject, arrobject, n8 + 1, n8, n9);
            } else {
                arrobject = this.p;
                j.c(arrobject, arrobject, 1, 0, n9);
                arrobject = this.p;
                arrobject[0] = arrobject[arrobject.length - 1];
                n8 = this.o;
                j.c(arrobject, arrobject, n8 + 1, n8, arrobject.length - 1);
            }
            arrobject = this.p;
            n8 = this.o;
            arrobject[n8] = null;
            this.o = this.D(n8);
        } else {
            n8 = this.T(this.o + m.h(this));
            Object[] arrobject = this.p;
            if (n9 <= n8) {
                j.c(arrobject, arrobject, n9, n9 + 1, n8 + 1);
            } else {
                j.c(arrobject, arrobject, n9, n9 + 1, arrobject.length);
                arrobject = this.p;
                arrobject[arrobject.length - 1] = arrobject[0];
                j.c(arrobject, arrobject, 0, 1, n8 + 1);
            }
            this.p[n8] = null;
        }
        this.q = this.size() - 1;
        return object;
    }

    public final void f(Object object) {
        int n8;
        this.U();
        this.s(this.size() + 1);
        this.o = n8 = this.q(this.o);
        this.p[n8] = object;
        this.q = this.size() + 1;
    }

    public final void g(Object object) {
        this.U();
        this.s(this.size() + 1);
        this.p[this.T((int)(this.o + this.size()))] = object;
        this.q = this.size() + 1;
    }

    public Object get(int n8) {
        c.o.a(n8, this.size());
        return this.p[this.T(this.o + n8)];
    }

    public final void i(int n8, Collection collection) {
        Iterator iterator = collection.iterator();
        int n9 = this.p.length;
        while (n8 < n9 && iterator.hasNext()) {
            this.p[n8] = iterator.next();
            ++n8;
        }
        n9 = this.o;
        for (n8 = 0; n8 < n9 && iterator.hasNext(); ++n8) {
            this.p[n8] = iterator.next();
        }
        this.q = this.size() + collection.size();
    }

    /*
     * Enabled aggressive block sorting
     */
    public int indexOf(Object object) {
        int n8;
        int n9 = this.o;
        int n10 = this.T(this.o + this.size());
        if (n9 >= n10) {
            if (n9 < n10) return -1;
            n8 = this.p.length;
        } else {
            while (n9 < n10) {
                if (Intrinsics.a(object, this.p[n9])) {
                    return n9 - this.o;
                }
                ++n9;
            }
            return -1;
        }
        while (n9 < n8) {
            if (Intrinsics.a(object, this.p[n9])) {
                return n9 - this.o;
            }
            ++n9;
        }
        n9 = 0;
        while (n9 < n10) {
            if (Intrinsics.a(object, this.p[n9])) {
                return (n9 += this.p.length) - this.o;
            }
            ++n9;
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.size() == 0) {
            return true;
        }
        return false;
    }

    public final void k(int n8) {
        Object[] arrobject = new Object[n8];
        Object[] arrobject2 = this.p;
        j.c(arrobject2, arrobject, 0, this.o, arrobject2.length);
        arrobject2 = this.p;
        n8 = arrobject2.length;
        int n9 = this.o;
        j.c(arrobject2, arrobject, n8 - n9, 0, n9);
        this.o = 0;
        this.p = arrobject;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int lastIndexOf(Object object) {
        int n8 = this.o;
        int n9 = this.T(this.o + this.size());
        if (n8 >= n9) {
            if (n8 <= n9) return -1;
            --n9;
        } else {
            if (n8 > --n9) return -1;
            do {
                if (Intrinsics.a(object, this.p[n9])) {
                    return n9 - this.o;
                }
                if (n9 == n8) return -1;
                --n9;
            } while (true);
        }
        while (-1 < n9) {
            if (Intrinsics.a(object, this.p[n9])) {
                return (n9 += this.p.length) - this.o;
            }
            --n9;
        }
        n8 = this.o;
        n9 = k.k(this.p);
        if (n8 > n9) return -1;
        while (!Intrinsics.a(object, this.p[n9])) {
            if (n9 == n8) return -1;
            --n9;
        }
        return n9 - this.o;
    }

    public final int q(int n8) {
        if (n8 == 0) {
            return k.k(this.p);
        }
        return n8 - 1;
    }

    public boolean remove(Object object) {
        int n8 = this.indexOf(object);
        if (n8 == -1) {
            return false;
        }
        this.remove(n8);
        return true;
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.checkNotNullParameter((Object)collection, "elements");
        boolean bl = this.isEmpty();
        int n8 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        if (!bl) {
            if (this.p.length == 0) {
                return false;
            }
            int n9 = this.o;
            int n10 = this.T(this.o + this.size());
            if (n9 < n10) {
                int n11 = n9;
                while (n9 < n10) {
                    Object object = this.p[n9];
                    if (collection.contains(object) ^ true) {
                        this.p[n11] = object;
                        ++n11;
                    } else {
                        bl3 = true;
                    }
                    ++n9;
                }
                j.e(this.p, null, n11, n10);
                n9 = n11;
            } else {
                Object[] arrobject;
                Object object;
                int n12 = this.p.length;
                bl3 = false;
                int n13 = n9;
                while (n9 < n12) {
                    arrobject = this.p;
                    object = arrobject[n9];
                    arrobject[n9] = null;
                    if (collection.contains(object) ^ true) {
                        this.p[n13] = object;
                        ++n13;
                    } else {
                        bl3 = true;
                    }
                    ++n9;
                }
                n9 = this.T(n13);
                for (n13 = n8; n13 < n10; ++n13) {
                    arrobject = this.p;
                    object = arrobject[n13];
                    arrobject[n13] = null;
                    if (collection.contains(object) ^ true) {
                        this.p[n9] = object;
                        n9 = this.D(n9);
                        continue;
                    }
                    bl3 = true;
                }
            }
            bl2 = bl3;
            if (bl3) {
                this.U();
                this.q = this.M(n9 - this.o);
                bl2 = bl3;
            }
        }
        return bl2;
    }

    public void removeRange(int n8, int n9) {
        c.o.c(n8, n9, this.size());
        int n10 = n9 - n8;
        if (n10 == 0) {
            return;
        }
        if (n10 == this.size()) {
            this.clear();
            return;
        }
        if (n10 == 1) {
            this.remove(n8);
            return;
        }
        this.U();
        if (n8 < this.size() - n9) {
            this.Y(n8, n9);
            n8 = this.T(this.o + n10);
            this.S(this.o, n8);
            this.o = n8;
        } else {
            this.Z(n8, n9);
            n8 = this.T(this.o + this.size());
            this.S(this.M(n8 - n10), n8);
        }
        this.q = this.size() - n10;
    }

    public boolean retainAll(Collection collection) {
        Intrinsics.checkNotNullParameter((Object)collection, "elements");
        boolean bl = this.isEmpty();
        int n8 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        if (!bl) {
            if (this.p.length == 0) {
                return false;
            }
            int n9 = this.o;
            int n10 = this.T(this.o + this.size());
            if (n9 < n10) {
                int n11 = n9;
                while (n9 < n10) {
                    Object object = this.p[n9];
                    if (collection.contains(object)) {
                        this.p[n11] = object;
                        ++n11;
                    } else {
                        bl3 = true;
                    }
                    ++n9;
                }
                j.e(this.p, null, n11, n10);
                n9 = n11;
            } else {
                Object[] arrobject;
                Object object;
                int n12 = this.p.length;
                bl3 = false;
                int n13 = n9;
                while (n9 < n12) {
                    arrobject = this.p;
                    object = arrobject[n9];
                    arrobject[n9] = null;
                    if (collection.contains(object)) {
                        this.p[n13] = object;
                        ++n13;
                    } else {
                        bl3 = true;
                    }
                    ++n9;
                }
                n9 = this.T(n13);
                for (n13 = n8; n13 < n10; ++n13) {
                    arrobject = this.p;
                    object = arrobject[n13];
                    arrobject[n13] = null;
                    if (collection.contains(object)) {
                        this.p[n9] = object;
                        n9 = this.D(n9);
                        continue;
                    }
                    bl3 = true;
                }
            }
            bl2 = bl3;
            if (bl3) {
                this.U();
                this.q = this.M(n9 - this.o);
                bl2 = bl3;
            }
        }
        return bl2;
    }

    public final void s(int n8) {
        if (n8 >= 0) {
            Object[] arrobject = this.p;
            if (n8 <= arrobject.length) {
                return;
            }
            if (arrobject == s) {
                this.p = new Object[l6.d.a(n8, 10)];
                return;
            }
            this.k(c.o.d(arrobject.length, n8));
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public Object set(int n8, Object object) {
        c.o.a(n8, this.size());
        n8 = this.T(this.o + n8);
        Object[] arrobject = this.p;
        Object object2 = arrobject[n8];
        arrobject[n8] = object;
        return object2;
    }

    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }

    public Object[] toArray(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "array");
        if (arrobject.length < this.size()) {
            arrobject = h.a(arrobject, this.size());
        }
        int n8 = this.T(this.o + this.size());
        int n9 = this.o;
        if (n9 < n8) {
            j.d(this.p, arrobject, 0, n9, n8, 2, null);
        } else if (this.isEmpty() ^ true) {
            Object[] arrobject2 = this.p;
            j.c(arrobject2, arrobject, 0, this.o, arrobject2.length);
            arrobject2 = this.p;
            j.c(arrobject2, arrobject, arrobject2.length - this.o, 0, n8);
        }
        return n.c(this.size(), arrobject);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

