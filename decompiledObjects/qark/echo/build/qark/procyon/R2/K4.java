// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.RemoteException;
import A2.n;
import com.google.android.gms.internal.measurement.y0;

public final class K4 implements Runnable
{
    public final /* synthetic */ W5 o;
    public final /* synthetic */ y0 p;
    public final /* synthetic */ D4 q;
    
    public K4(final D4 q, final W5 o, final y0 p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        final String s = null;
        String g = null;
        String s2 = s;
    Block_7_Outer:
        while (true) {
            Label_0114: {
                try {
                    try {
                        if (!this.q.i().J().y()) {
                            s2 = s;
                            this.q.j().M().a("Analytics storage consent denied; will not get app instance id");
                            s2 = s;
                            this.q.r().T(null);
                            s2 = s;
                            this.q.i().g.b(null);
                            final String s3 = g;
                            this.q.k().V(this.p, s3);
                            return;
                        }
                        break Label_0114;
                    }
                    finally {}
                }
                catch (RemoteException g) {
                    String s3 = null;
                    s2 = s3;
                    this.q.j().G().b("Failed to get app instance id", g);
                    continue Block_7_Outer;
                    // iftrue(Label_0229:, g == null)
                    while (true) {
                        this.q.r().T(g);
                        this.q.i().g.b(g);
                        Label_0229: {
                            s2 = g;
                        }
                        D4.m0(this.q);
                        s3 = g;
                        continue Block_7_Outer;
                        Label_0160:
                        n.i(this.o);
                        final R1 b;
                        g = b.G(this.o);
                        continue;
                    }
                    final R1 b = D4.B(this.q);
                    // iftrue(Label_0160:, b != null)
                    s2 = s;
                    this.q.j().G().a("Failed to get app instance id");
                    s3 = g;
                    continue Block_7_Outer;
                }
            }
            break;
        }
        this.q.k().V(this.p, s2);
    }
}
