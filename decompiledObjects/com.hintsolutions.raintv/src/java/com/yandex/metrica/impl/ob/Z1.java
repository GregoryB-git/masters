/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.Kl
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.B0;
import com.yandex.metrica.impl.ob.Kl;
import com.yandex.metrica.impl.ob.L0;
import org.json.JSONObject;

public class z1 {
    @NonNull
    private final B0 a;
    private boolean b = false;

    public z1(@NonNull Kl kl2) {
        this(kl2, new B0());
    }

    @VisibleForTesting
    public z1(@NonNull Kl kl2, @NonNull B0 b0) {
        this.a = b0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(@NonNull Context object) {
        long l8;
        block9: {
            z1 z12 = this;
            // MONITORENTER : z12
            // MONITOREXIT : z12
            if (this.b) return;
            z12 = this;
            // MONITORENTER : z12
            try {
                object = L0.a(this.a.a((Context)object, "metrica_service_settings.dat"));
                if (TextUtils.isEmpty((CharSequence)object)) break block9;
                JSONObject jSONObject = new JSONObject((String)object);
                l8 = jSONObject.optLong("delay");
            }
            catch (Throwable throwable) {}
        }
        l8 = 0L;
        // MONITOREXIT : z12
        if (l8 > 0L) {
            try {
                Thread.sleep((long)l8);
            }
            catch (Throwable throwable) {}
        }
        this.b = true;
    }
}

