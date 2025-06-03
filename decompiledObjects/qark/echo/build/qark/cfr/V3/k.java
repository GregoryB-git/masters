/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  java.util.NoSuchElementException
 */
package V3;

import Q3.d;
import Y3.m;
import d4.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class k
implements Iterable,
Comparable {
    public static final k r = new k("");
    public final b[] o;
    public final int p;
    public final int q;

    public k(String arrstring) {
        int n8;
        int n9;
        arrstring = arrstring.split("/", -1);
        int n10 = arrstring.length;
        int n11 = n8 = 0;
        while (n8 < n10) {
            n9 = n11;
            if (arrstring[n8].length() > 0) {
                n9 = n11 + 1;
            }
            ++n8;
            n11 = n9;
        }
        this.o = new b[n11];
        n10 = arrstring.length;
        n11 = n8 = 0;
        while (n8 < n10) {
            String string2 = arrstring[n8];
            n9 = n11;
            if (string2.length() > 0) {
                this.o[n11] = b.j(string2);
                n9 = n11 + 1;
            }
            ++n8;
            n11 = n9;
        }
        this.p = 0;
        this.q = this.o.length;
    }

    public k(List list) {
        this.o = new b[list.size()];
        Iterator iterator = list.iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            this.o[n8] = b.j(string2);
            ++n8;
        }
        this.p = 0;
        this.q = list.size();
    }

    public /* varargs */ k(b ... arrb) {
        this.o = (b[])Arrays.copyOf((Object[])arrb, (int)arrb.length);
        this.p = 0;
        this.q = arrb.length;
        int n8 = arrb.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            boolean bl = arrb[i8] != null;
            m.g(bl, "Can't construct a path with a null value!");
        }
    }

    public k(b[] arrb, int n8, int n9) {
        this.o = arrb;
        this.p = n8;
        this.q = n9;
    }

    public static k Y() {
        return r;
    }

    public static k b0(k k8, k k9) {
        b b8 = k8.Z();
        b b9 = k9.Z();
        if (b8 == null) {
            return k9;
        }
        if (b8.equals(b9)) {
            return k.b0(k8.c0(), k9.c0());
        }
        b8 = new StringBuilder();
        b8.append("INTERNAL ERROR: ");
        b8.append((Object)k9);
        b8.append(" is not contained in ");
        b8.append((Object)k8);
        throw new d(b8.toString());
    }

    public List S() {
        ArrayList arrayList = new ArrayList(this.size());
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)((b)iterator.next()).e());
        }
        return arrayList;
    }

    public k T(k k8) {
        int n8 = this.size() + k8.size();
        b[] arrb = new b[n8];
        System.arraycopy((Object)this.o, (int)this.p, (Object)arrb, (int)0, (int)this.size());
        System.arraycopy((Object)k8.o, (int)k8.p, (Object)arrb, (int)this.size(), (int)k8.size());
        return new k(arrb, 0, n8);
    }

    public k U(b b8) {
        int n8 = this.size();
        int n9 = n8 + 1;
        b[] arrb = new b[n9];
        System.arraycopy((Object)this.o, (int)this.p, (Object)arrb, (int)0, (int)n8);
        arrb[n8] = b8;
        return new k(arrb, 0, n9);
    }

    public int V(k k8) {
        int n8;
        int n9;
        int n10 = this.p;
        for (n8 = k8.p; n10 < (n9 = this.q) && n8 < k8.q; ++n10, ++n8) {
            n9 = this.o[n10].h(k8.o[n8]);
            if (n9 == 0) continue;
            return n9;
        }
        if (n10 == n9 && n8 == k8.q) {
            return 0;
        }
        if (n10 == n9) {
            return -1;
        }
        return 1;
    }

    public boolean W(k k8) {
        if (this.size() > k8.size()) {
            return false;
        }
        int n8 = this.p;
        int n9 = k8.p;
        while (n8 < this.q) {
            if (!this.o[n8].equals(k8.o[n9])) {
                return false;
            }
            ++n8;
            ++n9;
        }
        return true;
    }

    public b X() {
        if (!this.isEmpty()) {
            return this.o[this.q - 1];
        }
        return null;
    }

    public b Z() {
        if (this.isEmpty()) {
            return null;
        }
        return this.o[this.p];
    }

    public k a0() {
        if (this.isEmpty()) {
            return null;
        }
        return new k(this.o, this.p, this.q - 1);
    }

    public k c0() {
        int n8;
        int n9 = n8 = this.p;
        if (!this.isEmpty()) {
            n9 = n8 + 1;
        }
        return new k(this.o, n9, this.q);
    }

    public String d0() {
        if (this.isEmpty()) {
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i8 = this.p; i8 < this.q; ++i8) {
            if (i8 > this.p) {
                stringBuilder.append("/");
            }
            stringBuilder.append(this.o[i8].e());
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        if (!(object instanceof k)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (k)object;
        if (this.size() != object.size()) {
            return false;
        }
        int n8 = this.p;
        for (int i8 = object.p; n8 < this.q && i8 < object.q; ++n8, ++i8) {
            if (this.o[n8].equals(object.o[i8])) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        int n8 = 0;
        for (int i8 = this.p; i8 < this.q; ++i8) {
            n8 = n8 * 37 + this.o[i8].hashCode();
        }
        return n8;
    }

    public boolean isEmpty() {
        if (this.p >= this.q) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new Iterator(){
            public int o;
            {
                this.o = k.this.p;
            }

            public b b() {
                if (this.hasNext()) {
                    Object object = k.this.o;
                    int n8 = this.o;
                    object = object[n8];
                    this.o = n8 + 1;
                    return object;
                }
                throw new NoSuchElementException("No more elements.");
            }

            public boolean hasNext() {
                if (this.o < k.this.q) {
                    return true;
                }
                return false;
            }

            public void remove() {
                throw new UnsupportedOperationException("Can't remove component from immutable Path!");
            }
        };
    }

    public int size() {
        return this.q - this.p;
    }

    public String toString() {
        if (this.isEmpty()) {
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i8 = this.p; i8 < this.q; ++i8) {
            stringBuilder.append("/");
            stringBuilder.append(this.o[i8].e());
        }
        return stringBuilder.toString();
    }

}

