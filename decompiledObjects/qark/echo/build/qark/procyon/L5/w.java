// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L5;

import java.util.List;
import java.util.Iterator;
import Q3.n;
import Q3.e;
import Q3.r;
import java.util.Objects;
import Q3.p;
import V2.m;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import Q3.h;
import android.util.Log;
import E5.j;
import E5.d;
import E5.c;
import java.util.Map;
import java.util.HashMap;
import E5.k;
import A5.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;

public class w implements FlutterFirebasePlugin, a, c
{
    public static final HashMap e;
    public int a;
    public final Map b;
    public k c;
    public E5.c d;
    
    static {
        e = new HashMap();
    }
    
    public w() {
        this.a = 0;
        this.b = new HashMap();
    }
    
    public static void b0(final h value, final String s) {
        final HashMap e = w.e;
        // monitorenter(e)
        while (true) {
            try {
                if (e.get(s) == null) {
                    e.put(s, value);
                }
                // monitorexit(e)
                return;
                // monitorexit(e)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static h v(final String key) {
        final HashMap e = w.e;
        synchronized (e) {
            return e.get(key);
        }
    }
    
    public final V2.j A(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new u(this, map, k));
        return k.a();
    }
    
    public final void B(final E5.c d) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_database", this);
        this.d = d;
        (this.c = new k(d, "plugins.flutter.io/firebase_database")).e((k.c)this);
    }
    
