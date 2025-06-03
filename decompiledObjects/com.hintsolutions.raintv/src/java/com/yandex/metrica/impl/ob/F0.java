/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.ResultReceiver
 *  androidx.annotation.NonNull
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Sk;

@SuppressLint(value={"ParcelCreator"})
public class f0
extends ResultReceiver {
    public static final int b = 0;
    @NonNull
    private final a a;

    public f0(Handler handler, @NonNull a a2) {
        super(handler);
        this.a = a2;
    }

    public void onReceiveResult(int n4, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(Sk.class.getClassLoader());
        this.a.a(n4, bundle2);
    }

    public static interface a {
        public void a(int var1, @NonNull Bundle var2);
    }
}

