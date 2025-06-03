// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import g0.a;

public final class V
{
    public final byte[] a;
    public final int b;
    public int c;
    public int d;
    
    public V(final byte[] a) {
        this.a = a;
        this.b = a.length;
    }
    
    public final void a() {
        final int c = this.c;
        boolean b2 = false;
        Label_0038: {
            if (c >= 0) {
                final int b = this.b;
                if (c < b || (c == b && this.d == 0)) {
                    b2 = true;
                    break Label_0038;
                }
            }
            b2 = false;
        }
        g0.a.f(b2);
    }
    
    public int b() {
        return this.c * 8 + this.d;
    }
    
    public boolean c() {
        final boolean b = ((this.a[this.c] & 0xFF) >> this.d & 0x1) == 0x1;
        this.e(1);
        return b;
    }
    
    public int d(final int a) {
        final int c = this.c;
        int i = Math.min(a, 8 - this.d);
        final byte[] a2 = this.a;
        int n = c + 1;
        int n2 = (a2[c] & 0xFF) >> this.d & 255 >> 8 - i;
        while (i < a) {
            n2 |= (this.a[n] & 0xFF) << i;
            i += 8;
            ++n;
        }
        this.e(a);
        return n2 & -1 >>> 32 - a;
    }
    
    public void e(int d) {
        final int n = d / 8;
        final int c = this.c + n;
        this.c = c;
        d = this.d + (d - n * 8);
        this.d = d;
        if (d > 7) {
            this.c = c + 1;
            this.d = d - 8;
        }
        this.a();
    }
}
