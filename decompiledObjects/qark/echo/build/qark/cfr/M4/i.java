/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.util.concurrent.TimeUnit
 */
package M4;

import java.util.concurrent.TimeUnit;

public class i {
    public long a;
    public long b;
    public TimeUnit c;

    public i(long l8, long l9, TimeUnit timeUnit) {
        this.a = l8;
        this.b = l9;
        this.c = timeUnit;
    }

    public double a() {
        int n8 = .a[this.c.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return (double)this.a / (double)this.c.toSeconds(this.b);
                }
                return (double)this.a / (double)this.b * (double)TimeUnit.SECONDS.toMillis(1L);
            }
            return (double)this.a / (double)this.b * (double)TimeUnit.SECONDS.toMicros(1L);
        }
        return (double)this.a / (double)this.b * (double)TimeUnit.SECONDS.toNanos(1L);
    }

}

