/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Bk;
import com.yandex.metrica.impl.ob.Zm;

class Rj
implements Bk {
    @Nullable
    private final Bundle a;

    public Rj(@NonNull Context context) {
        this(context, new Zm());
    }

    @VisibleForTesting
    public Rj(@NonNull Context context, @NonNull Zm zm) {
        context = zm.a(context, context.getPackageName(), 128);
        this.a = context != null ? context.metaData : null;
    }

    @Override
    @Nullable
    public Bundle a(@NonNull Activity activity) {
        return this.a;
    }
}

