// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K4;

import com.google.protobuf.r;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.RejectedExecutionException;
import N4.e;
import android.system.Os;
import android.system.OsConstants;
import M4.l;
import android.os.Process;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ConcurrentLinkedQueue;
import F4.a;

public class c
{
    public static final a g;
    public static final long h;
    public final ConcurrentLinkedQueue a;
    public final ScheduledExecutorService b;
    public final String c;
    public final long d;
    public ScheduledFuture e;
    public long f;
    
    static {
        g = a.e();
        h = TimeUnit.SECONDS.toMicros(1L);
    }
    
    public c() {
        this.e = null;
        this.f = -1L;
        this.a = new ConcurrentLinkedQueue();
        this.b = Executors.newSingleThreadScheduledExecutor();
        final int myPid = Process.myPid();
        final StringBuilder sb = new StringBuilder();
        sb.append("/proc/");
        sb.append(Integer.toString(myPid));
        sb.append("/stat");
        this.c = sb.toString();
        this.d = this.e();
    }
    
    public static boolean f(final long n) {
        return n <= 0L;
    }
    
    public void c(final l l) {
        this.i(l);
    }
    
    public final long d(final long n) {
        return Math.round(n / (double)this.d * K4.c.h);
    }
    
    public final long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }
    
    public final void i(final l l) {
        // monitorenter(this)
        try {
            try {
                this.b.schedule(new b(this, l), 0L, TimeUnit.MILLISECONDS);
            }
            finally {}
        }
        catch (RejectedExecutionException ex) {
            final a g = K4.c.g;
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect Cpu Metric: ");
            sb.append(ex.getMessage());
            g.j(sb.toString());
        }
        // monitorexit(this)
        return;
    }
    // monitorexit(this)
    
    public final void j(final long f, final l l) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0087: {
            Label_0084: {
                try {
                    this.f = f;
                    final c c = this;
                    final c c2 = this;
                    final ScheduledExecutorService scheduledExecutorService = c2.b;
                    final c c3 = this;
                    final l i = l;
                    final K4.a a = new K4.a(c3, i);
                    final long n = 0L;
                    final long n2 = f;
                    final TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    final ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(a, n, n2, timeUnit);
                    c.e = scheduledFuture;
                    break Label_0084;
                }
                finally {
                    break Label_0087;
                }
                try {
                    final c c = this;
                    final c c2 = this;
                    final ScheduledExecutorService scheduledExecutorService = c2.b;
                    final c c3 = this;
                    final l i = l;
                    final K4.a a = new K4.a(c3, i);
                    final long n = 0L;
                    final long n2 = f;
                    final TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    final ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(a, n, n2, timeUnit);
                    c.e = scheduledFuture;
                }
                catch (RejectedExecutionException ex) {
                    final a g = K4.c.g;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to start collecting Cpu Metrics: ");
                    sb.append(ex.getMessage());
                    g.j(sb.toString());
                }
            }
            return;
        }
    }
    // monitorexit(this)
    
    public void k(final long n, final l l) {
        final long d = this.d;
        if (d != -1L) {
            if (d == 0L) {
                return;
            }
            if (f(n)) {
                return;
            }
            if (this.e != null) {
                if (this.f != n) {
                    this.l();
                    this.j(n, l);
                }
                return;
            }
            this.j(n, l);
        }
    }
    
    public void l() {
        final ScheduledFuture e = this.e;
        if (e == null) {
            return;
        }
        e.cancel(false);
        this.e = null;
        this.f = -1L;
    }
    
    public final e m(final l l) {
        if (l == null) {
            return null;
        }
        while (true) {
            Label_0213: {
                Label_0159: {
                    BufferedReader bufferedReader;
                    try {
                        bufferedReader = new BufferedReader(new FileReader(this.c));
                        final l i = l;
                        final long n = i.b();
                        final BufferedReader bufferedReader2 = bufferedReader;
                        final String s = bufferedReader2.readLine();
                        final String s2 = " ";
                        final String[] array = s.split(s2);
                        final String[] array3;
                        final String[] array2 = array3 = array;
                        final int n2 = 13;
                        final String s3 = array3[n2];
                        final long n3 = Long.parseLong(s3);
                        final String[] array4 = array2;
                        final int n4 = 15;
                        final String s4 = array4[n4];
                        final long n5 = Long.parseLong(s4);
                        final String[] array5 = array2;
                        final int n6 = 14;
                        final String s5 = array5[n6];
                        final long n7 = Long.parseLong(s5);
                        final String[] array6 = array2;
                        final int n8 = 16;
                        final String s6 = array6[n8];
                        final long n9 = Long.parseLong(s6);
                        final e.b b = N4.e.X();
                        final long n10 = n;
                        final e.b b2 = b.D(n10);
                        final c c = this;
                        final long n11 = n7;
                        final long n12 = n9;
                        final long n13 = n11 + n12;
                        final long n14 = c.d(n13);
                        final e.b b3 = b2.E(n14);
                        final c c2 = this;
                        final long n15 = n3;
                        final long n16 = n5;
                        final long n17 = n15 + n16;
                        final long n18 = c2.d(n17);
                        final e.b b4 = b3.F(n18);
                        final r r = ((r.a)b4).v();
                        final e e = (e)r;
                        final BufferedReader bufferedReader3 = bufferedReader;
                        bufferedReader3.close();
                        return e;
                    }
                    catch (NullPointerException ex) {
                        break Label_0159;
                    }
                    catch (NumberFormatException ex2) {
                        break Label_0159;
                    }
                    catch (ArrayIndexOutOfBoundsException ex3) {
                        break Label_0159;
                    }
                    catch (IOException j) {
                        break Label_0213;
                    }
                    try {
                        final l i = l;
                        final long n = i.b();
                        final BufferedReader bufferedReader2 = bufferedReader;
                        final String s = bufferedReader2.readLine();
                        final String s2 = " ";
                        final String[] array = s.split(s2);
                        final String[] array3;
                        final String[] array2 = array3 = array;
                        final int n2 = 13;
                        final String s3 = array3[n2];
                        final long n3 = Long.parseLong(s3);
                        final String[] array4 = array2;
                        final int n4 = 15;
                        final String s4 = array4[n4];
                        final long n5 = Long.parseLong(s4);
                        final String[] array5 = array2;
                        final int n6 = 14;
                        final String s5 = array5[n6];
                        final long n7 = Long.parseLong(s5);
                        final String[] array6 = array2;
                        final int n8 = 16;
                        final String s6 = array6[n8];
                        final long n9 = Long.parseLong(s6);
                        final e.b b = N4.e.X();
                        final long n10 = n;
                        final e.b b2 = b.D(n10);
                        final c c = this;
                        final long n11 = n7;
                        final long n12 = n9;
                        final long n13 = n11 + n12;
                        final long n14 = c.d(n13);
                        final e.b b3 = b2.E(n14);
                        final c c2 = this;
                        final long n15 = n3;
                        final long n16 = n5;
                        final long n17 = n15 + n16;
                        final long n18 = c2.d(n17);
                        final e.b b4 = b3.F(n18);
                        final r r = ((r.a)b4).v();
                        final e e = (e)r;
                        final BufferedReader bufferedReader3 = bufferedReader;
                        bufferedReader3.close();
                        return e;
                    }
                    finally {
                        try {
                            bufferedReader.close();
                        }
                        finally {
                            final Throwable exception;
                            ((Throwable)l).addSuppressed(exception);
                        }
                    }
                }
                final a g = K4.c.g;
                final StringBuilder sb = new StringBuilder();
                final String str = "Unexpected '/proc/[pid]/stat' file format encountered: ";
                final l j = l;
                final a g2 = g;
                sb.append(str);
                sb.append(((Throwable)j).getMessage());
                g2.j(sb.toString());
                return null;
            }
            final a g2 = K4.c.g;
            final StringBuilder sb = new StringBuilder();
            final String str = "Unable to read 'proc/[pid]/stat' file: ";
            continue;
        }
    }
}
