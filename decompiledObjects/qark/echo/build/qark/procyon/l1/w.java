// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import g0.a;
import java.util.Arrays;

public final class w
{
    public final int a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public int e;
    
    public w(final int a, final int n) {
        this.a = a;
        (this.d = new byte[n + 3])[2] = 1;
    }
    
    public void a(final byte[] array, final int n, int n2) {
        if (!this.b) {
            return;
        }
        n2 -= n;
        final byte[] d = this.d;
        final int length = d.length;
        final int e = this.e;
        if (length < e + n2) {
            this.d = Arrays.copyOf(d, (e + n2) * 2);
        }
        System.arraycopy(array, n, this.d, this.e, n2);
        this.e += n2;
    }
    
    public boolean b(final int n) {
        if (!this.b) {
            return false;
        }
        this.e -= n;
        this.b = false;
        return this.c = true;
    }
    
    public boolean c() {
        return this.c;
    }
    
    public void d() {
        this.b = false;
        this.c = false;
    }
    
    public void e(final int n) {
        final boolean b = this.b;
        boolean b2 = true;
        g0.a.f(b ^ true);
        if (n != this.a) {
            b2 = false;
        }
        this.b = b2;
        if (b2) {
            this.e = 3;
            this.c = false;
        }
    }
}
