/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.xf$c
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.concurrent.TimeUnit
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Ch;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.q9;
import com.yandex.metrica.impl.ob.xf;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class qi {
    @NonNull
    private final q9 a;

    public qi() {
        this(new q9());
    }

    @VisibleForTesting
    public qi(@NonNull q9 q92) {
        this.a = q92;
    }

    @NonNull
    public Ch a(@NonNull JSONObject jSONObject) {
        xf.c c3 = new xf.c();
        JSONObject jSONObject2 = jSONObject.optJSONObject("cache_control");
        if (jSONObject2 != null) {
            jSONObject = Gl.a(jSONObject2, "cells_around_ttl", null);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            c3.a = Gl.a((Long)jSONObject, timeUnit, c3.a);
            c3.b = Gl.a(Gl.a(jSONObject2, "wifi_networks_ttl", null), timeUnit, c3.b);
            c3.c = Gl.a(Gl.a(jSONObject2, "last_known_location_ttl", null), timeUnit, c3.c);
            c3.d = Gl.a(Gl.a(jSONObject2, "net_interfaces_ttl", null), timeUnit, c3.d);
        }
        return this.a.a(c3);
    }
}

