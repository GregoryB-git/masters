// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K1;

import x1.B;
import org.json.JSONException;
import C1.f;
import org.json.JSONArray;
import org.json.JSONObject;
import android.view.View;
import android.content.SharedPreferences$Editor;
import W5.C;
import O1.P;
import kotlin.jvm.internal.Intrinsics;
import T1.a;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.SharedPreferences;
import java.util.Map;

public final class b
{
    public static final b a;
    public static final Map b;
    public static SharedPreferences c;
    public static final AtomicBoolean d;
    
    static {
        a = new b();
        b = new LinkedHashMap();
        d = new AtomicBoolean(false);
    }
    
    public static final void a(final String s, final String s2) {
        if (T1.a.d(b.class)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(s, "pathID");
                Intrinsics.checkNotNullParameter(s2, "predictedEvent");
                if (!K1.b.d.get()) {
                    K1.b.a.c();
                }
                final Map b = K1.b.b;
                b.put(s, s2);
                final SharedPreferences c = K1.b.c;
                if (c != null) {
                    final SharedPreferences$Editor edit = c.edit();
                    final P a = P.a;
                    edit.putString("SUGGESTED_EVENTS_HISTORY", P.l0(C.m(b))).apply();
                    return;
                }
                Intrinsics.n("shardPreferences");
                throw null;
                final Throwable t;
                T1.a.b(t, b.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final String b(View j, final String s) {
        if (T1.a.d(b.class)) {
            return null;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(j, "view");
                Intrinsics.checkNotNullParameter(s, "text");
                final JSONObject jsonObject = new JSONObject();
                try {
                    jsonObject.put("text", (Object)s);
                    final JSONArray jsonArray = new JSONArray();
                    while (j != null) {
                        jsonArray.put((Object)j.getClass().getSimpleName());
                        j = (View)f.j(j);
                    }
                    jsonObject.put("classname", (Object)jsonArray);
                    final P a = P.a;
                    return P.F0(jsonObject.toString());
                    final Throwable t;
                    T1.a.b(t, b.class);
                    return null;
                }
                catch (JSONException ex) {}
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public static final String d(String s) {
        if (T1.a.d(b.class)) {
            return null;
        }
        Label_0049: {
            try {
                Intrinsics.checkNotNullParameter(s, "pathID");
                final Map b = K1.b.b;
                if (b.containsKey(s)) {
                    s = b.get(s);
                    return s;
                }
            }
            finally {
                break Label_0049;
            }
            return null;
        }
        final Throwable t;
        T1.a.b(t, b.class);
        return null;
    }
    
    public final void c() {
        String s = "";
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                final AtomicBoolean d = K1.b.d;
                if (d.get()) {
                    return;
                }
                final SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
                K1.b.c = sharedPreferences;
                final Map b = K1.b.b;
                final P a = P.a;
                final SharedPreferences c = K1.b.c;
                if (c != null) {
                    final String string = c.getString("SUGGESTED_EVENTS_HISTORY", "");
                    if (string != null) {
                        s = string;
                    }
                    b.putAll(P.h0(s));
                    d.set(true);
                    return;
                }
                Intrinsics.n("shardPreferences");
                throw null;
                final Throwable t;
                T1.a.b(t, this);
                return;
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
}
