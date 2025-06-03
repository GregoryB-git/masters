/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Nd;
import com.yandex.metrica.impl.ob.la;
import org.json.JSONArray;
import org.json.JSONObject;

public class qa
implements la<Nd> {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull
    public JSONObject a(@Nullable Object object) {
        Nd nd2 = (Nd)object;
        JSONObject jSONObject = new JSONObject();
        if (nd2 == null) return jSONObject;
        try {
            boolean bl2;
            JSONArray jSONArray = new JSONArray();
            Object object2 = nd2.b.iterator();
            while (bl2 = object2.hasNext()) {
                object = object2.next();
                if (object == null) {
                    object = null;
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    object = jSONObject2.putOpt("tracking_id", (Object)object.a).put("additional_parameters", (Object)object.b).put("source", (Object)object.c.a());
                }
                jSONArray.put(object);
            }
            object = jSONObject.put("candidates", (Object)jSONArray);
            object2 = nd2.a;
            nd2 = new JSONObject();
            object.put("chosen", (Object)nd2.putOpt("tracking_id", object2.a).put("additional_parameters", (Object)object2.b).put("source", (Object)object2.e.a()).put("auto_tracking_enabled", object2.d));
        }
        finally {
            return jSONObject;
        }
    }
}

