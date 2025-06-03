// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K1;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import O1.r;
import H1.f;
import O1.v;
import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import T1.a;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e
{
    public static final e a;
    public static final AtomicBoolean b;
    public static final Set c;
    public static final Set d;
    
    static {
        a = new e();
        b = new AtomicBoolean(false);
        c = new LinkedHashSet();
        d = new LinkedHashSet();
    }
    
    public static final void b() {
        synchronized (e.class) {
            if (T1.a.d(e.class)) {
                return;
            }
            try {
                B.t().execute(new d());
            }
            finally {
                final Throwable t;
                T1.a.b(t, e.class);
            }
        }
    }
    
    public static final void c() {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            final AtomicBoolean b = e.b;
            if (b.get()) {
                return;
            }
            b.set(true);
            e.a.d();
        }
        finally {
            final Throwable t;
            T1.a.b(t, e.class);
        }
    }
    
    public static final boolean e(final String s) {
        if (T1.a.d(e.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(s, "event");
            return e.d.contains(s);
        }
        finally {
            final Throwable t;
            T1.a.b(t, e.class);
            return false;
        }
    }
    
    public static final boolean f(final String s) {
        if (T1.a.d(e.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(s, "event");
            return e.c.contains(s);
        }
        finally {
            final Throwable t;
            T1.a.b(t, e.class);
            return false;
        }
    }
    
    public static final void h(final Activity activity) {
        if (T1.a.d(e.class)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(activity, "activity");
                try {
                    if (e.b.get() && K1.a.f() && (!e.c.isEmpty() || !e.d.isEmpty())) {
                        g.r.a(activity);
                        return;
                    }
                    g.r.b(activity);
                    return;
                    final Throwable t;
                    T1.a.b(t, e.class);
                    return;
                }
                catch (Exception ex) {
                    return;
                }
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final void d() {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                final v a = v.a;
                final r q = v.q(B.m(), false);
                if (q == null) {
                    return;
                }
                final String m = q.m();
                if (m == null) {
                    return;
                }
                this.g(m);
                if ((e.c.isEmpty() ^ true) || (e.d.isEmpty() ^ true)) {
                    final f a2 = f.a;
                    final File l = f.l(f.a.p);
                    if (l == null) {
                        return;
                    }
                    K1.a.d(l);
                    final Activity i = G1.f.l();
                    if (i != null) {
                        h(i);
                        return;
                    }
                }
                return;
                final Throwable t;
                T1.a.b(t, this);
                return;
            }
            catch (Exception ex) {
                return;
            }
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final void g(final String s) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            while (true) {
                Label_0181: {
                    try {
                        final Object o = new JSONObject(s);
                        final boolean has = ((JSONObject)o).has("production_events");
                        int n = 0;
                        if (has) {
                            final Object o2 = ((JSONObject)o).getJSONArray("production_events");
                            final int length = ((JSONArray)o2).length();
                            if (length > 0) {
                                final int n2 = 0;
                                final int length2 = n2 + 1;
                                final Set c = e.c;
                                final String string = ((JSONArray)o2).getString(n2);
                                Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                                c.add(string);
                                if (length2 < length) {
                                    break Label_0181;
                                }
                            }
                        }
                        if (((JSONObject)o).has("eligible_for_prediction_events")) {
                            final JSONArray jsonArray = ((JSONObject)o).getJSONArray("eligible_for_prediction_events");
                            final int length2 = jsonArray.length();
                            if (length2 > 0) {
                                int n3 = n;
                                while (true) {
                                    n = n3 + 1;
                                    final Object o2 = e.d;
                                    final String string2 = jsonArray.getString(n3);
                                    Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
                                    ((Set<String>)o2).add(string2);
                                    if (n >= length2) {
                                        break;
                                    }
                                    n3 = n;
                                }
                                return;
                            }
                        }
                        return;
                        T1.a.b((Throwable)o, this);
                        return;
                    }
                    catch (Exception ex) {
                        return;
                        final int length2;
                        final int n2 = length2;
                        continue;
                    }
                }
                break;
            }
            final JSONObject jsonObject;
            final Object o = jsonObject;
            continue;
        }
    }
}
