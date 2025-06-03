/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 *  org.json.JSONObject
 */
package Q4;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import r4.b;
import w3.a;

public class r {
    public final b a;
    public final Map b = Collections.synchronizedMap((Map)new HashMap());

    public r(b b8) {
        this.a = b8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(String string2, com.google.firebase.remoteconfig.internal.b b8) {
        a a8 = (a)this.a.get();
        if (a8 == null) {
            return;
        }
        Object object = b8.h();
        if (object.length() < 1) {
            return;
        }
        if ((b8 = b8.f()).length() < 1) {
            return;
        }
        JSONObject jSONObject = object.optJSONObject(string2);
        if (jSONObject == null) {
            return;
        }
        object = jSONObject.optString("choiceId");
        if (object.isEmpty()) {
            return;
        }
        Map map = this.b;
        // MONITORENTER : map
        if (object.equals(this.b.get((Object)string2))) {
            // MONITOREXIT : map
            return;
        }
        this.b.put((Object)string2, object);
        // MONITOREXIT : map
        map = new Bundle();
        map.putString("arm_key", string2);
        map.putString("arm_value", b8.optString(string2));
        map.putString("personalization_id", jSONObject.optString("personalizationId"));
        map.putInt("arm_index", jSONObject.optInt("armIndex", -1));
        map.putString("group", jSONObject.optString("group"));
        a8.e("fp", "personalization_assignment", (Bundle)map);
        string2 = new Bundle();
        string2.putString("_fpid", (String)object);
        a8.e("fp", "_fpc", (Bundle)string2);
    }
}

