/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Random
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package U3;

import c4.c;
import c4.d;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class a {
    public final ScheduledExecutorService a;
    public final c b;
    public final long c;
    public final long d;
    public final double e;
    public final double f;
    public final Random g = new Random();
    public ScheduledFuture h;
    public long i;
    public boolean j = true;

    public a(ScheduledExecutorService scheduledExecutorService, c c8, long l8, long l9, double d8, double d9) {
        this.a = scheduledExecutorService;
        this.b = c8;
        this.c = l8;
        this.d = l9;
        this.f = d8;
        this.e = d9;
    }

    public /* synthetic */ a(ScheduledExecutorService scheduledExecutorService, c c8, long l8, long l9, double d8, double d9,  a8) {
        this(scheduledExecutorService, c8, l8, l9, d8, d9);
    }

    public void b() {
        if (this.h != null) {
            this.b.b("Cancelling existing retry attempt", new Object[0]);
            this.h.cancel(false);
            this.h = null;
        } else {
            this.b.b("No existing retry attempt to cancel", new Object[0]);
        }
        this.i = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void c(final Runnable runnable) {
        runnable = new Runnable(){

            public void run() {
                a.this.h = null;
                runnable.run();
            }
        };
        if (this.h != null) {
            this.b.b("Cancelling previous scheduled retry", new Object[0]);
            this.h.cancel(false);
            this.h = null;
        }
        boolean bl = this.j;
        long l8 = 0L;
        if (!bl) {
            l8 = this.i;
            l8 = l8 == 0L ? this.c : Math.min((long)((long)((double)l8 * this.f)), (long)this.d);
            this.i = l8;
            double d8 = this.e;
            l8 = this.i;
            l8 = (long)((1.0 - d8) * (double)l8 + d8 * (double)l8 * this.g.nextDouble());
        }
        this.j = false;
        this.b.b("Scheduling retry in %dms", l8);
        this.h = this.a.schedule(runnable, l8, TimeUnit.MILLISECONDS);
    }

    public void d() {
        this.i = this.d;
    }

    public void e() {
        this.j = true;
        this.i = 0L;
    }

    public static class b {
        public final ScheduledExecutorService a;
        public long b = 1000L;
        public double c = 0.5;
        public long d = 30000L;
        public double e = 1.3;
        public final c f;

        public b(ScheduledExecutorService scheduledExecutorService, d d8, String string2) {
            this.a = scheduledExecutorService;
            this.f = new c(d8, string2);
        }

        public a a() {
            return new a(this.a, this.f, this.b, this.d, this.e, this.c, null);
        }

        public b b(double d8) {
            if (d8 >= 0.0 && d8 <= 1.0) {
                this.c = d8;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Argument out of range: ");
            stringBuilder.append(d8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public b c(long l8) {
            this.d = l8;
            return this;
        }

        public b d(long l8) {
            this.b = l8;
            return this;
        }

        public b e(double d8) {
            this.e = d8;
            return this;
        }
    }

}

