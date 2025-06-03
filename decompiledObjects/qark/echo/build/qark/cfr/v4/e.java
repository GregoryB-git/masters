/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.concurrent.TimeUnit
 */
package v4;

import java.util.concurrent.TimeUnit;
import s4.q;

public class e {
    public static final long d = TimeUnit.HOURS.toMillis(24L);
    public static final long e = TimeUnit.MINUTES.toMillis(30L);
    public final q a = q.c();
    public long b;
    public int c;

    public static boolean c(int n8) {
        if (n8 != 429 && (n8 < 500 || n8 >= 600)) {
            return false;
        }
        return true;
    }

    public static boolean d(int n8) {
        if ((n8 < 200 || n8 >= 300) && n8 != 401 && n8 != 404) {
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    if (!e.c(n8)) {
                        return d;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                double d8 = Math.min((double)(Math.pow((double)2.0, (double)this.c) + (double)this.a.e()), (double)e);
                return (long)d8;
            }
            throw throwable2;
        }
    }

    public boolean b() {
        synchronized (this) {
            Throwable throwable2;
            block5 : {
                boolean bl;
                block4 : {
                    block3 : {
                        try {
                            long l8;
                            long l9;
                            if (this.c == 0 || (l9 = this.a.a()) > (l8 = this.b)) break block3;
                            bl = false;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    bl = true;
                }
                return bl;
            }
            throw throwable2;
        }
    }

    public final void e() {
        synchronized (this) {
            this.c = 0;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    if (e.d(n8)) {
                        this.e();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                ++this.c;
                long l8 = this.a(n8);
                this.b = this.a.a() + l8;
                return;
            }
            throw throwable2;
        }
    }
}

