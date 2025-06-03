// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B0;

import i0.t;
import java.io.IOException;
import i0.h;
import i0.q;
import java.io.FileNotFoundException;
import d0.A;

public class k implements m
{
    public final int a;
    
    public k() {
        this(-1);
    }
    
    public k(final int a) {
        this.a = a;
    }
    
    @Override
    public b b(final a a, final c c) {
        if (!this.e(c.c)) {
            return null;
        }
        if (a.a(1)) {
            return new b(1, 300000L);
        }
        if (a.a(2)) {
            return new b(2, 60000L);
        }
        return null;
    }
    
    @Override
    public long c(final c c) {
        final IOException c2 = c.c;
        if (!(c2 instanceof A) && !(c2 instanceof FileNotFoundException) && !(c2 instanceof q) && !(c2 instanceof n.h) && !h.a(c2)) {
            return Math.min((c.d - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }
    
    @Override
    public int d(final int n) {
        final int a = this.a;
        if (a != -1) {
            return a;
        }
        if (n == 7) {
            return 6;
        }
        return 3;
    }
    
    public boolean e(final IOException ex) {
        final boolean b = ex instanceof t;
        boolean b2 = false;
        if (!b) {
            return false;
        }
        final int r = ((t)ex).r;
        if (r == 403 || r == 404 || r == 410 || r == 416 || r == 500 || r == 503) {
            b2 = true;
        }
        return b2;
    }
}
