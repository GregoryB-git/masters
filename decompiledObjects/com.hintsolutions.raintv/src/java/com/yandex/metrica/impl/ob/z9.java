/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.M7;
import com.yandex.metrica.impl.ob.Y9;

public abstract class Z9<T>
implements Y9<T> {
    @Override
    public ProtobufStateStorage a(@NonNull Context context) {
        return this.a(context, this.c(context));
    }

    @NonNull
    public abstract ProtobufStateStorage a(@NonNull Context var1, @NonNull M7 var2);

    @Override
    public ProtobufStateStorage b(@NonNull Context context) {
        return this.a(context, this.d(context));
    }

    @NonNull
    public abstract M7 c(@NonNull Context var1);

    @NonNull
    public abstract M7 d(@NonNull Context var1);
}

