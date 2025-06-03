// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A0;

import g0.M;
import g0.a;
import d0.L;
import k0.b1;

public final class E
{
    public final int a;
    public final b1[] b;
    public final y[] c;
    public final L d;
    public final Object e;
    
    public E(final b1[] b, final y[] array, final L d, final Object e) {
        g0.a.a(b.length == array.length);
        this.b = b;
        this.c = array.clone();
        this.d = d;
        this.e = e;
        this.a = b.length;
    }
    
    public boolean a(final E e) {
        if (e == null) {
            return false;
        }
        if (e.c.length != this.c.length) {
            return false;
        }
        for (int i = 0; i < this.c.length; ++i) {
            if (!this.b(e, i)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean b(final E e, final int n) {
        final boolean b = false;
        if (e == null) {
            return false;
        }
        boolean b2 = b;
        if (M.c(this.b[n], e.b[n])) {
            b2 = b;
            if (M.c(this.c[n], e.c[n])) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public boolean c(final int n) {
        return this.b[n] != null;
    }
}
