/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Uk;
import com.yandex.metrica.impl.ob.el;
import org.json.JSONArray;
import org.json.JSONObject;

public class vl
extends el {
    @Nullable
    public volatile String h = null;
    @Nullable
    public volatile String i = null;

    public vl(@NonNull String string, @NonNull String string2, @Nullable el.b b4, int n2, boolean bl2) {
        super(string, string2, null, n2, bl2, el.c.c, el.a.i);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public JSONArray a(@NonNull Uk uk2) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", (Object)"HTML");
            if (uk2.j) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("u", (Object)A2.a(this.h, uk2.o));
                jSONObject2.putOpt("ou", (Object)A2.a(this.i, uk2.o));
                if (jSONObject2.length() > 0) {
                    jSONObject.put("i", (Object)jSONObject2);
                }
            }
            jSONArray.put((Object)jSONObject);
            return jSONArray;
        }
        catch (Throwable throwable) {
            return jSONArray;
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = z2.t("WebViewElement{url='");
        a.B(stringBuilder, this.h, '\'', ", originalUrl='");
        a.B(stringBuilder, this.i, '\'', ", mClassName='");
        a.B(stringBuilder, this.a, '\'', ", mId='");
        a.B(stringBuilder, this.b, '\'', ", mParseFilterReason=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", mDepth=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mListItem=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mViewType=");
        stringBuilder.append((Object)this.f);
        stringBuilder.append(", mClassType=");
        stringBuilder.append((Object)this.g);
        stringBuilder.append("} ");
        return stringBuilder.toString();
    }
}

