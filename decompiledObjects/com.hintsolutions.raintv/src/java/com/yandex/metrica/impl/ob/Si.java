/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.xf$g
 *  java.lang.Object
 *  org.jetbrains.annotations.NotNull
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Hi;
import com.yandex.metrica.impl.ob.v9;
import com.yandex.metrica.impl.ob.xf;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public final class si {
    private final v9 a;

    public si() {
        this(new v9());
    }

    @VisibleForTesting
    public si(@NotNull v9 v92) {
        this.a = v92;
    }

    public final void a(@NotNull Hi hi2, @NotNull JSONObject jSONObject) {
        xf.g g4 = new xf.g();
        if ((jSONObject = jSONObject.optJSONObject("easy_collecting")) != null) {
            g4.a = jSONObject.optLong("first_delay_seconds", g4.a);
        }
        hi2.a(this.a.a(g4));
    }
}

