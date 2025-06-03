/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.L0;
import com.yandex.metrica.impl.ob.je;
import com.yandex.metrica.impl.ob.qm;
import com.yandex.metrica.impl.ob.ye;
import com.yandex.metrica.impl.ob.yg;

public class xe
implements ye {
    @NonNull
    private final qm a;

    public xe() {
        this(new qm());
    }

    @VisibleForTesting
    public xe(@NonNull qm qm2) {
        this.a = qm2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull
    public byte[] a(@NonNull je object, @NonNull yg object2) {
        block2: {
            byte[] byArray;
            object2 = new byte[0];
            try {
                byArray = L0.a(((je)object).b);
            }
            catch (Throwable throwable) {
                break block2;
            }
            object2 = byArray;
        }
        object = object2 = (Object)this.a.a(((je)object).r).a((byte[])object2);
        if (object2 != null) return object;
        return new byte[0];
    }
}

