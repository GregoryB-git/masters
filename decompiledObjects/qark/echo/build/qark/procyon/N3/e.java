// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N3;

import java.util.Locale;
import c2.h;
import c2.c;
import android.database.SQLException;
import f2.l;
import H3.c0;
import java.util.concurrent.CountDownLatch;
import H3.v;
import V2.k;
import O3.d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ArrayBlockingQueue;
import android.os.SystemClock;
import H3.H;
import c2.f;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;

public final class e
{
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final BlockingQueue f;
    public final ThreadPoolExecutor g;
    public final f h;
    public final H i;
    public int j;
    public long k;
    
    public e(final double a, final double b, final long c, final f h, final H i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.i = i;
        this.d = SystemClock.elapsedRealtime();
        final int n = (int)a;
        this.e = n;
        final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<Runnable>(n);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>)arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }
    
    public e(final f f, final d d, final H h) {
        this(d.f, d.g, d.h * 1000L, f, h);
    }
    
    public static /* synthetic */ H d(final e e) {
        return e.i;
    }
    
    public static void q(final double n) {
        final long n2 = (long)n;
        try {
            Thread.sleep(n2);
        }
        catch (InterruptedException ex) {}
    }
    
    public final double g() {
        return Math.min(3600000.0, 60000.0 / this.a * Math.pow(this.b, this.h()));
    }
    
    public final int h() {
        if (this.k == 0L) {
            this.k = this.o();
        }
        final int n = (int)((this.o() - this.k) / this.c);
        int j;
        if (this.l()) {
            j = Math.min(100, this.j + n);
        }
        else {
            j = Math.max(0, this.j - n);
        }
        if (this.j != j) {
            this.j = j;
            this.k = this.o();
        }
        return j;
    }
    
    public k i(final v v, final boolean b) {
        final BlockingQueue f = this.f;
        // monitorenter(f)
        while (true) {
            try {
                final k k = new k();
                if (!b) {
                    this.p(v, k);
                    // monitorexit(f)
                    return k;
                }
                this.i.d();
                if (this.k()) {
                    final E3.f f2 = E3.f.f();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Enqueueing report: ");
                    sb.append(v.d());
                    f2.b(sb.toString());
                    final E3.f f3 = E3.f.f();
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Queue size: ");
                    sb2.append(this.f.size());
                    f3.b(sb2.toString());
                    this.g.execute(new b(v, k, null));
                    final E3.f f4 = E3.f.f();
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Closing task for report: ");
                    sb3.append(v.d());
                    f4.b(sb3.toString());
                    k.e(v);
                    // monitorexit(f)
                    return k;
                }
                this.h();
                final E3.f f5 = E3.f.f();
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("Dropping report due to queue being full: ");
                sb4.append(v.d());
                f5.b(sb4.toString());
                this.i.c();
                k.e(v);
                // monitorexit(f)
                return k;
                // monitorexit(f)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new N3.d(this, countDownLatch)).start();
        c0.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }
    
    public final boolean k() {
        return this.f.size() < this.e;
    }
    
    public final boolean l() {
        return this.f.size() == this.e;
    }
    
    public final long o() {
        return System.currentTimeMillis();
    }
    
    public final void p(final v v, final k k) {
        final E3.f f = E3.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Sending report through Google DataTransport: ");
        sb.append(v.d());
        f.b(sb.toString());
        this.h.a(c2.c.e(v.b()), new N3.c(this, k, SystemClock.elapsedRealtime() - this.d < 2000L, v));
    }
    
    public final class b implements Runnable
    {
        public final v o;
        public final k p;
        
        public b(final v o, final k p3) {
            this.o = o;
            this.p = p3;
        }
        
        @Override
        public void run() {
            N3.e.this.p(this.o, this.p);
            N3.e.d(N3.e.this).e();
            final double e = N3.e.this.g();
            final E3.f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Delay for: ");
            sb.append(String.format(Locale.US, "%.2f", e / 1000.0));
            sb.append(" s for report: ");
            sb.append(this.o.d());
            f.b(sb.toString());
            q(e);
        }
    }
}
