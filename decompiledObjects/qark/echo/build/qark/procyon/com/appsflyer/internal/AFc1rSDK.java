// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.Iterator;
import org.json.JSONException;
import com.appsflyer.AFLogger;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

public final class AFc1rSDK implements AFc1hSDK<Map<String, Object>>
{
    public static Map<String, Object> AFKeystoreWrapper(final String s) {
        while (true) {
            try {
                final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
                final JSONObject jsonObject = new JSONObject(s);
                final Iterator keys = jsonObject.keys();
                while (keys.hasNext()) {
                    final String s2 = keys.next();
                    Object value;
                    if (jsonObject.isNull(s2)) {
                        value = null;
                    }
                    else {
                        value = jsonObject.get(s2);
                    }
                    hashMap.put(s2, value);
                }
                hashMap.remove("is_cache");
                return (Map<String, Object>)hashMap;
                final JSONException ex;
                AFLogger.afErrorLogForExcManagerOnly("error while paring GCD response", (Throwable)ex);
                final HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
                hashMap2.put("string_response", s);
                return hashMap2;
            }
            catch (JSONException ex) {
                continue;
            }
            break;
        }
    }
}
