/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 */
package com.yandex.metrica.profile;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Te;

public class UserProfileUpdate<T extends Te> {
    @NonNull
    public final T a;

    public UserProfileUpdate(@NonNull T t2) {
        this.a = t2;
    }

    @NonNull
    public T getUserProfileUpdatePatcher() {
        return this.a;
    }
}

