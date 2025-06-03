/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.google.protobuf.nano.ym.MessageNano
 *  com.yandex.metrica.core.api.ProtobufStateSerializer
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.core.api.ProtobufStateSerializer;

public abstract class b9
implements ProtobufStateSerializer {
    @NonNull
    public byte[] toByteArray(@NonNull Object object) {
        return MessageNano.toByteArray((MessageNano)((MessageNano)object));
    }
}

