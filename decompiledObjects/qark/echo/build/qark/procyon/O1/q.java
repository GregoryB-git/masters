// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import android.os.BaseBundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import x1.a;
import x1.F;
import android.os.Bundle;
import org.json.JSONArray;
import java.util.concurrent.Executor;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Arrays;
import kotlin.jvm.internal.x;
import x1.B;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.v;
import P1.b;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class q
{
    public static final q a;
    public static final String b;
    public static final AtomicBoolean c;
    public static final ConcurrentLinkedQueue d;
    public static final Map e;
    public static Long f;
    public static b g;
    
    static {
        a = new q();
        b = v.b(q.class).a();
        c = new AtomicBoolean(false);
        d = new ConcurrentLinkedQueue();
        e = new ConcurrentHashMap();
    }
    
    public static final boolean d(final String s, final String s2, final boolean b) {
        Intrinsics.checkNotNullParameter(s, "name");
        final Map e = q.a.e(s2);
        if (!e.containsKey(s)) {
            return b;
        }
        final Boolean b2 = e.get(s);
        if (b2 == null) {
            return b;
        }
        return b2;
    }
    
    public static final void h(a e) {
        // monitorenter(q.class)
        Label_0018: {
            if (e == null) {
                break Label_0018;
            }
            while (true) {
                try {
                    q.d.add(e);
                    final String m = B.m();
                    final q a = q.a;
                    if (a.f(q.f) && q.e.containsKey(m)) {
                        a.k();
                        // monitorexit(q.class)
                        return;
                    }
                    final Context l = B.l();
                    final x a2 = x.a;
                    final String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[] { m }, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    if (l == null) {
                        // monitorexit(q.class)
                        return;
                    }
                    final SharedPreferences sharedPreferences = l.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0);
                    e = null;
                    final String string = sharedPreferences.getString(format, (String)null);
                    if (!P.c0(string)) {
                        try {
                            e = (a)new JSONObject(string);
                        }
                        catch (JSONException ex) {
                            P.i0("FacebookSDK", (Exception)ex);
                        }
                        if (e != null) {
                            j(m, (JSONObject)e);
                        }
                    }
                    final Executor t = B.t();
                    if (t == null) {
                        // monitorexit(q.class)
                        return;
                    }
                    if (!q.c.compareAndSet(false, true)) {
                        // monitorexit(q.class)
                        return;
                    }
                    t.execute(new o(m, l, format));
                    // monitorexit(q.class)
                    return;
                    // monitorexit(q.class)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
    
    public static final void i(final String s, final Context context, final String s2) {
        Intrinsics.checkNotNullParameter(s, "$applicationId");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(s2, "$gateKeepersKey");
        final q a = q.a;
        final JSONObject c = a.c(s);
        if (c.length() != 0) {
            j(s, c);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(s2, c.toString()).apply();
            q.f = System.currentTimeMillis();
        }
        a.k();
        q.c.set(false);
    }
    
    public static final JSONObject j(final String s, JSONObject jsonObject) {
        while (true) {
            // monitorenter(q.class)
        Label_0119:
            while (true) {
                int n = 0;
                while (true) {
                    int length = 0;
                Label_0067_Outer:
                    while (true) {
                    Label_0067:
                        while (true) {
                        Block_8_Outer:
                            while (true) {
                                try {
                                    Intrinsics.checkNotNullParameter(s, "applicationId");
                                    JSONObject jsonObject2;
                                    if ((jsonObject2 = q.e.get(s)) == null) {
                                        jsonObject2 = new JSONObject();
                                    }
                                    break Block_8_Outer;
                                    jsonObject = (JSONObject)jsonObject.optJSONArray("data");
                                    // iftrue(Label_0061:, jsonObject != null)
                                    // monitorexit(q.class)
                                    // iftrue(Label_0083:, jsonObject != null)
                                    // monitorexit(q.class)
                                    // iftrue(Label_0167:, length <= 0)
                                    while (true) {
                                        Label_0083: {
                                            Label_0108: {
                                                Block_6: {
                                                    break Block_6;
                                                    throw;
                                                    while (true) {
                                                        JSONObject jsonObject3 = new JSONObject();
                                                        break Label_0083;
                                                        jsonObject = (JSONObject)new JSONArray();
                                                        break Label_0108;
                                                        jsonObject3 = jsonObject;
                                                        continue Block_8_Outer;
                                                    }
                                                    final int n2;
                                                    n = n2 + 1;
                                                    try {
                                                        final JSONObject jsonObject4 = ((JSONArray)jsonObject).getJSONObject(n2);
                                                        jsonObject2.put(jsonObject4.getString("key"), jsonObject4.getBoolean("value"));
                                                    }
                                                    catch (JSONException ex) {
                                                        P.i0("FacebookSDK", (Exception)ex);
                                                    }
                                                    break Label_0067_Outer;
                                                    q.e.put(t, jsonObject2);
                                                    return jsonObject2;
                                                }
                                                final JSONObject jsonObject5;
                                                jsonObject = jsonObject5;
                                                continue Label_0067;
                                                Label_0061: {
                                                    jsonObject = ((JSONArray)jsonObject).optJSONObject(0);
                                                }
                                                continue Label_0067;
                                            }
                                            length = ((JSONArray)jsonObject).length();
                                            continue Label_0119;
                                        }
                                        continue Label_0067_Outer;
                                    }
                                }
                                // iftrue(Label_0108:, jsonObject = jsonObject3.optJSONArray("gatekeepers") != null)
                                finally {
                                    continue Label_0067_Outer;
                                }
                                break;
                            }
                            final int n2 = 0;
                            final JSONObject jsonObject5 = null;
                            if (jsonObject == null) {
                                jsonObject = jsonObject5;
                                continue Label_0067;
                            }
                            break;
                        }
                        continue Label_0067_Outer;
                    }
                    if (n >= length) {
                        continue;
                    }
                    break;
                }
                final int n2 = n;
                continue Label_0119;
            }
        }
    }
    
    public static final void l(final a a) {
        a.a();
    }
    
    public static final JSONObject m(final String s, final boolean b) {
        Intrinsics.checkNotNullParameter(s, "applicationId");
        if (!b) {
            final Map e = q.e;
            if (e.containsKey(s)) {
                JSONObject jsonObject;
                if ((jsonObject = e.get(s)) == null) {
                    jsonObject = new JSONObject();
                }
                return jsonObject;
            }
        }
        final JSONObject c = q.a.c(s);
        final Context l = B.l();
        final x a = x.a;
        final String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[] { s }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        l.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, c.toString()).apply();
        return j(s, c);
    }
    
    public final JSONObject c(final String s) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("platform", "android");
        ((BaseBundle)bundle).putString("sdk_version", B.B());
        ((BaseBundle)bundle).putString("fields", "gatekeepers");
        final F.c n = F.n;
        final x a = x.a;
        final String format = String.format("app/%s", Arrays.copyOf(new Object[] { "mobile_sdk_gk" }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        final F x = n.x(null, format, null);
        x.G(bundle);
        JSONObject d;
        if ((d = x.k().d()) == null) {
            d = new JSONObject();
        }
        return d;
    }
    
    public final Map e(final String s) {
        this.g();
        if (s != null) {
            final Map e = q.e;
            if (e.containsKey(s)) {
                final b g = q.g;
                List<P1.a> a;
                if (g == null) {
                    a = null;
                }
                else {
                    a = (List<P1.a>)g.a(s);
                }
                HashMap<String, Boolean> hashMap2;
                if (a != null) {
                    final HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
                    final Iterator<Object> iterator = a.iterator();
                    while (true) {
                        hashMap2 = hashMap;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final P1.a a2 = iterator.next();
                        hashMap.put(a2.a(), a2.b());
                    }
                }
                else {
                    final HashMap<String, Boolean> hashMap3 = new HashMap<String, Boolean>();
                    JSONObject jsonObject;
                    if ((jsonObject = e.get(s)) == null) {
                        jsonObject = new JSONObject();
                    }
                    final Iterator keys = jsonObject.keys();
                    while (keys.hasNext()) {
                        final String s2 = keys.next();
                        Intrinsics.checkNotNullExpressionValue(s2, "key");
                        hashMap3.put(s2, jsonObject.optBoolean(s2));
                    }
                    b g2;
                    if ((g2 = q.g) == null) {
                        g2 = new b();
                    }
                    final ArrayList list = new ArrayList<P1.a>(hashMap3.size());
                    for (final Map.Entry<String, Boolean> entry : hashMap3.entrySet()) {
                        list.add(new P1.a(entry.getKey(), entry.getValue()));
                    }
                    g2.b(s, list);
                    q.g = g2;
                    hashMap2 = hashMap3;
                }
                return hashMap2;
            }
        }
        return new HashMap();
    }
    
    public final boolean f(final Long n) {
        boolean b = false;
        if (n == null) {
            return false;
        }
        if (System.currentTimeMillis() - n < 3600000L) {
            b = true;
        }
        return b;
    }
    
    public final void g() {
        h(null);
    }
    
    public final void k() {
        final Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            final ConcurrentLinkedQueue d = q.d;
            if (d.isEmpty()) {
                break;
            }
            final a a = d.poll();
            if (a == null) {
                continue;
            }
            handler.post((Runnable)new p(a));
        }
    }
    
    public interface a
    {
        void a();
    }
}
