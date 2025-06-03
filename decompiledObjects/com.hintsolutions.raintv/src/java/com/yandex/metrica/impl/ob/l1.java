/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.RequiresApi
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.L1$a
 *  com.yandex.metrica.impl.ob.V6
 *  com.yandex.metrica.impl.ob.c0
 *  com.yandex.metrica.impl.ob.c7
 *  com.yandex.metrica.impl.ob.d7
 *  com.yandex.metrica.impl.ob.i4
 *  com.yandex.metrica.impl.ob.j4
 *  com.yandex.metrica.impl.ob.m7
 *  com.yandex.metrica.impl.ob.o6
 *  com.yandex.metrica.impl.ob.q7$c
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.B0;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.K6;
import com.yandex.metrica.impl.ob.L1;
import com.yandex.metrica.impl.ob.N1;
import com.yandex.metrica.impl.ob.V6;
import com.yandex.metrica.impl.ob.X6;
import com.yandex.metrica.impl.ob.Zl;
import com.yandex.metrica.impl.ob.a1;
import com.yandex.metrica.impl.ob.am;
import com.yandex.metrica.impl.ob.b7;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.c7;
import com.yandex.metrica.impl.ob.d7;
import com.yandex.metrica.impl.ob.i4;
import com.yandex.metrica.impl.ob.j4;
import com.yandex.metrica.impl.ob.m7;
import com.yandex.metrica.impl.ob.o6;
import com.yandex.metrica.impl.ob.q7;
import java.io.File;

public class L1 {
    @NonNull
    private final Context a;
    @NonNull
    private final ICommonExecutor b;
    @NonNull
    private final j4 c;
    @NonNull
    private final B0 d;

    @VisibleForTesting
    public L1(@NonNull Context context, @NonNull j4 j42, @NonNull ICommonExecutor iCommonExecutor, @NonNull B0 b02) {
        this.a = context;
        this.b = iCommonExecutor;
        this.c = j42;
        this.d = b02;
    }

    public void a(c0 object, Bundle bundle) {
        boolean bl = a1.c.b() == object.e;
        if (!bl) {
            object = new N1(this.a, (c0)object, bundle, this.c);
            this.b.execute((Runnable)object);
        }
    }

    public void a(@NonNull i4 i42, @NonNull c0 c02, @NonNull D3 d3) {
        this.c.a(i42, d3).a(c02, d3);
        this.c.a(i42.b(), i42.c().intValue(), i42.d());
    }

    @RequiresApi(value=21)
    public void a(@NonNull m7 m72, @NonNull am<String, c0> am2) {
        ICommonExecutor iCommonExecutor = this.b;
        B0 b02 = this.d;
        String string = m72.a.b;
        b02.getClass();
        iCommonExecutor.execute((Runnable)new o6(new File(string), (am)new d7(new X6(b7.d, m72.c.b), new c7(new K6())), (Zl)new q7.c(m72.a.a), (Zl)new /* Unavailable Anonymous Inner Class!! */));
    }

    public void a(@NonNull File file) {
        V6 v62 = new V6();
        this.b.execute((Runnable)new o6(file, (am)v62, (Zl)v62, (Zl)new a(this)));
    }
}

