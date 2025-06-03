// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M5;

import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import P4.s;
import java.util.Iterator;
import P4.t;
import P4.m;
import java.util.Collection;
import P4.b;
import P4.o;
import java.util.ArrayList;
import P4.c;
import java.util.Objects;
import P4.r;
import P4.n;
import P4.p;
import V2.j;
import android.os.Looper;
import java.util.HashMap;
import android.os.Handler;
import java.util.Map;
import E5.d;
import A5.a;
import E5.k;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;

public class e implements FlutterFirebasePlugin, k.c, a, d.d
{
    public k a;
    public final Map b;
    public d c;
    public final Handler d;
    
    public e() {
        this.b = new HashMap();
        this.d = new Handler(Looper.getMainLooper());
    }
    
    public static /* synthetic */ Handler f(final e e) {
        return e.d;
    }
    
    @Override
    public void a(Object value) {
        value = ((Map)value).get("appName");
        Objects.requireNonNull(value);
        final String s = (String)value;
        final P4.d d = this.b.get(s);
        if (d != null) {
            d.remove();
            this.b.remove(s);
        }
    }
    
    @Override
    public void b(final Object o, final d.b b) {
        final Map map = (Map)o;
        final m i = this.i(map);
        final String value = map.get("appName");
        Objects.requireNonNull(value);
        this.b.put(value, i.i(new c() {
            @Override
            public void a(final o o) {
                b.b("firebase_remote_config", o.getMessage(), null);
            }
            
            @Override
            public void b(final b b) {
                e.f(e.this).post((Runnable)new d(b, new ArrayList(b.b())));
            }
        }));
    }
    
    @Override
    public j didReinitializeFirebaseCore() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(k));
        return k.a();
    }
    
    public final Map g(final t t) {
        final HashMap<String, byte[]> hashMap = new HashMap<String, byte[]>();
        hashMap.put("value", t.e());
        hashMap.put("source", (byte[])(Object)this.n(t.f()));
        return hashMap;
    }
    
    @Override
    public j getPluginConstantsForFirebaseApp(final s3.e e) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, e, k));
        return k.a();
    }
    
    public final Map h(final m m) {
        final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        hashMap.put("fetchTimeout", m.n().b().a());
        hashMap.put("minimumFetchInterval", m.n().b().b());
        hashMap.put("lastFetchTime", m.n().a());
        hashMap.put("lastFetchStatus", this.m(m.n().c()));
        final StringBuilder sb = new StringBuilder();
        sb.append("Sending fetchTimeout: ");
        sb.append(hashMap.get("fetchTimeout"));
        t5.b.a("FRCPlugin", sb.toString());
        return hashMap;
    }
    
    public final m i(final Map map) {
        final String value = map.get("appName");
        Objects.requireNonNull(value);
        return m.o(s3.e.p(value));
    }
    
    public final String m(final int n) {
        if (n == -1) {
            return "success";
        }
        if (n == 0) {
            return "noFetchYet";
        }
        if (n != 2) {
            return "failure";
        }
        return "throttled";
    }
    
    public final String n(final int n) {
        if (n == 1) {
            return "default";
        }
        if (n != 2) {
            return "static";
        }
        return "remote";
    }
    
    public final Map o(final Map map) {
        final HashMap<String, Map> hashMap = new HashMap<String, Map>();
        for (final String s : map.keySet()) {
            final t obj = (t)map.get(s);
            Objects.requireNonNull(obj);
            hashMap.put(s, this.g(obj));
        }
        return hashMap;
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        this.p(b.b());
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        this.q();
    }
    
    @Override
    public void onMethodCall(final E5.j j, final k.d d) {
        final m i = this.i((Map)j.b());
        final String a = j.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1069772825: {
                if (!a.equals("RemoteConfig#setDefaults")) {
                    break;
                }
                n = 7;
                break;
            }
            case 198105259: {
                if (!a.equals("RemoteConfig#fetchAndActivate")) {
                    break;
                }
                n = 6;
                break;
            }
            case 120001542: {
                if (!a.equals("RemoteConfig#getAll")) {
                    break;
                }
                n = 5;
                break;
            }
            case 47629262: {
                if (!a.equals("RemoteConfig#activate")) {
                    break;
                }
                n = 4;
                break;
            }
            case 2948543: {
                if (!a.equals("RemoteConfig#fetch")) {
                    break;
                }
                n = 3;
                break;
            }
            case -824350930: {
                if (!a.equals("RemoteConfig#getProperties")) {
                    break;
                }
                n = 2;
                break;
            }
            case -967766516: {
                if (!a.equals("RemoteConfig#setConfigSettings")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1145383109: {
                if (!a.equals("RemoteConfig#ensureInitialized")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        j k = null;
        Label_0493: {
            Map map = null;
            switch (n) {
                default: {
                    d.c();
                    return;
                }
                case 7: {
                    final Map obj = (Map)j.a("defaults");
                    Objects.requireNonNull(obj);
                    k = i.z(obj);
                    break Label_0493;
                }
                case 6: {
                    k = i.l();
                    break Label_0493;
                }
                case 5: {
                    map = this.o(i.m());
                    break;
                }
                case 4: {
                    k = i.h();
                    break Label_0493;
                }
                case 3: {
                    k = i.k();
                    break Label_0493;
                }
                case 2: {
                    map = this.h(i);
                    break;
                }
                case 1: {
                    final Integer obj2 = (Integer)j.a("fetchTimeout");
                    Objects.requireNonNull(obj2);
                    final int intValue = obj2;
                    final Integer obj3 = (Integer)j.a("minimumFetchInterval");
                    Objects.requireNonNull(obj3);
                    k = i.x(new s.b().d(intValue).e(obj3).c());
                    break Label_0493;
                }
                case 0: {
                    k = V2.m.g(i.j());
                    break Label_0493;
                }
            }
            k = V2.m.e(map);
        }
        k.b(new c(d));
    }
    
    public final void p(final E5.c c) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_remote_config", this);
        (this.a = new k(c, "plugins.flutter.io/firebase_remote_config")).e((k.c)this);
        (this.c = new d(c, "plugins.flutter.io/firebase_remote_config_updated")).d((d.d)this);
    }
    
    public final void q() {
        this.a.e(null);
        this.a = null;
        this.c.d(null);
        this.c = null;
    }
}
