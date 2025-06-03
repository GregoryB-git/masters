/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.webkit.WebView
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.D2
 *  com.yandex.metrica.impl.ob.Hf
 *  com.yandex.metrica.impl.ob.Jf
 *  com.yandex.metrica.impl.ob.P
 *  com.yandex.metrica.impl.ob.R2
 *  com.yandex.metrica.impl.ob.a0
 *  com.yandex.metrica.impl.ob.o2
 *  com.yandex.metrica.impl.ob.q
 *  com.yandex.metrica.impl.ob.q$c
 *  java.lang.Boolean
 *  java.lang.Object
 */
package com.yandex.metrica;

import android.app.Application;
import android.content.Context;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.i;
import com.yandex.metrica.impl.ob.D2;
import com.yandex.metrica.impl.ob.Hf;
import com.yandex.metrica.impl.ob.Jf;
import com.yandex.metrica.impl.ob.P;
import com.yandex.metrica.impl.ob.R2;
import com.yandex.metrica.impl.ob.a0;
import com.yandex.metrica.impl.ob.o2;
import com.yandex.metrica.impl.ob.q;

public class f {
    @NonNull
    private final Hf a;
    @NonNull
    private final D2 b;
    @NonNull
    private final q c;
    @NonNull
    private final o2 d;
    @NonNull
    private final a0 e;

    public f(@NonNull Hf hf, @NonNull D2 d2) {
        this(hf, d2, P.g().b(), P.g().k(), P.g().e());
    }

    @VisibleForTesting
    public f(@NonNull Hf hf, @NonNull D2 d2, @NonNull q q2, @NonNull o2 o22, @NonNull a0 a02) {
        this.a = hf;
        this.b = d2;
        this.c = q2;
        this.d = o22;
        this.e = a02;
    }

    @NonNull
    public q.c a(@NonNull Application application) {
        this.c.a(application);
        return this.d.a();
    }

    public void a(@NonNull Context context) {
        this.e.a(context);
    }

    public void a(@NonNull Context context, @NonNull YandexMetricaConfig yandexMetricaConfig) {
        i i3 = (i)yandexMetricaConfig;
        this.e.a(context);
        Boolean bl = i3.sessionsAutoTrackingEnabled;
        Boolean bl2 = Boolean.TRUE;
        yandexMetricaConfig = bl;
        if (bl == null) {
            yandexMetricaConfig = bl2;
        }
        if (yandexMetricaConfig.booleanValue()) {
            this.d.a();
        }
        this.a.getClass();
        R2.a((Context)context).b(i3);
    }

    public void a(@NonNull WebView webView, @NonNull Jf jf) {
        this.b.a(webView, jf);
    }

    public void b(@NonNull Context context) {
        this.e.a(context);
    }

    public void c(@NonNull Context context) {
        this.e.a(context);
    }
}

