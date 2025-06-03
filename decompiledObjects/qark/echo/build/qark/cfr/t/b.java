/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.reflect.Array
 *  java.util.Collection
 *  java.util.ConcurrentModificationException
 *  java.util.Iterator
 *  java.util.Set
 */
package t;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import t.d;
import t.e;

public final class b
implements Collection,
Set {
    public static Object[] r;
    public static int s;
    public static Object[] t;
    public static int u;
    public static final Object v;
    public static final Object w;
    public int[] o;
    public Object[] p;
    public int q;

    static {
        v = new Object();
        w = new Object();
    }

    public b() {
        this(0);
    }

    public b(int n8) {
        if (n8 == 0) {
            this.o = d.a;
            this.p = d.c;
        } else {
            this.a(n8);
        }
        this.q = 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void g(int[] var0, Object[] var1_3, int var2_4) {
        block12 : {
            block11 : {
                block10 : {
                    if (var0.length != 8) break block10;
                    var3_5 = b.w;
                    // MONITORENTER : var3_5
                    if (b.u >= 10) ** GOTO lbl28
                    var1_3[0] = b.t;
                    var1_3[1] = var0;
                    --var2_4;
                    break block11;
                }
                if (var0.length != 4) return;
                var3_6 = b.v;
                // MONITORENTER : var3_6
                if (b.s >= 10) ** GOTO lbl40
                var1_3[0] = b.r;
                var1_3[1] = var0;
                --var2_4;
                break block12;
            }
            while (var2_4 >= 2) {
                var1_3[var2_4] = null;
                --var2_4;
            }
            b.t = var1_3;
            ++b.u;
lbl28: // 2 sources:
            // MONITOREXIT : var3_5
            return;
        }
        while (var2_4 >= 2) {
            var1_3[var2_4] = null;
            --var2_4;
        }
        b.r = var1_3;
        ++b.s;
lbl40: // 2 sources:
        // MONITOREXIT : var3_6
        return;
    }

    /*
     * Exception decompiling
     */
    public final void a(int var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 6[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean add(Object object) {
        int n8;
        int n9;
        int n10 = this.q;
        if (object == null) {
            n8 = this.k();
            n9 = 0;
        } else {
            n9 = object.hashCode();
            n8 = this.i(object, n9);
        }
        if (n8 >= 0) {
            return false;
        }
        int n11 = n8;
        int[] arrn = this.o;
        if (n10 >= arrn.length) {
            n8 = 8;
            if (n10 >= 8) {
                n8 = (n10 >> 1) + n10;
            } else if (n10 < 4) {
                n8 = 4;
            }
            Object[] arrobject = this.p;
            this.a(n8);
            if (n10 == this.q) {
                int[] arrn2 = this.o;
                if (arrn2.length > 0) {
                    System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)0, (int)arrn.length);
                    System.arraycopy((Object)arrobject, (int)0, (Object)this.p, (int)0, (int)arrobject.length);
                }
                b.g(arrn, arrobject, n10);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (n11 < n10) {
            arrn = this.o;
            n8 = n11 + 1;
            int n12 = n10 - n11;
            System.arraycopy((Object)arrn, (int)n11, (Object)arrn, (int)n8, (int)n12);
            arrn = this.p;
            System.arraycopy((Object)arrn, (int)n11, (Object)arrn, (int)n8, (int)n12);
        }
        if (n10 == (n8 = this.q) && n11 < (arrn = this.o).length) {
            arrn[n11] = n9;
            this.p[n11] = object;
            this.q = n8 + 1;
            return true;
        }
        throw new ConcurrentModificationException();
    }

    public boolean addAll(Collection collection) {
        this.f(this.q + collection.size());
        collection = collection.iterator();
        boolean bl = false;
        while (collection.hasNext()) {
            bl |= this.add(collection.next());
        }
        return bl;
    }

    public void clear() {
        int n8 = this.q;
        if (n8 != 0) {
            int[] arrn = this.o;
            Object[] arrobject = this.p;
            this.o = d.a;
            this.p = d.c;
            this.q = 0;
            b.g(arrn, arrobject, n8);
        }
        if (this.q == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean contains(Object object) {
        if (this.indexOf(object) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        collection = collection.iterator();
        while (collection.hasNext()) {
            if (this.contains(collection.next())) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int d(int n8) {
        try {
            return d.a(this.o, this.q, n8);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new ConcurrentModificationException();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        object = (Set)object;
        if (this.size() != object.size()) {
            return false;
        }
        try {
            for (int n8 = 0; n8 < this.q; ++n8) {
                boolean bl = object.contains(this.s(n8));
                if (bl) continue;
                return false;
            }
            return true;
        }
        catch (ClassCastException | NullPointerException classCastException) {
            return false;
        }
    }

    public void f(int n8) {
        int n9 = this.q;
        int[] arrn = this.o;
        if (arrn.length < n8) {
            Object[] arrobject = this.p;
            this.a(n8);
            n8 = this.q;
            if (n8 > 0) {
                System.arraycopy((Object)arrn, (int)0, (Object)this.o, (int)0, (int)n8);
                System.arraycopy((Object)arrobject, (int)0, (Object)this.p, (int)0, (int)this.q);
            }
            b.g(arrn, arrobject, this.q);
        }
        if (this.q == n9) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public int hashCode() {
        int[] arrn = this.o;
        int n8 = this.q;
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 += arrn[i8];
        }
        return n9;
    }

    public final int i(Object object, int n8) {
        int n9;
        int n10 = this.q;
        if (n10 == 0) {
            return -1;
        }
        int n11 = this.d(n8);
        if (n11 < 0) {
            return n11;
        }
        if (object.equals(this.p[n11])) {
            return n11;
        }
        for (n9 = n11 + 1; n9 < n10 && this.o[n9] == n8; ++n9) {
            if (!object.equals(this.p[n9])) continue;
            return n9;
        }
        for (n10 = n11 - 1; n10 >= 0 && this.o[n10] == n8; --n10) {
            if (!object.equals(this.p[n10])) continue;
            return n10;
        }
        return n9;
    }

    public int indexOf(Object object) {
        if (object == null) {
            return this.k();
        }
        return this.i(object, object.hashCode());
    }

    public boolean isEmpty() {
        if (this.q <= 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new a();
    }

    public final int k() {
        int n8;
        int n9 = this.q;
        if (n9 == 0) {
            return -1;
        }
        int n10 = this.d(0);
        if (n10 < 0) {
            return n10;
        }
        if (this.p[n10] == null) {
            return n10;
        }
        for (n8 = n10 + 1; n8 < n9 && this.o[n8] == 0; ++n8) {
            if (this.p[n8] != null) continue;
            return n8;
        }
        for (n9 = n10 - 1; n9 >= 0 && this.o[n9] == 0; --n9) {
            if (this.p[n9] != null) continue;
            return n9;
        }
        return n8;
    }

    public Object q(int n8) {
        int n9 = this.q;
        Object[] arrobject = this.p;
        Object object = arrobject[n8];
        if (n9 <= 1) {
            this.clear();
            return object;
        }
        int n10 = n9 - 1;
        int[] arrn = this.o;
        int n11 = arrn.length;
        int n12 = 8;
        if (n11 > 8 && n9 < arrn.length / 3) {
            if (n9 > 8) {
                n12 = n9 + (n9 >> 1);
            }
            this.a(n12);
            if (n8 > 0) {
                System.arraycopy((Object)arrn, (int)0, (Object)this.o, (int)0, (int)n8);
                System.arraycopy((Object)arrobject, (int)0, (Object)this.p, (int)0, (int)n8);
            }
            if (n8 < n10) {
                n12 = n8 + 1;
                int[] arrn2 = this.o;
                n11 = n10 - n8;
                System.arraycopy((Object)arrn, (int)n12, (Object)arrn2, (int)n8, (int)n11);
                System.arraycopy((Object)arrobject, (int)n12, (Object)this.p, (int)n8, (int)n11);
            }
        } else {
            if (n8 < n10) {
                n12 = n8 + 1;
                n11 = n10 - n8;
                System.arraycopy((Object)arrn, (int)n12, (Object)arrn, (int)n8, (int)n11);
                arrobject = this.p;
                System.arraycopy((Object)arrobject, (int)n12, (Object)arrobject, (int)n8, (int)n11);
            }
            this.p[n10] = null;
        }
        if (n9 == this.q) {
            this.q = n10;
            return object;
        }
        throw new ConcurrentModificationException();
    }

    public boolean remove(Object object) {
        int n8 = this.indexOf(object);
        if (n8 >= 0) {
            this.q(n8);
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        collection = collection.iterator();
        boolean bl = false;
        while (collection.hasNext()) {
            bl |= this.remove(collection.next());
        }
        return bl;
    }

    public boolean retainAll(Collection collection) {
        boolean bl = false;
        for (int i8 = this.q - 1; i8 >= 0; --i8) {
            if (collection.contains(this.p[i8])) continue;
            this.q(i8);
            bl = true;
        }
        return bl;
    }

    public Object s(int n8) {
        return this.p[n8];
    }

    public int size() {
        return this.q;
    }

    public Object[] toArray() {
        int n8 = this.q;
        Object[] arrobject = new Object[n8];
        System.arraycopy((Object)this.p, (int)0, (Object)arrobject, (int)0, (int)n8);
        return arrobject;
    }

    public Object[] toArray(Object[] arrobject) {
        Object[] arrobject2 = arrobject;
        if (arrobject.length < this.q) {
            arrobject2 = (Object[])Array.newInstance((Class)arrobject.getClass().getComponentType(), (int)this.q);
        }
        System.arraycopy((Object)this.p, (int)0, (Object)arrobject2, (int)0, (int)this.q);
        int n8 = arrobject2.length;
        int n9 = this.q;
        if (n8 > n9) {
            arrobject2[n9] = null;
        }
        return arrobject2;
    }

    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.q * 14);
        stringBuilder.append('{');
        for (int i8 = 0; i8 < this.q; ++i8) {
            Object object;
            if (i8 > 0) {
                stringBuilder.append(", ");
            }
            if ((object = this.s(i8)) != this) {
                stringBuilder.append(object);
                continue;
            }
            stringBuilder.append("(this Set)");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public class a
    extends e {
        public a() {
            super(b.this.q);
        }

        @Override
        public Object b(int n8) {
            return b.this.s(n8);
        }

        @Override
        public void d(int n8) {
            b.this.q(n8);
        }
    }

}

