package T3;

import T3.q;
import c4.C0851c;
import j3.C1373c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements q.c {

    /* renamed from: f, reason: collision with root package name */
    public static long f6080f;

    /* renamed from: a, reason: collision with root package name */
    public f f6081a;

    /* renamed from: b, reason: collision with root package name */
    public q f6082b;

    /* renamed from: c, reason: collision with root package name */
    public a f6083c;

    /* renamed from: d, reason: collision with root package name */
    public c f6084d;

    /* renamed from: e, reason: collision with root package name */
    public final C0851c f6085e;

    public interface a {
        void c(long j7, String str);

        void g(EnumC0101b enumC0101b);

        void i(Map map);

        void o(String str);

        void q(String str);
    }

    /* renamed from: T3.b$b, reason: collision with other inner class name */
    public enum EnumC0101b {
        SERVER_RESET,
        OTHER
    }

    public enum c {
        REALTIME_CONNECTING,
        REALTIME_CONNECTED,
        REALTIME_DISCONNECTED
    }

    public b(T3.c cVar, f fVar, String str, a aVar, String str2, String str3) {
        long j7 = f6080f;
        f6080f = 1 + j7;
        this.f6081a = fVar;
        this.f6083c = aVar;
        this.f6085e = new C0851c(cVar.f(), "Connection", "conn_" + j7);
        this.f6084d = c.REALTIME_CONNECTING;
        this.f6082b = new q(cVar, fVar, str, str3, this, str2);
    }

    @Override // T3.q.c
    public void a(Map map) {
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (this.f6085e.f()) {
                    this.f6085e.b("Failed to parse server message: missing message type:" + map.toString(), new Object[0]);
                }
                c();
                return;
            }
            if (str.equals("d")) {
                h((Map) map.get("d"));
                return;
            }
            if (str.equals(C1373c.f15449d)) {
                g((Map) map.get("d"));
                return;
            }
            if (this.f6085e.f()) {
                this.f6085e.b("Ignoring unknown server message type: " + str, new Object[0]);
            }
        } catch (ClassCastException e7) {
            if (this.f6085e.f()) {
                this.f6085e.b("Failed to parse server message: " + e7.toString(), new Object[0]);
            }
            c();
        }
    }

    @Override // T3.q.c
    public void b(boolean z7) {
        this.f6082b = null;
        if (z7 || this.f6084d != c.REALTIME_CONNECTING) {
            if (this.f6085e.f()) {
                this.f6085e.b("Realtime connection lost", new Object[0]);
            }
        } else if (this.f6085e.f()) {
            this.f6085e.b("Realtime connection failed", new Object[0]);
        }
        c();
    }

    public void c() {
        d(EnumC0101b.OTHER);
    }

    public void d(EnumC0101b enumC0101b) {
        c cVar = this.f6084d;
        c cVar2 = c.REALTIME_DISCONNECTED;
        if (cVar != cVar2) {
            if (this.f6085e.f()) {
                this.f6085e.b("closing realtime connection", new Object[0]);
            }
            this.f6084d = cVar2;
            q qVar = this.f6082b;
            if (qVar != null) {
                qVar.k();
                this.f6082b = null;
            }
            this.f6083c.g(enumC0101b);
        }
    }

    public final void e(long j7, String str) {
        if (this.f6085e.f()) {
            this.f6085e.b("realtime connection established", new Object[0]);
        }
        this.f6084d = c.REALTIME_CONNECTED;
        this.f6083c.c(j7, str);
    }

    public final void f(String str) {
        if (this.f6085e.f()) {
            this.f6085e.b("Connection shutdown command received. Shutting down...", new Object[0]);
        }
        this.f6083c.q(str);
        c();
    }

    public final void g(Map map) {
        if (this.f6085e.f()) {
            this.f6085e.b("Got control message: " + map.toString(), new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (this.f6085e.f()) {
                    this.f6085e.b("Got invalid control message: " + map.toString(), new Object[0]);
                }
                c();
                return;
            }
            if (str.equals("s")) {
                f((String) map.get("d"));
                return;
            }
            if (str.equals("r")) {
                j((String) map.get("d"));
                return;
            }
            if (str.equals("h")) {
                i((Map) map.get("d"));
                return;
            }
            if (this.f6085e.f()) {
                this.f6085e.b("Ignoring unknown control message: " + str, new Object[0]);
            }
        } catch (ClassCastException e7) {
            if (this.f6085e.f()) {
                this.f6085e.b("Failed to parse control message: " + e7.toString(), new Object[0]);
            }
            c();
        }
    }

    public final void h(Map map) {
        if (this.f6085e.f()) {
            this.f6085e.b("received data message: " + map.toString(), new Object[0]);
        }
        this.f6083c.i(map);
    }

    public final void i(Map map) {
        long longValue = ((Long) map.get("ts")).longValue();
        this.f6083c.o((String) map.get("h"));
        String str = (String) map.get("s");
        if (this.f6084d == c.REALTIME_CONNECTING) {
            this.f6082b.y();
            e(longValue, str);
        }
    }

    public final void j(String str) {
        if (this.f6085e.f()) {
            this.f6085e.b("Got a reset; killing connection to " + this.f6081a.b() + "; Updating internalHost to " + str, new Object[0]);
        }
        this.f6083c.o(str);
        d(EnumC0101b.SERVER_RESET);
    }

    public void k() {
        if (this.f6085e.f()) {
            this.f6085e.b("Opening a connection", new Object[0]);
        }
        this.f6082b.t();
    }

    public final void l(Map map, boolean z7) {
        if (this.f6084d != c.REALTIME_CONNECTED) {
            this.f6085e.b("Tried to send on an unconnected connection", new Object[0]);
            return;
        }
        if (z7) {
            this.f6085e.b("Sending data (contents hidden)", new Object[0]);
        } else {
            this.f6085e.b("Sending data: %s", map);
        }
        this.f6082b.v(map);
    }

    public void m(Map map, boolean z7) {
        HashMap hashMap = new HashMap();
        hashMap.put("t", "d");
        hashMap.put("d", map);
        l(hashMap, z7);
    }
}
