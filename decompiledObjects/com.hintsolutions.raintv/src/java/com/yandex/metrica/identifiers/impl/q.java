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
import com.yandex.metrica.identifiers.impl.t;
import com.yandex.metrica.identifiers.impl.u;
import com.yandex.metrica.identifiers.impl.v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class q
extends Lambda
implements Function1 {
    public static final q a = new q();

    public q() {
        super(1);
    }

    public Object invoke(Object object) {
        IBinder iBinder = (IBinder)object;
        Intrinsics.checkNotNullParameter((Object)iBinder, (String)"it");
        int n4 = u.a;
        object = iBinder == null ? null : ((object = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService")) != null && object instanceof v ? (v)object : new t(iBinder));
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"OpenDeviceIdentifierService.Stub.asInterface(it)");
        return object;
    }
}

