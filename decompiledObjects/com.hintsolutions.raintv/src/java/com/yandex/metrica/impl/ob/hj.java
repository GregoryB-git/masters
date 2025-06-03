/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Gj;
import com.yandex.metrica.impl.ob.Ij;
import com.yandex.metrica.impl.ob.Lj;
import com.yandex.metrica.impl.ob.rd;
import com.yandex.metrica.impl.ob.vj;
import java.util.ArrayList;
import java.util.List;

public class Hj
implements Lj<List<Gj>> {
    @NonNull
    private final vj a;
    @NonNull
    private final rd b;

    public Hj(@NonNull vj vj2, @NonNull rd rd2) {
        this.a = vj2;
        this.b = rd2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Gj a() {
        void var2_22;
        void var2_19;
        void var2_17;
        Boolean bl;
        Integer n2;
        Integer n3;
        Object var5_28;
        block18: {
            block17: {
                block16: {
                    TelephonyManager telephonyManager = this.a.f();
                    var5_28 = null;
                    if (telephonyManager != null) {
                        try {
                            void var2_5;
                            String string2 = telephonyManager.getSimOperator();
                            if (!TextUtils.isEmpty((CharSequence)string2)) {
                                String string3 = string2.substring(0, 3);
                            } else {
                                Object var2_4 = null;
                            }
                            if (TextUtils.isEmpty((CharSequence)var2_5)) break block16;
                            n3 = Integer.parseInt((String)var2_5);
                        }
                        catch (Throwable throwable) {}
                    }
                }
                n3 = null;
                TelephonyManager telephonyManager = this.a.f();
                if (telephonyManager != null) {
                    try {
                        void var2_11;
                        String string4 = telephonyManager.getSimOperator();
                        if (!TextUtils.isEmpty((CharSequence)string4)) {
                            String string5 = string4.substring(3);
                        } else {
                            Object var2_10 = null;
                        }
                        if (TextUtils.isEmpty((CharSequence)var2_11)) break block17;
                        n2 = Integer.parseInt((String)var2_11);
                    }
                    catch (Throwable throwable) {}
                }
            }
            n2 = null;
            TelephonyManager telephonyManager = this.a.f();
            bl = Boolean.FALSE;
            if (telephonyManager != null) {
                try {
                    if (!this.b.b(this.a.e())) break block18;
                    Boolean bl2 = telephonyManager.isNetworkRoaming();
                }
                catch (Throwable throwable) {}
            }
        }
        Object var2_16 = null;
        if (var2_17 == null) {
            Boolean bl3 = bl;
        }
        boolean bl4 = var2_19.booleanValue();
        bl = this.a.f();
        Object var2_20 = var5_28;
        if (bl == null) return new Gj(n3, n2, bl4, (String)var2_22);
        try {
            String string6 = bl.getSimOperatorName();
        }
        catch (Throwable throwable) {
            Object var2_27 = var5_28;
            return new Gj(n3, n2, bl4, (String)var2_22);
        }
        return new Gj(n3, n2, bl4, (String)var2_22);
    }

    @Nullable
    public Object b() {
        ArrayList arrayList = new ArrayList();
        if (this.a.d()) {
            if (A2.a(23)) {
                if (this.b.b(this.a.e())) {
                    arrayList.addAll(Ij.a(this.a.e()));
                }
                if (arrayList.size() == 0) {
                    arrayList.add((Object)this.a());
                }
            } else {
                arrayList.add((Object)this.a());
            }
        }
        return arrayList;
    }
}

