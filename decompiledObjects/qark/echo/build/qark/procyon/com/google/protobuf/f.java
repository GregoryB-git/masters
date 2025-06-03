// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Locale;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import java.util.Comparator;
import java.io.Serializable;

public abstract class f implements Iterable, Serializable
{
    public static final f p;
    public static final f q;
    public static final Comparator r;
    public int o;
    
    static {
        p = new i(t.d);
        f q2;
        if (com.google.protobuf.d.c()) {
            q2 = new j(null);
        }
        else {
            q2 = new d(null);
        }
        q = q2;
        r = new Comparator() {
            public int a(final f f, final f f2) {
                final g d = f.D();
                final g d2 = f2.D();
                while (d.hasNext() && d2.hasNext()) {
                    final int compareTo = Integer.valueOf(V(d.c())).compareTo(V(d2.c()));
                    if (compareTo != 0) {
                        return compareTo;
                    }
                }
                return Integer.valueOf(f.size()).compareTo(f2.size());
            }
        };
    }
    
    public f() {
        this.o = 0;
    }
    
    public static int V(final byte b) {
        return b & 0xFF;
    }
    
    public static f a0(final byte[] array) {
        return new i(array);
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
    
    public static f i(final String s) {
        return new i(s.getBytes(t.b));
    }
    
    public g D() {
        return (g)new c() {
            public int o = 0;
            public final int p = f.this.size();
            
            @Override
            public byte c() {
                final int o = this.o;
                if (o < this.p) {
                    this.o = o + 1;
                    return f.this.q(o);
                }
                throw new NoSuchElementException();
            }
            
            @Override
            public boolean hasNext() {
                return this.o < this.p;
            }
        };
    }
    
    public abstract int M(final int p0, final int p1, final int p2);
    
    public final int S() {
        return this.o;
    }
    
    public abstract f T(final int p0, final int p1);
    
    public final byte[] U() {
        final int size = this.size();
        if (size == 0) {
            return t.d;
        }
        final byte[] array = new byte[size];
        this.k(array, 0, 0, size);
        return array;
    }
    
    public final String W(final Charset charset) {
        if (this.size() == 0) {
            return "";
        }
        return this.X(charset);
    }
    
    public abstract String X(final Charset p0);
    
    public final String Y() {
        return this.W(t.b);
    }
    
    public final String Z() {
        if (this.size() <= 50) {
            return e0.a(this);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(e0.a(this.T(0, 47)));
        sb.append("...");
        return sb.toString();
    }
    
    public abstract void b0(final com.google.protobuf.e p0);
    
    public abstract byte d(final int p0);
    
    @Override
    public abstract boolean equals(final Object p0);
    
    @Override
    public final int hashCode() {
        int o;
        if ((o = this.o) == 0) {
            final int size = this.size();
            if ((o = this.M(size, 0, size)) == 0) {
                o = 1;
            }
            this.o = o;
        }
        return o;
    }
    
    public abstract void k(final byte[] p0, final int p1, final int p2, final int p3);
    
    public abstract byte q(final int p0);
    
    public abstract boolean s();
    
    public abstract int size();
    
    @Override
    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), this.size(), this.Z());
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
    }
    
    public static final class e extends i
    {
        private static final long serialVersionUID = 1L;
        public final int t;
        public final int u;
        
        public e(final byte[] array, final int t, final int u) {
            super(array);
            f.g(t, t + u, array.length);
            this.t = t;
            this.u = u;
        }
        
        private void readObject(final ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }
        
        @Override
        public byte d(final int n) {
            f.f(n, this.size());
            return super.s[this.t + n];
        }
        
        @Override
        public int d0() {
            return this.t;
        }
        
        @Override
        public void k(final byte[] array, final int n, final int n2, final int n3) {
            System.arraycopy(super.s, this.d0() + n, array, n2, n3);
        }
        
        @Override
        public byte q(final int n) {
            return super.s[this.t + n];
        }
        
        @Override
        public int size() {
            return this.u;
        }
        
        public Object writeReplace() {
            return f.a0(this.U());
        }
    }
    
    public interface f
    {
    }
    
    public interface g extends Iterator
    {
        byte c();
    }
    
    public abstract static class h extends f
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
        public final int M(final int n, final int n2, final int n3) {
            return t.h(n, this.s, this.d0() + n2, n3);
        }
        
        @Override
        public final f T(final int n, int g) {
            g = f.g(n, g, this.size());
            if (g == 0) {
                return f.p;
            }
            return new e(this.s, this.d0() + n, g);
        }
        
        @Override
        public final String X(final Charset charset) {
            return new String(this.s, this.d0(), this.size(), charset);
        }
        
        @Override
        public final void b0(final com.google.protobuf.e e) {
            e.a(this.s, this.d0(), this.size());
        }
        
        public final boolean c0(final f f, int i, final int n) {
            if (n > f.size()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Length too large: ");
                sb.append(n);
                sb.append(this.size());
                throw new IllegalArgumentException(sb.toString());
            }
            final int n2 = i + n;
            if (n2 > f.size()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Ran off end of other: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(n);
                sb2.append(", ");
                sb2.append(f.size());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (f instanceof i) {
                final i j = (i)f;
                final byte[] s = this.s;
                final byte[] s2 = j.s;
                int d0;
                int k;
                for (d0 = this.d0(), k = this.d0(), i += j.d0(); k < d0 + n; ++k, ++i) {
                    if (s[k] != s2[i]) {
                        return false;
                    }
                }
                return true;
            }
            return f.T(i, n2).equals(this.T(0, n));
        }
        
        @Override
        public byte d(final int n) {
            return this.s[n];
        }
        
        public int d0() {
            return 0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof f)) {
                return false;
            }
            if (this.size() != ((f)o).size()) {
                return false;
            }
            if (this.size() == 0) {
                return true;
            }
            if (o instanceof i) {
                final i i = (i)o;
                final int s = this.S();
                final int s2 = i.S();
                return (s == 0 || s2 == 0 || s == s2) && this.c0(i, 0, this.size());
            }
            return o.equals(this);
        }
        
        @Override
        public void k(final byte[] array, final int n, final int n2, final int n3) {
            System.arraycopy(this.s, n, array, n2, n3);
        }
        
        @Override
        public byte q(final int n) {
            return this.s[n];
        }
        
        @Override
        public final boolean s() {
            final int d0 = this.d0();
            return l0.m(this.s, d0, this.size() + d0);
        }
        
        @Override
        public int size() {
            return this.s.length;
        }
    }
    
    public static final class j implements f
    {
    }
}
