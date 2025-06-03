/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.xk;
import org.json.JSONArray;
import org.json.JSONObject;

public class al
implements xk {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @NonNull
    public JSONObject a(@NonNull Activity activity, long l2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject.put("ssh", (Object)jSONArray.put((Object)jSONObject2.put("si", (Object)jSONObject3.put("cn", (Object)activity.getClass().getName())).put("cid", l2)));
            return jSONObject;
        }
        catch (Throwable throwable) {
            return jSONObject;
        }
    }
}

