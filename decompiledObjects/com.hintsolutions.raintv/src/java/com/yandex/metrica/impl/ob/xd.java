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
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.u0;
import com.yandex.metrica.impl.ob.v0;
import org.json.JSONObject;

public class Xd
implements v0 {
    @Nullable
    public final String a;
    @NonNull
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    @NonNull
    public final u0 e;

    public Xd(@Nullable String string2, @NonNull JSONObject jSONObject, boolean bl, boolean bl2, @NonNull u0 u02) {
        this.a = string2;
        this.b = jSONObject;
        this.c = bl;
        this.d = bl2;
        this.e = u02;
    }

    @Override
    @NonNull
    public u0 a() {
        return this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("PreloadInfoState{trackingId='");
        a.B(stringBuilder, this.a, '\'', ", additionalParameters=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", wasSet=");
        stringBuilder.append(this.c);
        stringBuilder.append(", autoTrackingEnabled=");
        stringBuilder.append(this.d);
        stringBuilder.append(", source=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

