// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class F3 extends G3
{
    public final byte[] e;
    public final boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    
    public F3(final byte[] e, final int n, final int n2, final boolean f) {
        super(null);
        this.k = Integer.MAX_VALUE;
        this.e = e;
        this.g = n2 + n;
        this.i = n;
        this.j = n;
        this.f = f;
    }
    
    @Override
    public final int a(int k) {
        if (k < 0) {
            throw k4.d();
        }
        k += this.d();
        if (k < 0) {
            throw k4.e();
        }
        final int i = this.k;
        if (k <= i) {
            this.k = k;
            this.f();
            return i;
        }
        throw k4.f();
    }
    
    @Override
    public final int d() {
        return this.i - this.j;
    }
    
    public final void f() {
        final int g = this.g + this.h;
        this.g = g;
        final int n = g - this.j;
        final int k = this.k;
        if (n > k) {
            final int h = n - k;
            this.h = h;
            this.g = g - h;
            return;
        }
        this.h = 0;
    }
}
