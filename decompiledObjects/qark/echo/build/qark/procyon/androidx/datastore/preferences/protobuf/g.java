// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import java.util.Comparator;
import java.io.Serializable;

public abstract class g implements Iterable, Serializable
{
    public static final g p;
    public static final f q;
    public static final Comparator r;
    public int o;
    
    static {
        p = new i(y.c);
        f q2;
        if (androidx.datastore.preferences.protobuf.d.c()) {
            q2 = new j(null);
        }
        else {
            q2 = new d(null);
        }
        q = q2;
        r = new Comparator() {
            public int a(final g g, final g g2) {
                final g s = g.S();
                final g s2 = g2.S();
                while (s.hasNext() && s2.hasNext()) {
                    final int compare = Integer.compare(X(s.c()), X(s2.c()));
                    if (compare != 0) {
                        return compare;
                    }
                }
                return Integer.compare(g.size(), g2.size());
            }
        };
    }
    
    public g() {
        this.o = 0;
    }
    
    public static int X(final byte b) {
        return b & 0xFF;
    }
    
    public static g b0(final byte[] array) {
        return new i(array);
    }
    
    public static g c0(final byte[] array, final int n, final int n2) {
        return new e(array, n, n2);
    }
    
    public static void f(final int n, final int i) {
        if ((i - (n + 1) | n) >= 0) {
            return;
        }
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Index < 0: ");
            sb.append(n);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Index > length: ");
        sb2.append(n);
        sb2.append(", ");
        sb2.append(i);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
    
    public static int g(final int n, final int n2, final int i) {
        final int n3 = n2 - n;
        if ((n | n2 | n3 | i - n2) >= 0) {
            return n3;
        }
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Beginning index: ");
            sb.append(n);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (n2 < n) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(n);
            sb2.append(", ");
            sb2.append(n2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("End index: ");
        sb3.append(n2);
        sb3.append(" >= ");
        sb3.append(i);
        throw new IndexOutOfBoundsException(sb3.toString());
    }
    
    public static g i(final byte[] array) {
        return k(array, 0, array.length);
    }
    
    public static g k(final byte[] array, final int n, final int n2) {
        g(n, n + n2, array.length);
        return new i(g.q.a(array, n, n2));
    }
    
    public static g q(final String s) {
        return new i(s.getBytes(y.a));
    }
    
    public abstract byte D(final int p0);
    
    public abstract boolean M();
    
    public g S() {
        return (g)new c() {
            public int o = 0;
            public final int p = g.this.size();
            
            @Override
            public byte c() {
                final int o = this.o;
                if (o < this.p) {
                    this.o = o + 1;
                    return g.this.D(o);
                }
                throw new NoSuchElementException();
            }
            
            @Override
            public boolean hasNext() {
                return this.o < this.p;
            }
        };
    }
    
    public abstract int T(final int p0, final int p1, final int p2);
    
    public final int U() {
        return this.o;
    }
    
    public abstract g V(final int p0, final int p1);
    
    public final byte[] W() {
        final int size = this.size();
        if (size == 0) {
            return y.c;
        }
        final byte[] array = new byte[size];
        this.s(array, 0, 0, size);
        return array;
    }
    
    public final String Y(final Charset charset) {
        if (this.size() == 0) {
            return "";
        }
        return this.Z(charset);
    }
    
    public abstract String Z(final Charset p0);
    
    public final String a0() {
        return this.Y(y.a);
    }
    
    public abstract byte d(final int p0);
    
    public abstract void d0(final androidx.datastore.preferences.protobuf.f p0);
    
    @Override
    public abstract boolean equals(final Object p0);
    
    @Override
    public final int hashCode() {
        int o;
        if ((o = this.o) == 0) {
            final int size = this.size();
            if ((o = this.T(size, 0, size)) == 0) {
                o = 1;
            }
            this.o = o;
        }
        return o;
    }
    
    public abstract void s(final byte[] p0, final int p1, final int p2, final int p3);
    
    public abstract int size();
    
    @Override
    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.size());
    }
    
    public abstract static class c implements g
    {
        public final Byte b() {
            return ((g)this).c();
        }
        
        @Override
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }
    
