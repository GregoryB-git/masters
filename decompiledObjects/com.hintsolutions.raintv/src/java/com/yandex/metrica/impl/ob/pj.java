/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.ComponentName;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Bk;
import com.yandex.metrica.impl.ob.Zm;

class Pj
implements Bk {
    @NonNull
    private final Zm a;

    public Pj() {
        this(new Zm());
    }

    @VisibleForTesting
    public Pj(@NonNull Zm zm) {
        this.a = zm;
    }

    @Override
    @Nullable
    public Bundle a(@NonNull Activity activity) {
        Zm zm = this.a;
        ComponentName componentName = activity.getComponentName();
        zm.getClass();
        try {
            activity = activity.getPackageManager().getActivityInfo(componentName, 128);
        }
        catch (Throwable throwable) {
            activity = null;
        }
        if (activity != null) {
            return activity.metaData;
        }
        return null;
    }
}

