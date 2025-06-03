// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.io.Serializable;
import java.util.ListIterator;
import java.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import W2.m;
import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;

public abstract class v extends t implements List, RandomAccess
{
    public static final h0 p;
    private static final long serialVersionUID = -889275714L;
    
    static {
        p = new b(S.s, 0);
    }
    
    public static v D(final Object[] array, final int n) {
        if (n == 0) {
            return Y();
        }
        return new S(array, n);
    }
    
    public static a M() {
        return new a();
    }
    
    public static a S(final int n) {
        i.b(n, "expectedSize");
        return new a(n);
    }
    
    public static v T(final Object... array) {
        return s(O.b(array));
    }
    
    public static v U(final Collection collection) {
        if (collection instanceof t) {
            v v2;
            final v v = v2 = ((t)collection).a();
            if (v.k()) {
                v2 = s(v.toArray());
            }
            return v2;
        }
        return T(collection.toArray());
    }
    
    public static v V(final Object[] array) {
        if (array.length == 0) {
            return Y();
        }
        return T((Object[])array.clone());
    }
    
    public static v Y() {
        return S.s;
    }
    
    public static v Z(final Object o) {
        return T(o);
    }
    
    public static v a0(final Object o, final Object o2) {
        return T(o, o2);
    }
    
    public static v b0(final Object o, final Object o2, final Object o3) {
        return T(o, o2, o3);
    }
    
    public static v c0(final Object o, final Object o2, final Object o3, final Object o4, final Object o5) {
        return T(o, o2, o3, o4, o5);
    }
    
    public static v d0(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7) {
        return T(o, o2, o3, o4, o5, o6, o7);
    }
    
    public static v e0(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11, final Object o12, final Object... array) {
        m.e(array.length <= 2147483635, "the total number of elements must fit in an int");
        final Object[] array2 = new Object[array.length + 12];
        array2[0] = o;
        array2[1] = o2;
        array2[2] = o3;
        array2[3] = o4;
        array2[4] = o5;
        array2[5] = o6;
        array2[6] = o7;
        array2[7] = o8;
        array2[8] = o9;
        array2[9] = o10;
        array2[10] = o11;
        array2[11] = o12;
        System.arraycopy(array, 0, array2, 12, array.length);
        return T(array2);
    }
    
    public static v g0(final Comparator c, final Iterable iterable) {
        m.j(c);
        final Object[] k = B.k(iterable);
        O.b(k);
        Arrays.sort(k, c);
        return s(k);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    public static v s(final Object[] array) {
        return D(array, array.length);
    }
    
    public h0 W() {
        return this.X(0);
    }
    
    public h0 X(final int n) {
        m.l(n, this.size());
        if (this.isEmpty()) {
            return v.p;
        }
        return new b(this, n);
    }
    
    @Override
    public final v a() {
        return this;
    }
    
    @Override
    public final void add(final int n, final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    @Override
    public int d(final Object[] array, final int n) {
        final int size = this.size();
        for (int i = 0; i < size; ++i) {
            array[n + i] = this.get(i);
        }
        return n + size;
    }
    
    @Override
    public boolean equals(final Object o) {
        return E.c(this, o);
    }
    
    public v f0() {
        if (this.size() <= 1) {
            return this;
        }
        return new c(this);
    }
    
    public v h0(final int n, final int n2) {
        m.n(n, n2, this.size());
        final int n3 = n2 - n;
        if (n3 == this.size()) {
            return this;
        }
        if (n3 == 0) {
            return Y();
        }
        return this.i0(n, n2);
    }
    
    @Override
    public int hashCode() {
        final int size = this.size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = n * 31 + this.get(i).hashCode();
        }
        return n;
    }
    
    public v i0(final int n, final int n2) {
        return new e(n, n2 - n);
    }
    
    @Override
    public int indexOf(final Object o) {
        if (o == null) {
            return -1;
        }
        return E.d(this, o);
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        if (o == null) {
            return -1;
        }
        return E.f(this, o);
    }
    
    @Override
    public g0 q() {
        return this.W();
    }
    
    @Override
    public final Object remove(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object set(final int n, final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Object writeReplace() {
        return new d(this.toArray());
    }
    
    public static final class a extends t.a
    {
        public a() {
            this(4);
        }
        
        public a(final int n) {
            super(n);
        }
        
        public a h(final Object o) {
            super.d(o);
            return this;
        }
        
        public a i(final Object... array) {
            super.e(array);
            return this;
        }
        
        public a j(final Iterable iterable) {
            super.b(iterable);
            return this;
        }
        
        public v k() {
            super.c = true;
            return v.D(super.a, super.b);
        }
    }
    
    public static class b extends a
    {
        public final v q;
        
        public b(final v q, final int n) {
            super(q.size(), n);
            this.q = q;
        }
        
        @Override
        public Object b(final int n) {
            return this.q.get(n);
        }
    }
    
    public static class c extends v
    {
        public final transient v q;
        
        public c(final v q) {
            this.q = q;
        }
        
        @Override
        public boolean contains(final Object o) {
            return this.q.contains(o);
        }
        
        @Override
        public v f0() {
            return this.q;
        }
        
        @Override
        public Object get(final int n) {
            m.h(n, this.size());
            return this.q.get(this.j0(n));
        }
        
        @Override
        public v h0(final int n, final int n2) {
            m.n(n, n2, this.size());
            return this.q.h0(this.k0(n2), this.k0(n)).f0();
        }
        
        @Override
        public int indexOf(final Object o) {
            final int lastIndex = this.q.lastIndexOf(o);
            if (lastIndex >= 0) {
                return this.j0(lastIndex);
            }
            return -1;
        }
        
        public final int j0(final int n) {
            return this.size() - 1 - n;
        }
        
        @Override
        public boolean k() {
            return this.q.k();
        }
        
        public final int k0(final int n) {
            return this.size() - n;
        }
        
        @Override
        public int lastIndexOf(final Object o) {
            final int index = this.q.indexOf(o);
            if (index >= 0) {
                return this.j0(index);
            }
            return -1;
        }
        
        @Override
        public int size() {
            return this.q.size();
        }
        
        @Override
        public Object writeReplace() {
            return super.writeReplace();
        }
    }
    
    public static class d implements Serializable
    {
        private static final long serialVersionUID = 0L;
        public final Object[] o;
        
        public d(final Object[] o) {
            this.o = o;
        }
        
        public Object readResolve() {
            return v.V(this.o);
        }
    }
    
    public class e extends v
    {
        public final transient int q;
        public final transient int r;
        
        public e(final int q, final int r) {
            this.q = q;
            this.r = r;
        }
        
        @Override
        public Object[] f() {
            return v.this.f();
        }
        
        @Override
        public int g() {
            return v.this.i() + this.q + this.r;
        }
        
        @Override
        public Object get(final int n) {
            m.h(n, this.r);
            return v.this.get(n + this.q);
        }
        
        @Override
        public v h0(final int n, final int n2) {
            m.n(n, n2, this.r);
            final v s = v.this;
            final int q = this.q;
            return s.h0(n + q, n2 + q);
        }
        
        @Override
        public int i() {
            return v.this.i() + this.q;
        }
        
        @Override
        public boolean k() {
            return true;
        }
        
        @Override
        public int size() {
            return this.r;
        }
        
        @Override
        public Object writeReplace() {
            return super.writeReplace();
        }
    }
}
