// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M4;

import java.util.concurrent.TimeUnit;

public class i
{
    public long a;
    public long b;
    public TimeUnit c;
    
    public i(final long a, final long b, final TimeUnit c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double a() {
        final int n = i$a.a[this.c.ordinal()];
        if (n == 1) {
            return this.a / (double)this.b * TimeUnit.SECONDS.toNanos(1L);
        }
        if (n == 2) {
            return this.a / (double)this.b * TimeUnit.SECONDS.toMicros(1L);
        }
        if (n != 3) {
            return this.a / (double)this.c.toSeconds(this.b);
        }
        return this.a / (double)this.b * TimeUnit.SECONDS.toMillis(1L);
    }
}
