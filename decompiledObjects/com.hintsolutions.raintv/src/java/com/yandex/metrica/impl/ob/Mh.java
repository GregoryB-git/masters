/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.wh
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.Qh;
import com.yandex.metrica.impl.ob.jh;
import com.yandex.metrica.impl.ob.kh;
import com.yandex.metrica.impl.ob.th;
import com.yandex.metrica.impl.ob.wh;
import com.yandex.metrica.impl.ob.x2;

class mh {
    private final String a;
    @NonNull
    private final x2 b;
    @NonNull
    private final TimeProvider c;
    @NonNull
    private final kh d;

    public mh(String string, @NonNull jh jh2) {
        this(string, new x2(), new SystemTimeProvider(), new kh(jh2));
    }

    @VisibleForTesting
    public mh(@NonNull String string, @NonNull x2 x22, @NonNull TimeProvider timeProvider, @NonNull kh kh2) {
        this.a = string;
        this.b = x22;
        this.c = timeProvider;
        this.d = kh2;
    }

    public void a(@NonNull th th2, int n4, @NonNull Qh object) {
        this.d.a(((Qh)object).g);
        x2 x22 = this.b;
        long l5 = this.d.a(n4);
        long l8 = ((Qh)object).g;
        object = z2.t("report ");
        object.append(this.a);
        if (x22.b(l5, l8, object.toString())) {
            object = this.a;
            ((wh)th2).a((String)object, Integer.valueOf((int)n4));
            this.d.a(n4, this.c.currentTimeSeconds());
        }
    }
}

