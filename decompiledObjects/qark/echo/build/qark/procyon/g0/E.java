// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import java.util.concurrent.TimeoutException;
import android.os.SystemClock;

public final class E
{
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d;
    
    public E(final long n) {
        this.d = new ThreadLocal();
        this.i(n);
    }
    
    public static long h(final long n) {
        return n * 1000000L / 90000L;
    }
    
    public static long k(final long n) {
        return n * 90000L / 1000000L;
    }
    
    public static long l(final long n) {
        return k(n) % 8589934592L;
    }
    
    public long a(final long c) {
        // monitorenter(this)
        if (c == -9223372036854775807L) {
            // monitorexit(this)
            return -9223372036854775807L;
        }
        while (true) {
            try {
                if (!this.g()) {
                    long n;
                    if ((n = this.a) == 9223372036854775806L) {
                        n = (long)g0.a.e(this.d.get());
                    }
                    this.b = n - c;
                    this.notifyAll();
                }
                this.c = c;
                final long b = this.b;
                // monitorexit(this)
                return c + b;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public long b(long a) {
        // monitorenter(this)
        if (a == -9223372036854775807L) {
            // monitorexit(this)
            return -9223372036854775807L;
        }
        while (true) {
            try {
                final long c = this.c;
                long n = a;
                if (c != -9223372036854775807L) {
                    final long k = k(c);
                    final long n2 = (4294967296L + k) / 8589934592L;
                    final long n3 = (n2 - 1L) * 8589934592L + a;
                    a = (n = a + n2 * 8589934592L);
                    if (Math.abs(n3 - k) < Math.abs(a - k)) {
                        n = n3;
                    }
                }
                a = this.a(h(n));
                // monitorexit(this)
                return a;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public long c(long a) {
        // monitorenter(this)
        if (a == -9223372036854775807L) {
            // monitorexit(this)
            return -9223372036854775807L;
        }
        // monitorexit(this)
        Label_0103: {
            long i;
            try {
                final long c = this.c;
                i = a;
                if (c != -9223372036854775807L) {
                    final long k = k(c);
                    i = k / 8589934592L;
                    Long.signum(i);
                    final long n = i * 8589934592L + a;
                    i = a + (i + 1L) * 8589934592L;
                    if (n >= k) {
                        i = n;
                    }
                }
            }
            finally {
                break Label_0103;
            }
            a = this.a(h(i));
            return a;
        }
    }
    // monitorexit(this)
    
    public long d() {
        synchronized (this) {
            final long a = this.a;
            if (a != Long.MAX_VALUE) {
                final long n = a;
                if (a != 9223372036854775806L) {
                    return n;
                }
            }
            return -9223372036854775807L;
        }
    }
    
    public long e() {
        // monitorenter(this)
        while (true) {
            try {
                final long c = this.c;
                long d;
                if (c != -9223372036854775807L) {
                    d = c + this.b;
                }
                else {
                    d = this.d();
                }
                // monitorexit(this)
                return d;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public long f() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public boolean g() {
        synchronized (this) {
            return this.b != -9223372036854775807L;
        }
    }
    
    public void i(long n) {
        while (true) {
            while (true) {
                synchronized (this) {
                    this.a = n;
                    if (n == Long.MAX_VALUE) {
                        n = 0L;
                        this.b = n;
                        this.c = -9223372036854775807L;
                        return;
                    }
                }
                n = -9223372036854775807L;
                continue;
            }
        }
    }
    
    public void j(final boolean b, long l, final long lng) {
        while (true) {
            // monitorenter(this)
        Label_0056_Outer:
            while (true) {
            Label_0178_Outer:
                while (true) {
                    Label_0194: {
                        while (true) {
                            try {
                                g0.a.f(this.a == 9223372036854775806L);
                                if (this.g()) {
                                    // monitorexit(this)
                                    return;
                                }
                                if (b) {
                                    this.d.set(l);
                                    Label_0175: {
                                        return;
                                    }
                                }
                                // monitorexit(this)
                                break Label_0194;
                                final boolean b2;
                                g0.a.f(b2);
                                final long elapsedRealtime = SystemClock.elapsedRealtime();
                                this.wait(l);
                                final long n = n + (SystemClock.elapsedRealtime() - elapsedRealtime);
                                // iftrue(Label_0166:, n < lng || this.g())
                                // iftrue(Label_0203:, lng != 0L)
                                // iftrue(Label_0175:, this.g())
                                // monitorexit(this)
                                Block_8: {
                                    Label_0120: {
                                        break Label_0120;
                                        while (true) {
                                            break Block_8;
                                            continue Label_0056_Outer;
                                        }
                                    }
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("TimestampAdjuster failed to initialize in ");
                                    sb.append(lng);
                                    sb.append(" milliseconds");
                                    throw new TimeoutException(sb.toString());
                                }
                                this.wait();
                                continue Label_0178_Outer;
                                Label_0166: {
                                    l = lng - n;
                                }
                                continue Label_0178_Outer;
                            }
                            finally {}
                            continue;
                        }
                    }
                    final long n = 0L;
                    l = lng;
                    continue;
                }
                Label_0203: {
                    final boolean b2 = l > 0L;
                }
                continue Label_0056_Outer;
            }
        }
    }
}
