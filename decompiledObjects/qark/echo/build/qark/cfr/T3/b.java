/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ClassCastException
 *  java.lang.Enum
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package T3;

import T3.f;
import T3.q;
import c4.d;
import java.util.HashMap;
import java.util.Map;

public class b
implements q.c {
    public static long f;
    public f a;
    public q b;
    public a c;
    public c d;
    public final c4.c e;

    public b(T3.c c8, f f8, String string2, a object, String string3, String string4) {
        long l8 = f;
        f = 1L + l8;
        this.a = f8;
        this.c = object;
        object = c8.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("conn_");
        stringBuilder.append(l8);
        this.e = new c4.c((d)object, "Connection", stringBuilder.toString());
        this.d = c.o;
        this.b = new q(c8, f8, string2, string4, this, string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(Map object) {
        try {
            Object object2 = (String)object.get((Object)"t");
            if (object2 != null) {
                if (object2.equals((Object)"d")) {
                    this.h((Map)object.get((Object)"d"));
                    return;
                }
                if (object2.equals((Object)"c")) {
                    this.g((Map)object.get((Object)"d"));
                    return;
                }
                if (!this.e.f()) return;
                object = this.e;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ignoring unknown server message type: ");
                stringBuilder.append((String)object2);
                object.b(stringBuilder.toString(), new Object[0]);
                return;
            }
            if (this.e.f()) {
                object2 = this.e;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to parse server message: missing message type:");
                stringBuilder.append(object.toString());
                object2.b(stringBuilder.toString(), new Object[0]);
            }
            this.c();
            return;
        }
        catch (ClassCastException classCastException) {}
        if (this.e.f()) {
            object = this.e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse server message: ");
            stringBuilder.append(classCastException.toString());
            object.b(stringBuilder.toString(), new Object[0]);
        }
        this.c();
    }

    @Override
    public void b(boolean bl) {
        this.b = null;
        if (!bl && this.d == c.o) {
            if (this.e.f()) {
                this.e.b("Realtime connection failed", new Object[0]);
            }
        } else if (this.e.f()) {
            this.e.b("Realtime connection lost", new Object[0]);
        }
        this.c();
    }

    public void c() {
        this.d(b.p);
    }

    public void d(b b8) {
        Object object = this.d;
        c c8 = c.q;
        if (object != c8) {
            if (this.e.f()) {
                this.e.b("closing realtime connection", new Object[0]);
            }
            this.d = c8;
            object = this.b;
            if (object != null) {
                object.k();
                this.b = null;
            }
            this.c.g(b8);
        }
    }

    public final void e(long l8, String string2) {
        if (this.e.f()) {
            this.e.b("realtime connection established", new Object[0]);
        }
        this.d = c.p;
        this.c.c(l8, string2);
    }

    public final void f(String string2) {
        if (this.e.f()) {
            this.e.b("Connection shutdown command received. Shutting down...", new Object[0]);
        }
        this.c.q(string2);
        this.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(Map object) {
        StringBuilder stringBuilder;
        Object object2;
        if (this.e.f()) {
            object2 = this.e;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Got control message: ");
            stringBuilder.append(object.toString());
            object2.b(stringBuilder.toString(), new Object[0]);
        }
        try {
            object2 = (String)object.get((Object)"t");
            if (object2 != null) {
                boolean bl = object2.equals((Object)"s");
                if (bl) {
                    this.f((String)object.get((Object)"d"));
                    return;
                }
                if (object2.equals((Object)"r")) {
                    this.j((String)object.get((Object)"d"));
                    return;
                }
                if (object2.equals((Object)"h")) {
                    this.i((Map)object.get((Object)"d"));
                    return;
                }
                if (!this.e.f()) return;
                object = this.e;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Ignoring unknown control message: ");
                stringBuilder.append((String)object2);
                object.b(stringBuilder.toString(), new Object[0]);
                return;
            }
            if (this.e.f()) {
                object2 = this.e;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Got invalid control message: ");
                stringBuilder.append(object.toString());
                object2.b(stringBuilder.toString(), new Object[0]);
            }
            this.c();
            return;
        }
        catch (ClassCastException classCastException) {}
        if (this.e.f()) {
            object = this.e;
            object2 = new StringBuilder();
            object2.append("Failed to parse control message: ");
            object2.append(classCastException.toString());
            object.b(object2.toString(), new Object[0]);
        }
        this.c();
    }

    public final void h(Map map) {
        if (this.e.f()) {
            c4.c c8 = this.e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("received data message: ");
            stringBuilder.append(map.toString());
            c8.b(stringBuilder.toString(), new Object[0]);
        }
        this.c.i(map);
    }

    public final void i(Map object) {
        long l8 = (Long)object.get((Object)"ts");
        String string2 = (String)object.get((Object)"h");
        this.c.o(string2);
        object = (String)object.get((Object)"s");
        if (this.d == c.o) {
            this.b.y();
            this.e(l8, (String)object);
        }
    }

    public final void j(String string2) {
        if (this.e.f()) {
            c4.c c8 = this.e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Got a reset; killing connection to ");
            stringBuilder.append(this.a.b());
            stringBuilder.append("; Updating internalHost to ");
            stringBuilder.append(string2);
            c8.b(stringBuilder.toString(), new Object[0]);
        }
        this.c.o(string2);
        this.d(b.o);
    }

    public void k() {
        if (this.e.f()) {
            this.e.b("Opening a connection", new Object[0]);
        }
        this.b.t();
    }

    public final void l(Map map, boolean bl) {
        if (this.d != c.p) {
            this.e.b("Tried to send on an unconnected connection", new Object[0]);
            return;
        }
        if (bl) {
            this.e.b("Sending data (contents hidden)", new Object[0]);
        } else {
            this.e.b("Sending data: %s", new Object[]{map});
        }
        this.b.v(map);
    }

    public void m(Map map, boolean bl) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"t", (Object)"d");
        hashMap.put((Object)"d", (Object)map);
        this.l((Map)hashMap, bl);
    }

    public static interface a {
        public void c(long var1, String var3);

        public void g(b var1);

        public void i(Map var1);

        public void o(String var1);

        public void q(String var1);
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b o;
        public static final /* enum */ b p;
        public static final /* synthetic */ b[] q;

        static {
            b b8;
            b b9;
            o = b9 = new b();
            p = b8 = new b();
            q = new b[]{b9, b8};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])q.clone();
        }
    }

    public static final class c
    extends Enum {
        public static final /* enum */ c o;
        public static final /* enum */ c p;
        public static final /* enum */ c q;
        public static final /* synthetic */ c[] r;

        static {
            c c8;
            c c9;
            c c10;
            o = c10 = new c();
            p = c8 = new c();
            q = c9 = new c();
            r = new c[]{c10, c8, c9};
        }

        public static c valueOf(String string2) {
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            return (c[])r.clone();
        }
    }

}

