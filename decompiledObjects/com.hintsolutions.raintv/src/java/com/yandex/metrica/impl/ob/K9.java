/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.StateSerializer;
import com.yandex.metrica.impl.ob.jm;
import java.io.IOException;

public class k9
implements StateSerializer {
    @NonNull
    private final StateSerializer a;
    @NonNull
    private final jm b;

    public k9(@NonNull StateSerializer stateSerializer, @NonNull jm jm2) {
        this.a = stateSerializer;
        this.b = jm2;
    }

    @Override
    @NonNull
    public Object defaultValue() {
        return this.a.defaultValue();
    }

    @Override
    @NonNull
    public byte[] toByteArray(@NonNull Object object) {
        try {
            object = this.b.a(this.a.toByteArray(object));
            return object;
        }
        catch (Throwable throwable) {
            return new byte[0];
        }
    }

    @Override
    @NonNull
    public Object toState(@NonNull byte[] byArray) throws IOException {
        try {
            jm jm2 = this.b;
            jm2.getClass();
            byArray = jm2.a(byArray, 0, byArray.length);
        }
        catch (Throwable throwable) {
            throw new IOException(throwable);
        }
        return this.a.toState(byArray);
    }
}

