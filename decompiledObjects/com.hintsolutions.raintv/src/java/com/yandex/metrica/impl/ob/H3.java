/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.google.protobuf.nano.ym.MessageNano
 *  com.yandex.metrica.impl.ob.mf
 *  com.yandex.metrica.impl.ob.mf$a
 *  com.yandex.metrica.impl.ob.mf$b
 *  com.yandex.metrica.impl.ob.mf$b$a
 *  com.yandex.metrica.impl.ob.mf$b$b
 *  com.yandex.metrica.impl.ob.mf$c
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Currency
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.billing_interface.c;
import com.yandex.metrica.billing_interface.d;
import com.yandex.metrica.billing_interface.e;
import com.yandex.metrica.impl.ob.mf;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

public class h3 {
    @NonNull
    private final d a;

    public h3(@NonNull d d4) {
        this.a = d4;
    }

    @NonNull
    private mf.b.b a(@NonNull c c3) {
        mf.b.b b2 = new mf.b.b();
        b2.a = c3.a;
        int n4 = c3.b.ordinal();
        int n5 = 4;
        if (n4 != 1) {
            if (n4 != 2) {
                if (n4 != 3) {
                    if (n4 != 4) {
                        n5 = 0;
                    }
                } else {
                    n5 = 3;
                }
            } else {
                n5 = 2;
            }
        } else {
            n5 = 1;
        }
        b2.b = n5;
        return b2;
    }

    @NonNull
    public byte[] a() {
        d d4 = this.a;
        mf mf2 = new mf();
        mf2.a = d4.c;
        mf2.g = d4.d;
        String string = d4.e;
        try {
            string = Currency.getInstance((String)string).getCurrencyCode();
        }
        catch (Throwable throwable) {
            string = "";
        }
        mf2.c = string.getBytes();
        mf2.d = d4.b.getBytes();
        string = new mf.a();
        ((mf.a)string).a = d4.n.getBytes();
        ((mf.a)string).b = d4.j.getBytes();
        mf2.f = string;
        int n4 = 1;
        mf2.h = true;
        mf2.i = 1;
        if (d4.a.ordinal() == 1) {
            n4 = 2;
        }
        mf2.j = n4;
        string = new mf.c();
        ((mf.c)string).a = d4.k.getBytes();
        ((mf.c)string).b = TimeUnit.MILLISECONDS.toSeconds(d4.l);
        mf2.k = string;
        if (d4.a == e.b) {
            string = new mf.b();
            ((mf.b)string).a = d4.m;
            c c3 = d4.i;
            if (c3 != null) {
                ((mf.b)string).b = this.a(c3);
            }
            mf.b.a a2 = new mf.b.a();
            a2.a = d4.f;
            c3 = d4.g;
            if (c3 != null) {
                a2.b = this.a(c3);
            }
            a2.c = d4.h;
            ((mf.b)string).c = a2;
            mf2.l = string;
        }
        return MessageNano.toByteArray((MessageNano)mf2);
    }
}

