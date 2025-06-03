/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.google.protobuf.nano.ym.MessageNano
 *  com.yandex.metrica.impl.ob.of
 *  java.io.IOException
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.b9;
import com.yandex.metrica.impl.ob.of;
import java.io.IOException;

public class a9
extends b9 {
    @NonNull
    public Object defaultValue() {
        return new of();
    }

    @NonNull
    public Object toState(@NonNull byte[] byArray) throws IOException {
        return (of)MessageNano.mergeFrom((MessageNano)new of(), (byte[])byArray);
    }
}

