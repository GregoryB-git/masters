/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Set
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package F3;

import E3.f;
import F3.b;
import G3.a;
import android.os.Bundle;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class d
implements b,
G3.b {
    public a a;

    public static String b(String string2, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String string3 : bundle.keySet()) {
            jSONObject2.put(string3, bundle.get(string3));
        }
        jSONObject.put("name", (Object)string2);
        jSONObject.put("parameters", (Object)jSONObject2);
        return jSONObject.toString();
    }

    @Override
    public void a(a a8) {
        this.a = a8;
        f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void t(String string2, Bundle bundle) {
        a a8 = this.a;
        if (a8 != null) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("$A$:");
                stringBuilder.append(d.b(string2, bundle));
                a8.a(stringBuilder.toString());
                return;
            }
            catch (JSONException jSONException) {}
            f.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
        }
    }
}

