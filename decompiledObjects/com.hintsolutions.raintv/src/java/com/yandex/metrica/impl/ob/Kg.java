/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.HashSet
 *  java.util.Set
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Sf;
import com.yandex.metrica.impl.ob.Tf;
import com.yandex.metrica.impl.ob.ig;
import com.yandex.metrica.impl.ob.og;
import java.util.HashSet;
import java.util.Set;

public class kg
implements ig.a {
    @NonNull
    private final Set<Sf> a = new HashSet();
    private boolean b;
    @Nullable
    private Tf c;

    public kg() {
        this(F0.g().m());
    }

    @VisibleForTesting
    public kg(@NonNull ig ig2) {
        ig2.a(new og(this));
        ig2.b();
    }

    public void a(@NonNull Sf sf2) {
        kg kg2 = this;
        synchronized (kg2) {
            this.a.add((Object)sf2);
            if (this.b) {
                sf2.a(this.c);
                this.a.remove((Object)sf2);
            }
            return;
        }
    }

    @Override
    public void a(@Nullable Tf tf2) {
        kg kg2 = this;
        synchronized (kg2) {
            this.c = tf2;
            this.b = true;
            tf2 = this.a.iterator();
            while (tf2.hasNext()) {
                ((Sf)tf2.next()).a(this.c);
            }
            this.a.clear();
            return;
        }
    }
}

