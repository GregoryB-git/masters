// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N0;

import F0.L;
import java.util.List;
import F0.s;
import F0.q;
import F0.t;
import F0.O;
import F0.r;

public final class a implements r
{
    public final r a;
    
    public a(final int n) {
        r a;
        if ((n & 0x1) != 0x0) {
            a = new O(65496, 2, "image/jpeg");
        }
        else {
            a = new b();
        }
        this.a = a;
    }
    
    @Override
    public void a(final long n, final long n2) {
        this.a.a(n, n2);
    }
    
    @Override
    public void b(final t t) {
        this.a.b(t);
    }
    
    @Override
    public boolean e(final s s) {
        return this.a.e(s);
    }
    
    @Override
    public int i(final s s, final L l) {
        return this.a.i(s, l);
    }
    
    @Override
    public void release() {
        this.a.release();
    }
}
