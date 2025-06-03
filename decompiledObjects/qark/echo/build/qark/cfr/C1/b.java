/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package C1;

import C1.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {
    public static final a e = new a(null);
    public final String a;
    public final String b;
    public final List c;
    public final String d;

    public b(JSONObject jSONObject) {
        int n8;
        Intrinsics.checkNotNullParameter((Object)jSONObject, "component");
        String string2 = jSONObject.getString("name");
        Intrinsics.checkNotNullExpressionValue(string2, "component.getString(PARAMETER_NAME_KEY)");
        this.a = string2;
        string2 = jSONObject.optString("value");
        Intrinsics.checkNotNullExpressionValue(string2, "component.optString(PARAMETER_VALUE_KEY)");
        this.b = string2;
        string2 = jSONObject.optString("path_type", "absolute");
        Intrinsics.checkNotNullExpressionValue(string2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.d = string2;
        string2 = new ArrayList();
        jSONObject = jSONObject.optJSONArray("path");
        if (jSONObject != null && (n8 = jSONObject.length()) > 0) {
            int n9 = 0;
            do {
                int n10 = n9 + 1;
                JSONObject jSONObject2 = jSONObject.getJSONObject(n9);
                Intrinsics.checkNotNullExpressionValue((Object)jSONObject2, "jsonPathArray.getJSONObject(i)");
                string2.add((Object)new c(jSONObject2));
                if (n10 >= n8) break;
                n9 = n10;
            } while (true);
        }
        this.c = string2;
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

