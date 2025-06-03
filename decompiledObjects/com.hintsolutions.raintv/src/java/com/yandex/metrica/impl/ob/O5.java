/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.F0
 *  com.yandex.metrica.impl.ob.Gl
 *  com.yandex.metrica.impl.ob.I1
 *  com.yandex.metrica.impl.ob.X4
 *  com.yandex.metrica.impl.ob.Xd
 *  com.yandex.metrica.impl.ob.c0
 *  com.yandex.metrica.impl.ob.u0
 *  com.yandex.metrica.impl.ob.v0
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  kotlin.jvm.internal.Intrinsics
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.I1;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.X4;
import com.yandex.metrica.impl.ob.Xd;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.u0;
import com.yandex.metrica.impl.ob.v0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public class o5
extends X4 {
    @NonNull
    private final I1 b;

    public o5(@NonNull L3 l32) {
        this(l32, F0.g().k());
    }

    @VisibleForTesting
    public o5(@NonNull L3 l32, @NonNull I1 i1) {
        super(l32);
        this.b = i1;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(@NonNull c0 c02) {
        void var6_8;
        String string = c02.p();
        Object var7_5 = null;
        try {
            c02 = new JSONObject(string);
            JSONObject jSONObject = c02.optJSONObject("preloadInfo");
        }
        catch (Throwable throwable) {
            Object var6_7 = null;
        }
        I1 i1 = this.b;
        String string2 = Gl.b((JSONObject)var6_8, (String)"trackingId");
        string = new JSONObject();
        if (var6_8 != null && var6_8.has("additionalParams")) {
            try {
                c02 = var6_8.getJSONObject("additionalParams");
            }
            catch (Throwable throwable) {}
        }
        c02 = null;
        if (c02 != null) {
            string = c02;
        }
        boolean bl = Gl.a((JSONObject)var6_8, (String)"wasSet", (boolean)false);
        boolean bl2 = Gl.a((JSONObject)var6_8, (String)"autoTracking", (boolean)false);
        String string3 = Gl.b((JSONObject)var6_8, (String)"source");
        u0[] u0Array = u0.values();
        int n2 = 0;
        while (true) {
            c02 = var7_5;
            if (n2 >= 4 || Intrinsics.areEqual((Object)(c02 = u0Array[n2]).a(), (Object)string3)) break;
            ++n2;
        }
        if (c02 == null) {
            c02 = u0.b;
        }
        i1.b((v0)new Xd(string2, (JSONObject)string, bl, bl2, (u0)c02));
        return false;
    }
}

