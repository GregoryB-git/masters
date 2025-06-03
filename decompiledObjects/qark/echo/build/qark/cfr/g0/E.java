/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.util.concurrent.TimeoutException
 */
package g0;

import android.os.SystemClock;
import g0.a;
import java.util.concurrent.TimeoutException;

public final class E {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public E(long l8) {
        this.i(l8);
    }

    public static long h(long l8) {
        return l8 * 1000000L / 90000L;
    }

    public static long k(long l8) {
        return l8 * 90000L / 1000000L;
    }

    public static long l(long l8) {
        return E.k(l8) % 0x200000000L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long a(long l8) {
        synchronized (this) {
            long l9;
            if (l8 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            try {
                if (!this.g()) {
                    long l10;
                    l9 = l10 = this.a;
                    if (l10 == 9223372036854775806L) {
                        l9 = (Long)a.e((Object)((Long)this.d.get()));
                    }
                    this.b = l9 - l8;
                    this.notifyAll();
                }
                this.c = l8;
                l9 = this.b;
            }
            catch (Throwable throwable) {}
            return l8 + l9;
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long b(long l8) {
        synchronized (this) {
            long l9;
            long l10;
            long l11;
            if (l8 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            try {
                l10 = this.c;
                l9 = l8;
                if (l10 == -9223372036854775807L) return this.a(E.h(l9));
                l11 = E.k(l10);
                l9 = (0x100000000L + l11) / 0x200000000L;
            }
            catch (Throwable throwable) {}
            l10 = (l9 - 1L) * 0x200000000L + l8;
            l9 = l8 += l9 * 0x200000000L;
            if (Math.abs((long)(l10 - l11)) >= Math.abs((long)(l8 - l11))) return this.a(E.h(l9));
            l9 = l10;
            return this.a(E.h(l9));
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long c(long l8) {
        synchronized (this) {
            long l9;
            Throwable throwable2;
            block6 : {
                long l10;
                long l11;
                if (l8 == -9223372036854775807L) {
                    return -9223372036854775807L;
                }
                try {
                    l10 = this.c;
                    l9 = l8;
                    if (l10 == -9223372036854775807L) break block6;
                    l11 = E.k(l10);
                    l9 = l11 / 0x200000000L;
                }
                catch (Throwable throwable2) {}
                Long.signum((long)l9);
                l10 = l9 * 0x200000000L + l8;
                l9 = l8 + (l9 + 1L) * 0x200000000L;
                if (l10 >= l11) {
                    l9 = l10;
                }
            }
            return this.a(E.h(l9));
            throw throwable2;
        }
    }

    public long d() {
        synchronized (this) {
            long l8;
            block4 : {
                long l9 = this.a;
                if (l9 != Long.MAX_VALUE) {
                    l8 = l9;
                    if (l9 != 9223372036854775806L) break block4;
                }
                l8 = -9223372036854775807L;
            }
            return l8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long e() {
        synchronized (this) {
            try {
                long l8 = this.c;
                if (l8 == -9223372036854775807L) return this.d();
                l8 += this.b;
                return l8;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public long f() {
        synchronized (this) {
            long l8 = this.b;
            return l8;
        }
    }

    public boolean g() {
        synchronized (this) {
            long l8 = this.b;
            boolean bl = l8 != -9223372036854775807L;
            return bl;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void i(long l8) {
        synchronized (this) {
            this.a = l8;
            l8 = l8 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.b = l8;
            this.c = -9223372036854775807L;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j(boolean bl, long l8, long l9) {
        synchronized (this) {
            block9 : {
                block10 : {
                    Throwable throwable2;
                    block8 : {
                        try {
                            boolean bl2 = this.a == 9223372036854775806L;
                            a.f(bl2);
                            bl2 = this.g();
                            if (!bl2) break block8;
                        }
                        catch (Throwable throwable2) {}
                        return;
                    }
                    if (bl) {
                        this.d.set((Object)l8);
                        break block9;
                    }
                    break block10;
                    throw throwable2;
                }
                long l10 = 0L;
                l8 = l9;
                while (!this.g()) {
                    if (l9 == 0L) {
                        this.wait();
                        continue;
                    }
                    bl = l8 > 0L;
                    a.f(bl);
                    long l11 = SystemClock.elapsedRealtime();
                    this.wait(l8);
                    if ((l10 += SystemClock.elapsedRealtime() - l11) >= l9 && !this.g()) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("TimestampAdjuster failed to initialize in ");
                        stringBuilder.append(l9);
                        stringBuilder.append(" milliseconds");
                        throw new TimeoutException(stringBuilder.toString());
                    }
                    l8 = l9 - l10;
                }
            }
            return;
        }
    }
}

