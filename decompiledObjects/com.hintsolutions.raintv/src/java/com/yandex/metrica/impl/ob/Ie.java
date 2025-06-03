/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.b;
import com.yandex.metrica.impl.ob.je;
import com.yandex.metrica.impl.ob.qm;
import com.yandex.metrica.impl.ob.ye;
import com.yandex.metrica.impl.ob.yg;

public class ie
implements ye {
    @NonNull
    private final qm a;

    public ie() {
        this(new qm());
    }

    @VisibleForTesting
    public ie(@NonNull qm qm2) {
        this.a = qm2;
    }

    @Override
    @NonNull
    public byte[] a(@NonNull je je2, @NonNull yg object) {
        object = je2.b;
        object = object != null ? (Object)b.b((String)object) : (Object)new byte[0];
        return this.a.a(je2.r).a((byte[])object);
    }
}

