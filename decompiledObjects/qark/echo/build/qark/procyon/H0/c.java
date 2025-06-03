// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H0;

import g0.z;

public final class c implements a
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    public c(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static c c(final z z) {
        final int t = z.t();
        z.U(8);
        final int t2 = z.t();
        final int t3 = z.t();
        z.U(4);
        final int t4 = z.t();
        z.U(12);
        return new c(t, t2, t3, t4);
    }
    
    @Override
    public int a() {
        return 1751742049;
    }
    
    public boolean b() {
        return (this.b & 0x10) == 0x10;
    }
}
