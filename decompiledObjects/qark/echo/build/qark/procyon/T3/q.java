// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T3;

import e4.g;
import java.io.EOFException;
import e4.e;
import java.util.concurrent.TimeUnit;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.util.ArrayList;
import c4.d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import U3.b;

public class q
{
    public static long l;
    public d a;
    public boolean b;
    public boolean c;
    public long d;
    public b e;
    public c f;
    public ScheduledFuture g;
    public ScheduledFuture h;
    public final T3.c i;
    public final ScheduledExecutorService j;
    public final c4.c k;
    
    public q(final T3.c i, final f f, final String s, final String s2, final c f2, final String s3) {
        this.b = false;
        this.c = false;
        this.d = 0L;
        this.i = i;
        this.j = i.e();
        this.f = f2;
        final long l = q.l;
        q.l = 1L + l;
        final c4.d f3 = i.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("ws_");
        sb.append(l);
        this.k = new c4.c(f3, "WebSocket", sb.toString());
        this.a = this.m(f, s, s2, s3);
    }
    
    public static /* synthetic */ ScheduledFuture a(final q q) {
        return q.h;
    }
    
    public static /* synthetic */ boolean b(final q q, final boolean b) {
        return q.b = b;
    }
    
    public static /* synthetic */ c4.c c(final q q) {
        return q.k;
    }
    
    public static /* synthetic */ ScheduledExecutorService e(final q q) {
        return q.j;
    }
    
    public static /* synthetic */ d i(final q q) {
        return q.a;
    }
    
    public static String[] x(final String s, final int n) {
        if (s.length() <= n) {
            return new String[] { s };
        }
        final ArrayList<String> list = new ArrayList<String>();
        int a;
        for (int i = 0; i < s.length(); i = a) {
            a = i + n;
            list.add(s.substring(i, Math.min(a, s.length())));
        }
        return list.toArray(new String[list.size()]);
    }
    
    public final void j(final String s) {
        this.e.a(s);
        final long d = this.d - 1L;
        this.d = d;
        if (d == 0L) {
            while (true) {
                try {
                    this.e.i();
                    final Map a = f4.b.a(this.e.toString());
                    this.e = null;
                    if (this.k.f()) {
                        final c4.c k = this.k;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("handleIncomingFrame complete frame: ");
                        sb.append(a);
                        k.b(sb.toString(), new Object[0]);
                    }
                    this.f.a(a);
                    return;
                    final c4.c i = this.k;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error parsing frame: ");
                    sb2.append(this.e.toString());
                    final ClassCastException ex;
                    i.c(sb2.toString(), ex);
                    this.k();
                    this.w();
                    return;
                }
                catch (ClassCastException ex3) {}
                catch (IOException ex2) {}
                final IOException ex2;
                final ClassCastException ex = (ClassCastException)ex2;
                continue;
            }
        }
    }
    
    public void k() {
        if (this.k.f()) {
            this.k.b("websocket is being closed", new Object[0]);
        }
        this.c = true;
        this.a.close();
        final ScheduledFuture h = this.h;
        if (h != null) {
            h.cancel(true);
        }
        final ScheduledFuture g = this.g;
        if (g != null) {
            g.cancel(true);
        }
    }
    
    public final void l() {
        if (!this.b && !this.c) {
            if (this.k.f()) {
                this.k.b("timed out on connect", new Object[0]);
            }
            this.a.close();
        }
    }
    
    public final d m(final f f, String b, final String s, final String s2) {
        if (b == null) {
            b = f.b();
        }
        final URI a = f.a(b, f.d(), f.c(), s2);
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("User-Agent", this.i.h());
        hashMap.put("X-Firebase-GMPID", this.i.b());
        hashMap.put("X-Firebase-AppCheck", s);
        return (d)new e(new e4.c(this.i, a, null, hashMap), null);
    }
    
