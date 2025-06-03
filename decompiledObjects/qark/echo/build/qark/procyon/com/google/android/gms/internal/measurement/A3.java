// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

public class A3 extends B3
{
    public final byte[] s;
    
    public A3(final byte[] s) {
        s.getClass();
        this.s = s;
    }
    
    @Override
    public final void D(final r3 r3) {
        r3.a(this.s, this.Y(), this.S());
    }
    
    @Override
    public byte M(final int n) {
        return this.s[n];
    }
    
    @Override
    public int S() {
        return this.s.length;
    }
    
    @Override
    public final int T(final int n, final int n2, final int n3) {
        return a4.a(n, this.s, this.Y(), n3);
    }
    
    @Override
    public final boolean W() {
        final int y = this.Y();
        return E5.f(this.s, y, this.S() + y);
    }
    
    @Override
    public final boolean X(final q3 q3, int n, final int n2) {
        if (n2 > q3.S()) {
            n = this.S();
            final StringBuilder sb = new StringBuilder("Length too large: ");
            sb.append(n2);
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n2 > q3.S()) {
            n = q3.S();
            final StringBuilder sb2 = new StringBuilder("Ran off end of other: ");
            sb2.append(0);
            sb2.append(", ");
            sb2.append(n2);
            sb2.append(", ");
            sb2.append(n);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (q3 instanceof A3) {
            final A3 a3 = (A3)q3;
            final byte[] s = this.s;
            final byte[] s2 = a3.s;
            int y;
            int i;
            for (y = this.Y(), i = this.Y(), n = a3.Y(); i < y + n2; ++i, ++n) {
                if (s[i] != s2[n]) {
                    return false;
                }
            }
            return true;
        }
        return q3.i(0, n2).equals(this.i(0, n2));
    }
    
    public int Y() {
        return 0;
    }
    
    @Override
    public byte a(final int n) {
        return this.s[n];
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof q3)) {
            return false;
        }
        if (this.S() != ((q3)o).S()) {
            return false;
        }
        if (this.S() == 0) {
            return true;
        }
        if (o instanceof A3) {
            final A3 a3 = (A3)o;
            final int d = this.d();
            final int d2 = a3.d();
            return (d == 0 || d2 == 0 || d == d2) && this.X(a3, 0, this.S());
        }
        return o.equals(this);
    }
    
    @Override
    public final q3 i(int g, final int n) {
        g = q3.g(0, n, this.S());
        if (g == 0) {
            return q3.p;
        }
        return new u3(this.s, this.Y(), g);
    }
    
    @Override
    public final String s(final Charset charset) {
        return new String(this.s, this.Y(), this.S(), charset);
    }
}
