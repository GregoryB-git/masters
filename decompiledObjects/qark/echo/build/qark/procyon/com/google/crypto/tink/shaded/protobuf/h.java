// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Locale;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import java.util.Comparator;
import java.io.Serializable;

public abstract class h implements Iterable, Serializable
{
    public static final h p;
    public static final f q;
    public static final Comparator r;
    public int o;
    
    static {
        p = new j(z.d);
        f q2;
        if (com.google.crypto.tink.shaded.protobuf.d.c()) {
            q2 = new k(null);
        }
        else {
            q2 = new d(null);
        }
        q = q2;
        r = new Comparator() {
            public int a(final h h, final h h2) {
                final g s = h.S();
                final g s2 = h2.S();
                while (s.hasNext() && s2.hasNext()) {
                    final int compareTo = Integer.valueOf(Z(s.c())).compareTo(Z(s2.c()));
                    if (compareTo != 0) {
                        return compareTo;
                    }
                }
                return Integer.valueOf(h.size()).compareTo(h2.size());
            }
        };
    }
    
    public h() {
        this.o = 0;
    }
    
    public static h T(final int n) {
        return new h(n, null);
    }
    
    public static int Z(final byte b) {
        return b & 0xFF;
    }
    
    public static h e0(final byte[] array) {
        return new j(array);
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
    
    public static h f0(final byte[] array, final int n, final int n2) {
        return new e(array, n, n2);
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
    
    public static h i(final byte[] array) {
        return k(array, 0, array.length);
    }
    
    public static h k(final byte[] array, final int n, final int n2) {
        g(n, n + n2, array.length);
        return new j(h.q.a(array, n, n2));
    }
    
    public static h q(final String s) {
        return new j(s.getBytes(z.b));
    }
    
    public abstract byte D(final int p0);
    
    public abstract boolean M();
    
    public g S() {
        return (g)new c() {
            public int o = 0;
            public final int p = h.this.size();
            
            @Override
            public byte c() {
                final int o = this.o;
                if (o < this.p) {
                    this.o = o + 1;
                    return h.this.D(o);
                }
                throw new NoSuchElementException();
            }
            
            @Override
            public boolean hasNext() {
                return this.o < this.p;
            }
        };
    }
    
    public abstract com.google.crypto.tink.shaded.protobuf.i U();
    
    public abstract int V(final int p0, final int p1, final int p2);
    
    public final int W() {
        return this.o;
    }
    
    public abstract h X(final int p0, final int p1);
    
    public final byte[] Y() {
        final int size = this.size();
        if (size == 0) {
            return z.d;
        }
        final byte[] array = new byte[size];
        this.s(array, 0, 0, size);
        return array;
    }
    
    public final String a0(final Charset charset) {
        if (this.size() == 0) {
            return "";
        }
        return this.b0(charset);
    }
    
    public abstract String b0(final Charset p0);
    
    public final String c0() {
        return this.a0(z.b);
    }
    
    public abstract byte d(final int p0);
    
    public final String d0() {
        if (this.size() <= 50) {
            return i0.a(this);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(i0.a(this.X(0, 47)));
        sb.append("...");
        return sb.toString();
    }
    
    @Override
    public abstract boolean equals(final Object p0);
    
    public abstract void g0(final com.google.crypto.tink.shaded.protobuf.g p0);
    
    @Override
    public final int hashCode() {
        int o;
        if ((o = this.o) == 0) {
            final int size = this.size();
            if ((o = this.V(size, 0, size)) == 0) {
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
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), this.size(), this.d0());
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
    
    public static final class e extends j
    {
        private static final long serialVersionUID = 1L;
        public final int t;
        public final int u;
        
        public e(final byte[] array, final int t, final int u) {
            super(array);
            h.g(t, t + u, array.length);
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
            h.f(n, this.size());
            return super.s[this.t + n];
        }
        
        @Override
        public int i0() {
            return this.t;
        }
        
        @Override
        public void s(final byte[] array, final int n, final int n2, final int n3) {
            System.arraycopy(super.s, this.i0() + n, array, n2, n3);
        }
        
        @Override
        public int size() {
            return this.u;
        }
        
        public Object writeReplace() {
            return h.e0(this.Y());
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
    
    public static final class h
    {
        public final com.google.crypto.tink.shaded.protobuf.k a;
        public final byte[] b;
        
        public h(final int n) {
            final byte[] b = new byte[n];
            this.b = b;
            this.a = com.google.crypto.tink.shaded.protobuf.k.U(b);
        }
        
        public com.google.crypto.tink.shaded.protobuf.h a() {
            this.a.c();
            return new j(this.b);
        }
        
        public com.google.crypto.tink.shaded.protobuf.k b() {
            return this.a;
        }
    }
    
    public abstract static class i extends h
    {
    }
    
    public static class j extends i
    {
        private static final long serialVersionUID = 1L;
        public final byte[] s;
        
        public j(final byte[] s) {
            s.getClass();
            this.s = s;
        }
        
        @Override
        public byte D(final int n) {
            return this.s[n];
        }
        
        @Override
        public final boolean M() {
            final int i0 = this.i0();
            return p0.n(this.s, i0, this.size() + i0);
        }
        
        @Override
        public final com.google.crypto.tink.shaded.protobuf.i U() {
            return com.google.crypto.tink.shaded.protobuf.i.j(this.s, this.i0(), this.size(), true);
        }
        
        @Override
        public final int V(final int n, final int n2, final int n3) {
            return z.h(n, this.s, this.i0() + n2, n3);
        }
        
        @Override
        public final h X(final int n, int g) {
            g = h.g(n, g, this.size());
            if (g == 0) {
                return h.p;
            }
            return new e(this.s, this.i0() + n, g);
        }
        
        @Override
        public final String b0(final Charset charset) {
            return new String(this.s, this.i0(), this.size(), charset);
        }
        
        @Override
        public byte d(final int n) {
            return this.s[n];
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof h)) {
                return false;
            }
            if (this.size() != ((h)o).size()) {
                return false;
            }
            if (this.size() == 0) {
                return true;
            }
            if (o instanceof j) {
                final j j = (j)o;
                final int w = this.W();
                final int w2 = j.W();
                return (w == 0 || w2 == 0 || w == w2) && this.h0(j, 0, this.size());
            }
            return o.equals(this);
        }
        
        @Override
        public final void g0(final com.google.crypto.tink.shaded.protobuf.g g) {
            g.a(this.s, this.i0(), this.size());
        }
        
        public final boolean h0(final h h, int i, final int n) {
            if (n > h.size()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Length too large: ");
                sb.append(n);
                sb.append(this.size());
                throw new IllegalArgumentException(sb.toString());
            }
            final int n2 = i + n;
            if (n2 > h.size()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Ran off end of other: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(n);
                sb2.append(", ");
                sb2.append(h.size());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (h instanceof j) {
                final j j = (j)h;
                final byte[] s = this.s;
                final byte[] s2 = j.s;
                int i2;
                int k;
                for (i2 = this.i0(), k = this.i0(), i += j.i0(); k < i2 + n; ++k, ++i) {
                    if (s[k] != s2[i]) {
                        return false;
                    }
                }
                return true;
            }
            return h.X(i, n2).equals(this.X(0, n));
        }
        
        public int i0() {
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
    
    public static final class k implements f
    {
        @Override
        public byte[] a(final byte[] array, final int n, final int n2) {
            final byte[] array2 = new byte[n2];
            System.arraycopy(array, n, array2, 0, n2);
            return array2;
        }
    }
}
