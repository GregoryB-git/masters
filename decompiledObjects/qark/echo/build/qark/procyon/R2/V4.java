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

public final class V4 implements Runnable
{
    public final /* synthetic */ AtomicReference o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ W5 s;
    public final /* synthetic */ D4 t;
    
    public V4(final D4 t, final AtomicReference o, final String p6, final String q, final String r, final W5 s) {
        this.t = t;
        this.o = o;
        this.p = p6;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    @Override
    public final void run() {
        final AtomicReference o = this.o;
        // monitorenter(o)
        try {
            try {
                Label_0081: {
                    if (D4.B(this.t) != null) {
                        break Label_0081;
                    }
                    this.t.j().G().d("(legacy) Failed to get conditional properties; not connected to service", Y1.v(this.p), this.q, this.r);
                    this.o.set(Collections.emptyList());
                    try {
                        this.o.notify();
                    }
                    // monitorexit(o)
                    finally {
                        // monitorexit(o)
                        // monitorexit(o)
                        // iftrue(Label_0131:, !TextUtils.isEmpty((CharSequence)this.p))
                        while (true) {
                            AtomicReference atomicReference2 = null;
                        Label_0170:
                            while (true) {
                                AtomicReference atomicReference = null;
                                List newValue = null;
                                atomicReference.set(newValue);
                                D4.m0(this.t);
                                atomicReference2 = this.o;
                                break Label_0170;
                                n.i(this.s);
                                atomicReference = this.o;
                                final R1 r1;
                                newValue = r1.V0(this.q, this.r, this.s);
                                continue;
                                this.o.notify();
                                Label_0131: {
                                    atomicReference = this.o;
                                }
                                newValue = r1.K0(this.p, this.q, this.r);
                                continue;
                            }
                            atomicReference2.notify();
                            return;
                            continue;
                        }
                        final RemoteException ex;
                        this.t.j().G().d("(legacy) Failed to get conditional properties; remote exception", Y1.v(this.p), this.q, ex);
                        this.o.set(Collections.emptyList());
                        AtomicReference atomicReference2 = this.o;
                    }
                }
            }
            finally {}
        }
        catch (RemoteException ex2) {}
    }
}
