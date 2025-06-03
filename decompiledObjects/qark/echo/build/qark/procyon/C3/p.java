// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import u.a;

public class p extends a implements ScheduledFuture
{
    public final ScheduledFuture v;
    
    public p(final c c) {
        this.v = c.a(new b() {
            @Override
            public void a(final Throwable t) {
                u.a.this.C(t);
            }
            
            @Override
            public void set(final Object o) {
                u.a.this.z(o);
            }
        });
    }
    
    public int K(final Delayed delayed) {
        return this.v.compareTo(delayed);
    }
    
    @Override
    public long getDelay(final TimeUnit timeUnit) {
        return this.v.getDelay(timeUnit);
    }
    
    @Override
    public void h() {
        this.v.cancel(this.F());
    }
    
    public interface b
    {
        void a(final Throwable p0);
        
        void set(final Object p0);
    }
    
    public interface c
    {
        ScheduledFuture a(final b p0);
    }
}
