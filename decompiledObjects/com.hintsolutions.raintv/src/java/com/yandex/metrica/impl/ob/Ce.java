/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.je;
import com.yandex.metrica.impl.ob.qm;
import com.yandex.metrica.impl.ob.ye;
import com.yandex.metrica.impl.ob.yg;

public class ce
implements ye {
    @NonNull
    private final qm a;

    public ce() {
        this(new qm());
    }

    @VisibleForTesting
    public ce(@NonNull qm qm2) {
        this.a = qm2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull
    public byte[] a(@NonNull je je2, @NonNull yg object) {
        byte[] byArray = new byte[]{};
        String string = je2.b;
        object = byArray;
        if (string == null) return this.a.a(je2.r).a((byte[])object);
        try {
            object = Base64.decode((String)string, (int)0);
            return this.a.a(je2.r).a((byte[])object);
        }
        catch (Throwable throwable) {
            object = byArray;
            return this.a.a(je2.r).a((byte[])object);
        }
    }
}

