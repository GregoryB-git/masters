/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  org.json.JSONObject
 */
package C1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONObject;

public final class c {
    public static final a i = new a(null);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public c(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter((Object)jSONObject, "component");
        String string2 = jSONObject.getString("class_name");
        Intrinsics.checkNotNullExpressionValue(string2, "component.getString(PATH_CLASS_NAME_KEY)");
        this.a = string2;
        this.b = jSONObject.optInt("index", -1);
        this.c = jSONObject.optInt("id");
        string2 = jSONObject.optString("text");
        Intrinsics.checkNotNullExpressionValue(string2, "component.optString(PATH_TEXT_KEY)");
        this.d = string2;
        string2 = jSONObject.optString("tag");
        Intrinsics.checkNotNullExpressionValue(string2, "component.optString(PATH_TAG_KEY)");
        this.e = string2;
        string2 = jSONObject.optString("description");
        Intrinsics.checkNotNullExpressionValue(string2, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f = string2;
        string2 = jSONObject.optString("hint");
        Intrinsics.checkNotNullExpressionValue(string2, "component.optString(PATH_HINT_KEY)");
        this.g = string2;
        this.h = jSONObject.optInt("match_bitmask");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.g;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final int f() {
        return this.h;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.d;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b p = new b(1);
        public static final /* enum */ b q = new b(2);
        public static final /* enum */ b r = new b(4);
        public static final /* enum */ b s = new b(8);
        public static final /* enum */ b t = new b(16);
        public static final /* synthetic */ b[] u;
        public final int o;

        static {
            u = b.c();
        }

        public b(int n9) {
            this.o = n9;
        }

        public static final /* synthetic */ b[] c() {
            return new b[]{p, q, r, s, t};
        }

        public static b valueOf(String string2) {
            Intrinsics.checkNotNullParameter(string2, "value");
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            b[] arrb = u;
            return (b[])Arrays.copyOf((Object[])arrb, (int)arrb.length);
        }

        public final int e() {
            return this.o;
        }
    }

}

