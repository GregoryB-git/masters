/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1hSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFc1rSDK
implements AFc1hSDK<Map<String, Object>> {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Map<String, Object> AFKeystoreWrapper(String string2) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(string2);
            Iterator iterator = jSONObject.keys();
            do {
                if (!iterator.hasNext()) {
                    hashMap.remove((Object)"is_cache");
                    return hashMap;
                }
                String string3 = (String)iterator.next();
                Object object = jSONObject.isNull(string3) ? null : jSONObject.get(string3);
                hashMap.put((Object)string3, object);
            } while (true);
        }
        catch (JSONException jSONException) {}
        AFLogger.afErrorLogForExcManagerOnly("error while paring GCD response", (Throwable)jSONException);
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"string_response", (Object)string2);
        return hashMap;
    }

    @Override
    public final /* synthetic */ Object values(String string2) {
        return AFc1rSDK.AFKeystoreWrapper(string2);
    }
}

