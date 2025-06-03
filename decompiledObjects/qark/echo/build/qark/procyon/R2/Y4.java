// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.RemoteException;
import A2.n;
import java.util.ArrayList;
import com.google.android.gms.internal.measurement.y0;

public final class Y4 implements Runnable
{
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ W5 q;
    public final /* synthetic */ y0 r;
    public final /* synthetic */ D4 s;
    
    public Y4(final D4 s, final String o, final String p5, final W5 q, final y0 r) {
        this.s = s;
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
    }
    
    @Override
    public final void run() {
        ArrayList t0;
        ArrayList list = t0 = new ArrayList();
        while (true) {
            Label_0079: {
                try {
                    try {
                        final R1 b = D4.B(this.s);
                        if (b == null) {
                            t0 = list;
                            this.s.j().G().c("Failed to get conditional properties; not connected to service", this.o, this.p);
                            final ArrayList list2 = list;
                            this.s.k().W(this.r, list2);
                            return;
                        }
                        break Label_0079;
                    }
                    finally {}
                }
                catch (RemoteException list) {
                    final ArrayList list2;
                    t0 = list2;
                    this.s.j().G().d("Failed to get conditional properties; remote exception", this.o, this.p, list);
                    continue;
                    n.i(this.q);
                    final R1 b;
                    list = (t0 = S5.t0(b.V0(this.o, this.p, this.q)));
                    D4.m0(this.s);
                    list2 = list;
                    continue;
                }
            }
            break;
        }
        this.s.k().W(this.r, t0);
    }
}
