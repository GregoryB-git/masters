/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.telephony.TelephonyManager
 *  androidx.annotation.NonNull
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Lj;
import com.yandex.metrica.impl.ob.vj;

public class ej
implements Lj<Integer> {
    @NonNull
    private final vj a;

    public ej(@NonNull vj vj2) {
        this.a = vj2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public Object a() {
        boolean bl2 = this.a.c();
        int n2 = 2;
        if (bl2) {
            int n3;
            TelephonyManager telephonyManager = this.a.f();
            Integer n5 = Integer.MIN_VALUE;
            if (telephonyManager != null) {
                try {
                    telephonyManager = Integer.valueOf((int)telephonyManager.getCallState());
                }
                catch (Throwable throwable) {}
            }
            telephonyManager = null;
            if (telephonyManager == null) {
                telephonyManager = n5;
            }
            if ((n3 = telephonyManager.intValue()) == 0) {
                n2 = 1;
                return n2;
            }
            if (n3 == 1) return n2;
            if (n3 == 2) {
                n2 = 3;
                return n2;
            }
        }
        n2 = 0;
        return n2;
    }
}

