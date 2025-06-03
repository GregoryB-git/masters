/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Error
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.concurrent.ExecutorService
 */
package B0;

import B0.o;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import g0.F;
import g0.M;
import g0.a;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class n
implements o {
    public static final c d = n.h(false, -9223372036854775807L);
    public static final c e = n.h(true, -9223372036854775807L);
    public static final c f = new c(2, -9223372036854775807L, null);
    public static final c g = new c(3, -9223372036854775807L, null);
    public final ExecutorService a;
    public d b;
    public IOException c;

    public n(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExoPlayer:Loader:");
        stringBuilder.append(string2);
        this.a = M.K0(stringBuilder.toString());
    }

    public static c h(boolean bl, long l8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    @Override
    public void a() {
        this.k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d)((Object)a.h((Object)this.b))).a(false);
    }

    public void g() {
        this.c = null;
    }

    public boolean i() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public void k(int n8) {
        Object object = this.c;
        if (object == null) {
            object = this.b;
            if (object != null) {
                int n9 = n8;
                if (n8 == Integer.MIN_VALUE) {
                    n9 = object.o;
                }
                object.e(n9);
            }
            return;
        }
        throw object;
    }

    public void l() {
        this.m(null);
    }

    public void m(f f8) {
        d d8 = this.b;
        if (d8 != null) {
            d8.a(true);
        }
        if (f8 != null) {
            this.a.execute((Runnable)new g(f8));
        }
        this.a.shutdown();
    }

    public long n(e e8, b b8, int n8) {
        Looper looper = (Looper)a.h((Object)Looper.myLooper());
        this.c = null;
        long l8 = SystemClock.elapsedRealtime();
        new d(looper, e8, b8, n8, l8).f(0L);
        return l8;
    }

    public static interface b {
        public void o(e var1, long var2, long var4);

        public c r(e var1, long var2, long var4, IOException var6, int var7);

        public void t(e var1, long var2, long var4, boolean var6);
    }

    public static final class c {
        public final int a;
        public final long b;

        public c(int n8, long l8) {
            this.a = n8;
            this.b = l8;
        }

        public /* synthetic */ c(int n8, long l8,  a8) {
            this(n8, l8);
        }

        public boolean c() {
            int n8 = this.a;
            boolean bl = true;
            if (n8 != 0) {
                if (n8 == 1) {
                    return true;
                }
                bl = false;
            }
            return bl;
        }
    }

    public final class d
    extends Handler
    implements Runnable {
        public final int o;
        public final e p;
        public final long q;
        public b r;
        public IOException s;
        public int t;
        public Thread u;
        public boolean v;
        public volatile boolean w;

        public d(Looper looper, e e8, b b8, int n9, long l8) {
            super(looper);
            this.p = e8;
            this.r = b8;
            this.o = n9;
            this.q = l8;
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public void a(boolean bl) {
            this.w = bl;
            this.s = null;
            if (this.hasMessages(1)) {
                this.v = true;
                this.removeMessages(1);
                if (!bl) {
                    this.sendEmptyMessage(2);
                }
            } else {
                // MONITORENTER : this
                this.v = true;
                this.p.c();
                Thread thread = this.u;
                if (thread != null) {
                    thread.interrupt();
                }
                // MONITOREXIT : this
            }
            if (!bl) return;
            this.c();
            long l8 = SystemClock.elapsedRealtime();
            ((b)a.e(this.r)).t(this.p, l8, l8 - this.q, true);
            this.r = null;
            return;
            catch (Throwable throwable) {
                throw throwable;
            }
        }

        public final void b() {
            this.s = null;
            n.this.a.execute((Runnable)a.e((Object)n.this.b));
        }

        public final void c() {
            n.this.b = null;
        }

        public final long d() {
            return Math.min((int)((this.t - 1) * 1000), (int)5000);
        }

        public void e(int n8) {
            IOException iOException = this.s;
            if (iOException != null) {
                if (this.t <= n8) {
                    return;
                }
                throw iOException;
            }
        }

        public void f(long l8) {
            boolean bl = n.this.b == null;
            a.f(bl);
            n.this.b = this;
            if (l8 > 0L) {
                this.sendEmptyMessageDelayed(1, l8);
                return;
            }
            this.b();
        }

        public void handleMessage(Message object) {
            if (this.w) {
                return;
            }
            int n8 = object.what;
            if (n8 == 1) {
                this.b();
                return;
            }
            if (n8 != 4) {
                this.c();
                long l8 = SystemClock.elapsedRealtime();
                long l9 = l8 - this.q;
                b b8 = (b)a.e(this.r);
                if (this.v) {
                    b8.t(this.p, l8, l9, false);
                    return;
                }
                n8 = object.what;
                if (n8 != 2) {
                    if (n8 != 3) {
                        return;
                    }
                    object = (IOException)object.obj;
                    this.s = object;
                    this.t = n8 = this.t + 1;
                    if (((c)(object = b8.r(this.p, l8, l9, (IOException)object, n8))).a == 3) {
                        n.this.c = this.s;
                        return;
                    }
                    if (((c)object).a != 2) {
                        if (((c)object).a == 1) {
                            this.t = 1;
                        }
                        l8 = ((c)object).b != -9223372036854775807L ? ((c)object).b : this.d();
                        this.f(l8);
                        return;
                    }
                } else {
                    try {
                        b8.o(this.p, l8, l9);
                        return;
                    }
                    catch (RuntimeException runtimeException) {
                        g0.o.d("LoadTask", "Unexpected exception handling load completed", (Throwable)runtimeException);
                        n.this.c = new h((Throwable)runtimeException);
                    }
                }
                return;
            }
            throw (Error)object.obj;
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public void run() {
            Object object;
            block21 : {
                block20 : {
                    boolean bl = this.v;
                    this.u = Thread.currentThread();
                    // MONITOREXIT : this
                    if (bl ^ true) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("load:");
                        stringBuilder.append(this.p.getClass().getSimpleName());
                        F.a(stringBuilder.toString());
                        this.p.b();
                        {
                            catch (Throwable throwable) {
                                F.b();
                                throw throwable;
                            }
                        }
                        F.b();
                        // MONITORENTER : this
                    }
                    this.u = null;
                    Thread.interrupted();
                    // MONITOREXIT : this
                    try {
                        if (this.w) return;
                        this.sendEmptyMessage(2);
                        return;
                    }
                    catch (Error error) {}
                    if (this.w) throw error;
                    g0.o.d("LoadTask", "Unexpected error loading stream", (Throwable)error);
                    this.obtainMessage(4, (Object)error).sendToTarget();
                    throw error;
                    catch (OutOfMemoryError outOfMemoryError) {}
                    if (this.w) return;
                    g0.o.d("LoadTask", "OutOfMemory error loading stream", (Throwable)outOfMemoryError);
                    object = new h((Throwable)outOfMemoryError);
                    break block20;
                    catch (Exception exception) {}
                    if (this.w) return;
                    g0.o.d("LoadTask", "Unexpected exception loading stream", (Throwable)exception);
                    object = new h((Throwable)exception);
                }
                object = this.obtainMessage(3, object);
                break block21;
                catch (IOException iOException) {}
                if (this.w) return;
                object = this.obtainMessage(3, (Object)iOException);
            }
            object.sendToTarget();
        }
    }

    public static interface e {
        public void b();

        public void c();
    }

    public static interface f {
        public void k();
    }

    public static final class g
    implements Runnable {
        public final f o;

        public g(f f8) {
            this.o = f8;
        }

        public void run() {
            this.o.k();
        }
    }

    public static final class h
    extends IOException {
        public h(Throwable throwable) {
            String string2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected ");
            stringBuilder.append(throwable.getClass().getSimpleName());
            if (throwable.getMessage() != null) {
                string2 = new StringBuilder();
                string2.append(": ");
                string2.append(throwable.getMessage());
                string2 = string2.toString();
            } else {
                string2 = "";
            }
            stringBuilder.append(string2);
            super(stringBuilder.toString(), throwable);
        }
    }

}

