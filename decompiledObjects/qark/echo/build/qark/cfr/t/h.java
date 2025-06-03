/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.ClassCastException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ConcurrentModificationException
 *  java.util.Map
 */
package t;

import java.util.ConcurrentModificationException;
import java.util.Map;
import t.d;

public class h {
    public static Object[] r;
    public static int s;
    public static Object[] t;
    public static int u;
    public int[] o;
    public Object[] p;
    public int q;

    public h() {
        this.o = d.a;
        this.p = d.c;
        this.q = 0;
    }

    public h(int n8) {
        if (n8 == 0) {
            this.o = d.a;
            this.p = d.c;
        } else {
            this.a(n8);
        }
        this.q = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int b(int[] arrn, int n8, int n9) {
        try {
            return d.a(arrn, n8, n9);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new ConcurrentModificationException();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void d(int[] var0, Object[] var1_3, int var2_4) {
        block12 : {
            block11 : {
                block10 : {
                    if (var0.length != 8) break block10;
                    // MONITORENTER : t.h.class
                    if (h.u >= 10) ** GOTO lbl23
                    var1_3[0] = h.t;
                    var1_3[1] = var0;
                    break block11;
                }
                if (var0.length != 4) return;
                // MONITORENTER : t.h.class
                if (h.s >= 10) ** GOTO lbl34
                var1_3[0] = h.r;
                var1_3[1] = var0;
                break block12;
            }
            for (var2_4 = (var2_4 << 1) - 1; var2_4 >= 2; --var2_4) {
                var1_3[var2_4] = null;
            }
            h.t = var1_3;
            ++h.u;
lbl23: // 2 sources:
            // MONITOREXIT : t.h.class
            return;
        }
        for (var2_4 = (var2_4 << 1) - 1; var2_4 >= 2; --var2_4) {
            var1_3[var2_4] = null;
        }
        h.r = var1_3;
        ++h.s;
lbl34: // 2 sources:
        // MONITOREXIT : t.h.class
        return;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(int n8) {
        block9 : {
            block8 : {
                if (n8 != 8) break block8;
                // MONITORENTER : t.h.class
                arrobject = h.t;
                if (arrobject == null) ** GOTO lbl15
                this.p = arrobject;
                h.t = (Object[])arrobject[0];
                this.o = (int[])arrobject[1];
                arrobject[1] = null;
                arrobject[0] = null;
                --h.u;
                // MONITOREXIT : t.h.class
                return;
lbl15: // 1 sources:
                // MONITOREXIT : t.h.class
            }
            if (n8 != 4) break block9;
            // MONITORENTER : t.h.class
            arrobject = h.r;
            if (arrobject == null) ** GOTO lbl34
            this.p = arrobject;
            h.r = (Object[])arrobject[0];
            this.o = (int[])arrobject[1];
            arrobject[1] = null;
            arrobject[0] = null;
            --h.s;
            // MONITOREXIT : t.h.class
            return;
lbl34: // 1 sources:
            // MONITOREXIT : t.h.class
        }
        this.o = new int[n8];
        this.p = new Object[n8 << 1];
        return;
        catch (Throwable throwable) {
            throw throwable;
        }
    }

    public void c(int n8) {
        int n9 = this.q;
        int[] arrn = this.o;
        if (arrn.length < n8) {
            Object[] arrobject = this.p;
            this.a(n8);
            if (this.q > 0) {
                System.arraycopy((Object)arrn, (int)0, (Object)this.o, (int)0, (int)n9);
                System.arraycopy((Object)arrobject, (int)0, (Object)this.p, (int)0, (int)(n9 << 1));
            }
            h.d(arrn, arrobject, n9);
        }
        if (this.q == n9) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int n8 = this.q;
        if (n8 > 0) {
            int[] arrn = this.o;
            Object[] arrobject = this.p;
            this.o = d.a;
            this.p = d.c;
            this.q = 0;
            h.d(arrn, arrobject, n8);
        }
        if (this.q <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object object) {
        if (this.f(object) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object object) {
        if (this.h(object) >= 0) {
            return true;
        }
        return false;
    }

    public int e(Object object, int n8) {
        int n9;
        int n10 = this.q;
        if (n10 == 0) {
            return -1;
        }
        int n11 = h.b(this.o, n10, n8);
        if (n11 < 0) {
            return n11;
        }
        if (object.equals(this.p[n11 << 1])) {
            return n11;
        }
        for (n9 = n11 + 1; n9 < n10 && this.o[n9] == n8; ++n9) {
            if (!object.equals(this.p[n9 << 1])) continue;
            return n9;
        }
        for (n10 = n11 - 1; n10 >= 0 && this.o[n10] == n8; --n10) {
            if (!object.equals(this.p[n10 << 1])) continue;
            return n10;
        }
        return n9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean equals(Object object) {
        block19 : {
            block20 : {
                block18 : {
                    block17 : {
                        if (this == object) {
                            return true;
                        }
                        try {
                            if (object instanceof h) {
                                object = (h)object;
                                if (this.size() != object.size()) {
                                    return false;
                                }
                                break block17;
                            }
                            if (object instanceof Map) {
                                object = (Map)object;
                                if (this.size() != object.size()) {
                                    return false;
                                }
                                break block18;
                            }
                            return false;
                        }
                        catch (ClassCastException | NullPointerException classCastException) {
                            return false;
                        }
                    }
                    int n8 = 0;
                    while (n8 < this.q) {
                        Object object2 = this.i(n8);
                        Object object3 = this.l(n8);
                        Object object4 = object.get(object2);
                        if (object3 == null) {
                            if (object4 != null) break block19;
                            if (!object.containsKey(object2)) {
                                return false;
                            }
                        } else if (!object3.equals(object4)) {
                            return false;
                        }
                        ++n8;
                    }
                    return true;
                }
                int n9 = 0;
                while (n9 < this.q) {
                    Object object5 = this.i(n9);
                    Object object6 = this.l(n9);
                    Object object7 = object.get(object5);
                    if (object6 == null) {
                        if (object7 != null) break block20;
                        if (!object.containsKey(object5)) {
                            return false;
                        }
                    } else {
                        boolean bl = object6.equals(object7);
                        if (!bl) {
                            return false;
                        }
                    }
                    ++n9;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int f(Object object) {
        if (object == null) {
            return this.g();
        }
        return this.e(object, object.hashCode());
    }

    public int g() {
        int n8;
        int n9 = this.q;
        if (n9 == 0) {
            return -1;
        }
        int n10 = h.b(this.o, n9, 0);
        if (n10 < 0) {
            return n10;
        }
        if (this.p[n10 << 1] == null) {
            return n10;
        }
        for (n8 = n10 + 1; n8 < n9 && this.o[n8] == 0; ++n8) {
            if (this.p[n8 << 1] != null) continue;
            return n8;
        }
        for (n9 = n10 - 1; n9 >= 0 && this.o[n9] == 0; --n9) {
            if (this.p[n9 << 1] != null) continue;
            return n9;
        }
        return n8;
    }

    public Object get(Object object) {
        return this.getOrDefault(object, null);
    }

    public Object getOrDefault(Object object, Object object2) {
        int n8 = this.f(object);
        if (n8 >= 0) {
            object2 = this.p[(n8 << 1) + 1];
        }
        return object2;
    }

    public int h(Object object) {
        int n8 = this.q * 2;
        Object[] arrobject = this.p;
        if (object == null) {
            for (int i8 = 1; i8 < n8; i8 += 2) {
                if (arrobject[i8] != null) continue;
                return i8 >> 1;
            }
        } else {
            for (int i9 = 1; i9 < n8; i9 += 2) {
                if (!object.equals(arrobject[i9])) continue;
                return i9 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int n8;
        int[] arrn = this.o;
        Object[] arrobject = this.p;
        int n9 = this.q;
        int n10 = 1;
        int n11 = n8 = 0;
        while (n8 < n9) {
            Object object = arrobject[n10];
            int n12 = arrn[n8];
            int n13 = object == null ? 0 : object.hashCode();
            n11 += n13 ^ n12;
            ++n8;
            n10 += 2;
        }
        return n11;
    }

    public Object i(int n8) {
        return this.p[n8 << 1];
    }

    public boolean isEmpty() {
        if (this.q <= 0) {
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Object j(int n8) {
        Object[] arrobject = this.p;
        int n9 = n8 << 1;
        Object object = arrobject[n9 + 1];
        int n10 = this.q;
        if (n10 <= 1) {
            this.clear();
            return object;
        }
        int n11 = n10 - 1;
        int[] arrn = this.o;
        int n12 = arrn.length;
        int n13 = 8;
        if (n12 > 8 && n10 < arrn.length / 3) {
            if (n10 > 8) {
                n13 = n10 + (n10 >> 1);
            }
            this.a(n13);
            if (n10 != this.q) throw new ConcurrentModificationException();
            if (n8 > 0) {
                System.arraycopy((Object)arrn, (int)0, (Object)this.o, (int)0, (int)n8);
                System.arraycopy((Object)arrobject, (int)0, (Object)this.p, (int)0, (int)n9);
            }
            if (n8 < n11) {
                n13 = n8 + 1;
                int[] arrn2 = this.o;
                n12 = n11 - n8;
                System.arraycopy((Object)arrn, (int)n13, (Object)arrn2, (int)n8, (int)n12);
                System.arraycopy((Object)arrobject, (int)(n13 << 1), (Object)this.p, (int)n9, (int)(n12 << 1));
            }
        } else {
            if (n8 < n11) {
                n13 = n8 + 1;
                n12 = n11 - n8;
                System.arraycopy((Object)arrn, (int)n13, (Object)arrn, (int)n8, (int)n12);
                arrobject = this.p;
                System.arraycopy((Object)arrobject, (int)(n13 << 1), (Object)arrobject, (int)n9, (int)(n12 << 1));
            }
            arrobject = this.p;
            n8 = n11 << 1;
            arrobject[n8] = null;
            arrobject[n8 + 1] = null;
        }
        if (n10 != this.q) throw new ConcurrentModificationException();
        this.q = n11;
        return object;
    }

    public Object k(int n8, Object object) {
        n8 = (n8 << 1) + 1;
        Object[] arrobject = this.p;
        Object object2 = arrobject[n8];
        arrobject[n8] = object;
        return object2;
    }

    public Object l(int n8) {
        return this.p[(n8 << 1) + 1];
    }

    public Object put(Object arrobject, Object object) {
        int n8;
        int n9;
        int n10 = this.q;
        if (arrobject == null) {
            n9 = this.g();
            n8 = 0;
        } else {
            n8 = arrobject.hashCode();
            n9 = this.e(arrobject, n8);
        }
        if (n9 >= 0) {
            n9 = (n9 << 1) + 1;
            arrobject = this.p;
            Object object2 = arrobject[n9];
            arrobject[n9] = object;
            return object2;
        }
        int n11 = n9;
        int[] arrn = this.o;
        if (n10 >= arrn.length) {
            n9 = 8;
            if (n10 >= 8) {
                n9 = (n10 >> 1) + n10;
            } else if (n10 < 4) {
                n9 = 4;
            }
            Object[] arrobject2 = this.p;
            this.a(n9);
            if (n10 == this.q) {
                int[] arrn2 = this.o;
                if (arrn2.length > 0) {
                    System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)0, (int)arrn.length);
                    System.arraycopy((Object)arrobject2, (int)0, (Object)this.p, (int)0, (int)arrobject2.length);
                }
                h.d(arrn, arrobject2, n10);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (n11 < n10) {
            arrn = this.o;
            n9 = n11 + 1;
            System.arraycopy((Object)arrn, (int)n11, (Object)arrn, (int)n9, (int)(n10 - n11));
            arrn = this.p;
            System.arraycopy((Object)arrn, (int)(n11 << 1), (Object)arrn, (int)(n9 << 1), (int)(this.q - n11 << 1));
        }
        if (n10 == (n9 = this.q) && n11 < (arrn = this.o).length) {
            arrn[n11] = n8;
            arrn = this.p;
            n8 = n11 << 1;
            arrn[n8] = arrobject;
            arrn[n8 + 1] = object;
            this.q = n9 + 1;
            return null;
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object object, Object object2) {
        Object object3;
        Object object4 = object3 = this.get(object);
        if (object3 == null) {
            object4 = this.put(object, object2);
        }
        return object4;
    }

    public Object remove(Object object) {
        int n8 = this.f(object);
        if (n8 >= 0) {
            return this.j(n8);
        }
        return null;
    }

    public boolean remove(Object object, Object object2) {
        int n8 = this.f(object);
        if (n8 >= 0 && (object2 == (object = this.l(n8)) || object2 != null && object2.equals(object))) {
            this.j(n8);
            return true;
        }
        return false;
    }

    public Object replace(Object object, Object object2) {
        int n8 = this.f(object);
        if (n8 >= 0) {
            return this.k(n8, object2);
        }
        return null;
    }

    public boolean replace(Object object, Object object2, Object object3) {
        int n8 = this.f(object);
        if (n8 >= 0 && ((object = this.l(n8)) == object2 || object2 != null && object2.equals(object))) {
            this.k(n8, object3);
            return true;
        }
        return false;
    }

    public int size() {
        return this.q;
    }

    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.q * 28);
        stringBuilder.append('{');
        for (int i8 = 0; i8 < this.q; ++i8) {
            Object object;
            if (i8 > 0) {
                stringBuilder.append(", ");
            }
            if ((object = this.i(i8)) != this) {
                stringBuilder.append(object);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            object = this.l(i8);
            if (object != this) {
                stringBuilder.append(object);
                continue;
            }
            stringBuilder.append("(this Map)");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

