/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package O1;

import O1.P;
import O1.o;
import O1.p;
import P1.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.K;

public final class q {
    public static final q a = new q();
    public static final String b = v.b(q.class).a();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    public static final Map e = new ConcurrentHashMap();
    public static Long f;
    public static b g;

    public static /* synthetic */ void a(a a8) {
        q.l(a8);
    }

    public static /* synthetic */ void b(String string2, Context context, String string3) {
        q.i(string2, context, string3);
    }

    public static final boolean d(String string2, String string3, boolean bl) {
        Intrinsics.checkNotNullParameter(string2, "name");
        string3 = a.e(string3);
        if (!string3.containsKey((Object)string2)) {
            return bl;
        }
        if ((string2 = (Boolean)string3.get((Object)string2)) == null) {
            return bl;
        }
        return string2.booleanValue();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static final void h(a var0) {
        block14 : {
            block13 : {
                block12 : {
                    block11 : {
                        // MONITORENTER : O1.q.class
                        if (var0 == null) ** GOTO lbl5
                        q.d.add(var0);
lbl5: // 2 sources:
                        var3_2 = B.m();
                        var0 = q.a;
                        if (!var0.f(q.f) || !q.e.containsKey((Object)var3_2)) break block11;
                        var0.k();
                        return;
                    }
                    var4_3 = B.l();
                    var0 = x.a;
                    var5_4 = String.format((String)"com.facebook.internal.APP_GATEKEEPERS.%s", (Object[])Arrays.copyOf((Object[])new Object[]{var3_2}, (int)1));
                    Intrinsics.checkNotNullExpressionValue(var5_4, "java.lang.String.format(format, *args)");
                    if (var4_3 != null) break block12;
                    // MONITOREXIT : O1.q.class
                    return;
                }
                var2_5 = var4_3.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0);
                var0 = null;
                var2_5 = var2_5.getString(var5_4, null);
                var1_7 = P.c0((String)var2_5);
                if (!var1_7) {
                    try {
                        var0 = var2_5 = new JSONObject((String)var2_5);
                    }
                    catch (JSONException var2_6) {
                        P.i0("FacebookSDK", (Exception)var2_6);
                    }
                    if (var0 != null) {
                        q.j(var3_2, (JSONObject)var0);
                    }
                }
                if ((var0 = B.t()) != null) break block13;
                // MONITOREXIT : O1.q.class
                return;
            }
            var1_7 = q.c.compareAndSet(false, true);
            if (var1_7) break block14;
            // MONITOREXIT : O1.q.class
            return;
        }
        var0.execute((Runnable)new o(var3_2, var4_3, var5_4));
        // MONITOREXIT : O1.q.class
    }

