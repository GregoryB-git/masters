/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.google.protobuf.nano.ym.MessageNano
 *  com.yandex.metrica.impl.ob.ca
 *  com.yandex.metrica.impl.ob.rf
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.I3;
import com.yandex.metrica.impl.ob.M5;
import com.yandex.metrica.impl.ob.M7;
import com.yandex.metrica.impl.ob.N5;
import com.yandex.metrica.impl.ob.O5;
import com.yandex.metrica.impl.ob.ca;
import com.yandex.metrica.impl.ob.rf;

public class P5 {
    @NonNull
    private final N5 a;
    @NonNull
    private final O5 b;
    @NonNull
    private final M7 c;

    public P5(@NonNull Context context, @NonNull I3 i32) {
        this(new O5(), new N5(), ca.a((Context)context).a(i32), "event_hashes");
    }

    @VisibleForTesting
    public P5(@NonNull O5 o52, @NonNull N5 n52, @NonNull M7 m72, @NonNull String string) {
        this.b = o52;
        this.a = n52;
        this.c = m72;
    }

    @NonNull
    public M5 a() {
        try {
            Object object = this.c;
            byte[] byArray = object.a("event_hashes");
            if (A2.a(byArray)) {
                object = this.a;
                this.b.getClass();
                rf rf2 = new rf();
                return ((N5)object).a(rf2);
            }
            object = this.a;
            this.b.getClass();
            rf rf3 = new rf();
            object = ((N5)object).a((rf)MessageNano.mergeFrom((MessageNano)rf3, (byte[])byArray));
            return object;
        }
        catch (Throwable throwable) {
            N5 n52 = this.a;
            this.b.getClass();
            return n52.a(new rf());
        }
    }

    public void a(@NonNull M5 m52) {
        M7 m72 = this.c;
        O5 o52 = this.b;
        m52 = this.a.a(m52);
        o52.getClass();
        m72.a("event_hashes", MessageNano.toByteArray((MessageNano)m52));
    }
}

