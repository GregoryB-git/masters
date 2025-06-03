// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import X5.g;

public final class e extends a
{
    public final Thread r;
    public final a0 s;
    
    public e(final g g, final Thread r, final a0 s) {
        super(g, true, true);
        this.r = r;
        this.s = s;
    }
    
    @Override
    public void F(final Object o) {
        if (!Intrinsics.a(Thread.currentThread(), this.r)) {
            final Thread r = this.r;
            c.a();
            LockSupport.unpark(r);
        }
    }
    
    public final Object K0() {
        c.a();
        Label_0167: {
            try {
                final a0 s = this.s;
                if (s != null) {
                    a0.N(s, false, 1, null);
                }
            }
            finally {
                break Label_0167;
            }
            while (true) {
            Label_0151_Outer:
                while (true) {
                    Label_0181: {
                        while (true) {
                            try {
                                while (!Thread.interrupted()) {
                                    final a0 s2 = this.s;
                                    if (s2 == null) {
                                        break Label_0181;
                                    }
                                    final long q = s2.Q();
                                    if (!this.f0()) {
                                        c.a();
                                        LockSupport.parkNanos(this, q);
                                    }
                                    else {
                                        final a0 s3 = this.s;
                                        if (s3 != null) {
                                            a0.I(s3, false, 1, null);
                                        }
                                        c.a();
                                        final Object h = y0.h(this.b0());
                                        Object s4 = null;
                                        if (h instanceof z) {
                                            s4 = h;
                                        }
                                        if (s4 == null) {
                                            return h;
                                        }
                                        throw ((z)s4).a;
                                    }
                                }
                                final InterruptedException ex = new InterruptedException();
                                this.I(ex);
                                throw ex;
                                while (true) {
                                    final Object s4;
                                    a0.I((a0)s4, false, 1, null);
                                    c.a();
                                    throw s4;
                                    s4 = this.s;
                                    continue Label_0151_Outer;
                                }
                            }
                            // iftrue(Label_0167:, s4 == null)
                            finally {}
                            continue;
                        }
                    }
                    final long q = Long.MAX_VALUE;
                    continue;
                }
            }
        }
    }
    
    @Override
    public boolean g0() {
        return true;
    }
}
