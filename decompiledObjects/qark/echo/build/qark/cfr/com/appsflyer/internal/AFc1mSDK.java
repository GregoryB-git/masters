/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFc1hSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class AFc1mSDK
implements AFc1hSDK<Map<String, String>> {
    @Override
    public final /* synthetic */ Object values(String string2) {
        HashMap hashMap = new HashMap();
        if (!string2.trim().isEmpty()) {
            string2 = new JSONObject(string2);
            Iterator iterator = string2.keys();
            while (iterator.hasNext()) {
                String string3 = (String)iterator.next();
                hashMap.put((Object)string3, (Object)string2.optString(string3));
            }
        }
        return hashMap;
    }
}

