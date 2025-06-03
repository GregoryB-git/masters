/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.CopyOnWriteArraySet
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package J1;

import O1.P;
import O1.v;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;

public final class a {
    public static final a a = new a();
    public static boolean b;
    public static final String c;
    public static final List d;
    public static final Set e;

    static {
        c = a.class.getCanonicalName();
        d = new ArrayList();
        e = new CopyOnWriteArraySet();
    }

    public static final void a() {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            b = true;
            a.c();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, a.class);
            return;
        }
    }

    public static final String e(String string2) {
        Throwable throwable2;
        block4 : {
            if (T1.a.d(a.class)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(string2, "eventName");
                if (b && a.d(string2)) {
                    return "_removed_";
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            return string2;
        }
        T1.a.b(throwable2, a.class);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void f(Map map, String string2) {
        if (T1.a.d(a.class)) {
            return;
        }
        Intrinsics.checkNotNullParameter((Object)map, "parameters");
        Intrinsics.checkNotNullParameter(string2, "eventName");
        if (!b) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (String string3 : new ArrayList((Collection)map.keySet())) {
            String string4 = a.b(string2, string3);
            if (string4 == null) continue;
            hashMap.put((Object)string3, (Object)string4);
            map.remove((Object)string3);
        }
        boolean bl = hashMap.isEmpty();
        if (!(bl ^ true)) return;
        try {
            string2 = new JSONObject();
            hashMap = hashMap.entrySet().iterator();
            do {
                if (!hashMap.hasNext()) {
                    map.put((Object)"_restrictedParams", (Object)string2.toString());
                    return;
                }
                Iterator iterator = (Map.Entry)hashMap.next();
                string2.put((String)iterator.getKey(), (Object)((String)iterator.getValue()));
            } while (true);
        }
        catch (JSONException jSONException) {
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, a.class);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final String b(String string2, String string3) {
        block7 : {
            if (T1.a.d(this)) {
                return null;
            }
            try {
                var3_5 = new ArrayList((Collection)a.d).iterator();
                block4 : do lbl-1000: // 3 sources:
                {
                    if (var3_5.hasNext() == false) return null;
                    a8 = (a)var3_5.next();
                    if (a8 == null || !Intrinsics.a(string2, a8.a())) ** GOTO lbl-1000
                    var5_7 = a8.b().keySet().iterator();
                    do {
                        if (!var5_7.hasNext()) continue block4;
                    } while (!Intrinsics.a(string3, string4 = (String)var5_7.next()));
                    break;
                } while (true);
                return (String)a8.b().get((Object)string4);
            }
            catch (Throwable throwable2) {
                break block7;
            }
            catch (Exception exception) {
                Log.w((String)a.c, (String)"getMatchedRuleType failed", (Throwable)exception);
            }
            return null;
        }
        T1.a.b(throwable2, this);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Object object = v.a;
            object = v.q(B.m(), false);
            if (object == null) {
                return;
            }
            if ((object = object.i()) == null) return;
            if (object.length() == 0) {
                return;
            }
            object = new JSONObject((String)object);
            d.clear();
            e.clear();
            Iterator iterator = object.keys();
            while (iterator.hasNext()) {
                Object object2 = (String)iterator.next();
                JSONObject jSONObject = object.getJSONObject((String)object2);
                if (jSONObject == null) continue;
                JSONObject jSONObject2 = jSONObject.optJSONObject("restrictive_param");
                Intrinsics.checkNotNullExpressionValue(object2, "key");
                object2 = new a((String)object2, (Map)new HashMap());
                if (jSONObject2 != null) {
                    object2.c(P.o(jSONObject2));
                    d.add(object2);
                }
                if (!jSONObject.has("process_event_name")) continue;
                e.add((Object)object2.a());
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    public final boolean d(String string2) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            boolean bl = e.contains((Object)string2);
            return bl;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return false;
        }
    }

    public static final class a {
        public String a;
        public Map b;

        public a(String string2, Map map) {
            Intrinsics.checkNotNullParameter(string2, "eventName");
            Intrinsics.checkNotNullParameter((Object)map, "restrictiveParams");
            this.a = string2;
            this.b = map;
        }

        public final String a() {
            return this.a;
        }

        public final Map b() {
            return this.b;
        }

        public final void c(Map map) {
            Intrinsics.checkNotNullParameter((Object)map, "<set-?>");
            this.b = map;
        }
    }

}

