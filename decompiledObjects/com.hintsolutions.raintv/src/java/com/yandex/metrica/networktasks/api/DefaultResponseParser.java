/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.DefaultResponseParser$Response;
import org.json.JSONObject;

public class DefaultResponseParser {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DefaultResponseParser$Response parse(byte[] object) {
        void var1_5;
        if (object != null) {
            try {
                if (((byte[])object).length > 0) {
                    String string = new String(object, "UTF-8");
                    JSONObject jSONObject = new JSONObject(string);
                    DefaultResponseParser$Response defaultResponseParser$Response = new DefaultResponseParser$Response(jSONObject.optString("status"));
                    return var1_5;
                }
            }
            catch (Throwable throwable) {}
        }
        Object var1_4 = null;
        return var1_5;
    }
}

