/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.JavascriptInterface
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.Jf
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Jf;

public class AppMetricaJsInterface {
    @NonNull
    private final Jf a;

    public AppMetricaJsInterface(@NonNull Jf jf) {
        this.a = jf;
    }

    @JavascriptInterface
    public void reportEvent(String string2, String string3) {
        this.a.c(string2, string3);
    }
}

