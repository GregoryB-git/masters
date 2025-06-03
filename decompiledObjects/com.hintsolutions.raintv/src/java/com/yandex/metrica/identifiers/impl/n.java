/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Lambda
 */
package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import com.yandex.metrica.identifiers.impl.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class n
extends Lambda
implements Function1 {
    public static final n a = new n();

    public n() {
        super(1);
    }

    public Object invoke(Object object) {
        object = (IBinder)object;
        Intrinsics.checkNotNullParameter((Object)object, (String)"it");
        object = b.a((IBinder)object);
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"YandexAdvIdInterface.Stub.asInterface(it)");
        return object;
    }
}

