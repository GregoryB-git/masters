// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H0;

import g0.o;
import g0.M;
import g0.z;

public final class d implements a
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    
    public d(final int a, final int b, final int c, final int d, final int e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static d d(final z z) {
        final int t = z.t();
        z.U(12);
        final int t2 = z.t();
        final int t3 = z.t();
        final int t4 = z.t();
        z.U(4);
        final int t5 = z.t();
        final int t6 = z.t();
        z.U(8);
        return new d(t, t2, t3, t4, t5, t6);
    }
    
    @Override
    public int a() {
        return 1752331379;
    }
    
    public long b() {
        return M.W0(this.e, this.c * 1000000L, this.d);
    }
    
    public int c() {
        final int a = this.a;
        if (a == 1935960438) {
            return 2;
        }
        if (a == 1935963489) {
            return 1;
        }
        if (a != 1937012852) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Found unsupported streamType fourCC: ");
            sb.append(Integer.toHexString(this.a));
            o.h("AviStreamHeaderChunk", sb.toString());
            return -1;
        }
        return 3;
    }
}