    public static final void i(String string2, Context context, String string3) {
        Intrinsics.checkNotNullParameter(string2, "$applicationId");
        Intrinsics.checkNotNullParameter((Object)context, "$context");
        Intrinsics.checkNotNullParameter(string3, "$gateKeepersKey");
        q q8 = a;
        JSONObject jSONObject = q8.c(string2);
        if (jSONObject.length() != 0) {
            q.j(string2, jSONObject);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(string3, jSONObject.toString()).apply();
            f = System.currentTimeMillis();
        }
        q8.k();
        c.set(false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static final JSONObject j(String var0, JSONObject var1_2) {
        // MONITORENTER : O1.q.class
        Intrinsics.checkNotNullParameter(var0, "applicationId");
        var5_5 = var6_3 = (JSONObject)q.e.get((Object)var0);
        if (var6_3 == null) {
            var5_5 = new JSONObject();
        }
        var2_6 = 0;
        var6_3 = null;
        var1_2 = var1_2 == null ? var6_3 : ((var1_2 = var1_2.optJSONArray("data")) == null ? var6_3 : var1_2.optJSONObject(0));
        var6_3 = var1_2;
        if (var1_2 == null) {
            var6_3 = new JSONObject();
        }
        var1_2 = var6_3 = var6_3.optJSONArray("gatekeepers");
        if (var6_3 == null) {
            var1_2 = new JSONArray();
        }
        ** if ((var4_7 = var1_2.length()) <= 0) goto lbl27
lbl-1000: // 1 sources:
        {
            do lbl-1000: // 2 sources:
            {
                var3_8 = var2_6 + 1;
                try {
                    var6_3 = var1_2.getJSONObject(var2_6);
                    var5_5.put(var6_3.getString("key"), var6_3.getBoolean("value"));
                }
                catch (JSONException var6_4) {
                    P.i0("FacebookSDK", (Exception)var6_4);
                }
                break;
            } while (true);
        }
lbl27: // 1 sources:
        ** GOTO lbl31
        {
            block16 : {
                catch (Throwable var0_1) {
                    throw var0_1;
                }
                if (var3_8 < var4_7) break block16;
lbl31: // 2 sources:
                q.e.put((Object)var0, (Object)var5_5);
                // MONITOREXIT : O1.q.class
                return var5_5;
            }
            var2_6 = var3_8;
            ** while (true)
        }
    }

    public static final void l(a a8) {
        a8.a();
    }

    public static final JSONObject m(String string2, boolean bl) {
        Map map;
        Intrinsics.checkNotNullParameter(string2, "applicationId");
        if (!bl && (map = e).containsKey((Object)string2)) {
            map = (JSONObject)map.get((Object)string2);
            string2 = map;
            if (map == null) {
                string2 = new JSONObject();
            }
            return string2;
        }
        map = a.c(string2);
        Context context = B.l();
        Object object = x.a;
        object = String.format((String)"com.facebook.internal.APP_GATEKEEPERS.%s", (Object[])Arrays.copyOf((Object[])new Object[]{string2}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString((String)object, map.toString()).apply();
        return q.j(string2, (JSONObject)map);
    }

    public final JSONObject c(String object) {
        object = new Bundle();
        object.putString("platform", "android");
        object.putString("sdk_version", B.B());
        object.putString("fields", "gatekeepers");
        Object object2 = F.n;
        Object object3 = x.a;
        object3 = String.format((String)"app/%s", (Object[])Arrays.copyOf((Object[])new Object[]{"mobile_sdk_gk"}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object3, "java.lang.String.format(format, *args)");
        object2 = object2.x(null, (String)object3, null);
        object2.G((Bundle)object);
        object = object2 = object2.k().d();
        if (object2 == null) {
            object = new JSONObject();
        }
        return object;
    }

    public final Map e(String object) {
        Object object2;
        this.g();
        if (object != null && (object2 = e).containsKey(object)) {
            Object object3 = g;
            object3 = object3 == null ? null : object3.a((String)object);
            if (object3 != null) {
                HashMap hashMap = new HashMap();
                object3 = ((Iterable)object3).iterator();
                do {
                    object = hashMap;
                    if (object3.hasNext()) {
                        object = (P1.a)object3.next();
                        hashMap.put((Object)object.a(), (Object)object.b());
                        continue;
                    }
                    break;
                } while (true);
            } else {
                HashMap hashMap = new HashMap();
                object3 = object2 = (JSONObject)object2.get(object);
                if (object2 == null) {
                    object3 = new JSONObject();
                }
                object2 = object3.keys();
                while (object2.hasNext()) {
                    String string2 = (String)object2.next();
                    Intrinsics.checkNotNullExpressionValue(string2, "key");
                    hashMap.put((Object)string2, (Object)object3.optBoolean(string2));
                }
                object3 = object2 = g;
                if (object2 == null) {
                    object3 = new b();
                }
                object2 = new ArrayList(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    object2.add((Object)new P1.a((String)entry.getKey(), (Boolean)entry.getValue()));
                }
                object3.b((String)object, (List)object2);
                g = object3;
                object = hashMap;
            }
            return object;
        }
        return new HashMap();
    }

    public final boolean f(Long l8) {
        boolean bl = false;
        if (l8 == null) {
            return false;
        }
        if (System.currentTimeMillis() - l8 < 3600000L) {
            bl = true;
        }
        return bl;
    }

    public final void g() {
        q.h(null);
    }

    public final void k() {
        Object object;
        Handler handler = new Handler(Looper.getMainLooper());
        while (!(object = d).isEmpty()) {
            if ((object = (a)object.poll()) == null) continue;
            handler.post((Runnable)new p((a)object));
        }
    }

    public static interface a {
        public void a();
    }

}

