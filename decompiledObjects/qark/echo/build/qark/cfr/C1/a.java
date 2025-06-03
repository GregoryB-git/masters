/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 *  java.util.Locale
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package C1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public static final b j = new b(null);
    public final String a;
    public final c b;
    public final a c;
    public final String d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;
    public final String i;

    public a(String string2, c c8, a a8, String string3, List list, List list2, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter((Object)c8, "method");
        Intrinsics.checkNotNullParameter((Object)a8, "type");
        Intrinsics.checkNotNullParameter(string3, "appVersion");
        Intrinsics.checkNotNullParameter((Object)list, "path");
        Intrinsics.checkNotNullParameter((Object)list2, "parameters");
        Intrinsics.checkNotNullParameter(string4, "componentId");
        Intrinsics.checkNotNullParameter(string5, "pathType");
        Intrinsics.checkNotNullParameter(string6, "activityName");
        this.a = string2;
        this.b = c8;
        this.c = a8;
        this.d = string3;
        this.e = list;
        this.f = list2;
        this.g = string4;
        this.h = string5;
        this.i = string6;
    }

    public final String a() {
        return this.i;
    }

    public final String b() {
        return this.a;
    }

    public final List c() {
        List list = Collections.unmodifiableList((List)this.f);
        Intrinsics.checkNotNullExpressionValue((Object)list, "unmodifiableList(parameters)");
        return list;
    }

    public final List d() {
        List list = Collections.unmodifiableList((List)this.e);
        Intrinsics.checkNotNullExpressionValue((Object)list, "unmodifiableList(path)");
        return list;
    }

    public static final class a
    extends Enum {
        public static final /* enum */ a o = new a();
        public static final /* enum */ a p = new a();
        public static final /* enum */ a q = new a();
        public static final /* synthetic */ a[] r;

        static {
            r = a.c();
        }

        public static final /* synthetic */ a[] c() {
            return new a[]{o, p, q};
        }

        public static a valueOf(String string2) {
            Intrinsics.checkNotNullParameter(string2, "value");
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            a[] arra = r;
            return (a[])Arrays.copyOf((Object[])arra, (int)arra.length);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        public final a a(JSONObject object) {
            int n8;
            int n9;
            JSONObject jSONObject;
            Intrinsics.checkNotNullParameter(object, "mapping");
            String string2 = object.getString("event_name");
            Object object2 = object.getString("method");
            Intrinsics.checkNotNullExpressionValue(object2, "mapping.getString(\"method\")");
            Object object3 = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(object3, "ENGLISH");
            object2 = object2.toUpperCase((Locale)object3);
            Intrinsics.checkNotNullExpressionValue(object2, "(this as java.lang.String).toUpperCase(locale)");
            object2 = c.valueOf((String)object2);
            String string3 = object.getString("event_type");
            Intrinsics.checkNotNullExpressionValue(string3, "mapping.getString(\"event_type\")");
            Intrinsics.checkNotNullExpressionValue(object3, "ENGLISH");
            object3 = string3.toUpperCase((Locale)object3);
            Intrinsics.checkNotNullExpressionValue(object3, "(this as java.lang.String).toUpperCase(locale)");
            object3 = a.valueOf((String)object3);
            string3 = object.getString("app_version");
            Object object4 = object.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int n10 = object4.length();
            int n11 = 0;
            if (n10 > 0) {
                n9 = 0;
                do {
                    n8 = n9 + 1;
                    jSONObject = object4.getJSONObject(n9);
                    Intrinsics.checkNotNullExpressionValue((Object)jSONObject, "jsonPath");
                    arrayList.add((Object)new C1.c(jSONObject));
                    if (n8 >= n10) break;
                    n9 = n8;
                } while (true);
            }
            object4 = object.optString("path_type", "absolute");
            Object object5 = object.optJSONArray("parameters");
            jSONObject = new ArrayList();
            if (object5 != null && (n8 = object5.length()) > 0) {
                n9 = n11;
                do {
                    n11 = n9 + 1;
                    JSONObject jSONObject2 = object5.getJSONObject(n9);
                    Intrinsics.checkNotNullExpressionValue((Object)jSONObject2, "jsonParameter");
                    jSONObject.add((Object)new C1.b(jSONObject2));
                    if (n11 >= n8) break;
                    n9 = n11;
                } while (true);
            }
            object5 = object.optString("component_id");
            object = object.optString("activity_name");
            Intrinsics.checkNotNullExpressionValue(string2, "eventName");
            Intrinsics.checkNotNullExpressionValue(string3, "appVersion");
            Intrinsics.checkNotNullExpressionValue(object5, "componentId");
            Intrinsics.checkNotNullExpressionValue(object4, "pathType");
            Intrinsics.checkNotNullExpressionValue(object, "activityName");
            return new a(string2, (c)((Object)object2), (a)((Object)object3), string3, (List)arrayList, (List)jSONObject, (String)object5, (String)object4, (String)object);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final List b(JSONArray jSONArray) {
            int n8;
            int n9;
            ArrayList arrayList = new ArrayList();
            if (jSONArray == null) return arrayList;
            try {
                n8 = jSONArray.length();
                if (n8 <= 0) return arrayList;
                n9 = 0;
            }
            catch (IllegalArgumentException | JSONException jSONException) {
                return arrayList;
            }
            do {
                int n10 = n9 + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(n9);
                Intrinsics.checkNotNullExpressionValue((Object)jSONObject, "array.getJSONObject(i)");
                arrayList.add((Object)this.a(jSONObject));
                if (n10 >= n8) {
                    return arrayList;
                }
                n9 = n10;
                continue;
                break;
            } while (true);
        }
    }

    public static final class c
    extends Enum {
        public static final /* enum */ c o = new c();
        public static final /* enum */ c p = new c();
        public static final /* synthetic */ c[] q;

        static {
            q = c.c();
        }

        public static final /* synthetic */ c[] c() {
            return new c[]{o, p};
        }

        public static c valueOf(String string2) {
            Intrinsics.checkNotNullParameter(string2, "value");
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            c[] arrc = q;
            return (c[])Arrays.copyOf((Object[])arrc, (int)arrc.length);
        }
    }

}

