/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.D3$a
 *  com.yandex.metrica.impl.ob.E4
 *  com.yandex.metrica.impl.ob.F0
 *  com.yandex.metrica.impl.ob.I3
 *  com.yandex.metrica.impl.ob.P3
 *  com.yandex.metrica.impl.ob.Th
 *  com.yandex.metrica.impl.ob.W7
 *  com.yandex.metrica.impl.ob.c0
 *  com.yandex.metrica.impl.ob.ci
 *  com.yandex.metrica.impl.ob.f4
 *  com.yandex.metrica.impl.ob.ii
 *  com.yandex.metrica.impl.ob.z0
 *  com.yandex.metrica.impl.ob.z4$a
 *  com.yandex.metrica.impl.ob.z4$b
 *  com.yandex.metrica.networktasks.api.ConfigProvider
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.A4;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.D4;
import com.yandex.metrica.impl.ob.E4;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.I3;
import com.yandex.metrica.impl.ob.P3;
import com.yandex.metrica.impl.ob.Q3;
import com.yandex.metrica.impl.ob.Th;
import com.yandex.metrica.impl.ob.W7;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.f4;
import com.yandex.metrica.impl.ob.ii;
import com.yandex.metrica.impl.ob.p0;
import com.yandex.metrica.impl.ob.z0;
import com.yandex.metrica.impl.ob.z4;
import com.yandex.metrica.networktasks.api.ConfigProvider;

public class z4
implements P3,
ConfigProvider,
Q3 {
    @NonNull
    private final Context a;
    @NonNull
    private final I3 b;
    @NonNull
    private final p0 c;
    @NonNull
    private A4 d;
    @NonNull
    private f4 e;

    public z4(@NonNull Context context, @NonNull I3 i3, @NonNull D3.a a8, @NonNull ci ci2, @NonNull ii ii2, @NonNull CounterConfiguration.b b3) {
        this(context, i3, a8, ci2, ii2, b3, new E4(), new /* Unavailable Anonymous Inner Class!! */, new /* Unavailable Anonymous Inner Class!! */, new f4(context, i3), F0.g().w().a(i3));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public z4(@NonNull Context context, @NonNull I3 i3, @NonNull D3.a a8, @NonNull ci ci2, @NonNull ii object, @NonNull CounterConfiguration.b b3, @NonNull E4 e42, @NonNull b b6, @NonNull a a10, @NonNull f4 f42, @NonNull W7 w72) {
        this.a = context;
        this.b = i3;
        this.e = f42;
        this.c = b6.a(this, object, e42, w72);
        z4 z42 = this;
        synchronized (z42) {
            this.e.a(ci2.P());
            super(a8);
            this.d = a10.a(context, i3, ci2, (D4.a)((Object)object));
            return;
        }
    }

    public void a() {
        if (this.e.a(((D4)this.d.b()).D())) {
            c0 c02 = z0.a();
            this.c.a(c02);
            this.e.a();
        }
    }

    public void a(@NonNull D3.a a8) {
        this.d.a(a8);
    }

    public void a(@NonNull Th th, @Nullable ci ci2) {
    }

    public void a(@NonNull c0 c02) {
        this.c.a(c02);
    }

    public void a(@Nullable ci ci2) {
        z4 z42 = this;
        synchronized (z42) {
            this.d.a(ci2);
            this.e.a(ci2.P());
            return;
        }
    }

    @NonNull
    public Context b() {
        return this.a;
    }

    @NonNull
    public Object getConfig() {
        return (D4)this.d.b();
    }
}

