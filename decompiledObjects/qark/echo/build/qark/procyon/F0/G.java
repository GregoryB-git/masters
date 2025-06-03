// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import java.io.EOFException;
import d0.x;
import T0.h;
import g0.z;

public final class G
{
    public final z a;
    
    public G() {
        this.a = new z(10);
    }
    
    public x a(final s s, final h.a a) {
        Object e = null;
        int n = 0;
        while (true) {
            try {
                while (true) {
                    s.n(this.a.e(), 0, 10);
                    this.a.T(0);
                    if (this.a.J() != 4801587) {
                        break;
                    }
                    this.a.U(3);
                    final int f = this.a.F();
                    final int n2 = f + 10;
                    if (e == null) {
                        e = new byte[n2];
                        System.arraycopy(this.a.e(), 0, e, 0, 10);
                        s.n((byte[])e, 10, f);
                        e = new h(a).e((byte[])e, n2);
                    }
                    else {
                        s.o(f);
                    }
                    n += n2;
                }
                s.h();
                s.o(n);
                return (x)e;
            }
            catch (EOFException ex) {
                continue;
            }
            break;
        }
    }
}
