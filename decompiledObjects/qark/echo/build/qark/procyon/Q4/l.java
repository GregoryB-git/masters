// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q4;

import P4.t;
import java.util.HashMap;
import java.util.Collection;
import java.util.Map;
import android.util.Log;
import org.json.JSONException;
import java.util.Iterator;
import com.google.firebase.remoteconfig.internal.b;
import E2.d;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.Set;
import java.util.regex.Pattern;
import java.nio.charset.Charset;

public class l
{
    public static final Charset e;
    public static final Pattern f;
    public static final Pattern g;
    public final Set a;
    public final Executor b;
    public final e c;
    public final e d;
    
    static {
        e = Charset.forName("UTF-8");
        f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }
    
    public l(final Executor b, final e c, final e d) {
        this.a = new HashSet();
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static b e(final e e) {
        return e.f();
    }
    
    public static Set f(final e e) {
        final HashSet<String> set = new HashSet<String>();
        final b e2 = e(e);
        if (e2 == null) {
            return set;
        }
        final Iterator keys = e2.f().keys();
        while (keys.hasNext()) {
            set.add(keys.next());
        }
        return set;
    }
    
    public static String g(final e e, final String s) {
        final b e2 = e(e);
        if (e2 == null) {
            return null;
        }
        try {
            return e2.f().getString(s);
        }
        catch (JSONException ex) {
            return null;
        }
    }
    
    public static void j(final String s, final String s2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", s2, s));
    }
    
    public void b(final d d) {
        synchronized (this.a) {
            this.a.add(d);
        }
    }
    
    public final void c(final String s, final b b) {
        if (b == null) {
            return;
        }
        final Set a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                final Iterator<d> iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    this.b.execute(new k(iterator.next(), s, b));
                }
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public Map d() {
        final HashSet<String> set = new HashSet<String>();
        set.addAll((Collection<?>)f(this.c));
        set.addAll((Collection<?>)f(this.d));
        final HashMap<String, t> hashMap = new HashMap<String, t>();
        for (final String key : set) {
            hashMap.put(key, this.h(key));
        }
        return hashMap;
    }
    
    public t h(final String s) {
        final String g = g(this.c, s);
        if (g != null) {
            this.c(s, e(this.c));
            return new q(g, 2);
        }
        final String g2 = g(this.d, s);
        if (g2 != null) {
            return new q(g2, 1);
        }
        j(s, "FirebaseRemoteConfigValue");
        return new q("", 0);
    }
}
