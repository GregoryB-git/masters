/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  com.google.protobuf.nano.ym.CodedOutputByteBufferNano
 *  com.google.protobuf.nano.ym.MessageNano
 *  com.yandex.metrica.impl.ob.if
 *  com.yandex.metrica.impl.ob.if$e
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Gj;
import com.yandex.metrica.impl.ob.J1;
import com.yandex.metrica.impl.ob.Mj;
import com.yandex.metrica.impl.ob.Nj;
import com.yandex.metrica.impl.ob.P1;
import com.yandex.metrica.impl.ob.if;

class O1
implements Nj {
    public final if a;
    public final P1 b;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public O1(P1 p1, if if_) {
        this.b = p1;
        this.a = if_;
    }

    @Override
    public void a(@NonNull Mj list) {
        if if_ = this.a;
        if (!A2.b(list = list.c())) {
            if_.d = new if.e[list.size()];
            for (int i2 = 0; i2 < list.size(); ++i2) {
                Gj gj = (Gj)list.get(i2);
                if.e[] eArray = if_.d;
                int n2 = J1.e;
                if.e e3 = new if.e();
                if (gj.b() != null) {
                    e3.a = gj.b();
                }
                if (gj.c() != null) {
                    e3.b = gj.c();
                }
                if (!TextUtils.isEmpty((CharSequence)gj.a())) {
                    e3.c = gj.a();
                }
                e3.d = gj.d();
                eArray[i2] = e3;
                P1.a(this.b, CodedOutputByteBufferNano.computeMessageSizeNoTag((MessageNano)if_.d[i2]));
                P1.a(this.b, CodedOutputByteBufferNano.computeTagSize((int)10));
            }
        }
    }
}

