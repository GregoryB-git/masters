/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.google.protobuf.nano.ym.MessageNano
 *  com.yandex.metrica.impl.ob.sf
 *  java.io.IOException
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.b9;
import com.yandex.metrica.impl.ob.sf;
import java.io.IOException;

public class e9
extends b9 {
    @NonNull
    public Object defaultValue() {
        return new sf();
    }

    @NonNull
    public Object toState(@NonNull byte[] byArray) throws IOException {
        return (sf)MessageNano.mergeFrom((MessageNano)new sf(), (byte[])byArray);
    }
}

