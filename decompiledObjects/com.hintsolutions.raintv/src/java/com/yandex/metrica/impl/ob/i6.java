/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.UnsupportedOperationException
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C6;
import com.yandex.metrica.impl.ob.J6;
import com.yandex.metrica.impl.ob.S6;

public class I6
implements Converter {
    @NonNull
    private final J6<C6> a;

    public I6() {
        this(new J6<C6>(new S6()));
    }

    @VisibleForTesting
    public I6(@NonNull J6<C6> j6) {
        this.a = j6;
    }

    @NonNull
    public byte[] a(@NonNull C6 c6) {
        return this.a.a(c6);
    }

    @Override
    @NonNull
    public Object fromModel(@NonNull Object object) {
        object = (C6)object;
        return this.a.a((C6)object);
    }

    @Override
    @NonNull
    public Object toModel(@NonNull Object object) {
        object = (byte[])object;
        throw new UnsupportedOperationException();
    }
}

