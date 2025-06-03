/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONObject
 */
package O3;

import E3.f;
import H3.x;
import O3.b;
import O3.d;
import O3.h;
import O3.l;
import org.json.JSONObject;

public class g {
    public final x a;

    public g(x x8) {
        this.a = x8;
    }

    public static h a(int n8) {
        if (n8 != 3) {
            f f8 = f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not determine SettingsJsonTransform for settings version ");
            stringBuilder.append(n8);
            stringBuilder.append(". Using default settings values.");
            f8.d(stringBuilder.toString());
            return new b();
        }
        return new l();
    }

    public d b(JSONObject jSONObject) {
        return g.a(jSONObject.getInt("settings_version")).a(this.a, jSONObject);
    }
}

