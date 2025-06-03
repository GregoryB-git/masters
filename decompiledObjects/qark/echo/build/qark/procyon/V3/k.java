// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import java.util.NoSuchElementException;
import java.util.ArrayList;
import Q3.d;
import Y3.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import d4.b;

public class k implements Iterable, Comparable
{
    public static final k r;
    public final b[] o;
    public final int p;
    public final int q;
    
    static {
        r = new k("");
    }
    
    public k(final String s) {
        final String[] split = s.split("/", -1);
        int n;
        int n2;
        for (int length = split.length, i = n = 0; i < length; ++i, n = n2) {
            n2 = n;
            if (split[i].length() > 0) {
                n2 = n + 1;
            }
        }
        this.o = new b[n];
        int n3;
        int n4;
        for (int length2 = split.length, j = n3 = 0; j < length2; ++j, n3 = n4) {
            final String s2 = split[j];
            n4 = n3;
            if (s2.length() > 0) {
                this.o[n3] = b.j(s2);
                n4 = n3 + 1;
            }
        }
        this.p = 0;
        this.q = this.o.length;
    }
    
    public k(final List list) {
        this.o = new b[list.size()];
        final Iterator<String> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            this.o[n] = b.j(iterator.next());
            ++n;
        }
        this.p = 0;
        this.q = list.size();
    }
    
    public k(final b... original) {
        this.o = Arrays.copyOf(original, original.length);
        this.p = 0;
        this.q = original.length;
        for (int length = original.length, i = 0; i < length; ++i) {
            m.g(original[i] != null, "Can't construct a path with a null value!");
        }
    }
    
    public k(final b[] o, final int p3, final int q) {
        this.o = o;
        this.p = p3;
        this.q = q;
    }
    
    public static /* synthetic */ int D(final k k) {
        return k.q;
    }
    
    public static /* synthetic */ b[] M(final k k) {
        return k.o;
    }
    
    public static k Y() {
        return k.r;
    }
    
    public static k b0(final k obj, final k obj2) {
        final b z = obj.Z();
        final b z2 = obj2.Z();
        if (z == null) {
            return obj2;
        }
        if (z.equals(z2)) {
            return b0(obj.c0(), obj2.c0());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("INTERNAL ERROR: ");
        sb.append(obj2);
        sb.append(" is not contained in ");
        sb.append(obj);
        throw new d(sb.toString());
    }
    
    public static /* synthetic */ int s(final k k) {
        return k.p;
    }
    
    public List S() {
        final ArrayList<String> list = new ArrayList<String>(this.size());
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().e());
        }
        return list;
    }
    
    public k T(final k k) {
        final int n = this.size() + k.size();
        final b[] array = new b[n];
        System.arraycopy(this.o, this.p, array, 0, this.size());
        System.arraycopy(k.o, k.p, array, this.size(), k.size());
        return new k(array, 0, n);
    }
    
    public k U(final b b) {
        final int size = this.size();
        final int n = size + 1;
        final b[] array = new b[n];
        System.arraycopy(this.o, this.p, array, 0, size);
        array[size] = b;
        return new k(array, 0, n);
    }
    
    public int V(final k k) {
        int p = this.p;
        int p2 = k.p;
        while (true) {
            final int q = this.q;
            if (p < q && p2 < k.q) {
                final int h = this.o[p].h(k.o[p2]);
                if (h != 0) {
                    return h;
                }
                ++p;
                ++p2;
            }
            else {
                if (p == q && p2 == k.q) {
                    return 0;
                }
                if (p == q) {
                    return -1;
                }
                return 1;
            }
        }
    }
    
    public boolean W(final k k) {
        if (this.size() > k.size()) {
            return false;
        }
        for (int i = this.p, p = k.p; i < this.q; ++i, ++p) {
            if (!this.o[i].equals(k.o[p])) {
                return false;
            }
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
        int p = this.p;
        if (!this.isEmpty()) {
            ++p;
        }
        return new k(this.o, p, this.q);
    }
    
    public String d0() {
        if (this.isEmpty()) {
            return "/";
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = this.p; i < this.q; ++i) {
            if (i > this.p) {
                sb.append("/");
            }
            sb.append(this.o[i].e());
        }
        return sb.toString();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof k)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final k k = (k)o;
        if (this.size() != k.size()) {
            return false;
        }
        for (int p = this.p, p2 = k.p; p < this.q && p2 < k.q; ++p, ++p2) {
            if (!this.o[p].equals(k.o[p2])) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int i = this.p;
        int n = 0;
        while (i < this.q) {
            n = n * 37 + this.o[i].hashCode();
            ++i;
        }
        return n;
    }
    
    public boolean isEmpty() {
        return this.p >= this.q;
    }
    
    @Override
    public Iterator iterator() {
        return new Iterator() {
            public int o = k.s(k.this);
            
            public b b() {
                if (this.hasNext()) {
                    final b[] m = k.M(k.this);
                    final int o = this.o;
                    final b b = m[o];
                    this.o = o + 1;
                    return b;
                }
                throw new NoSuchElementException("No more elements.");
            }
            
            @Override
            public boolean hasNext() {
                return this.o < k.D(k.this);
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Can't remove component from immutable Path!");
            }
        };
    }
    
    public int size() {
        return this.q - this.p;
    }
    
    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "/";
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = this.p; i < this.q; ++i) {
            sb.append("/");
            sb.append(this.o[i].e());
        }
        return sb.toString();
    }
}
