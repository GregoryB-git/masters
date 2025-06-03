// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import A2.n;
import E2.e;

public final class w5
{
    public final e a;
    public long b;
    
    public w5(final e a) {
        n.i(a);
        this.a = a;
    }
    
    public final void a() {
        this.b = 0L;
    }
    
    public final boolean b(final long n) {
        return this.b == 0L || this.a.b() - this.b >= 3600000L;
    }
    
    public final void c() {
        this.b = this.a.b();
    }
}
