// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T3;

import java.util.HashMap;
import java.util.Map;
import c4.d;
import c4.c;

public class b implements q.c
{
    public static long f;
    public f a;
    public q b;
    public a c;
    public c d;
    public final c4.c e;
    
    public b(final T3.c c, final f a, final String s, final a c2, final String s2, final String s3) {
        final long f = T3.b.f;
        T3.b.f = 1L + f;
        this.a = a;
        this.c = c2;
        final c4.d f2 = c.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("conn_");
        sb.append(f);
        this.e = new c4.c(f2, "Connection", sb.toString());
        this.d = T3.b.c.o;
        this.b = new q(c, a, s, s3, (q.c)this, s2);
    }
    
    @Override
    public void a(final Map map) {
        while (true) {
            try {
                final String str = map.get("t");
                if (str == null) {
                    if (this.e.f()) {
                        final c4.c e = this.e;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Failed to parse server message: missing message type:");
                        sb.append(map.toString());
                        e.b(sb.toString(), new Object[0]);
                    }
                    this.c();
                    return;
                }
                if (str.equals("d")) {
                    this.h((Map)map.get("d"));
                    return;
                }
                if (str.equals("c")) {
                    this.g((Map)map.get("d"));
                    return;
                }
                if (this.e.f()) {
                    final c4.c e2 = this.e;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Ignoring unknown server message type: ");
                    sb2.append(str);
                    e2.b(sb2.toString(), new Object[0]);
                    return;
                }
                return;
                // iftrue(Label_0222:, !this.e.f())
                final c4.c e3 = this.e;
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to parse server message: ");
                final ClassCastException ex;
                sb3.append(ex.toString());
                e3.b(sb3.toString(), new Object[0]);
                Label_0222: {
                    this.c();
                }
                return;
            }
            catch (ClassCastException ex2) {}
            final ClassCastException ex2;
            final ClassCastException ex = ex2;
            continue;
        }
    }
    
    @Override
    public void b(final boolean b) {
        this.b = null;
        if (!b && this.d == T3.b.c.o) {
            if (this.e.f()) {
                this.e.b("Realtime connection failed", new Object[0]);
            }
        }
        else if (this.e.f()) {
            this.e.b("Realtime connection lost", new Object[0]);
        }
        this.c();
    }
    
    public void c() {
        this.d(T3.b.b.p);
    }
    
    public void d(final b b) {
        final c d = this.d;
        final c q = T3.b.c.q;
        if (d != q) {
            if (this.e.f()) {
                this.e.b("closing realtime connection", new Object[0]);
            }
            this.d = q;
            final q b2 = this.b;
            if (b2 != null) {
                b2.k();
                this.b = null;
            }
            this.c.g(b);
        }
    }
    
    public final void e(final long n, final String s) {
        if (this.e.f()) {
            this.e.b("realtime connection established", new Object[0]);
        }
        this.d = T3.b.c.p;
        this.c.c(n, s);
    }
    
    public final void f(final String s) {
        if (this.e.f()) {
            this.e.b("Connection shutdown command received. Shutting down...", new Object[0]);
        }
        this.c.q(s);
        this.c();
    }
    
    public final void g(final Map map) {
        if (this.e.f()) {
            final c4.c e = this.e;
            final StringBuilder sb = new StringBuilder();
            sb.append("Got control message: ");
            sb.append(map.toString());
            e.b(sb.toString(), new Object[0]);
        }
        while (true) {
            try {
                final String str = map.get("t");
                if (str == null) {
                    if (this.e.f()) {
                        final c4.c e2 = this.e;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Got invalid control message: ");
                        sb2.append(map.toString());
                        e2.b(sb2.toString(), new Object[0]);
                    }
                    this.c();
                    return;
                }
                if (str.equals("s")) {
                    this.f(map.get("d"));
                    return;
                }
                if (str.equals("r")) {
                    this.j(map.get("d"));
                    return;
                }
                if (str.equals("h")) {
                    this.i((Map)map.get("d"));
                    return;
                }
                if (this.e.f()) {
                    final c4.c e3 = this.e;
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Ignoring unknown control message: ");
                    sb3.append(str);
                    e3.b(sb3.toString(), new Object[0]);
                    return;
                }
                return;
                while (true) {
                    final c4.c e4 = this.e;
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Failed to parse control message: ");
                    final ClassCastException ex;
                    sb4.append(ex.toString());
                    e4.b(sb4.toString(), new Object[0]);
                    Label_0313: {
                        this.c();
                    }
                    return;
                    continue;
                }
            }
            // iftrue(Label_0313:, !this.e.f())
            catch (ClassCastException ex2) {}
            final ClassCastException ex2;
            final ClassCastException ex = ex2;
            continue;
        }
    }
    
    public final void h(final Map map) {
        if (this.e.f()) {
            final c4.c e = this.e;
            final StringBuilder sb = new StringBuilder();
            sb.append("received data message: ");
            sb.append(map.toString());
            e.b(sb.toString(), new Object[0]);
        }
        this.c.i(map);
    }
    
    public final void i(final Map map) {
        final long longValue = map.get("ts");
        this.c.o((String)map.get("h"));
        final String s = (String)map.get("s");
        if (this.d == T3.b.c.o) {
            this.b.y();
            this.e(longValue, s);
        }
    }
    
    public final void j(final String str) {
        if (this.e.f()) {
            final c4.c e = this.e;
            final StringBuilder sb = new StringBuilder();
            sb.append("Got a reset; killing connection to ");
            sb.append(this.a.b());
            sb.append("; Updating internalHost to ");
            sb.append(str);
            e.b(sb.toString(), new Object[0]);
        }
        this.c.o(str);
        this.d(T3.b.b.o);
    }
    
    public void k() {
        if (this.e.f()) {
            this.e.b("Opening a connection", new Object[0]);
        }
        this.b.t();
    }
    
    public final void l(final Map map, final boolean b) {
        if (this.d != T3.b.c.p) {
            this.e.b("Tried to send on an unconnected connection", new Object[0]);
            return;
        }
        if (b) {
            this.e.b("Sending data (contents hidden)", new Object[0]);
        }
        else {
            this.e.b("Sending data: %s", map);
        }
        this.b.v(map);
    }
    
    public void m(final Map map, final boolean b) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("t", "d");
        hashMap.put("d", (String)map);
        this.l(hashMap, b);
    }
    
    public interface a
    {
        void c(final long p0, final String p1);
        
        void g(final b p0);
        
        void i(final Map p0);
        
        void o(final String p0);
        
        void q(final String p0);
    }
    
    public enum b
    {
        o("SERVER_RESET", 0), 
        p("OTHER", 1);
        
        public b(final String name, final int ordinal) {
        }
    }
    
    public enum c
    {
        o("REALTIME_CONNECTING", 0), 
        p("REALTIME_CONNECTED", 1), 
        q("REALTIME_DISCONNECTED", 2);
        
        public c(final String name, final int ordinal) {
        }
    }
}
