/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.google.protobuf.nano.ym.MessageNano
 *  com.yandex.metrica.impl.ob.xf
 *  com.yandex.metrica.impl.ob.xf$i
 *  java.io.IOException
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.b9;
import com.yandex.metrica.impl.ob.xf;
import java.io.IOException;

public class j9
extends b9 {
    @NonNull
    public Object defaultValue() {
        xf xf2 = new xf();
        xf2.k = new xf.i();
        return xf2;
    }

    @NonNull
    public Object toState(@NonNull byte[] byArray) throws IOException {
        return (xf)MessageNano.mergeFrom((MessageNano)new xf(), (byte[])byArray);
    }
}