    public static final class d implements f
    {
        @Override
        public byte[] a(final byte[] original, final int from, final int n) {
            return Arrays.copyOfRange(original, from, n + from);
        }
    }
    
    public static final class e extends i
    {
        private static final long serialVersionUID = 1L;
        public final int t;
        public final int u;
        
        public e(final byte[] array, final int t, final int u) {
            super(array);
            g.g(t, t + u, array.length);
            this.t = t;
            this.u = u;
        }
        
        private void readObject(final ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }
        
        @Override
        public byte D(final int n) {
            return super.s[this.t + n];
        }
        
        @Override
        public byte d(final int n) {
            g.f(n, this.size());
            return super.s[this.t + n];
        }
        
        @Override
        public int f0() {
            return this.t;
        }
        
        @Override
        public void s(final byte[] array, final int n, final int n2, final int n3) {
            System.arraycopy(super.s, this.f0() + n, array, n2, n3);
        }
        
        @Override
        public int size() {
            return this.u;
        }
        
        public Object writeReplace() {
            return g.b0(this.W());
        }
    }
    
    public interface f
    {
        byte[] a(final byte[] p0, final int p1, final int p2);
    }
    
    public interface g extends Iterator
    {
        byte c();
    }
    
    public abstract static class h extends g
    {
    }
    
    public static class i extends h
    {
        private static final long serialVersionUID = 1L;
        public final byte[] s;
        
        public i(final byte[] s) {
            s.getClass();
            this.s = s;
        }
        
        @Override
        public byte D(final int n) {
            return this.s[n];
        }
        
        @Override
        public final boolean M() {
            final int f0 = this.f0();
            return q0.n(this.s, f0, this.size() + f0);
        }
        
        @Override
        public final int T(final int n, final int n2, final int n3) {
            return y.i(n, this.s, this.f0() + n2, n3);
        }
        
        @Override
        public final g V(final int n, int g) {
            g = g.g(n, g, this.size());
            if (g == 0) {
                return g.p;
            }
            return new e(this.s, this.f0() + n, g);
        }
        
        @Override
        public final String Z(final Charset charset) {
            return new String(this.s, this.f0(), this.size(), charset);
        }
        
        @Override
        public byte d(final int n) {
            return this.s[n];
        }
        
        @Override
        public final void d0(final androidx.datastore.preferences.protobuf.f f) {
            f.a(this.s, this.f0(), this.size());
        }
        
        public final boolean e0(final g g, int i, final int n) {
            if (n > g.size()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Length too large: ");
                sb.append(n);
                sb.append(this.size());
                throw new IllegalArgumentException(sb.toString());
            }
            final int n2 = i + n;
            if (n2 > g.size()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Ran off end of other: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(n);
                sb2.append(", ");
                sb2.append(g.size());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (g instanceof i) {
                final i j = (i)g;
                final byte[] s = this.s;
                final byte[] s2 = j.s;
                int f0;
                int k;
                for (f0 = this.f0(), k = this.f0(), i += j.f0(); k < f0 + n; ++k, ++i) {
                    if (s[k] != s2[i]) {
                        return false;
                    }
                }
                return true;
            }
            return g.V(i, n2).equals(this.V(0, n));
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof g)) {
                return false;
            }
            if (this.size() != ((g)o).size()) {
                return false;
            }
            if (this.size() == 0) {
                return true;
            }
            if (o instanceof i) {
                final i i = (i)o;
                final int u = this.U();
                final int u2 = i.U();
                return (u == 0 || u2 == 0 || u == u2) && this.e0(i, 0, this.size());
            }
            return o.equals(this);
        }
        
        public int f0() {
            return 0;
        }
        
        @Override
        public void s(final byte[] array, final int n, final int n2, final int n3) {
            System.arraycopy(this.s, n, array, n2, n3);
        }
        
        @Override
        public int size() {
            return this.s.length;
        }
    }
    
    public static final class j implements f
    {
        @Override
        public byte[] a(final byte[] array, final int n, final int n2) {
            final byte[] array2 = new byte[n2];
            System.arraycopy(array, n, array2, 0, n2);
            return array2;
        }
    }
}
