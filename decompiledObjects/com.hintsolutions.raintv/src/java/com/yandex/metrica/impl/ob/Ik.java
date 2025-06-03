/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.kk
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.cm;
import com.yandex.metrica.impl.ob.el;
import com.yandex.metrica.impl.ob.jk;
import com.yandex.metrica.impl.ob.kk;

class ik {
    private final cm<jk, Pair<Boolean, el.b>> a;
    private final int b;

    public ik(int n4, int n5) {
        this.a = new kk(n4);
        this.b = n5;
    }

    @Nullable
    public Pair<Boolean, el.b> a(int n4, @NonNull String string) {
        if (string.length() > this.b) {
            return null;
        }
        return this.a.a(new jk(n4, string));
    }

    public void a() {
        this.a.a();
    }

    public void a(int n4, @NonNull String string, boolean bl, @Nullable el.b b2) {
        if (string.length() <= this.b) {
            this.a.a(new jk(n4, string), (Pair<Boolean, el.b>)new Pair((Object)bl, (Object)b2));
        }
    }
}

