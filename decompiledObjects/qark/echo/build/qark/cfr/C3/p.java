/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.concurrent.Delayed
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package C3;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u.a;

public class p
extends a
implements ScheduledFuture {
    public final ScheduledFuture v;

    public p(c c8) {
        this.v = c8.a(new b(){

            @Override
            public void a(Throwable throwable) {
                p.this.C(throwable);
            }

            @Override
            public void set(Object object) {
                p.this.z(object);
            }
        });
    }

    public int K(Delayed delayed) {
        return this.v.compareTo((Object)delayed);
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.v.getDelay(timeUnit);
    }

    @Override
    public void h() {
        this.v.cancel(this.F());
    }

    public static interface b {
        public void a(Throwable var1);

        public void set(Object var1);
    }

    public static interface c {
        public ScheduledFuture a(b var1);
    }

}

