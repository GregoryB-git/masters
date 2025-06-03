/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.rtm.client.CrashesDirectoryProvider
 *  com.yandex.metrica.rtm.service.DefaultValuesProvider
 *  com.yandex.metrica.rtm.service.EventToReporterProxy
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 */
package com.yandex.metrica.rtm.wrapper;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.rtm.client.CrashesDirectoryProvider;
import com.yandex.metrica.rtm.service.DefaultValuesProvider;
import com.yandex.metrica.rtm.service.EventToReporterProxy;
import com.yandex.metrica.rtm.wrapper.a;
import com.yandex.metrica.rtm.wrapper.c;
import com.yandex.metrica.rtm.wrapper.f;
import com.yandex.metrica.rtm.wrapper.i;
import com.yandex.metrica.rtm.wrapper.j;
import java.util.concurrent.Executor;

public class l
implements f {
    @NonNull
    private final EventToReporterProxy a;

    @VisibleForTesting
    public l(@NonNull EventToReporterProxy eventToReporterProxy) {
        this.a = eventToReporterProxy;
    }

    public l(@NonNull i i2, @NonNull Context context, @NonNull Executor executor, @NonNull j j9) {
        this(new EventToReporterProxy((CrashesDirectoryProvider)new a(i2), context, executor, (DefaultValuesProvider)new c(j9)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void reportData(@NonNull Bundle bundle) {
        try {
            this.a.reportData(bundle);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

