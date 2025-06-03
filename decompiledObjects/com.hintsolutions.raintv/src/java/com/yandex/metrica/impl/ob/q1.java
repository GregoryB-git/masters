/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.A3;
import com.yandex.metrica.impl.ob.Om;
import com.yandex.metrica.impl.ob.Uh;
import com.yandex.metrica.impl.ob.Wh;
import com.yandex.metrica.impl.ob.be;
import com.yandex.metrica.impl.ob.x0;
import com.yandex.metrica.impl.ob.z3;

public class Q1
extends z3 {
    public x0 c;
    public be d;
    private boolean e = true;
    @Nullable
    private final String f;

    public Q1(@NonNull A3 a3, @NonNull CounterConfiguration counterConfiguration) {
        this(a3, counterConfiguration, null);
    }

    public Q1(@NonNull A3 a3, @NonNull CounterConfiguration counterConfiguration, @Nullable String string2) {
        super(a3, counterConfiguration);
        this.f = string2;
    }

    public void a(Om om2) {
        this.c = new x0(om2);
    }

    public void a(Wh wh) {
        if (wh != null) {
            this.b().d(((Uh)wh).e());
        }
    }

    public void a(be be2) {
        this.d = be2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Bundle c() {
        Object object;
        Bundle bundle = new Bundle();
        CounterConfiguration counterConfiguration = object = this.b();
        synchronized (counterConfiguration) {
            bundle.putParcelable("COUNTER_CFG_OBJ", (Parcelable)object);
        }
        counterConfiguration = object = this.a();
        synchronized (counterConfiguration) {
            bundle.putParcelable("PROCESS_CFG_OBJ", (Parcelable)object);
            return bundle;
        }
    }

    @Nullable
    public String d() {
        return this.c.a();
    }

    @Nullable
    public String e() {
        return this.f;
    }

    public boolean f() {
        return this.e;
    }

    public void g() {
        this.e = true;
    }

    public void h() {
        this.e = false;
    }
}

