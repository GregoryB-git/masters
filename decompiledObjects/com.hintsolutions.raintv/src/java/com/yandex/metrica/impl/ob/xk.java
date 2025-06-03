/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.xk;
import org.json.JSONObject;

public class Xk
implements xk {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @NonNull
    public JSONObject a(@NonNull Activity activity, long l4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sid", (Object)activity.getClass().getName()).put("cid", l4);
            return jSONObject;
        }
        catch (Throwable throwable) {
            return jSONObject;
        }
    }
}

