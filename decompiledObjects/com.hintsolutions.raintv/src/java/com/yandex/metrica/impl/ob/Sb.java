/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.nb;

public class sb {
    @NonNull
    private final nb a;
    @NonNull
    private final nb b;
    @NonNull
    private final nb c;

    public sb() {
        this(new nb(), new nb(), new nb());
    }

    public sb(@NonNull nb nb2, @NonNull nb nb3, @NonNull nb nb4) {
        this.a = nb2;
        this.b = nb3;
        this.c = nb4;
    }

    @NonNull
    public nb a() {
        return this.a;
    }

    @NonNull
    public nb b() {
        return this.b;
    }

    @NonNull
    public nb c() {
        return this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("AdvertisingIdsHolder{mGoogle=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", mHuawei=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", yandex=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

