package T3;

import c4.C0851c;
import e4.C1267c;
import e4.C1269e;
import e4.C1271g;
import e4.InterfaceC1268d;
import f4.AbstractC1292b;
import java.io.EOFException;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class q {

    /* renamed from: l, reason: collision with root package name */
    public static long f6197l;

    /* renamed from: a, reason: collision with root package name */
    public d f6198a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6199b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6200c = false;

    /* renamed from: d, reason: collision with root package name */
    public long f6201d = 0;

    /* renamed from: e, reason: collision with root package name */
    public U3.b f6202e;

    /* renamed from: f, reason: collision with root package name */
    public c f6203f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledFuture f6204g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f6205h;

    /* renamed from: i, reason: collision with root package name */
    public final T3.c f6206i;

    /* renamed from: j, reason: collision with root package name */
    public final ScheduledExecutorService f6207j;

    /* renamed from: k, reason: collision with root package name */
    public final C0851c f6208k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.l();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (q.this.f6198a != null) {
                q.this.f6198a.e("0");
                q.this.u();
            }
        }
    }

    public interface c {
        void a(Map map);

        void b(boolean z7);
    }

    public interface d {
        void a();

        void close();

        void e(String str);
    }

    public class e implements d, InterfaceC1268d {

        /* renamed from: a, reason: collision with root package name */
        public C1267c f6211a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                q.this.f6205h.cancel(false);
                q.this.f6199b = true;
                if (q.this.f6208k.f()) {
                    q.this.f6208k.b("websocket opened", new Object[0]);
                }
                q.this.u();
            }
        }

        public class b implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f6214o;

            public b(String str) {
                this.f6214o = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                q.this.o(this.f6214o);
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (q.this.f6208k.f()) {
                    q.this.f6208k.b("closed", new Object[0]);
                }
                q.this.s();
            }
        }

        public class d implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ C1269e f6217o;

            public d(C1269e c1269e) {
                this.f6217o = c1269e;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f6217o.getCause() == null || !(this.f6217o.getCause() instanceof EOFException)) {
                    q.this.f6208k.a("WebSocket error.", this.f6217o, new Object[0]);
                } else {
                    q.this.f6208k.b("WebSocket reached EOF.", new Object[0]);
                }
                q.this.s();
            }
        }

        public e(C1267c c1267c) {
            this.f6211a = c1267c;
            c1267c.r(this);
        }

        @Override // T3.q.d
        public void a() {
            try {
                this.f6211a.e();
            } catch (C1269e e7) {
                if (q.this.f6208k.f()) {
                    q.this.f6208k.a("Error connecting", e7, new Object[0]);
                }
                g();
            }
        }

        @Override // e4.InterfaceC1268d
        public void b() {
            q.this.f6207j.execute(new c());
        }

        @Override // e4.InterfaceC1268d
        public void c() {
            q.this.f6207j.execute(new a());
        }

        @Override // T3.q.d
        public void close() {
            this.f6211a.c();
        }

        @Override // e4.InterfaceC1268d
        public void d(C1269e c1269e) {
            q.this.f6207j.execute(new d(c1269e));
        }

        @Override // T3.q.d
        public void e(String str) {
            this.f6211a.p(str);
        }

        @Override // e4.InterfaceC1268d
        public void f(C1271g c1271g) {
            String a7 = c1271g.a();
            if (q.this.f6208k.f()) {
                q.this.f6208k.b("ws message: " + a7, new Object[0]);
            }
            q.this.f6207j.execute(new b(a7));
        }

        public final void g() {
            this.f6211a.c();
            try {
                this.f6211a.b();
            } catch (InterruptedException e7) {
                q.this.f6208k.c("Interrupted while shutting down websocket threads", e7);
            }
        }

        public /* synthetic */ e(q qVar, C1267c c1267c, a aVar) {
            this(c1267c);
        }
    }

    public q(T3.c cVar, f fVar, String str, String str2, c cVar2, String str3) {
        this.f6206i = cVar;
        this.f6207j = cVar.e();
        this.f6203f = cVar2;
        long j7 = f6197l;
        f6197l = 1 + j7;
        this.f6208k = new C0851c(cVar.f(), "WebSocket", "ws_" + j7);
        this.f6198a = m(fVar, str, str2, str3);
    }

    public static String[] x(String str, int i7) {
        if (str.length() <= i7) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < str.length()) {
            int i9 = i8 + i7;
            arrayList.add(str.substring(i8, Math.min(i9, str.length())));
            i8 = i9;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final void j(String str) {
        C0851c c0851c;
        StringBuilder sb;
        String str2;
        this.f6202e.a(str);
        long j7 = this.f6201d - 1;
        this.f6201d = j7;
        if (j7 == 0) {
            try {
                this.f6202e.i();
                Map a7 = AbstractC1292b.a(this.f6202e.toString());
                this.f6202e = null;
                if (this.f6208k.f()) {
                    this.f6208k.b("handleIncomingFrame complete frame: " + a7, new Object[0]);
                }
                this.f6203f.a(a7);
            } catch (IOException e7) {
                e = e7;
                c0851c = this.f6208k;
                sb = new StringBuilder();
                str2 = "Error parsing frame: ";
                sb.append(str2);
                sb.append(this.f6202e.toString());
                c0851c.c(sb.toString(), e);
                k();
                w();
            } catch (ClassCastException e8) {
                e = e8;
                c0851c = this.f6208k;
                sb = new StringBuilder();
                str2 = "Error parsing frame (cast error): ";
                sb.append(str2);
                sb.append(this.f6202e.toString());
                c0851c.c(sb.toString(), e);
                k();
                w();
            }
        }
    }

    public void k() {
        if (this.f6208k.f()) {
            this.f6208k.b("websocket is being closed", new Object[0]);
        }
        this.f6200c = true;
        this.f6198a.close();
        ScheduledFuture scheduledFuture = this.f6205h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.f6204g;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    public final void l() {
        if (this.f6199b || this.f6200c) {
            return;
        }
        if (this.f6208k.f()) {
            this.f6208k.b("timed out on connect", new Object[0]);
        }
        this.f6198a.close();
    }

    public final d m(f fVar, String str, String str2, String str3) {
        if (str == null) {
            str = fVar.b();
        }
        URI a7 = f.a(str, fVar.d(), fVar.c(), str3);
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", this.f6206i.h());
        hashMap.put("X-Firebase-GMPID", this.f6206i.b());
        hashMap.put("X-Firebase-AppCheck", str2);
        return new e(this, new C1267c(this.f6206i, a7, null, hashMap), null);
    }

    public final String n(String str) {
        if (str.length() <= 6) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt <= 0) {
                    return null;
                }
                p(parseInt);
                return null;
            } catch (NumberFormatException unused) {
            }
        }
        p(1);
        return str;
    }

    public final void o(String str) {
        if (this.f6200c) {
            return;
        }
        u();
        if (!q() && (str = n(str)) == null) {
            return;
        }
        j(str);
    }

    public final void p(int i7) {
        this.f6201d = i7;
        this.f6202e = new U3.b();
        if (this.f6208k.f()) {
            this.f6208k.b("HandleNewFrameCount: " + this.f6201d, new Object[0]);
        }
    }

    public final boolean q() {
        return this.f6202e != null;
    }

    public final Runnable r() {
        return new b();
    }

    public final void s() {
        if (!this.f6200c) {
            if (this.f6208k.f()) {
                this.f6208k.b("closing itself", new Object[0]);
            }
            w();
        }
        this.f6198a = null;
        ScheduledFuture scheduledFuture = this.f6204g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public void t() {
        this.f6198a.a();
        this.f6205h = this.f6207j.schedule(new a(), 30000L, TimeUnit.MILLISECONDS);
    }

    public final void u() {
        if (this.f6200c) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f6204g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            if (this.f6208k.f()) {
                this.f6208k.b("Reset keepAlive. Remaining: " + this.f6204g.getDelay(TimeUnit.MILLISECONDS), new Object[0]);
            }
        } else if (this.f6208k.f()) {
            this.f6208k.b("Reset keepAlive", new Object[0]);
        }
        this.f6204g = this.f6207j.schedule(r(), 45000L, TimeUnit.MILLISECONDS);
    }

    public void v(Map map) {
        u();
        try {
            String[] x7 = x(AbstractC1292b.c(map), 16384);
            if (x7.length > 1) {
                this.f6198a.e("" + x7.length);
            }
            for (String str : x7) {
                this.f6198a.e(str);
            }
        } catch (IOException e7) {
            this.f6208k.c("Failed to serialize message: " + map.toString(), e7);
            w();
        }
    }

    public final void w() {
        this.f6200c = true;
        this.f6203f.b(this.f6199b);
    }

    public void y() {
    }
}
