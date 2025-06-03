// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;
import java.lang.ref.WeakReference;

public final class c extends Thread
{
    public final WeakReference o;
    public final long p;
    public final CountDownLatch q;
    public boolean r;
    
    public c(final a referent, final long p2) {
        this.o = new WeakReference((T)referent);
        this.p = p2;
        this.q = new CountDownLatch(1);
        this.r = false;
        this.start();
    }
    
    public final void a() {
        final a a = (a)this.o.get();
        if (a != null) {
            a.c();
            this.r = true;
        }
    }
    
    @Override
    public final void run() {
        while (true) {
            try {
                if (!this.q.await(this.p, TimeUnit.MILLISECONDS)) {
                    this.a();
                }
                return;
                this.a();
            }
            catch (InterruptedException ex) {
                continue;
            }
            break;
        }
    }
}
