/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.I3;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.Y3;
import com.yandex.metrica.impl.ob.d4;
import com.yandex.metrica.impl.ob.ei;
import com.yandex.metrica.impl.ob.i4;
import com.yandex.metrica.impl.ob.ji;
import com.yandex.metrica.impl.ob.k4;
import com.yandex.metrica.impl.ob.l4;
import com.yandex.metrica.impl.ob.o4;
import com.yandex.metrica.impl.ob.p4;
import com.yandex.metrica.impl.ob.t4;
import com.yandex.metrica.impl.ob.z4;

public class u4
implements l4,
o4<L3> {
    @NonNull
    public k4 a(@NonNull Context context, @NonNull p4 p42, @NonNull i4 i42, @NonNull D3 d3) {
        return new t4(context, p42.b(new I3(i42.b(), i42.a()), d3, new Y3<L3>(this)));
    }

    @NonNull
    public L3 c(@NonNull Context context, @NonNull I3 i32, @NonNull D3.a a2, @NonNull ei ei2) {
        return new d4(context, i32, a2, F0.g().u(), ei2.d(), new ji(ei2));
    }

    @NonNull
    public z4 d(@NonNull Context context, @NonNull I3 i32, @NonNull D3.a a2, @NonNull ei ei2) {
        return new z4(context, i32, a2, ei2.d(), new ji(ei2), CounterConfiguration.b.c);
    }
}

