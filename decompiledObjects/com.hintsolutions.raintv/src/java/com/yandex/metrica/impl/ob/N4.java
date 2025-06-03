/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.ResultReceiver
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.F3;
import com.yandex.metrica.impl.ob.K;
import com.yandex.metrica.impl.ob.L;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.f0;
import com.yandex.metrica.impl.ob.k4;

public class n4
implements K,
k4 {
    @NonNull
    private F3 a;
    @Nullable
    private final ResultReceiver b;

    public n4(@NonNull Context context, @NonNull F3 f3, @NonNull D3 d3) {
        this.a = f3;
        this.b = d3.c;
        f3.a(this);
    }

    @Override
    public void a() {
        this.a.b(this);
    }

    @Override
    public void a(@NonNull L l4) {
        ResultReceiver resultReceiver = this.b;
        int n2 = f0.b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            l4.c(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override
    public void a(@NonNull c0 c02, @NonNull D3 d3) {
        this.a.a(d3.b);
        this.a.a(c02, this);
    }

    @NonNull
    public F3 b() {
        return this.a;
    }
}

