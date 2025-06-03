/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.J1;
import com.yandex.metrica.impl.ob.gf;
import com.yandex.metrica.impl.ob.if;
import com.yandex.metrica.impl.ob.jf;
import com.yandex.metrica.impl.ob.re;
import org.json.JSONArray;
import org.json.JSONObject;

public class ne
implements re {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @Nullable
    public if.d.a.b a(@Nullable Integer messageNanoArray, @Nullable String jfArray, @Nullable String string, @Nullable String string2) {
        if.d.a.b b4 = new if.d.a.b();
        if (messageNanoArray != null) {
            b4.c = messageNanoArray.intValue();
        }
        if (jfArray != null) {
            b4.d = jfArray;
        }
        jfArray = null;
        messageNanoArray = jfArray;
        try {
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                messageNanoArray = new JSONArray(string2);
                messageNanoArray = J1.b((JSONArray)messageNanoArray);
            }
        }
        catch (Throwable throwable) {
            try {
                JSONObject jSONObject = new JSONObject(string2);
                messageNanoArray = new gf[]{J1.b(jSONObject)};
            }
            catch (Throwable throwable2) {
                messageNanoArray = jfArray;
            }
        }
        if (messageNanoArray != null) {
            b4.a = messageNanoArray;
        }
        if (!TextUtils.isEmpty((CharSequence)string)) {
            messageNanoArray = new jf[]{};
            try {
                jfArray = new JSONArray(string);
                jfArray = J1.a((JSONArray)jfArray);
                messageNanoArray = jfArray;
            }
            catch (Throwable throwable) {}
            b4.b = messageNanoArray;
        }
        return b4;
    }
}

