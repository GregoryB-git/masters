// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.Process;
import A2.n;
import java.util.concurrent.BlockingQueue;

public final class K2 extends Thread
{
    public final Object o;
    public final BlockingQueue p;
    public boolean q;
    public final /* synthetic */ G2 r;
    
    public K2(final G2 r, final String name, final BlockingQueue p3) {
        this.r = r;
        this.q = false;
        n.i(name);
        n.i(p3);
        this.o = new Object();
        this.p = p3;
        this.setName(name);
    }
    
    public final void a() {
        synchronized (this.o) {
            this.o.notifyAll();
        }
    }
    
    public final void b(final InterruptedException ex) {
        final a2 l = this.r.j().L();
        final String name = this.getName();
        final StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" was interrupted");
        l.b(sb.toString(), ex);
    }
    
    public final void c() {
        final Object e = G2.E(this.r);
        // monitorenter(e)
        while (true) {
            try {
                if (!this.q) {
                    G2.H(this.r).release();
                    G2.E(this.r).notifyAll();
                    if (this == G2.A(this.r)) {
                        G2.C(this.r, (K2)null);
                    }
                    else if (this == G2.u(this.r)) {
                        G2.x(this.r, (K2)null);
                    }
                    else {
                        this.r.j().G().a("Current scheduler thread is neither worker nor network");
                    }
                    this.q = true;
                }
                // monitorexit(e)
                return;
                // monitorexit(e)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final void run() {
        int i = 0;
        while (i == 0) {
            try {
                G2.H(this.r).acquire();
                i = 1;
            }
            catch (InterruptedException ex) {
                this.b(ex);
            }
        }
    Label_0204_Outer:
        while (true) {
            while (true) {
                try {
                    final int threadPriority = Process.getThreadPriority(Process.myTid());
                Label_0142_Outer:
                    while (true) {
                        final L2 l2 = (L2)this.p.poll();
                        if (l2 == null) {
                            final Object o = this.o;
                            // monitorenter(o)
                            while (true) {
                                try {
                                    if (this.p.peek() == null && !G2.I(this.r)) {
                                        final K2 k2 = this;
                                        final Object o2 = k2.o;
                                        final long n = 30000L;
                                        o2.wait(n);
                                    }
                                    break Label_0142;
                                }
                                finally {
                                    // monitorexit(o)
                                    // monitorexit(o)
                                    final Object e = G2.E(this.r);
                                    // monitorenter(e)
                                    Label_0186: {
                                        try {
                                            if (this.p.peek() == null) {
                                                this.c();
                                                // monitorexit(e)
                                                this.c();
                                                return;
                                            }
                                            break Label_0186;
                                        }
                                        finally {
                                            // monitorexit(e)
                                            // monitorexit(e)
                                            continue Label_0142_Outer;
                                        }
                                    }
                                }
                                try {
                                    final K2 k2 = this;
                                    final Object o2 = k2.o;
                                    final long n = 30000L;
                                    o2.wait(n);
                                    continue Label_0204_Outer;
                                }
                                catch (InterruptedException ex2) {}
                                break;
                            }
                            break;
                        }
                        int threadPriority2;
                        if (l2.p) {
                            threadPriority2 = threadPriority;
                        }
                        else {
                            threadPriority2 = 10;
                        }
                        Process.setThreadPriority(threadPriority2);
                        l2.run();
                    }
                    this.c();
                }
                finally {}
                continue;
            }
        }
    }
}
