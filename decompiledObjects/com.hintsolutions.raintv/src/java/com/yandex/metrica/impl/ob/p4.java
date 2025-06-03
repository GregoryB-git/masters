/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ResultReceiver
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.n4
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.F3;
import com.yandex.metrica.impl.ob.M4;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.n4;

public class P4
extends M4 {
    public P4(F3 f3) {
        super(f3);
    }

    @Override
    public boolean a(@NonNull c0 c02, @NonNull n4 n42) {
        c02 = (c02 = c02.k()) != null ? (ResultReceiver)c02.getParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver") : null;
        this.a().a((ResultReceiver)c02);
        return false;
    }
}

