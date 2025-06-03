/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.eh
 *  com.yandex.metrica.impl.ob.ih
 *  com.yandex.metrica.impl.ob.wh
 *  com.yandex.metrica.impl.ob.xh
 *  com.yandex.metrica.impl.ob.yh
 *  java.io.File
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.am;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.eh;
import com.yandex.metrica.impl.ob.hh;
import com.yandex.metrica.impl.ob.ih;
import com.yandex.metrica.impl.ob.jh;
import com.yandex.metrica.impl.ob.sh;
import com.yandex.metrica.impl.ob.wh;
import com.yandex.metrica.impl.ob.xh;
import com.yandex.metrica.impl.ob.yh;
import com.yandex.metrica.impl.ob.zh;
import java.io.File;

public class rh {
    @NonNull
    private final Context a;
    @NonNull
    private final zh b;
    @NonNull
    private final hh c;
    @Nullable
    private wh d;
    @Nullable
    private wh e;
    @Nullable
    private ci f;

    public rh(@NonNull Context context) {
        this(context, new zh(), new hh(context));
    }

    @VisibleForTesting
    public rh(@NonNull Context context, @NonNull zh zh2, @NonNull hh hh2) {
        this.a = context;
        this.b = zh2;
        this.c = hh2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        rh rh2 = this;
        synchronized (rh2) {
            wh wh2 = this.d;
            if (wh2 != null) {
                wh2.a();
            }
            if ((wh2 = this.e) != null) {
                wh2.a();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NonNull ci ci2) {
        rh rh2 = this;
        synchronized (rh2) {
            this.f = ci2;
            wh wh2 = this.d;
            if (wh2 == null) {
                wh wh3;
                Object object = this.b;
                Context context = this.a;
                object.getClass();
                wh2 = new eh();
                xh xh2 = new xh((zh)object);
                object = new jh("open", "http");
                jh jh2 = new jh("port_already_in_use", "http");
                this.d = wh3 = new wh(context, ci2, (sh)wh2, (am)xh2, (jh)object, jh2, "Http");
            } else {
                wh2.a(ci2);
            }
            this.c.a(ci2, this);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NonNull File file) {
        rh rh2 = this;
        synchronized (rh2) {
            wh wh2 = this.e;
            if (wh2 == null) {
                wh wh3;
                Object object = this.b;
                Context context = this.a;
                ci ci2 = this.f;
                object.getClass();
                wh2 = new ih(file);
                file = new yh((zh)object);
                jh jh2 = new jh("open", "https");
                object = new jh("port_already_in_use", "https");
                this.e = wh3 = new wh(context, ci2, (sh)wh2, (am)file, jh2, (jh)object, "Https");
            } else {
                wh2.a(this.f);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        rh rh2 = this;
        synchronized (rh2) {
            wh wh2 = this.d;
            if (wh2 != null) {
                wh2.b();
            }
            if ((wh2 = this.e) != null) {
                wh2.b();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(@NonNull ci ci2) {
        rh rh2 = this;
        synchronized (rh2) {
            this.f = ci2;
            this.c.a(ci2, this);
            wh wh2 = this.d;
            if (wh2 != null) {
                wh2.b(ci2);
            }
            if ((wh2 = this.e) != null) {
                wh2.b(ci2);
            }
            return;
        }
    }
}

