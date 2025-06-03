/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.A2
 *  com.yandex.metrica.impl.ob.B3
 *  com.yandex.metrica.impl.ob.D3$a
 *  com.yandex.metrica.impl.ob.F0
 *  com.yandex.metrica.impl.ob.I3
 *  com.yandex.metrica.impl.ob.M3
 *  com.yandex.metrica.impl.ob.ci
 *  com.yandex.metrica.impl.ob.ii
 *  com.yandex.metrica.impl.ob.s2
 *  com.yandex.metrica.impl.ob.x2
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.B3;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.I3;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.M3;
import com.yandex.metrica.impl.ob.b4;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.ii;
import com.yandex.metrica.impl.ob.s2;
import com.yandex.metrica.impl.ob.x2;

public class d4
extends L3 {
    private final s2 A;
    private final String z;

    @VisibleForTesting
    public d4(@NonNull Context context, @NonNull I3 i3, @NonNull B3 b3, @NonNull x2 x22, @NonNull M3 m3, @NonNull s2 s22) {
        super(context, i3, b3, x22, m3);
        this.z = i3.a();
        this.A = s22;
    }

    public d4(@NonNull Context context, @NonNull I3 i3, @NonNull D3.a a8, @NonNull s2 s22, @NonNull ci ci2, @NonNull ii ii2) {
        this(context, i3, new B3(), new x2(), new M3(context, i3, a8, ii2, ci2, new b4(s22), F0.g().q().d(), A2.b((Context)context, (String)i3.b()), F0.g().h()), s22);
    }

    @Override
    public void a(@NonNull D3.a a8) {
        d4 d42 = this;
        synchronized (d42) {
            super.a(a8);
            this.A.a(this.z, a8.l);
            return;
        }
    }
}

