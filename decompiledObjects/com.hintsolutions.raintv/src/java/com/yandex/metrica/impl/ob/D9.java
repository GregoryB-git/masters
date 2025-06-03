/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.core.api.ProtobufStateSerializer
 *  com.yandex.metrica.core.api.StateSerializer
 *  com.yandex.metrica.impl.ob.jm
 *  com.yandex.metrica.impl.ob.k9
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.ProtobufStateSerializer;
import com.yandex.metrica.core.api.StateSerializer;
import com.yandex.metrica.impl.ob.jm;
import com.yandex.metrica.impl.ob.k9;

public class d9
extends k9
implements ProtobufStateSerializer {
    public d9(@NonNull ProtobufStateSerializer protobufStateSerializer, @NonNull jm jm2) {
        super((StateSerializer)protobufStateSerializer, jm2);
    }
}

