// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

public abstract class g
{
    public static volatile int d = 100;
    public int a;
    public int b;
    public boolean c;
    
    public g() {
        this.a = g.d;
        this.b = Integer.MAX_VALUE;
        this.c = false;
    }
    
    public static g a(final byte[] array) {
        return b(array, 0, array.length);
    }
    
    public static g b(final byte[] array, final int n, final int n2) {
        return c(array, n, n2, false);
    }
    
    public static g c(final byte[] array, final int n, final int n2, final boolean b) {
        final b b2 = new b(array, n, n2, b, null);
        try {
            b2.e(n2);
            return b2;
        }
        catch (v cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    public static final class b extends g
    {
        public final byte[] e;
        public final boolean f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        
        public b(final byte[] e, final int n, final int n2, final boolean f) {
            super(null);
            this.k = Integer.MAX_VALUE;
            this.e = e;
            this.g = n2 + n;
            this.i = n;
            this.j = n;
            this.f = f;
        }
        
        public int d() {
            return this.i - this.j;
        }
        
        public int e(int k) {
            if (k < 0) {
                throw v.b();
            }
            k += this.d();
            if (k < 0) {
                throw v.c();
            }
            final int i = this.k;
            if (k <= i) {
                this.k = k;
                this.f();
                return i;
            }
            throw v.d();
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
}
