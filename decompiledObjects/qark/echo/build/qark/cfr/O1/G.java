/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.ConcurrentHashMap
 *  org.json.JSONObject
 */
package O1;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class G {
    public static final G a = new G();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    public static final JSONObject a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "accessToken");
        return (JSONObject)b.get((Object)string2);
    }

    public static final void b(String string2, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter((Object)jSONObject, "value");
        b.put((Object)string2, (Object)jSONObject);
    }
}

