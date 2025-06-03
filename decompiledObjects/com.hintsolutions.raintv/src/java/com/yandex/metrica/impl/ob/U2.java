/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.V1;

public class u2
extends V1<String> {
    public u2(@NonNull Context context, @NonNull String string) {
        super(context, string, "string");
    }

    @Override
    @Nullable
    public Object a(int n2) {
        return this.a.getString(n2);
    }
}

