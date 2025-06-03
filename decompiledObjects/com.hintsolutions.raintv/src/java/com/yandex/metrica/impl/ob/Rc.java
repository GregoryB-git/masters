/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.Lc
 *  java.lang.Object
 *  java.lang.System
 */
package com.yandex.metrica.impl.ob;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Kb;
import com.yandex.metrica.impl.ob.Lc;
import com.yandex.metrica.impl.ob.V;
import com.yandex.metrica.impl.ob.fc;
import com.yandex.metrica.impl.ob.x2;

class rc {
    @Nullable
    private fc a;
    @NonNull
    private V b;
    @Nullable
    private Location c;
    private long d;
    @NonNull
    private x2 e;
    @NonNull
    private Lc f;
    @NonNull
    private Kb g;

    public rc(@Nullable fc fc2, @NonNull V v4, @Nullable Location location, long l8, @NonNull x2 x22, @NonNull Lc lc2, @NonNull Kb kb2) {
        this.a = fc2;
        this.b = v4;
        this.c = null;
        this.d = l8;
        this.e = x22;
        this.f = lc2;
        this.g = kb2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(@Nullable Location location) {
        boolean bl = true;
        if (location == null) return false;
        fc fc2 = this.a;
        if (fc2 == null) return false;
        boolean bl2 = bl;
        if (this.c == null) return bl2;
        bl2 = this.e.a(this.d, fc2.a, "isSavedLocationOutdated");
        boolean bl3 = location.distanceTo(this.c) > this.a.b;
        boolean bl4 = this.c == null || location.getTime() - this.c.getTime() >= 0L;
        if (!bl2) {
            if (!bl3) return false;
        }
        if (!bl4) return false;
        return bl;
    }

    public void a(@Nullable Location location) {
        if (this.b(location)) {
            this.c = location;
            this.d = System.currentTimeMillis();
            this.b.a(location);
            this.f.a();
            this.g.a();
        }
    }

    public void a(@Nullable fc fc2) {
        this.a = fc2;
    }
}

