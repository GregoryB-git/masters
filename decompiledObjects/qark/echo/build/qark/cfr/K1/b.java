/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.view.View
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package K1;

import C1.f;
import O1.P;
import T1.a;
import W5.C;
import android.content.SharedPreferences;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;

public final class b {
    public static final b a = new b();
    public static final Map b = new LinkedHashMap();
    public static SharedPreferences c;
    public static final AtomicBoolean d;

    static {
        d = new AtomicBoolean(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(String string2, String object) {
        if (a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "pathID");
            Intrinsics.checkNotNullParameter(object, "predictedEvent");
            if (!d.get()) {
                a.c();
            }
            Map map = b;
            map.put((Object)string2, object);
            string2 = c;
            if (string2 != null) {
                string2 = string2.edit();
                object = P.a;
                string2.putString("SUGGESTED_EVENTS_HISTORY", P.l0(C.m(map))).apply();
                return;
            }
            Intrinsics.n("shardPreferences");
            throw null;
        }
        catch (Throwable throwable) {}
        a.b(throwable, b.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String b(View object, String string2) {
        if (a.d(b.class)) {
            return null;
        }
        try {
            JSONObject jSONObject;
            Intrinsics.checkNotNullParameter(object, "view");
            Intrinsics.checkNotNullParameter(string2, "text");
            jSONObject = new JSONObject();
            try {
                jSONObject.put("text", (Object)string2);
                string2 = new JSONArray();
                while (object != null) {
                    string2.put((Object)object.getClass().getSimpleName());
                    object = f.j((View)object);
                }
                jSONObject.put("classname", (Object)string2);
            }
            catch (JSONException jSONException) {}
            object = P.a;
            return P.F0(jSONObject.toString());
        }
        catch (Throwable throwable) {}
        a.b(throwable, b.class);
        return null;
    }

    public static final String d(String string2) {
        Throwable throwable2;
        block4 : {
            if (a.d(b.class)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(string2, "pathID");
                Map map = b;
                if (map.containsKey((Object)string2)) {
                    string2 = (String)map.get((Object)string2);
                    return string2;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            return null;
        }
        a.b(throwable2, b.class);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Object object = "";
        if (a.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = d;
            if (atomicBoolean.get()) {
                return;
            }
            Object object2 = B.l().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            Intrinsics.checkNotNullExpressionValue(object2, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            c = object2;
            Map map = b;
            object2 = P.a;
            object2 = c;
            if (object2 == null) {
                Intrinsics.n("shardPreferences");
                throw null;
            }
            if ((object2 = object2.getString("SUGGESTED_EVENTS_HISTORY", "")) != null) {
                object = object2;
            }
            map.putAll(P.h0((String)object));
            atomicBoolean.set(true);
            return;
        }
        catch (Throwable throwable) {}
        a.b(throwable, this);
    }
}

