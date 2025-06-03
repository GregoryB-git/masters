/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 *  java.lang.Object
 */
package com.yandex.metrica.identifiers.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.yandex.metrica.identifiers.impl.a;
import com.yandex.metrica.identifiers.impl.c;

public abstract class b
extends Binder
implements c {
    public static final int a = 0;

    public static c a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        if (iInterface != null && iInterface instanceof c) {
            return (c)iInterface;
        }
        return new a(iBinder);
    }
}

