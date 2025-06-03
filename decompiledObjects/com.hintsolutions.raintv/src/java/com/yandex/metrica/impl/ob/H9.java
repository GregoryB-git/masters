/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.google.protobuf.nano.ym.MessageNano
 *  com.yandex.metrica.impl.ob.vf
 *  java.io.IOException
 *  java.lang.Deprecated
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.b9;
import com.yandex.metrica.impl.ob.vf;
import java.io.IOException;

@Deprecated
public class h9
extends b9 {
    @NonNull
    public Object defaultValue() {
        return new vf();
    }

    @NonNull
    public Object toState(@NonNull byte[] byArray) throws IOException {
        return (vf)MessageNano.mergeFrom((MessageNano)new vf(), (byte[])byArray);
    }
}

