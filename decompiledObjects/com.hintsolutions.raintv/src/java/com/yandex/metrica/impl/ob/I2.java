/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.Q1
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.A3;
import com.yandex.metrica.impl.ob.Q1;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.k2;

public class i2 {
    @NonNull
    private final String a;
    @NonNull
    private final Context b;
    @Nullable
    private final CounterConfiguration.b c;
    @NonNull
    private final k2 d;

    public i2(@NonNull String string, @NonNull Context context, @NonNull CounterConfiguration.b b2, @NonNull k2 k22) {
        this.a = string;
        this.b = context;
        int n4 = b2.ordinal();
        this.c = n4 != 0 ? (n4 != 1 ? null : CounterConfiguration.b.g) : CounterConfiguration.b.f;
        this.d = k22;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NonNull c0 c02) {
        CounterConfiguration counterConfiguration;
        Object object;
        if (this.c == null) return;
        try {
            object = this.a;
            CounterConfiguration counterConfiguration2 = counterConfiguration = new CounterConfiguration();
            synchronized (counterConfiguration2) {
            }
        }
        catch (Throwable throwable) {
            return;
        }
        {
            counterConfiguration.b((String)object);
        }
        {
            counterConfiguration.a(this.c);
            k2 k22 = this.d;
            object = new A3(this.b, null);
            Q1 q1 = new Q1((A3)object, counterConfiguration, null);
            k22.a(c02.b(q1.c()));
        }
    }
}

