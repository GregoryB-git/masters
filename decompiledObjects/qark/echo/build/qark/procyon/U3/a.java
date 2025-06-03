// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package U3;

import c4.d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.Random;
import c4.c;
import java.util.concurrent.ScheduledExecutorService;

public class a
{
    public final ScheduledExecutorService a;
    public final c b;
    public final long c;
    public final long d;
    public final double e;
    public final double f;
    public final Random g;
    public ScheduledFuture h;
    public long i;
    public boolean j;
    
    public a(final ScheduledExecutorService a, final c b, final long c, final long d, final double f, final double e) {
        this.g = new Random();
        this.j = true;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.e = e;
    }
    
    public static /* synthetic */ ScheduledFuture a(final a a, final ScheduledFuture h) {
        return a.h = h;
    }
    
    public void b() {
        if (this.h != null) {
            this.b.b("Cancelling existing retry attempt", new Object[0]);
            this.h.cancel(false);
            this.h = null;
        }
        else {
            this.b.b("No existing retry attempt to cancel", new Object[0]);
        }
        this.i = 0L;
    }
    
    public void c(final Runnable runnable) {
        final Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                U3.a.a(U3.a.this, null);
                runnable.run();
            }
        };
        if (this.h != null) {
            this.b.b("Cancelling previous scheduled retry", new Object[0]);
            this.h.cancel(false);
            this.h = null;
        }
        final boolean j = this.j;
        long l = 0L;
        if (!j) {
            final long i = this.i;
            long k;
            if (i == 0L) {
                k = this.c;
            }
            else {
                k = Math.min((long)(i * this.f), this.d);
            }
            this.i = k;
            final double e = this.e;
            final long m = this.i;
            l = (long)((1.0 - e) * m + e * m * this.g.nextDouble());
        }
        this.j = false;
        this.b.b("Scheduling retry in %dms", l);
        this.h = this.a.schedule(runnable2, l, TimeUnit.MILLISECONDS);
    }
    
    public void d() {
        this.i = this.d;
    }
    
    public void e() {
        this.j = true;
        this.i = 0L;
    }
    
    public static class b
    {
        public final ScheduledExecutorService a;
        public long b;
        public double c;
        public long d;
        public double e;
        public final c f;
        
        public b(final ScheduledExecutorService a, final d d, final String s) {
            this.b = 1000L;
            this.c = 0.5;
            this.d = 30000L;
            this.e = 1.3;
            this.a = a;
            this.f = new c(d, s);
        }
        
        public a a() {
            return new a(this.a, this.f, this.b, this.d, this.e, this.c, null);
        }
        
        public b b(final double n) {
            if (n >= 0.0 && n <= 1.0) {
                this.c = n;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Argument out of range: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        
        public b c(final long d) {
            this.d = d;
            return this;
        }
        
        public b d(final long b) {
            this.b = b;
            return this;
        }
        
        public b e(final double e) {
            this.e = e;
            return this;
        }
    }
}
