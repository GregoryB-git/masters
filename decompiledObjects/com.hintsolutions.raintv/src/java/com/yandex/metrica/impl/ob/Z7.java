/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.i4;
import org.json.JSONObject;

class z7 {
    private static String[] a = new String[]{"arg_ak", "arg_pn", "arg_pd", "arg_ps", "arg_rt"};

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private i4 a(@NonNull JSONObject object) {
        int n7;
        String[] stringArray = a;
        int n8 = stringArray.length;
        for (n7 = 0; n7 < n8; ++n7) {
            if (object.has(stringArray[n7])) continue;
            return null;
        }
        try {
            n7 = n8 = object.getInt("arg_pd");
            if (n8 != 0) return new i4(object.getString("arg_ak"), object.getString("arg_pn"), n7, object.getString("arg_ps"), CounterConfiguration.b.a(object.getString("arg_rt")));
        }
        catch (Exception exception) {
            return null;
        }
        n7 = Integer.parseInt((String)object.getString("arg_pd"));
        return new i4(object.getString("arg_ak"), object.getString("arg_pn"), n7, object.getString("arg_ps"), CounterConfiguration.b.a(object.getString("arg_rt")));
    }

    @Nullable
    public i4 a(@NonNull String object) {
        try {
            String string = new String(Base64.decode((String)object, (int)0));
            JSONObject jSONObject = new JSONObject(string);
            object = this.a(jSONObject.getJSONObject("arg_cd"));
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

