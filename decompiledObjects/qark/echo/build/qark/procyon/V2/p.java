// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;

public final class p implements q
{
    public final CountDownLatch a = new CountDownLatch(1);
    
    @Override
    public final void a(final Object o) {
        this.a.countDown();
    }
    
    @Override
    public final void b() {
        this.a.countDown();
    }
    
    public final void c() {
        this.a.await();
    }
    
    @Override
    public final void d(final Exception ex) {
        this.a.countDown();
    }
    
    public final boolean e(final long timeout, final TimeUnit unit) {
        return this.a.await(timeout, unit);
    }
}
