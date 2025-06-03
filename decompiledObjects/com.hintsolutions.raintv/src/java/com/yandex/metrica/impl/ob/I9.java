/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.google.protobuf.nano.ym.MessageNano
 *  com.yandex.metrica.impl.ob.wf
 *  java.io.IOException
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.b9;
import com.yandex.metrica.impl.ob.wf;
import java.io.IOException;

public class i9
extends b9 {
    @NonNull
    public Object defaultValue() {
        return new wf();
    }

    @NonNull
    public Object toState(@NonNull byte[] byArray) throws IOException {
        return (wf)MessageNano.mergeFrom((MessageNano)new wf(), (byte[])byArray);
    }
}