    public final String n(final String s) {
        while (true) {
            if (s.length() > 6) {
                break Label_0025;
            }
            try {
                final int int1 = Integer.parseInt(s);
                if (int1 > 0) {
                    this.p(int1);
                }
                return null;
                this.p(1);
                return s;
            }
            catch (NumberFormatException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void o(String n) {
        if (!this.c) {
            this.u();
            if (!this.q()) {
                n = this.n(n);
                if (n == null) {
                    return;
                }
            }
            this.j(n);
        }
    }
    
    public final void p(final int n) {
        this.d = n;
        this.e = new b();
        if (this.k.f()) {
            final c4.c k = this.k;
            final StringBuilder sb = new StringBuilder();
            sb.append("HandleNewFrameCount: ");
            sb.append(this.d);
            k.b(sb.toString(), new Object[0]);
        }
    }
    
    public final boolean q() {
        return this.e != null;
    }
    
    public final Runnable r() {
        return new Runnable() {
            @Override
            public void run() {
                if (q.i(q.this) != null) {
                    q.i(q.this).e("0");
                    q.this.u();
                }
            }
        };
    }
    
    public final void s() {
        if (!this.c) {
            if (this.k.f()) {
                this.k.b("closing itself", new Object[0]);
            }
            this.w();
        }
        this.a = null;
        final ScheduledFuture g = this.g;
        if (g != null) {
            g.cancel(false);
        }
    }
    
    public void t() {
        this.a.a();
        this.h = this.j.schedule(new Runnable() {
            @Override
            public void run() {
                q.this.l();
            }
        }, 30000L, TimeUnit.MILLISECONDS);
    }
    
    public final void u() {
        if (!this.c) {
            final ScheduledFuture g = this.g;
            if (g != null) {
                g.cancel(false);
                if (this.k.f()) {
                    final c4.c k = this.k;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Reset keepAlive. Remaining: ");
                    sb.append(this.g.getDelay(TimeUnit.MILLISECONDS));
                    k.b(sb.toString(), new Object[0]);
                }
            }
            else if (this.k.f()) {
                this.k.b("Reset keepAlive", new Object[0]);
            }
            this.g = this.j.schedule(this.r(), 45000L, TimeUnit.MILLISECONDS);
        }
    }
    
    public void v(final Map map) {
    Label_0068_Outer:
        while (true) {
            this.u();
        Label_0068:
            while (true) {
                Label_0147: {
                    while (true) {
                        try {
                            final String[] x = x(f4.b.c(map), 16384);
                            if (x.length > 1) {
                                final d a = this.a;
                                final StringBuilder sb = new StringBuilder();
                                sb.append("");
                                sb.append(x.length);
                                a.e(sb.toString());
                            }
                            break Label_0147;
                            // iftrue(Label_0141:, n >= x.length)
                            while (true) {
                                final int n;
                                this.a.e(x[n]);
                                ++n;
                                break Label_0068;
                                final c4.c k = this.k;
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Failed to serialize message: ");
                                sb2.append(map.toString());
                                final IOException ex;
                                k.c(sb2.toString(), ex);
                                this.w();
                                return;
                                continue Label_0068_Outer;
                            }
                            Label_0141: {
                                return;
                            }
                        }
                        catch (IOException ex2) {}
                        final IOException ex2;
                        final IOException ex = ex2;
                        continue;
                    }
                }
                int n = 0;
                continue Label_0068;
            }
        }
    }
    
    public final void w() {
        this.c = true;
        this.f.b(this.b);
    }
    
    public void y() {
    }
    
    public interface c
    {
        void a(final Map p0);
        
        void b(final boolean p0);
    }
    
    public interface d
    {
        void a();
        
        void close();
        
        void e(final String p0);
    }
    
    public class e implements q.d, e4.d
    {
        public e4.c a;
        
        public e(final e4.c a) {
            (this.a = a).r(this);
        }
        
        @Override
        public void a() {
            try {
                this.a.e();
            }
            catch (e4.e e) {
                if (q.c(q.this).f()) {
                    q.c(q.this).a("Error connecting", e, new Object[0]);
                }
                this.g();
            }
        }
        
        @Override
        public void b() {
            q.e(q.this).execute(new Runnable() {
                @Override
                public void run() {
                    if (q.c(q.this).f()) {
                        q.c(q.this).b("closed", new Object[0]);
                    }
                    q.this.s();
                }
            });
        }
        
        @Override
        public void c() {
            q.e(q.this).execute(new Runnable() {
                @Override
                public void run() {
                    q.a(q.this).cancel(false);
                    q.b(q.this, true);
                    if (q.c(q.this).f()) {
                        q.c(q.this).b("websocket opened", new Object[0]);
                    }
                    q.this.u();
                }
            });
        }
        
        @Override
        public void close() {
            this.a.c();
        }
        
        @Override
        public void d(final e4.e e) {
            q.e(q.this).execute(new Runnable() {
                @Override
                public void run() {
                    if (e.getCause() != null && e.getCause() instanceof EOFException) {
                        q.c(q.this).b("WebSocket reached EOF.", new Object[0]);
                    }
                    else {
                        q.c(q.this).a("WebSocket error.", e, new Object[0]);
                    }
                    q.this.s();
                }
            });
        }
        
        @Override
        public void e(final String s) {
            this.a.p(s);
        }
        
        @Override
        public void f(final g g) {
            final String a = g.a();
            if (q.c(q.this).f()) {
                final c4.c c = q.c(q.this);
                final StringBuilder sb = new StringBuilder();
                sb.append("ws message: ");
                sb.append(a);
                c.b(sb.toString(), new Object[0]);
            }
            q.e(q.this).execute(new Runnable() {
                @Override
                public void run() {
                    q.this.o(a);
                }
            });
        }
        
        public final void g() {
            this.a.c();
            try {
                this.a.b();
            }
            catch (InterruptedException ex) {
                q.c(q.this).c("Interrupted while shutting down websocket threads", ex);
            }
        }
    }
}
