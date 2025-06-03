/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.xf$b
 *  java.lang.Object
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Hi;
import com.yandex.metrica.impl.ob.n9;
import com.yandex.metrica.impl.ob.xf;
import org.json.JSONObject;

class pi {
    @NonNull
    private final n9 a;

    public pi() {
        this(new n9());
    }

    @VisibleForTesting
    public pi(@NonNull n9 n92) {
        this.a = n92;
    }

    public void a(@NonNull Hi hi2, @NonNull JSONObject jSONObject) {
        n9 n92 = this.a;
        xf.b b2 = new xf.b();
        if ((jSONObject = jSONObject.optJSONObject("auto_inapp_collecting")) != null) {
            b2.a = jSONObject.optInt("send_frequency_seconds", b2.a);
            b2.b = jSONObject.optInt("first_collecting_inapp_max_age_seconds", b2.b);
        }
        hi2.a(n92.a(b2));
    }
}

