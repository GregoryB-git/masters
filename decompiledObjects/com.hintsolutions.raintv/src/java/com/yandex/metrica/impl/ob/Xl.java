/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.yandex.metrica.impl.ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.Xl;

public class xl
extends BroadcastReceiver {
    @NonNull
    private final Xl<Context, Intent> a;
    @NonNull
    private final ICommonExecutor b;

    public xl(@NonNull Xl<Context, Intent> xl2, @NonNull ICommonExecutor iCommonExecutor) {
        this.a = xl2;
        this.b = iCommonExecutor;
    }

    public void onReceive(Context context, Intent intent) {
        this.b.execute(new Runnable(){
            public final Context a;
            public final Intent b;
            public final xl c;
            {
                this.c = xl2;
                this.a = context;
                this.b = intent;
            }

            public void run() {
                this.c.a.a(this.a, this.b);
            }
        });
    }
}

