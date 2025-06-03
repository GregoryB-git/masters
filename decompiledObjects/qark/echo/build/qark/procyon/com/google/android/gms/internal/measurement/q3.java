// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Locale;
import java.util.Iterator;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.io.Serializable;

public abstract class q3 implements Serializable, Iterable
{
    public static final q3 p;
    public static final x3 q;
    public static final Comparator r;
    public int o;
    
    static {
        p = new A3(a4.d);
        q = new D3(null);
        r = new s3();
    }
    
    public q3() {
        this.o = 0;
    }
    
    public static z3 U(final int n) {
        return new z3(n, null);
    }
    
    public static int g(final int n, final int n2, final int i) {
        final int n3 = n2 - n;
        if ((n | n2 | n3 | i - n2) >= 0) {
            return n3;
        }
        if (n < 0) {
            final StringBuilder sb = new StringBuilder("Beginning index: ");
            sb.append(n);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (n2 < n) {
            final StringBuilder sb2 = new StringBuilder("Beginning index larger than ending index: ");
            sb2.append(n);
            sb2.append(", ");
            sb2.append(n2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        final StringBuilder sb3 = new StringBuilder("End index: ");
        sb3.append(n2);
        sb3.append(" >= ");
        sb3.append(i);
        throw new IndexOutOfBoundsException(sb3.toString());
    }
    
    public static q3 k(final String s) {
        return new A3(s.getBytes(a4.b));
    }
    
    public static q3 q(final byte[] array, final int n, final int n2) {
        g(n, n + n2, array.length);
        return new A3(q3.q.a(array, n, n2));
    }
    
    public abstract void D(final r3 p0);
    
    public abstract byte M(final int p0);
    
    public abstract int S();
    
    public abstract int T(final int p0, final int p1, final int p2);
    
    public final String V() {
        final Charset b = a4.b;
        if (this.S() == 0) {
            return "";
        }
        return this.s(b);
    }
    
    public abstract boolean W();
    
    public abstract byte a(final int p0);
    
    public final int d() {
        return this.o;
    }
    
    @Override
    public abstract boolean equals(final Object p0);
    
    @Override
    public final int hashCode() {
        int o;
        if ((o = this.o) == 0) {
            final int s = this.S();
            if ((o = this.T(s, 0, s)) == 0) {
                o = 1;
            }
            this.o = o;
        }
        return o;
    }
    
    public abstract q3 i(final int p0, final int p1);
    
    public abstract String s(final Charset p0);
    
    @Override
    public final String toString() {
        final Locale root = Locale.ROOT;
        final String hexString = Integer.toHexString(System.identityHashCode(this));
        final int s = this.S();
        String s2;
        if (this.S() <= 50) {
            s2 = s5.a(this);
        }
        else {
            final String a = s5.a(this.i(0, 47));
            final StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("...");
            s2 = sb.toString();
        }
        return String.format(root, "<ByteString@%s size=%d contents=\"%s\">", hexString, s, s2);
    }
}
