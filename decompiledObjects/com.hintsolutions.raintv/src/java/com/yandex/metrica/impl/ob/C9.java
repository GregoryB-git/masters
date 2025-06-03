/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.nano.ym.MessageNano
 *  com.yandex.metrica.impl.ob.qf
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.internal.Intrinsics
 */
package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.b9;
import com.yandex.metrica.impl.ob.qf;
import kotlin.jvm.internal.Intrinsics;

public final class c9
extends b9 {
    public Object defaultValue() {
        return new qf();
    }

    public Object toState(byte[] object) {
        object = (qf)MessageNano.mergeFrom((MessageNano)new qf(), (byte[])object);
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"ClidsInfoProto.ClidsInfo.parseFrom(data)");
        return object;
    }
}

