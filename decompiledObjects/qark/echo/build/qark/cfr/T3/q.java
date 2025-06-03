/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.io.IOException
 *  java.lang.ClassCastException
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URI
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package T3;

import T3.f;
import e4.g;
import f4.b;
import java.io.EOFException;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class q {
    public static long l;
    public d a;
    public boolean b = false;
    public boolean c = false;
    public long d = 0L;
    public U3.b e;
    public c f;
    public ScheduledFuture g;
    public ScheduledFuture h;
    public final T3.c i;
    public final ScheduledExecutorService j;
    public final c4.c k;

    public q(T3.c object, f f8, String string2, String string3, c c8, String string4) {
        this.i = object;
        this.j = object.e();
        this.f = c8;
        long l8 = l;
        l = 1L + l8;
        object = object.f();
        c8 = new StringBuilder();
        c8.append("ws_");
        c8.append(l8);
        this.k = new c4.c((c4.d)object, "WebSocket", c8.toString());
        this.a = this.m(f8, string2, string3, string4);
    }

    public static String[] x(String string2, int n8) {
        if (string2.length() <= n8) {
            return new String[]{string2};
        }
        ArrayList arrayList = new ArrayList();
        int n9 = 0;
        while (n9 < string2.length()) {
            int n10 = n9 + n8;
            arrayList.add((Object)string2.substring(n9, Math.min((int)n10, (int)string2.length())));
            n9 = n10;
        }
        return (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void j(String object) {
        String string2;
        StringBuilder stringBuilder;
        void var6_8;
        block4 : {
            long l8;
            this.e.a((String)object);
            this.d = l8 = this.d - 1L;
            if (l8 != 0L) return;
            try {
                this.e.i();
                object = b.a(this.e.toString());
                this.e = null;
                if (this.k.f()) {
                    c4.c c8 = this.k;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("handleIncomingFrame complete frame: ");
                    stringBuilder2.append(object);
                    c8.b(stringBuilder2.toString(), new Object[0]);
                }
                this.f.a((Map)object);
                return;
            }
            catch (ClassCastException classCastException) {}
            object = this.k;
            stringBuilder = new StringBuilder();
            string2 = "Error parsing frame (cast error): ";
            break block4;
            catch (IOException iOException) {}
            object = this.k;
            stringBuilder = new StringBuilder();
            string2 = "Error parsing frame: ";
        }
        stringBuilder.append(string2);
        stringBuilder.append(this.e.toString());
        object.c(stringBuilder.toString(), (Throwable)var6_8);
        this.k();
        this.w();
    }

    public void k() {
        if (this.k.f()) {
            this.k.b("websocket is being closed", new Object[0]);
        }
        this.c = true;
        this.a.close();
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        if ((scheduledFuture = this.g) != null) {
            scheduledFuture.cancel(true);
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

    public final d m(f f8, String string2, String string3, String string4) {
        if (string2 == null) {
            string2 = f8.b();
        }
        f8 = f.a(string2, f8.d(), f8.c(), string4);
        string2 = new HashMap();
        string2.put((Object)"User-Agent", (Object)this.i.h());
        string2.put((Object)"X-Firebase-GMPID", (Object)this.i.b());
        string2.put((Object)"X-Firebase-AppCheck", (Object)string3);
        return new e(new e4.c(this.i, (URI)f8, null, (Map)string2), null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String n(String string2) {
        if (string2.length() <= 6) {
            try {
                int n8 = Integer.parseInt((String)string2);
                if (n8 > 0) {
                    this.p(n8);
                }
                return null;
            }
            catch (NumberFormatException numberFormatException) {}
        }
        this.p(1);
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void o(String string2) {
        if (!this.c) {
            this.u();
            if (this.q() || (string2 = this.n(string2)) != null) {
                this.j(string2);
                return;
            }
        }
    }

    public final void p(int n8) {
        this.d = n8;
        this.e = new U3.b();
        if (this.k.f()) {
            c4.c c8 = this.k;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("HandleNewFrameCount: ");
            stringBuilder.append(this.d);
            c8.b(stringBuilder.toString(), new Object[0]);
        }
    }

    public final boolean q() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final Runnable r() {
        return new Runnable(){

            public void run() {
                if (q.this.a != null) {
                    q.this.a.e("0");
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
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public void t() {
        this.a.a();
        this.h = this.j.schedule(new Runnable(){

            public void run() {
                q.this.l();
            }
        }, 30000L, TimeUnit.MILLISECONDS);
    }

    public final void u() {
        if (!this.c) {
            Object object = this.g;
            if (object != null) {
                object.cancel(false);
                if (this.k.f()) {
                    object = this.k;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Reset keepAlive. Remaining: ");
                    stringBuilder.append(this.g.getDelay(TimeUnit.MILLISECONDS));
                    object.b(stringBuilder.toString(), new Object[0]);
                }
            } else if (this.k.f()) {
                this.k.b("Reset keepAlive", new Object[0]);
            }
            this.g = this.j.schedule(this.r(), 45000L, TimeUnit.MILLISECONDS);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void v(Map map) {
        String[] arrstring;
        block4 : {
            this.u();
            try {
                arrstring = q.x(b.c(map), 16384);
                if (arrstring.length > 1) {
                    d d8 = this.a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("");
                    stringBuilder.append(arrstring.length);
                    d8.e(stringBuilder.toString());
                }
                break block4;
            }
            catch (IOException iOException) {}
            c4.c c8 = this.k;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to serialize message: ");
            stringBuilder.append(map.toString());
            c8.c(stringBuilder.toString(), (Throwable)iOException);
            this.w();
            return;
        }
        int n8 = 0;
        while (n8 < arrstring.length) {
            this.a.e(arrstring[n8]);
            ++n8;
        }
    }

    public final void w() {
        this.c = true;
        this.f.b(this.b);
    }

    public void y() {
    }

    public static interface c {
        public void a(Map var1);

        public void b(boolean var1);
    }

    public static interface d {
        public void a();

        public void close();

        public void e(String var1);
    }

    public class e
    implements d,
    e4.d {
        public e4.c a;

        public e(e4.c c8) {
            this.a = c8;
            c8.r(this);
        }

        public /* synthetic */ e(e4.c c8, T3.q$a a8) {
            this(c8);
        }

        @Override
        public void a() {
            try {
                this.a.e();
                return;
            }
            catch (e4.e e8) {
                if (q.this.k.f()) {
                    q.this.k.a("Error connecting", (Throwable)e8, new Object[0]);
                }
                this.g();
                return;
            }
        }

        @Override
        public void b() {
            q.this.j.execute(new Runnable(){

                public void run() {
                    if (q.this.k.f()) {
                        q.this.k.b("closed", new Object[0]);
                    }
                    q.this.s();
                }
            });
        }

        @Override
        public void c() {
            q.this.j.execute(new Runnable(){

                public void run() {
                    q.this.h.cancel(false);
                    q.this.b = true;
                    if (q.this.k.f()) {
                        q.this.k.b("websocket opened", new Object[0]);
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
        public void d(final e4.e e8) {
            q.this.j.execute(new Runnable(){

                public void run() {
                    if (e8.getCause() != null && e8.getCause() instanceof EOFException) {
                        q.this.k.b("WebSocket reached EOF.", new Object[0]);
                    } else {
                        q.this.k.a("WebSocket error.", (Throwable)e8, new Object[0]);
                    }
                    q.this.s();
                }
            });
        }

        @Override
        public void e(String string2) {
            this.a.p(string2);
        }

        @Override
        public void f(g object) {
            object = object.a();
            if (q.this.k.f()) {
                c4.c c8 = q.this.k;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ws message: ");
                stringBuilder.append((String)object);
                c8.b(stringBuilder.toString(), new Object[0]);
            }
            q.this.j.execute(new Runnable((String)object){
                public final /* synthetic */ String o;
                {
                    this.o = string2;
                }

                public void run() {
                    q.this.o(this.o);
                }
            });
        }

        public final void g() {
            this.a.c();
            try {
                this.a.b();
                return;
            }
            catch (InterruptedException interruptedException) {
                q.this.k.c("Interrupted while shutting down websocket threads", (Throwable)interruptedException);
                return;
            }
        }

    }

}

