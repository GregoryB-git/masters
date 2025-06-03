/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collection
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.vn;
import com.yandex.metrica.impl.ob.xn;
import java.util.Collection;

public class rn<T>
implements xn<Collection<T>> {
    public rn(@NonNull String string) {
    }

    @Override
    public vn a(@Nullable Object object) {
        object = A2.b((Collection)object) ? vn.a(this, "Stacktrace is null or empty.") : vn.a(this);
        return object;
    }
}

