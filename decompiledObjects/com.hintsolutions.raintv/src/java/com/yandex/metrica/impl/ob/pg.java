/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Ng;
import com.yandex.metrica.impl.ob.Og;
import com.yandex.metrica.impl.ob.Rg;
import com.yandex.metrica.impl.ob.Ug;
import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer$Client;
import java.util.List;

class Pg
implements CacheControlHttpsConnectionPerformer$Client {
    public final Rg a;
    public final Ng b;
    public final Og c;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public Pg(Og og, Rg rg2, Ng ng) {
        this.c = og;
        this.a = rg2;
        this.b = ng;
    }

    @Override
    @Nullable
    public String getOldETag() {
        return this.a.b;
    }

    @Override
    public void onError() {
        this.b.a();
    }

    @Override
    public void onNotModified() {
        Ng ng = this.b;
        Rg rg2 = this.a;
        ng.a(new Rg(rg2.a, rg2.b, Og.d(this.c).currentTimeMillis(), true, false));
    }

    @Override
    public void onResponse(@NonNull String string2, @NonNull byte[] object) {
        object = Og.c(this.c).a(Og.b(this.c).a((byte[])object, "af9202nao18gswqp"));
        this.b.a(new Rg((List<Ug>)object, string2, Og.d(this.c).currentTimeMillis(), true, false));
    }
}

