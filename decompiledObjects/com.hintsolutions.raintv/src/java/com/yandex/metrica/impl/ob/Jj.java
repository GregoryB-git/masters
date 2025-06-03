/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.telephony.CellLocation
 *  android.telephony.TelephonyManager
 *  android.telephony.gsm.GsmCellLocation
 *  android.text.TextUtils
 *  android.util.SparseArray
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Lj;
import com.yandex.metrica.impl.ob.hj;
import com.yandex.metrica.impl.ob.rd;
import com.yandex.metrica.impl.ob.sd;
import com.yandex.metrica.impl.ob.vj;

@SuppressLint(value={"NewApi"})
public class jj
implements Lj<hj> {
    @SuppressLint(value={"InlineApi"})
    private static final SparseArray<String> d = new SparseArray<String>(){
        {
            this.put(0, null);
            this.put(7, "1xRTT");
            this.put(4, "CDMA");
            this.put(2, "EDGE");
            this.put(14, "eHRPD");
            this.put(5, "EVDO rev.0");
            this.put(6, "EVDO rev.A");
            this.put(12, "EVDO rev.B");
            this.put(1, "GPRS");
            this.put(8, "HSDPA");
            this.put(10, "HSPA");
            this.put(15, "HSPA+");
            this.put(9, "HSUPA");
            this.put(11, "iDen");
            this.put(3, "UMTS");
            this.put(12, "EVDO rev.B");
            this.put(14, "eHRPD");
            this.put(13, "LTE");
            this.put(15, "HSPA+");
        }
    };
    @NonNull
    private final vj a;
    @NonNull
    private final sd b;
    @NonNull
    private final sd c;

    public jj(@NonNull vj vj2, @NonNull rd rd2) {
        this.a = vj2;
        if (A2.a(29)) {
            this.b = new sd(){
                public final rd a;
                {
                    this.a = rd2;
                }

                @Override
                public boolean a(@NonNull Context context) {
                    this.a.getClass();
                    return false;
                }
            };
            this.c = new sd(){
                public final rd a;
                {
                    this.a = rd2;
                }

                @Override
                public boolean a(@NonNull Context context) {
                    return this.a.b(context);
                }
            };
        } else {
            this.b = new sd(){
                public final rd a;
                {
                    this.a = rd2;
                }

                @Override
                public boolean a(@NonNull Context context) {
                    return this.a.a(context);
                }
            };
            this.c = new sd(this){

                @Override
                public boolean a(@NonNull Context context) {
                    return true;
                }
            };
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public Object b() {
        void var3_43;
        void var3_41;
        void var3_37;
        void var3_32;
        int n2;
        Object object;
        void var3_45;
        Object var4_53;
        block29: {
            void var3_26;
            block28: {
                void var3_17;
                block27: {
                    void var3_8;
                    block26: {
                        boolean bl2 = this.a.c();
                        Object var3_2 = null;
                        var4_53 = null;
                        if (!bl2) return var3_45;
                        object = new hj.a();
                        TelephonyManager telephonyManager = this.a.f();
                        if (telephonyManager != null) {
                            try {
                                CellLocation cellLocation;
                                if (!this.b.a(this.a.e()) || (cellLocation = telephonyManager.getCellLocation()) == null || -1 == (n2 = ((GsmCellLocation)cellLocation).getLac())) break block26;
                                Integer n3 = n2;
                            }
                            catch (Throwable throwable) {}
                        }
                    }
                    Object var3_7 = null;
                    object = ((hj.a)object).c((Integer)var3_8);
                    TelephonyManager telephonyManager = this.a.f();
                    if (telephonyManager != null) {
                        try {
                            void var3_13;
                            String string = telephonyManager.getNetworkOperator();
                            if (!TextUtils.isEmpty((CharSequence)string)) {
                                String string2 = string.substring(0, 3);
                            } else {
                                Object var3_12 = null;
                            }
                            if (TextUtils.isEmpty((CharSequence)var3_13)) break block27;
                            Integer n5 = Integer.parseInt((String)var3_13);
                        }
                        catch (Throwable throwable) {}
                    }
                }
                Object var3_16 = null;
                object = ((hj.a)object).i((Integer)var3_17);
                TelephonyManager telephonyManager = this.a.f();
                if (telephonyManager != null) {
                    try {
                        void var3_22;
                        String string = telephonyManager.getNetworkOperator();
                        if (!TextUtils.isEmpty((CharSequence)string)) {
                            String string3 = string.substring(3);
                        } else {
                            Object var3_21 = null;
                        }
                        if (TextUtils.isEmpty((CharSequence)var3_22)) break block28;
                        Integer n6 = Integer.parseInt((String)var3_22);
                    }
                    catch (Throwable throwable) {}
                }
            }
            Object var3_25 = null;
            object = ((hj.a)object).j((Integer)var3_26);
            TelephonyManager telephonyManager = this.a.f();
            if (telephonyManager != null) {
                try {
                    if (!this.b.a(this.a.e())) break block29;
                    GsmCellLocation gsmCellLocation = (GsmCellLocation)telephonyManager.getCellLocation();
                    n2 = 1;
                    if (gsmCellLocation != null) {
                        n2 = gsmCellLocation.getCid();
                    }
                    if (-1 == n2) break block29;
                    Integer n9 = n2;
                }
                catch (Throwable throwable) {}
            }
        }
        Object var3_31 = null;
        object = ((hj.a)object).b((Integer)var3_32);
        TelephonyManager telephonyManager = this.a.f();
        if (telephonyManager != null) {
            try {
                String string = telephonyManager.getNetworkOperatorName();
            }
            catch (Throwable throwable) {}
        }
        Object var3_36 = null;
        hj.a a2 = ((hj.a)object).b((String)var3_37);
        TelephonyManager telephonyManager2 = this.a.f();
        object = "unknown";
        Object var3_38 = var4_53;
        if (telephonyManager2 != null) {
            try {
                if (this.c.a(this.a.e())) {
                    n2 = telephonyManager2.getNetworkType();
                    String string = (String)jj.d.get(n2, (Object)"unknown");
                } else {
                    String string = "unknown";
                }
            }
            catch (Throwable throwable) {
                Object var3_52 = var4_53;
            }
        }
        if (var3_41 == null) {
            Object object2 = object;
        }
        hj hj2 = new hj(a2.a((String)var3_43).a(0));
        return var3_45;
    }
}

