/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Iterator
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.la;
import com.yandex.metrica.impl.ob.v3;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ia
implements la<v3> {
    @Override
    @Nullable
    private JSONObject a(@Nullable v3.a a2) throws JSONException {
        if (a2 == null) {
            return null;
        }
        return new JSONObject().putOpt("clids", (Object)Gl.e(a2.b())).putOpt("source", (Object)a2.a().a());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull
    public JSONObject a(@Nullable Object object) {
        v3 v32 = (v3)object;
        object = new JSONObject();
        if (v32 == null) return object;
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator iterator = v32.a().iterator();
            while (iterator.hasNext()) {
                jSONArray.put((Object)this.a((v3.a)iterator.next()));
            }
            object.putOpt("chosen", (Object)this.a(v32.c())).putOpt("candidates", (Object)jSONArray);
        }
        finally {
            return object;
        }
    }
}

