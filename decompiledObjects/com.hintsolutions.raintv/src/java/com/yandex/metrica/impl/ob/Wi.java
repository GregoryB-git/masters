/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.xf$j
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.C9;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.Hi;
import com.yandex.metrica.impl.ob.xf;

public class wi {
    @NonNull
    private final C9 a;

    public wi() {
        this(new C9());
    }

    @VisibleForTesting
    public wi(@NonNull C9 c9) {
        this.a = c9;
    }

    public void a(@NonNull Hi hi2, @NonNull Gl.a a2) {
        if (hi2.e().f) {
            xf.j j8 = new xf.j();
            if ((a2 = a2.optJSONObject("identity_light_collecting")) != null) {
                j8.a = a2.optLong("min_interval_seconds", j8.a);
            }
            hi2.a(this.a.a(j8));
        }
    }
}

