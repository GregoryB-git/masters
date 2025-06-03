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
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.E3;
import com.yandex.metrica.impl.ob.G3;
import com.yandex.metrica.impl.ob.i4;
import com.yandex.metrica.impl.ob.k4;
import com.yandex.metrica.impl.ob.l4;
import com.yandex.metrica.impl.ob.n4;
import com.yandex.metrica.impl.ob.p4;

public class s4
implements l4 {
    @NonNull
    public k4 a(@NonNull Context context, @NonNull p4 p42, @NonNull i4 i42, @NonNull D3 d3) {
        return new n4(context, p42.a(new E3(i42.b()), d3, new G3()), d3);
    }
}

