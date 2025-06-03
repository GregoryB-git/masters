/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.wk;
import org.json.JSONObject;

public class Zk
implements wk {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(@NonNull JSONObject jSONObject, @NonNull Object object, @NonNull String string) {
        try {
            jSONObject.getJSONArray("ssh").getJSONObject(0).put(string, object);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

