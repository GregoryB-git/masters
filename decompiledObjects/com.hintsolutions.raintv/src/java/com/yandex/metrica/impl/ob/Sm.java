/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package com.yandex.metrica.impl.ob;

import android.util.Base64;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.om;
import com.yandex.metrica.impl.ob.pm;

public class sm
implements pm {
    @Override
    public om a(c0 c02) {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte[] a(byte[] byArray) {
        try {
            byArray = Base64.decode((byte[])byArray, (int)0);
            return byArray;
        }
        catch (Throwable throwable) {
            return new byte[0];
        }
    }
}

