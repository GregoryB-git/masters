// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B0;

import g0.F;
import android.os.Message;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Looper;
import g0.a;
import g0.M;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class n implements o
{
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public final ExecutorService a;
    public d b;
    public IOException c;
    
    static {
        d = h(false, -9223372036854775807L);
        e = h(true, -9223372036854775807L);
        f = new c(2, -9223372036854775807L, null);
        g = new c(3, -9223372036854775807L, null);
    }
    
    public n(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("ExoPlayer:Loader:");
        sb.append(str);
        this.a = M.K0(sb.toString());
    }
    
    public static /* synthetic */ d b(final n n) {
        return n.b;
    }
    
    public static /* synthetic */ d c(final n n, final d b) {
        return n.b = b;
    }
    
    public static /* synthetic */ IOException d(final n n, final IOException c) {
        return n.c = c;
    }
    
    public static /* synthetic */ ExecutorService e(final n n) {
        return n.a;
    }
    
    public static c h(final boolean b, final long n) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    @Override
    public void a() {
        this.k(Integer.MIN_VALUE);
    }
    
    public void f() {
        ((d)g0.a.h(this.b)).a(false);
    }
    
    public void g() {
        this.c = null;
    }
    
    public boolean i() {
        return this.c != null;
    }
    
    public boolean j() {
        return this.b != null;
    }
    
    public void k(final int n) {
        final IOException c = this.c;
        if (c == null) {
            final d b = this.b;
            if (b != null) {
                int o;
                if ((o = n) == Integer.MIN_VALUE) {
                    o = b.o;
                }
                b.e(o);
            }
            return;
        }
        throw c;
    }
    
    public void l() {
        this.m(null);
    }
    
    public void m(final f f) {
        final d b = this.b;
        if (b != null) {
            b.a(true);
        }
        if (f != null) {
            this.a.execute(new g(f));
        }
        this.a.shutdown();
    }
    
    public long n(final e e, final b b, final int n) {
        final Looper looper = (Looper)g0.a.h(Looper.myLooper());
        this.c = null;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, e, b, n, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
    
    public interface b
    {
        void o(final e p0, final long p1, final long p2);
        
        c r(final e p0, final long p1, final long p2, final IOException p3, final int p4);
        
        void t(final e p0, final long p1, final long p2, final boolean p3);
    }
    
    public static final class c
    {
        public final int a;
        public final long b;
        
        public c(final int a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        public static /* synthetic */ int a(final c c) {
            return c.a;
        }
        
        public static /* synthetic */ long b(final c c) {
            return c.b;
        }
        
        public boolean c() {
            final int a = this.a;
            boolean b = true;
            if (a != 0) {
                if (a == 1) {
                    return true;
                }
                b = false;
            }
            return b;
        }
    }
    
    public final class d extends Handler implements Runnable
    {
        public final int o;
        public final e p;
        public final long q;
        public b r;
        public IOException s;
        public int t;
        public Thread u;
        public boolean v;
        public volatile boolean w;
        
        public d(final Looper looper, final e p6, final b r, final int o, final long q) {
            super(looper);
            this.p = p6;
            this.r = r;
            this.o = o;
            this.q = q;
        }
        
        public void a(final boolean w) {
            this.w = w;
            this.s = null;
            Label_0078: {
                if (this.hasMessages(1)) {
                    this.v = true;
                    this.removeMessages(1);
                    if (!w) {
                        this.sendEmptyMessage(2);
                        break Label_0078;
                    }
                    break Label_0078;
                }
                while (true) {
                    try {
                        this.v = true;
                        this.p.c();
                        final Thread u = this.u;
                        if (u != null) {
                            u.interrupt();
                        }
                        // monitorexit(this)
                        if (w) {
                            this.c();
                            final long elapsedRealtime = SystemClock.elapsedRealtime();
                            ((b)g0.a.e(this.r)).t(this.p, elapsedRealtime, elapsedRealtime - this.q, true);
                            this.r = null;
                        }
                        return;
                        // monitorexit(this)
                        throw;
                    }
                    finally {
                        continue;
                    }
                    break;
                }
            }
        }
        // monitorenter(this)
        
        public final void b() {
            this.s = null;
            n.e(n.this).execute((Runnable)g0.a.e(n.b(n.this)));
        }
        
        public final void c() {
            n.c(n.this, null);
        }
        
        public final long d() {
            return Math.min((this.t - 1) * 1000, 5000);
        }
        
        public void e(final int n) {
            final IOException s = this.s;
            if (s == null) {
                return;
            }
            if (this.t <= n) {
                return;
            }
            throw s;
        }
        
        public void f(final long n) {
            g0.a.f(n.b(n.this) == null);
            n.c(n.this, this);
            if (n > 0L) {
                this.sendEmptyMessageDelayed(1, n);
                return;
            }
            this.b();
        }
        
        public void handleMessage(final Message message) {
            if (this.w) {
                return;
            }
            final int what = message.what;
            if (what == 1) {
                this.b();
                return;
            }
            if (what == 4) {
                throw (Error)message.obj;
            }
            this.c();
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final long n = elapsedRealtime - this.q;
            final b b = (b)g0.a.e(this.r);
            if (this.v) {
                b.t(this.p, elapsedRealtime, n, false);
                return;
            }
            final int what2 = message.what;
            if (what2 != 2) {
                if (what2 != 3) {
                    return;
                }
                final IOException s = (IOException)message.obj;
                this.s = s;
                final int t = this.t + 1;
                this.t = t;
                final c r = b.r(this.p, elapsedRealtime, n, s, t);
                if (B0.n.c.a(r) == 3) {
                    B0.n.d(B0.n.this, this.s);
                    return;
                }
                if (B0.n.c.a(r) != 2) {
                    if (B0.n.c.a(r) == 1) {
                        this.t = 1;
                    }
                    long n2;
                    if (B0.n.c.b(r) != -9223372036854775807L) {
                        n2 = B0.n.c.b(r);
                    }
                    else {
                        n2 = this.d();
                    }
                    this.f(n2);
                }
            }
            else {
                try {
                    b.o(this.p, elapsedRealtime, n);
                }
                catch (RuntimeException ex) {
                    g0.o.d("LoadTask", "Unexpected exception handling load completed", ex);
                    B0.n.d(B0.n.this, new h(ex));
                }
            }
        }
        
        public void run() {
            while (true) {
                try {
                    synchronized (this) {
                        final boolean v = this.v;
                        this.u = Thread.currentThread();
                        // monitorexit(this)
                        if (v ^ true) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("load:");
                            sb.append(this.p.getClass().getSimpleName());
                            F.a(sb.toString());
                            try {
                                this.p.b();
                            }
                            finally {
                                F.b();
                            }
                        }
                        synchronized (this) {
                            this.u = null;
                            Thread.interrupted();
                            // monitorexit(this)
                            if (!this.w) {
                                this.sendEmptyMessage(2);
                            }
                            return;
                        }
                    }
                    final Error error;
                    if (!this.w) {
                        g0.o.d("LoadTask", "Unexpected error loading stream", error);
                        this.obtainMessage(4, (Object)error).sendToTarget();
                    }
                    throw error;
                    Label_0223: {
                        return;
                    }
                    // iftrue(Label_0223:, this.w)
                    while (true) {
                        h h = null;
                        Label_0167: {
                            Block_8: {
                                break Block_8;
                                final Exception ex;
                                g0.o.d("LoadTask", "Unexpected exception loading stream", ex);
                                h = new h(ex);
                                break Label_0167;
                                final Message message;
                                message.sendToTarget();
                                return;
                            }
                            final IOException ex2;
                            final Message message = this.obtainMessage(3, (Object)ex2);
                            continue;
                            final OutOfMemoryError outOfMemoryError;
                            g0.o.d("LoadTask", "OutOfMemory error loading stream", outOfMemoryError);
                            h = new h(outOfMemoryError);
                        }
                        final Message message = this.obtainMessage(3, (Object)h);
                        continue;
                    }
                }
                catch (Error error2) {}
                catch (OutOfMemoryError outOfMemoryError2) {}
                catch (Exception ex4) {}
                catch (IOException ex3) {}
                final IOException ex3;
                final IOException ex2 = ex3;
                continue;
            }
        }
    }
    
    public interface e
    {
        void b();
        
        void c();
    }
    
    public interface f
    {
        void k();
    }
    
    public static final class g implements Runnable
    {
        public final f o;
        
        public g(final f o) {
            this.o = o;
        }
        
        @Override
        public void run() {
            this.o.k();
        }
    }
    
    public static final class h extends IOException
    {
        public h(final Throwable cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unexpected ");
            sb.append(cause.getClass().getSimpleName());
            String string;
            if (cause.getMessage() != null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(": ");
                sb2.append(cause.getMessage());
                string = sb2.toString();
            }
            else {
                string = "";
            }
            sb.append(string);
            super(sb.toString(), cause);
        }
    }
}
