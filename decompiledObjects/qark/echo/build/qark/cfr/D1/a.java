/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package D1;

import O1.P;
import O1.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.B;
import y1.e;

public final class a {
    public static final a a = new a();
    public static boolean b;
    public static final List c;
    public static final Set d;

    static {
        c = new ArrayList();
        d = new HashSet();
    }

    public static final void a() {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            b = true;
            a.b();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, a.class);
            return;
        }
    }

    public static final void c(Map map, String string2) {
        Throwable throwable2;
        block6 : {
            if (T1.a.d(a.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter((Object)map, "parameters");
                Intrinsics.checkNotNullParameter(string2, "eventName");
                if (!b) {
                    return;
                }
                ArrayList arrayList = new ArrayList((Collection)map.keySet());
                for (a a8 : new ArrayList((Collection)c)) {
                    if (!Intrinsics.a(a8.b(), string2)) continue;
                    for (String string3 : arrayList) {
                        if (!a8.a().contains((Object)string3)) continue;
                        map.remove((Object)string3);
                    }
                }
            }
            catch (Throwable throwable2) {
                break block6;
            }
            return;
        }
        T1.a.b(throwable2, a.class);
    }

    public static final void d(List list) {
        Throwable throwable2;
        block5 : {
            if (T1.a.d(a.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter((Object)list, "events");
                if (!b) {
                    return;
                }
                list = list.iterator();
                while (list.hasNext()) {
                    e e8 = (e)list.next();
                    if (!d.contains((Object)e8.f())) continue;
                    list.remove();
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            return;
        }
        T1.a.b(throwable2, a.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b() {
        Throwable throwable2;
        block13 : {
            Object object;
            block12 : {
                block11 : {
                    // MONITORENTER : this
                    boolean bl = T1.a.d(this);
                    if (!bl) break block11;
                    // MONITOREXIT : this
                    return;
                }
                object = v.a;
                object = v.q(B.m(), false);
                if (object != null) break block12;
                // MONITOREXIT : this
                return;
            }
            try {
                object = object.i();
                if (object == null || object.length() <= 0) break block13;
                object = new JSONObject((String)object);
                c.clear();
                Iterator iterator = object.keys();
                while (iterator.hasNext()) {
                    Object object2 = (String)iterator.next();
                    JSONObject jSONObject = object.getJSONObject((String)object2);
                    if (jSONObject == null) continue;
                    if (jSONObject.optBoolean("is_deprecated_event")) {
                        jSONObject = d;
                        Intrinsics.checkNotNullExpressionValue(object2, "key");
                        jSONObject.add(object2);
                        continue;
                    }
                    jSONObject = jSONObject.optJSONArray("deprecated_param");
                    Intrinsics.checkNotNullExpressionValue(object2, "key");
                    object2 = new a((String)object2, (List)new ArrayList());
                    if (jSONObject != null) {
                        object2.c(P.m((JSONArray)jSONObject));
                    }
                    c.add(object2);
                }
            }
            catch (Exception exception) {
                return;
            }
            catch (Throwable throwable2) {}
        }
        // MONITOREXIT : this
        return;
        T1.a.b(throwable2, this);
        // MONITOREXIT : this
        return;
    }

    public static final class a {
        public String a;
        public List b;

        public a(String string2, List list) {
            Intrinsics.checkNotNullParameter(string2, "eventName");
            Intrinsics.checkNotNullParameter((Object)list, "deprecateParams");
            this.a = string2;
            this.b = list;
        }

        public final List a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final void c(List list) {
            Intrinsics.checkNotNullParameter((Object)list, "<set-?>");
            this.b = list;
        }
    }

}

