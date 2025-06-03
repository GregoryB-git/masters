/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.tk;
import org.json.JSONObject;

public class Sj
implements tk {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @NonNull
    public JSONObject a(@NonNull Object object) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cxts", object);
            return jSONObject;
        }
        catch (Throwable throwable) {
            return jSONObject;
        }
    }
}

