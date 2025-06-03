/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  android.system.Os
 *  android.system.OsConstants
 *  java.io.BufferedReader
 *  java.io.FileReader
 *  java.io.IOException
 *  java.io.Reader
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.Executors
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package K4;

import K4.a;
import K4.b;
import M4.l;
import N4.e;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.protobuf.r;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class c {
    public static final F4.a g = F4.a.e();
    public static final long h = TimeUnit.SECONDS.toMicros(1L);
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public final String c;
    public final long d;
    public ScheduledFuture e = null;
    public long f = -1L;

    public c() {
        int n8 = Process.myPid();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/proc/");
        stringBuilder.append(Integer.toString((int)n8));
        stringBuilder.append("/stat");
        this.c = stringBuilder.toString();
        this.d = this.e();
    }

    public static /* synthetic */ void a(c c8, l l8) {
        c8.h(l8);
    }

    public static /* synthetic */ void b(c c8, l l8) {
        c8.g(l8);
    }

    public static boolean f(long l8) {
        if (l8 <= 0L) {
            return true;
        }
        return false;
    }

    public void c(l l8) {
        this.i(l8);
    }

    public final long d(long l8) {
        return Math.round((double)((double)l8 / (double)this.d * (double)h));
    }

    public final long e() {
        return Os.sysconf((int)OsConstants._SC_CLK_TCK);
    }

    public final /* synthetic */ void g(l object) {
        if ((object = this.m((l)object)) != null) {
            this.a.add(object);
        }
    }

    public final /* synthetic */ void h(l object) {
        if ((object = this.m((l)object)) != null) {
            this.a.add(object);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void i(l l8) {
        // MONITORENTER : this
        this.b.schedule((Runnable)new b(this, l8), 0L, TimeUnit.MILLISECONDS);
        return;
        catch (RejectedExecutionException rejectedExecutionException) {
            F4.a a8 = g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to collect Cpu Metric: ");
            stringBuilder.append(rejectedExecutionException.getMessage());
            a8.j(stringBuilder.toString());
        }
        // MONITOREXIT : this
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void j(long l8, l l9) {
        // MONITORENTER : this
        this.f = l8;
        this.e = this.b.scheduleAtFixedRate((Runnable)new a(this, l9), 0L, l8, TimeUnit.MILLISECONDS);
        return;
        catch (RejectedExecutionException rejectedExecutionException) {
            F4.a a8 = g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to start collecting Cpu Metrics: ");
            stringBuilder.append(rejectedExecutionException.getMessage());
            a8.j(stringBuilder.toString());
        }
        // MONITOREXIT : this
    }

    public void k(long l8, l l9) {
        long l10 = this.d;
        if (l10 != -1L) {
            if (l10 == 0L) {
                return;
            }
            if (c.f(l8)) {
                return;
            }
            if (this.e != null) {
                if (this.f != l8) {
                    this.l();
                    this.j(l8, l9);
                }
                return;
            }
            this.j(l8, l9);
        }
    }

    public void l() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.e = null;
        this.f = -1L;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final e m(l object) {
        String[] arrstring;
        BufferedReader bufferedReader;
        String string2;
        block14 : {
            block13 : {
                if (object == null) {
                    return null;
                }
                bufferedReader = new BufferedReader((Reader)new FileReader(this.c));
                long l8 = object.b();
                object = bufferedReader.readLine().split(" ");
                long l9 = Long.parseLong((String)object[13]);
                long l10 = Long.parseLong((String)object[15]);
                long l11 = Long.parseLong((String)object[14]);
                long l12 = Long.parseLong((String)object[16]);
                object = (e)e.X().D(l8).E(this.d(l11 + l12)).F(this.d(l9 + l10)).v();
                bufferedReader.close();
                return object;
                catch (Throwable throwable) {
                    try {
                        bufferedReader.close();
                        throw throwable;
                    }
                    catch (Throwable throwable2) {
                        try {
                            throwable.addSuppressed(throwable2);
                            throw throwable;
                        }
                        catch (NullPointerException nullPointerException) {
                        }
                        catch (NumberFormatException numberFormatException) {
                        }
                        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        }
                        catch (IOException iOException) {
                            break block13;
                        }
                    }
                }
                F4.a a8 = g;
                bufferedReader = new StringBuilder();
                string2 = "Unexpected '/proc/[pid]/stat' file format encountered: ";
                arrstring = object;
                object = a8;
                break block14;
            }
            object = g;
            bufferedReader = new StringBuilder();
            string2 = "Unable to read 'proc/[pid]/stat' file: ";
        }
        bufferedReader.append(string2);
        bufferedReader.append(arrstring.getMessage());
        object.j(bufferedReader.toString());
        return null;
    }
}

