/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.Kl
 *  com.yandex.metrica.impl.ob.Nd
 *  com.yandex.metrica.impl.ob.ga
 *  com.yandex.metrica.impl.ob.ha
 *  com.yandex.metrica.impl.ob.ia
 *  com.yandex.metrica.impl.ob.na$a
 *  com.yandex.metrica.impl.ob.na$b
 *  com.yandex.metrica.impl.ob.na$c
 *  com.yandex.metrica.impl.ob.na$d
 *  com.yandex.metrica.impl.ob.na$e
 *  com.yandex.metrica.impl.ob.qa
 *  com.yandex.metrica.impl.ob.v3
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.impl.ob.Kl;
import com.yandex.metrica.impl.ob.Nd;
import com.yandex.metrica.impl.ob.Ol;
import com.yandex.metrica.impl.ob.Q0;
import com.yandex.metrica.impl.ob.am;
import com.yandex.metrica.impl.ob.ga;
import com.yandex.metrica.impl.ob.ha;
import com.yandex.metrica.impl.ob.ia;
import com.yandex.metrica.impl.ob.ja;
import com.yandex.metrica.impl.ob.ka;
import com.yandex.metrica.impl.ob.la;
import com.yandex.metrica.impl.ob.ma;
import com.yandex.metrica.impl.ob.na;
import com.yandex.metrica.impl.ob.pa;
import com.yandex.metrica.impl.ob.qa;
import com.yandex.metrica.impl.ob.ra;
import com.yandex.metrica.impl.ob.v3;

public class na {
    @NonNull
    public ma<YandexMetricaConfig> a(@NonNull Context context, @NonNull Q0 q02) {
        Kl kl = new Kl();
        return new ma<YandexMetricaConfig>(context, q02, "activation", (la<YandexMetricaConfig>)new ga((Ol)kl, new ra()), (am<ka, ja>)new a(this), (pa)new ha((Ol)kl));
    }

    @NonNull
    public ma<v3> b(@NonNull Context context, @NonNull Q0 q02) {
        return new ma<v3>(context, q02, "clids_info", (la<v3>)new ia(), (am<ka, ja>)new d(this), (pa)new e(this));
    }

    @NonNull
    public ma<Nd> c(@NonNull Context context, @NonNull Q0 q02) {
        return new ma<Nd>(context, q02, "preload_info", (la<Nd>)new qa(), (am<ka, ja>)new b(this), (pa)new c(this));
    }
}

