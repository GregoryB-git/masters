// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.List;
import android.os.RemoteException;
import android.text.TextUtils;
import A2.n;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public final class X4 implements Runnable
{
    public final /* synthetic */ AtomicReference o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ W5 s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ D4 u;
    
    public X4(final D4 u, final AtomicReference o, final String p7, final String q, final String r, final W5 s, final boolean t) {
        this.u = u;
        this.o = o;
        this.p = p7;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
    }
    
    @Override
    public final void run() {
        final AtomicReference o = this.o;
        // monitorenter(o)
        try {
            try {
                Label_0081: {
                    if (D4.B(this.u) != null) {
                        break Label_0081;
                    }
                    this.u.j().G().d("(legacy) Failed to get user properties; not connected to service", Y1.v(this.p), this.q, this.r);
                    this.o.set(Collections.emptyList());
                    try {
                        this.o.notify();
                    }
                    // monitorexit(o)
                    finally {
                        // monitorexit(o)
                        // iftrue(Label_0135:, !TextUtils.isEmpty((CharSequence)this.p))
                        // monitorexit(o)
                    Label_0127:
                        while (true) {
                            AtomicReference atomicReference;
                            List newValue;
                            while (true) {
                                n.i(this.s);
                                atomicReference = this.o;
                                final R1 r1;
                                newValue = r1.x0(this.q, this.r, this.t, this.s);
                                break Label_0127;
                                continue;
                            }
                            atomicReference.set(newValue);
                            D4.m0(this.u);
                            final AtomicReference atomicReference2 = this.o;
                            Label_0178: {
                                break Label_0178;
                                this.o.notify();
                            }
                            atomicReference2.notify();
                            return;
                            Label_0135: {
                                atomicReference = this.o;
                            }
                            final R1 r1;
                            newValue = r1.W(this.p, this.q, this.r, this.t);
                            continue Label_0127;
                        }
                        final RemoteException ex;
                        this.u.j().G().d("(legacy) Failed to get user properties; remote exception", Y1.v(this.p), this.q, ex);
                        this.o.set(Collections.emptyList());
                        final AtomicReference atomicReference2 = this.o;
                    }
                }
            }
            finally {}
        }
        catch (RemoteException ex2) {}
    }
}
