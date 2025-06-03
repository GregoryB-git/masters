/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.I3;
import com.yandex.metrica.impl.ob.Q3;
import com.yandex.metrica.impl.ob.S3;
import com.yandex.metrica.impl.ob.U3;
import com.yandex.metrica.impl.ob.W3;
import com.yandex.metrica.impl.ob.Y3;
import com.yandex.metrica.impl.ob.ei;
import com.yandex.metrica.impl.ob.i4;
import com.yandex.metrica.impl.ob.ji;
import com.yandex.metrica.impl.ob.k4;
import com.yandex.metrica.impl.ob.l4;
import com.yandex.metrica.impl.ob.o4;
import com.yandex.metrica.impl.ob.p4;
import com.yandex.metrica.impl.ob.r4;
import com.yandex.metrica.impl.ob.z4;

class q4
implements l4,
o4<U3> {
    @Override
    @NonNull
    public S3 a(@NonNull Context context, @NonNull I3 i32, @NonNull D3.a a2, @NonNull ei ei2) {
        return new U3(context, ei2.d(), i32, a2, F0.g().m(), F0.g().u(), new ji(ei2));
    }

    @NonNull
    public k4 a(@NonNull Context context, @NonNull p4 p42, @NonNull i4 i42, @NonNull D3 d3) {
        return new r4(context, p42.b(new W3(i42.b(), i42.a()), d3, new Y3<U3>(this)));
    }

    @Override
    @NonNull
    public Q3 b(@NonNull Context context, @NonNull I3 i32, @NonNull D3.a a2, @NonNull ei ei2) {
        return new z4(context, i32, a2, ei2.d(), new ji(ei2), CounterConfiguration.b.b);
    }
}