    public final V2.j V(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(this, map, k));
        return k.a();
    }
    
    public final V2.j W(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new q(this, map, k));
        return k.a();
    }
    
    public final V2.j X(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new L5.k(this, map, k));
        return k.a();
    }
    
    public final V2.j Y(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(this, map, k));
        return k.a();
    }
    
    public final void Z() {
        for (final E5.d d : this.b.keySet()) {
            final E5.d.d d2 = this.b.get(d);
            if (d2 != null) {
                d2.a(null);
                d.d(null);
            }
        }
        this.b.clear();
    }
    
    public final V2.j a0(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new s(this, map, k));
        return k.a();
    }
    
    public final V2.j c0(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new v(this, map, k));
        return k.a();
    }
    
    public final V2.j d0(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new L5.j(this, map, k));
        return k.a();
    }
    
    @Override
    public V2.j didReinitializeFirebaseCore() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new L5.n(this, k));
        return k.a();
    }
    
    public final V2.j e0(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, map, k));
        return k.a();
    }
    
    public final V2.j f0(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new t(this, map, k));
        return k.a();
    }
    
    public final V2.j g0(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new L5.r(this, map, k));
        return k.a();
    }
    
    @Override
    public V2.j getPluginConstantsForFirebaseApp(final s3.e e) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new L5.d(k));
        return k.a();
    }
    
    public final V2.j h0(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new l(this, map, k));
        return k.a();
    }
    
    public final V2.j i0(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new L5.p(this, map, k));
        return k.a();
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        this.B(b.b());
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        this.c.e(null);
        this.u();
    }
    
    @Override
    public void onMethodCall(final j j, final d d) {
        final Map map = (Map)j.b();
        final String a = j.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1749611585: {
                if (!a.equals("Query#observe")) {
                    break;
                }
                n = 14;
                break;
            }
            case 1653150716: {
                if (!a.equals("FirebaseDatabase#goOnline")) {
                    break;
                }
                n = 13;
                break;
            }
            case 1185022340: {
                if (!a.equals("OnDisconnect#setWithPriority")) {
                    break;
                }
                n = 12;
                break;
            }
            case 734082383: {
                if (!a.equals("DatabaseReference#set")) {
                    break;
                }
                n = 11;
                break;
            }
            case 485025361: {
                if (!a.equals("OnDisconnect#update")) {
                    break;
                }
                n = 10;
                break;
            }
            case 272980762: {
                if (!a.equals("Query#keepSynced")) {
                    break;
                }
                n = 9;
                break;
            }
            case 195628283: {
                if (!a.equals("Query#get")) {
                    break;
                }
                n = 8;
                break;
            }
            case -43852798: {
                if (!a.equals("OnDisconnect#cancel")) {
                    break;
                }
                n = 7;
                break;
            }
            case -429179942: {
                if (!a.equals("OnDisconnect#set")) {
                    break;
                }
                n = 6;
                break;
            }
            case -526424742: {
                if (!a.equals("FirebaseDatabase#goOffline")) {
                    break;
                }
                n = 5;
                break;
            }
            case -858161988: {
                if (!a.equals("DatabaseReference#update")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1481870471: {
                if (!a.equals("DatabaseReference#setWithPriority")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1666493916: {
                if (!a.equals("FirebaseDatabase#purgeOutstandingWrites")) {
                    break;
                }
                n = 2;
                break;
            }
            case -2059578349: {
                if (!a.equals("DatabaseReference#setPriority")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2082411450: {
                if (!a.equals("DatabaseReference#runTransaction")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        V2.j i = null;
        switch (n) {
            default: {
                d.c();
                return;
            }
            case 14: {
                i = this.V(map);
                break;
            }
            case 13: {
                i = this.A(map);
                break;
            }
            case 12: {
                i = this.g0(map);
                break;
            }
            case 11: {
                i = this.e0(map);
                break;
            }
            case 10: {
                i = this.i0(map);
                break;
            }
            case 9: {
                i = this.Y(map);
                break;
            }
            case 8: {
                i = this.X(map);
                break;
            }
            case 7: {
                i = this.t(map);
                break;
            }
            case 6: {
                i = this.c0(map);
                break;
            }
            case 5: {
                i = this.z(map);
                break;
            }
            case 4: {
                i = this.h0(map);
                break;
            }
            case 3: {
                i = this.f0(map);
                break;
            }
            case 2: {
                i = this.W(map);
                break;
            }
            case 1: {
                i = this.d0(map);
                break;
            }
            case 0: {
                i = this.a0(map);
                break;
            }
        }
        i.b(new o(d, j));
    }
    
    public final V2.j t(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new L5.e(this, map, k));
        return k.a();
    }
    
    public final void u() {
        this.Z();
        w.e.clear();
    }
    
    public h w(final Map map) {
        String s;
        if ((s = map.get("appName")) == null) {
            s = "[DEFAULT]";
        }
        String str;
        if ((str = map.get("databaseURL")) == null) {
            str = "";
        }
        final String concat = s.concat(str);
        final h v = v(concat);
        if (v != null) {
            return v;
        }
        final s3.e p = s3.e.p(s);
        h h;
        if (!str.isEmpty()) {
            h = Q3.h.e(p, str);
        }
        else {
            h = Q3.h.d(p);
        }
        final Boolean b = (Boolean)map.get("loggingEnabled");
        final Boolean b2 = (Boolean)map.get("persistenceEnabled");
        final String s2 = map.get("emulatorHost");
        final Integer n = (Integer)map.get("emulatorPort");
        final String value = map.get("cacheSizeBytes");
        Q3.l l;
        long longValue;
        String message;
        Q3.d d;
        final Q3.d d2;
        Block_14_Outer:Label_0302_Outer:
        while (true) {
            if (b != null) {
                while (true) {
                    try {
                        if (b) {
                            l = Q3.l.o;
                        }
                        else {
                            l = Q3.l.s;
                        }
                        h.k(l);
                        if (s2 != null && n != null) {
                            h.n(s2, n);
                        }
                        if (b2 != null) {
                            h.m(b2);
                        }
                        // iftrue(Label_0325:, !message.contains((CharSequence)"must be made before any other usage of FirebaseDatabase"))
                        // iftrue(Label_0328:, message == null)
                        while (true) {
                            while (true) {
                                if (value != null) {
                                    if (value instanceof Long) {
                                        longValue = (long)value;
                                    }
                                    else {
                                        if (!(value instanceof Integer)) {
                                            break Label_0331;
                                        }
                                        longValue = (int)value;
                                    }
                                    h.l(longValue);
                                }
                                b0(h, concat);
                                return h;
                                continue Block_14_Outer;
                            }
                            message = d.getMessage();
                            continue Label_0302_Outer;
                        }
                        Label_0325: {
                            throw d;
                        }
                        Label_0328:
                        throw d;
                    }
                    catch (Q3.d d2) {}
                    d = d2;
                    continue;
                }
            }
            continue;
        }
    }
    
    public final p x(final Map map) {
        final e y = this.y(map);
        final List value = map.get("modifiers");
        Objects.requireNonNull((Object)value);
        return new A(y, value).a();
    }
    
    public final e y(final Map map) {
        final h w = this.w(map);
        final String value = map.get("path");
        Objects.requireNonNull(value);
        return w.f(value);
    }
    
    public final V2.j z(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new L5.h(this, map, k));
        return k.a();
    }
}
