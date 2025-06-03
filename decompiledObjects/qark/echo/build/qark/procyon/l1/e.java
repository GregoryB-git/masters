// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import F0.L;
import java.util.List;
import F0.c;
import F0.s;
import F0.q;
import F0.M;
import F0.t;
import g0.z;
import F0.x;
import F0.r;

public final class e implements r
{
    public static final x d;
    public final f a;
    public final z b;
    public boolean c;
    
    static {
        d = new d();
    }
    
    public e() {
        this.a = new f();
        this.b = new z(16384);
    }
    
    @Override
    public void a(final long n, final long n2) {
        this.c = false;
        this.a.b();
    }
    
    @Override
    public void b(final t t) {
        this.a.e(t, new K.d(0, 1));
        t.j();
        t.e(new M.b(-9223372036854775807L));
    }
    
    @Override
    public boolean e(final s s) {
        final z z = new z(10);
        int n = 0;
        while (true) {
            s.n(z.e(), 0, 10);
            z.T(0);
            if (z.J() != 4801587) {
                break;
            }
            z.U(3);
            final int f = z.F();
            n += f + 10;
            s.o(f);
        }
        s.h();
        s.o(n);
        int n2 = 0;
        int n3 = n;
        while (true) {
            s.n(z.e(), 0, 7);
            z.T(0);
            final int m = z.M();
            if (m != 44096 && m != 44097) {
                s.h();
                ++n3;
                if (n3 - n >= 8192) {
                    return false;
                }
                s.o(n3);
                n2 = 0;
            }
            else {
                ++n2;
                if (n2 >= 4) {
                    return true;
                }
                final int e = F0.c.e(z.e(), m);
                if (e == -1) {
                    return false;
                }
                s.o(e - 7);
            }
        }
    }
    
    @Override
    public int i(final s s, final L l) {
        final int read = s.read(this.b.e(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.b.T(0);
        this.b.S(read);
        if (!this.c) {
            this.a.d(0L, 4);
            this.c = true;
        }
        this.a.a(this.b);
        return 0;
    }
    
    @Override
    public void release() {
    }
}
